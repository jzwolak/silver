
package edu.umn.cs.melt.ableC.abstractsyntax.host;

public final class PmaximumConversionRank extends common.FunctionNode {

	public static final int i_a = 0;
	public static final int i_b = 1;


	public static final Class<?> childTypes[] = { edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType.class,edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_maximumConversionRank;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_a] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType.num_inh_attrs];
	childInheritedAttributes[i_b] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType.num_inh_attrs];

	}

	public PmaximumConversionRank(final Object c_a, final Object c_b) {
		this.child_a = c_a;
		this.child_b = c_b;

	}

	private Object child_a;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType getChild_a() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType) (child_a = common.Util.demand(child_a));
	}

	private Object child_b;
	public final edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType getChild_b() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType) (child_b = common.Util.demand(child_b));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_a: return getChild_a();
			case i_b: return getChild_b();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_a: return child_a;
			case i_b: return child_b;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:host:maximumConversionRank";
	}

	public static edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType invoke(final Object c_a, final Object c_b) {
		try {
		final common.DecoratedNode context = new PmaximumConversionRank(c_a, c_b).decorate();
		//if a.integerConversionRank < b.integerConversionRank then b else a
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType)(((((Integer)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PmaximumConversionRank.i_a).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_integerConversionRank__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType)) < ((Integer)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PmaximumConversionRank.i_b).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_integerConversionRank__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_IntegerType))) ? context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PmaximumConversionRank.i_b).undecorate() : context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.host.PmaximumConversionRank.i_a).undecorate()));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:abstractsyntax:host:maximumConversionRank", t);
		}
	}

	public static final common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType> {
		@Override
		public edu.umn.cs.melt.ableC.abstractsyntax.host.NIntegerType invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PmaximumConversionRank.invoke(children[0], children[1]);
		}
	};
}