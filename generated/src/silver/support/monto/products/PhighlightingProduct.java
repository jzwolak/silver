
package silver.support.monto.products;

// top::ProductValue ::= tokens::[HighlightToken] 
public final class PhighlightingProduct extends silver.support.monto.products.NProductValue {

	public static final int i_tokens = 0;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_support_monto_products_highlightingProduct;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.support.monto.products.NProductValue.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.support.monto.products.NProductValue.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PhighlightingProduct(final Object c_tokens) {
		super();
		this.child_tokens = c_tokens;

	}

	private Object child_tokens;
	public final common.ConsCell getChild_tokens() {
		return (common.ConsCell) (child_tokens = common.Util.demand(child_tokens));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_tokens: return getChild_tokens();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_tokens: return child_tokens;

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
		return true;
	}

	@Override
	public common.Node evalForward(final common.DecoratedNode context) {
		return ((silver.support.monto.products.NProductValue)new silver.support.monto.products.PproductValue((new common.StringCatter("highlighting")), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.json.NJson)new silver.json.PjsonArray(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(silver.support.monto.products.Init.silver_json_json__ON__silver_support_monto_products_HighlightToken, context), context.childAsIsLazy(silver.support.monto.products.PhighlightingProduct.i_tokens))); } })); } }));
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
		return "silver:support:monto:products:highlightingProduct";
	}

	static void initProductionAttributeDefinitions() {

	}

	public static final common.NodeFactory<PhighlightingProduct> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PhighlightingProduct> {

		@Override
		public PhighlightingProduct invoke(final Object[] children, final Object[] annotations) {
			return new PhighlightingProduct(children[0]);
		}
	};

}