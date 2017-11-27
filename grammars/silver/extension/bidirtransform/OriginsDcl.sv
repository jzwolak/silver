-- grammar silver:extension:bidirtransform;

-- concrete production originDcl
-- top::AGDcl ::= 'apply' 'origins' 'on' nts::NonterminalList ';'
-- {
--     forwards to applyOrigins(nts.ntList);
-- }

-- concrete production cncOriginDcl
-- top::AGDcl ::= 'apply' 'concrete' 'origins' 'on' nts::NonterminalList ';'
-- {
--     forwards to cncApplyOrigins(nts.ntList);
-- }

-- abstract production cncApplyOrigins
-- top::AGDcl ::= ntList::[Decorated FullNonterminal]
-- {
--     -- attribute suppliedOrigin occurs on $cncType;
--     local agDcls::AGDcl = appendAGDcl(attrOn("suppliedOrigin", cncNames, location=ag.location), agDcls4, location=ag.location);

--     -- aspect all cnc origins with:
--     --
--     -- o.wasTransformed = false;
--     -- o.concreteOrigin = o;
--     local agDcls2::AGDcl = foldl(\ agDcls::AGDcl name::String->
--         appendAGDcl(aspectProductionDcl('aspect', 'production', 
--             qName(ag.location, mkOriginName(name)), mkAspectProdSigDec("o", "Origin", "e", name, location=ag.location),
--                 prdBody([
--                     attribDef("o", "wasTransformed", mkFalse(location=ag.location), location=ag.location),
--                     attribDef("o", "concreteOrigin", baseName("o", location=ag.location), location=ag.location)
--                 ], location=ag.location), location=ag.location), agDcls, location=ag.location),
--         agDcls, cncNames);
--     
--     forwards to agDcls2;
-- }

-- abstract production applyOrigins 
-- top::AGDcl ::= ntList::[Decorated FullNonterminal]
-- {
--     local absNames :: [String] = map((.name), ntList);    

--     -- Occurances of attributes, annotations

--     -- Problem in future: only apply this on attributes that they are not 
--     -- already defined on. This doesn't work because checking if an attribute
--     -- occurs on an element we're working with causes a loop.

--     -- attribute wasTransformed occurs on $absType;
--     local agDcls::AGDcl = appendAGDcl(attrOn("wasTransformed", absNames, location=ag.location), agDcls9, location=ag.location);

--     -- abstract production origin_$type
--     -- o::Origin ::= e::Decorated $type
--     -- {
--     --      o.isBottomOrigin = false;
--     -- }
--     --
--     local agDcls2::AGDcl = appendAGDcl(foldl(\ agDcls::AGDcl qn::String->
--          appendAGDcl(productionDcl('abstract', 'production', 
--             name(mkOriginName(qn),ag.location), mkProdSigDec("o", "Origin", "e", qn, location=ag.location),
--                 prdBody([
--                     attribDef("o", "isBottomOrigin", mkFalse(location=ag.location), location=ag.location)
--                 ], location=ag.location), location=ag.location),
--             agDcls, location=ag.location),
--         emptyAGDcl(location=ag.location), allNames), agDcls11, location=ag.location);

--     local agDcls3::AGDcl = foldl(\ agDcls::AGDcl name::String->
--         appendAGDcl(aspectProductionDcl('aspect', 'production', 
--             qName(ag.location, mkOriginName(name)), mkAspectProdSigDec("o", "Origin", "e", name, location=ag.location),
--                 prdBody([
--                 attribDef("o", "wasTransformed",
--                     argFunc("wasTransformed", appExprList([
--                         namedAccess("redex", "e", location=ag.location),
--                         namedAccess("origin", "e", location=ag.location)
--                     ], location=ag.location), location=ag.location), location=ag.location),
--                 attribDef("o", "concreteOrigin", 
--                     argFunc("getConcreteOrigin", appExprList([
--                         presentName("o", location=ag.location),
--                         namedAccess("origin", "e", location=ag.location)
--                     ], location=ag.location), location=ag.location), location=ag.location)
--                 ], location=ag.location), location=ag.location), agDcls, location=ag.location),
--         agDcls2, absNames);

--     -- annotation redex occurs on $absType;
--     local agDcls4::AGDcl = appendAGDcl(annoOn("redex", absNames, location=ag.location), agDcls3, location=ag.location);
    
--     -- annotation labels occurs on $absType;
--     local agDcls5::AGDcl = appendAGDcl(annoOn("labels", absNames, location=ag.location), agDcls4, location=ag.location);
    
--     -- annotation origin occurs on $absType;
--     local agDcls6::AGDcl = appendAGDcl(annoOn("origin", absNames, location=ag.location), agDcls5, location=ag.location);
--     
--     forwards to agDcls6;
-- }

-- this uses QNames because Names is commented out right now

-- concrete production originAttributeDcl
-- top::AGDcl ::= 'origin' 'attributes' qns::QNames 
-- {
--     forwards to originAttributes(qns.qnames);
-- }
--

-- abstract production originAttributes
-- top::AGDcl ::= qns::[QNameWithTL]
-- {
--     forwards to if null(qns) then emptyAGDcl(location=top.location)
--       else appendAGDcl(originAttribute(head(qns)), originAttributes(tail(qns)), location=top.location);
-- }

-- abstract production originAttribute
-- top::AGDcl ::= qn::QNameWithTL
-- {
--     forwards to appendAGDcl(
--         attrOn(qn.name, ["Origin"]),
--         -- find all origin productions and give them this attribute if it's defined on their RHS
--         location=top.location)
-- }