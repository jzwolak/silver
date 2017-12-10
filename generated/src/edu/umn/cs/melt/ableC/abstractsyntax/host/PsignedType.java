
package edu.umn.cs.melt.ableC.abstractsyntax.host;

// top::BuiltinType ::= it::IntegerType 
public final class PsignedType extends edu.umn.cs.melt.ableC.abstractsyntax.host.NBuiltinType {

	public static final int i_it = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_signedType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NBuiltinType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NBuiltinType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_it] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType.num_inh_attrs];

	}

	public PsignedType(final Object c_it) {
		super();
		this.child_it = c_it;

	}

	private Object child_it;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType getChild_it() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType) (child_it = common.Util.demand(child_it));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_it: return getChild_it();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_it: return child_it;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:host:signedType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:host:signedType";
	}

	static void initProductionAttributeDefinitions() {
		// top.host = edu:umn:cs:melt:ableC:abstractsyntax:host:signedType(, it.host,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BuiltinType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NBuiltinType)new edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.i_it, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType))); } };
		// top.pp = ppConcat([ text(signed,), it.pp ],)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BuiltinType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.PppConcat.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.signed__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_signedType))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.i_it, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } };
		// signed = case it of charType() -> "" | _ -> "signed " end
		edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.signed__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_signedType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6319___fail_6320 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (new common.StringCatter("signed ")); } };
return new common.PatternLazy<common.DecoratedNode, common.StringCatter>() { public final common.StringCatter eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.host.PcharType) {  return (common.StringCatter)(new common.StringCatter("")); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((common.StringCatter)(__SV_LOCAL_6319___fail_6320.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.i_it)); } }).eval()); } };
		// top.mangledName = "signed_" ++ it.mangledName
		edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_mangledName__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BuiltinType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("signed_")), (common.StringCatter)((common.StringCatter)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.i_it).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_mangledName__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType))); } };
		// top.integerPromotionsBuiltin = signedType(case it of charType() -> intType(,) | shortType() -> intType(,) | _ -> it end,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_integerPromotionsBuiltin__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BuiltinType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NBuiltinType)new edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6323___fail_6324 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.i_it).undecorate(); } };
return new common.PatternLazy<common.DecoratedNode, edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType>() { public final edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.host.PcharType) {  return (edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType)((edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType)new edu.umn.cs.melt.ableC.abstractsyntax.host.PintType()); }
else if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.host.PshortType) {  return (edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType)((edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType)new edu.umn.cs.melt.ableC.abstractsyntax.host.PintType()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType)(__SV_LOCAL_6323___fail_6324.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.i_it)); } })); } };
		// top.defaultArgumentPromotionsBuiltin = top.integerPromotionsBuiltin
		edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_defaultArgumentPromotionsBuiltin__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BuiltinType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NBuiltinType)context.synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_integerPromotionsBuiltin__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BuiltinType)); } };
		// top.isIntegerType = true
		edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_isIntegerType__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BuiltinType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// top.isArithmeticType = true
		edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_isArithmeticType__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BuiltinType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };

	}

	public static final common.NodeFactory<PsignedType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PsignedType> {

		@Override
		public PsignedType invoke(final Object[] children, final Object[] annotations) {
			return new PsignedType(children[0]);
		}
	};

}
