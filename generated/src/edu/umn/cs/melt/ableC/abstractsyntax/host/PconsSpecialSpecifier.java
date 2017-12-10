
package edu.umn.cs.melt.ableC.abstractsyntax.host;

// top::SpecialSpecifiers ::= h::SpecialSpecifier t::SpecialSpecifiers 
public final class PconsSpecialSpecifier extends edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers {

	public static final int i_h = 0;
	public static final int i_t = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifier.class,edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_consSpecialSpecifier;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_h] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifier.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers.num_inh_attrs];

	}

	public PconsSpecialSpecifier(final Object c_h, final Object c_t) {
		super();
		this.child_h = c_h;
		this.child_t = c_t;

	}

	private Object child_h;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifier getChild_h() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifier) (child_h = common.Util.demand(child_h));
	}

	private Object child_t;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers getChild_t() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers) (child_t = common.Util.demand(child_t));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_h: return getChild_h();
			case i_t: return getChild_t();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_h: return child_h;
			case i_t: return child_t;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:host:consSpecialSpecifier erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:host:consSpecialSpecifier";
	}

	static void initProductionAttributeDefinitions() {
		// top.host = edu:umn:cs:melt:ableC:abstractsyntax:host:consSpecialSpecifier(, h.host, t.host,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers)new edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_h, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifier), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_t, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers))); } };
		// top.lifted = edu:umn:cs:melt:ableC:abstractsyntax:host:consSpecialSpecifier(, h.lifted, t.lifted,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NSpecialSpecifiers)new edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_h, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifier), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_t, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers))); } };
		// top.pps = (h.pp :: t.pps)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_h, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifier), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_t, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers))); } };
		// top.errors := h.errors ++ t.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_h, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifier), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_t, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers))); } });
		// top.globalDecls := h.globalDecls ++ t.globalDecls
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] = new edu.umn.cs.melt.ableC.abstractsyntax.host.CAglobalDecls(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_h, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifier), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_t, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_globalDecls__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers))); } });
		// top.defs := h.defs ++ t.defs
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers] = new edu.umn.cs.melt.ableC.abstractsyntax.env.CAdefs(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_h, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifier), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsSpecialSpecifier.i_t, edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_SpecialSpecifiers))); } });

	}

	public static final common.NodeFactory<PconsSpecialSpecifier> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PconsSpecialSpecifier> {

		@Override
		public PconsSpecialSpecifier invoke(final Object[] children, final Object[] annotations) {
			return new PconsSpecialSpecifier(children[0], children[1]);
		}
	};

}
