
package edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax;

// cs::ExprClauses ::= c::ExprClause 
public final class Pp_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0 extends edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.NExprClauses {

	public static final int i_c = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.NExprClause.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_p_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.NExprClauses.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.NExprClauses.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_c] = new common.Lazy[edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.NExprClause.num_inh_attrs];

	}

	public Pp_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0(final Object c_c, final Object a_core_location) {
		super(a_core_location);
		this.child_c = c_c;

	}

	private Object child_c;
	public final edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.NExprClause getChild_c() {
		return (edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.NExprClause) (child_c = common.Util.demand(child_c));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_c: return getChild_c();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_c: return child_c;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
	}

	@Override
	public common.Lazy[] getLocalInheritedAttributes(final int key) {
		return localInheritedAttributes[key];
	}

	@Override
	public common.Lazy[] getChildInheritedAttributes(final int key) {
		return childInheritedAttributes[key];
	}

	@Override
	public boolean hasForward() {
		return false;
	}

	@Override
	public common.Node evalForward(final common.DecoratedNode context) {
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:exts:ableC:algebraicDataTypes:patternmatching:concretesyntax:p_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0 erroneously claimed to forward");
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
	}

	@Override
	public common.Lazy getLocal(final int key) {
		return localAttributes[key];
	}

	@Override
	public final int getNumberOfLocalAttrs() {
		return num_local_attrs;
	}

	@Override
	public final String getNameOfLocalAttr(final int index) {
		return occurs_local[index];
	}

	@Override
	public String getName() {
		return "edu:umn:cs:melt:exts:ableC:algebraicDataTypes:patternmatching:concretesyntax:p_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0";
	}

	static void initProductionAttributeDefinitions() {
		// cs.ast = abs:oneExprClause(c.ast,location=cs.location)
		edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.Pp_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0.synthesizedAttributes[edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_ExprClauses] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.abstractsyntax.NExprClauses)new edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.abstractsyntax.PoneExprClause(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.Pp_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0.i_c, edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_ExprClause), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NLocation)((edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax.NExprClauses)context.undecorate()).getAnno_core_location()); } })); } };

	}

	public static final common.NodeFactory<Pp_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pp_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0> {

		@Override
		public Pp_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0 invoke(final Object[] children, final Object[] annotations) {
			return new Pp_edu_umn_cs_melt_exts_ableC_algebraicDataTypes_patternmatching_concretesyntax_MatchExpr_sv_37_0(children[0], annotations[0]);
		}
	};

}
