
package silver_features.anno;

// top::AnnoNT2 ::= 
public final class PannoNT2 extends silver_features.anno.NAnnoNT2 {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_features_anno_annoNT2;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver_features.anno.NAnnoNT2.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver_features.anno.NAnnoNT2.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PannoNT2(final Object a_silver_features_anno_anno1, final Object a_silver_features_anno_anno2) {
		super(a_silver_features_anno_anno1, a_silver_features_anno_anno2);

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
		throw new common.exceptions.SilverInternalError("Production silver_features:anno:annoNT2 erroneously claimed to forward");
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
		return "silver_features:anno:annoNT2";
	}

	static void initProductionAttributeDefinitions() {

	}

	public static final common.NodeFactory<PannoNT2> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PannoNT2> {

		@Override
		public PannoNT2 invoke(final Object[] children, final Object[] annotations) {
			return new PannoNT2(annotations[0], annotations[1]);
		}
	};

}
