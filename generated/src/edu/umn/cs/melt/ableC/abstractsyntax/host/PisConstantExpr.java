
package edu.umn.cs.melt.ableC.abstractsyntax.host;

// top::Expr ::= e::Expr 
public final class PisConstantExpr extends edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr {

	public static final int i_e = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_isConstantExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr.num_inh_attrs];

	}

	public PisConstantExpr(final Object c_e, final Object a_core_location) {
		super(a_core_location);
		this.child_e = c_e;

	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr getChild_e() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr) (child_e = common.Util.demand(child_e));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_e: return getChild_e();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_e: return child_e;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:host:isConstantExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:host:isConstantExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.host = edu:umn:cs:melt:ableC:abstractsyntax:host:isConstantExpr(, e.host,, location=top.location)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr)new edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr)context.undecorate()).getAnno_core_location()); } })); } };
		// top.lifted = edu:umn:cs:melt:ableC:abstractsyntax:host:isConstantExpr(, e.lifted,, location=top.location)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr)new edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr)context.undecorate()).getAnno_core_location()); } })); } };
		// top.pp = ppConcat([ text("__builtin_constant_p(",), e.pp, text(")",) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.PppConcat.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("__builtin_constant_p(")))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(")")))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } };
		// top.errors := e.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.i_e).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr)); } });
		// top.defs := e.defs
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new edu.umn.cs.melt.ableC.abstractsyntax.env.CAdefs(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.i_e).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr)); } });
		// top.globalDecls := e.globalDecls
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new edu.umn.cs.melt.ableC.abstractsyntax.host.CAglobalDecls(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.i_e).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr)); } });
		// top.typerep = builtinType(nilQualifier(,), signedType(intType(,),),)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NType)new edu.umn.cs.melt.ableC.abstractsyntax.host.PbuiltinType(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NQualifiers)new edu.umn.cs.melt.ableC.abstractsyntax.host.PnilQualifier()); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NBuiltinType)new edu.umn.cs.melt.ableC.abstractsyntax.host.PsignedType(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType)new edu.umn.cs.melt.ableC.abstractsyntax.host.PintType()); } })); } })); } };
		// top.freeVariables = e.freeVariables
		edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_freeVariables__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.i_e).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_freeVariables__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr)); } };
		// top.isLValue = false
		edu.umn.cs.melt.ableC.abstractsyntax.host.PisConstantExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_isLValue__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return false; } };

	}

	public static final common.NodeFactory<PisConstantExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PisConstantExpr> {

		@Override
		public PisConstantExpr invoke(final Object[] children, final Object[] annotations) {
			return new PisConstantExpr(children[0], annotations[0]);
		}
	};

}
