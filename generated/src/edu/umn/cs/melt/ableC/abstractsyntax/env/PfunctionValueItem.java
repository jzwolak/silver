
package edu.umn.cs.melt.ableC.abstractsyntax.env;

// top::ValueItem ::= s::Decorated FunctionDecl 
public final class PfunctionValueItem extends edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem {

	public static final int i_s = 0;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_functionValueItem;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PfunctionValueItem(final Object c_s) {
		super();
		this.child_s = c_s;

	}

	private Object child_s;
	public final common.DecoratedNode getChild_s() {
		return (common.DecoratedNode) (child_s = common.Util.demand(child_s));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_s: return getChild_s();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_s: return child_s;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:env:functionValueItem erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:env:functionValueItem";
	}

	static void initProductionAttributeDefinitions() {
		// top.typerep = s.typerep
		edu.umn.cs.melt.ableC.abstractsyntax.env.PfunctionValueItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_ValueItem] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NType)((common.DecoratedNode)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.env.PfunctionValueItem.i_s)).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_FunctionDecl)); } };
		// top.sourceLocation = s.sourceLocation
		edu.umn.cs.melt.ableC.abstractsyntax.env.PfunctionValueItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_sourceLocation__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_ValueItem] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NLocation)((common.DecoratedNode)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.env.PfunctionValueItem.i_s)).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_sourceLocation__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_FunctionDecl)); } };

	}

	public static final common.NodeFactory<PfunctionValueItem> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PfunctionValueItem> {

		@Override
		public PfunctionValueItem invoke(final Object[] children, final Object[] annotations) {
			return new PfunctionValueItem(children[0]);
		}
	};

}
