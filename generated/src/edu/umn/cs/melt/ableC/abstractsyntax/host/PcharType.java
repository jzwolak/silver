
package edu.umn.cs.melt.ableC.abstractsyntax.host;

// top::IntegerType ::= 
public final class PcharType extends edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_charType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PcharType() {
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:host:charType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:host:charType";
	}

	static void initProductionAttributeDefinitions() {
		// top.host = edu:umn:cs:melt:ableC:abstractsyntax:host:charType(,)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PcharType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType)new edu.umn.cs.melt.ableC.abstractsyntax.host.PcharType()); } };
		// top.pp = text("char",)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PcharType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("char")))); } };
		// top.mangledName = "char"
		edu.umn.cs.melt.ableC.abstractsyntax.host.PcharType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_mangledName__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("char")); } };
		// top.integerConversionRank = 0
		edu.umn.cs.melt.ableC.abstractsyntax.host.PcharType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_integerConversionRank__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)0); } };

	}

	public static final common.NodeFactory<PcharType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PcharType> {

		@Override
		public PcharType invoke(final Object[] children, final Object[] annotations) {
			return new PcharType();
		}
	};

}
