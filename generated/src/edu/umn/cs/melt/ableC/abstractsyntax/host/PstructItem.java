
package edu.umn.cs.melt.ableC.abstractsyntax.host;

// top::StructItem ::= attrs::Attributes ty::BaseTypeExpr dcls::StructDeclarators 
public final class PstructItem extends edu.umn.cs.melt.ableC.abstractsyntax.host.NStructItem {

	public static final int i_attrs = 0;
	public static final int i_ty = 1;
	public static final int i_dcls = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes.class,edu.umn.cs.melt.ableC.abstractsyntax.host.NBaseTypeExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.host.NStructDeclarators.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_structItem;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NStructItem.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NStructItem.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_attrs] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes.num_inh_attrs];
	childInheritedAttributes[i_ty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NBaseTypeExpr.num_inh_attrs];
	childInheritedAttributes[i_dcls] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NStructDeclarators.num_inh_attrs];

	}

	public PstructItem(final Object c_attrs, final Object c_ty, final Object c_dcls) {
		super();
		this.child_attrs = c_attrs;
		this.child_ty = c_ty;
		this.child_dcls = c_dcls;

	}

	private Object child_attrs;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes getChild_attrs() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes) (child_attrs = common.Util.demand(child_attrs));
	}

	private Object child_ty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NBaseTypeExpr getChild_ty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NBaseTypeExpr) (child_ty = common.Util.demand(child_ty));
	}

	private Object child_dcls;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NStructDeclarators getChild_dcls() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NStructDeclarators) (child_dcls = common.Util.demand(child_dcls));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_attrs: return getChild_attrs();
			case i_ty: return getChild_ty();
			case i_dcls: return getChild_dcls();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_attrs: return child_attrs;
			case i_ty: return child_ty;
			case i_dcls: return child_dcls;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 3;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:host:structItem erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:host:structItem";
	}

	static void initProductionAttributeDefinitions() {
		// top.host = edu:umn:cs:melt:ableC:abstractsyntax:host:structItem(, attrs.host, ty.host, dcls.host,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NStructItem)new edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_attrs, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Attributes), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators))); } };
		// top.lifted = edu:umn:cs:melt:ableC:abstractsyntax:host:structItem(, attrs.lifted, ty.lifted, dcls.lifted,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NStructItem)new edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_attrs, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Attributes), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators))); } };
		// top.pp = ppConcat([ ppAttributes(attrs,), ty.pp, space(,), ppImplode(text(", ",), dcls.pps,) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.PppConcat.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)edu.umn.cs.melt.ableC.abstractsyntax.host.PppAttributes.invoke(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_attrs)))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.PppImplode.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(", ")))); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } };
		// top.errors := ty.errors ++ dcls.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators))); } });
		// top.globalDecls := ty.globalDecls ++ dcls.globalDecls
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] = new edu.umn.cs.melt.ableC.abstractsyntax.host.CAglobalDecls(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators))); } });
		// top.defs := ty.defs
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] = new edu.umn.cs.melt.ableC.abstractsyntax.env.CAdefs(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr)); } });
		// top.freeVariables = ty.freeVariables ++ dcls.freeVariables
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_freeVariables__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_freeVariables__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_freeVariables__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators))); } };
		// top.localdefs := dcls.localdefs
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem] = new edu.umn.cs.melt.ableC.abstractsyntax.env.CAlocaldefs(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructItem]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators)); } });
		// ty.givenRefId = attrs.maybeRefId
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty][edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_givenRefId__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NMaybe)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_attrs).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_maybeRefId__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Attributes)); } };
		// dcls.env = addEnv(ty.defs, ty.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls][edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.DecoratedNode)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty).inherited(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr)); } })); } };
		// dcls.baseType = ty.typerep
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls][edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_baseType__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NType)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr)); } };
		// dcls.typeModifiersIn = ty.typeModifiers
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls][edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_typeModifiersIn__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_typeModifiers__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_BaseTypeExpr)); } };
		// dcls.givenAttributes = attrs
		edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_dcls][edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_givenAttributes__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_StructDeclarators] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PstructItem.i_attrs).undecorate(); } };

	}

	public static final common.NodeFactory<PstructItem> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PstructItem> {

		@Override
		public PstructItem invoke(final Object[] children, final Object[] annotations) {
			return new PstructItem(children[0], children[1], children[2]);
		}
	};

}
