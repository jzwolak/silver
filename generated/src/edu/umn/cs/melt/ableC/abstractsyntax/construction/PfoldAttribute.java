
package edu.umn.cs.melt.ableC.abstractsyntax.construction;

public final class PfoldAttribute extends common.FunctionNode {

	public static final int i_l = 0;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_construction_foldAttribute;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PfoldAttribute(final Object c_l) {
		this.child_l = c_l;

	}

	private Object child_l;
	public final common.ConsCell getChild_l() {
		return (common.ConsCell) (child_l = common.Util.demand(child_l));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:construction:foldAttribute";
	}

	public static edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes invoke(final Object c_l) {
		try {
		final common.DecoratedNode context = new PfoldAttribute(c_l).decorate();
		//foldr(consAttribute, nilAttribute(,), l,)
		return (edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes)(((edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes)core.Pfoldr.invoke(edu.umn.cs.melt.ableC.abstractsyntax.host.PconsAttribute.factory, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes)new edu.umn.cs.melt.ableC.abstractsyntax.host.PnilAttribute()); } }, context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.construction.PfoldAttribute.i_l))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:abstractsyntax:construction:foldAttribute", t);
		}
	}

	public static final common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes> factory = new Factory();

	public static final class Factory extends common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes> {
		@Override
		public edu.umn.cs.melt.ableC.abstractsyntax.host.NAttributes invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PfoldAttribute.invoke(children[0]);
		}
	};
}