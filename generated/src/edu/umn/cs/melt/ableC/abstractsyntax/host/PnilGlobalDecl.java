
package edu.umn.cs.melt.ableC.abstractsyntax.host;

// top::GlobalDecls ::= 
public final class PnilGlobalDecl extends edu.umn.cs.melt.ableC.abstractsyntax.host.NGlobalDecls {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_nilGlobalDecl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NGlobalDecls.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NGlobalDecls.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PnilGlobalDecl() {
		super();

	}



	@Override
	public Object getChild(final int index) {
		switch(index) {

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 0;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:host:nilGlobalDecl erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:host:nilGlobalDecl";
	}

	static void initProductionAttributeDefinitions() {
		// top.host = edu:umn:cs:melt:ableC:abstractsyntax:host:nilGlobalDecl(,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_GlobalDecls] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NGlobalDecls)new edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl()); } };
		// top.lifted = edu:umn:cs:melt:ableC:abstractsyntax:host:nilGlobalDecl(,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_GlobalDecls] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NGlobalDecls)new edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl()); } };
		// top.pps = []
		edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_GlobalDecls] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		// top.errors := []
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_GlobalDecls] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_GlobalDecls] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_GlobalDecls);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_GlobalDecls]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });
		// top.freeVariables = []
		edu.umn.cs.melt.ableC.abstractsyntax.host.PnilGlobalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_freeVariables__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_GlobalDecls] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };

	}

	public static final common.NodeFactory<PnilGlobalDecl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PnilGlobalDecl> {

		@Override
		public PnilGlobalDecl invoke(final Object[] children, final Object[] annotations) {
			return new PnilGlobalDecl();
		}
	};

}
