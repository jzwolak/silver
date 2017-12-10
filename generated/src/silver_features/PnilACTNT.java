
package silver_features;

// top::AutoCopyTestNT ::= 
public final class PnilACTNT extends silver_features.NAutoCopyTestNT {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_features_nilACTNT;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver_features.NAutoCopyTestNT.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver_features.NAutoCopyTestNT.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PnilACTNT() {
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
		throw new common.exceptions.SilverInternalError("Production silver_features:nilACTNT erroneously claimed to forward");
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
		return "silver_features:nilACTNT";
	}

	static void initProductionAttributeDefinitions() {
		// top.autoSyn = top.autoTest
		silver_features.PnilACTNT.synthesizedAttributes[silver_features.Init.silver_features_autoSyn__ON__silver_features_AutoCopyTestNT] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.inherited(silver_features.Init.silver_features_autoTest__ON__silver_features_AutoCopyTestNT)); } };

	}

	public static final common.NodeFactory<PnilACTNT> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PnilACTNT> {

		@Override
		public PnilACTNT invoke(final Object[] children, final Object[] annotations) {
			return new PnilACTNT();
		}
	};

}
