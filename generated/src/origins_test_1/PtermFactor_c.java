
package origins_test_1;

// t::Term_c ::= f::Factor_c 
public final class PtermFactor_c extends origins_test_1.NTerm_c {

	public static final int i_f = 0;


	public static final Class<?> childTypes[] = {origins_test_1.NFactor_c.class};

	public static final int num_local_attrs = Init.count_local__ON__origins_test_1_termFactor_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[origins_test_1.NTerm_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[origins_test_1.NTerm_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_f] = new common.Lazy[origins_test_1.NFactor_c.num_inh_attrs];

	}

	public PtermFactor_c(final Object c_f) {
		super();
		this.child_f = c_f;

	}

	private Object child_f;
	public final origins_test_1.NFactor_c getChild_f() {
		return (origins_test_1.NFactor_c) (child_f = common.Util.demand(child_f));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_f: return getChild_f();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_f: return child_f;

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
		throw new common.exceptions.SilverInternalError("Production origins_test_1:termFactor_c erroneously claimed to forward");
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
		return "origins_test_1:termFactor_c";
	}

	static void initProductionAttributeDefinitions() {
		// t.pp = f.pp
		origins_test_1.PtermFactor_c.synthesizedAttributes[origins_test_1.Init.origins_test_1_pp__ON__origins_test_1_Term_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(origins_test_1.PtermFactor_c.i_f).synthesized(origins_test_1.Init.origins_test_1_pp__ON__origins_test_1_Factor_c)); } };
		// t.ast_Expr = f.ast_Expr
		origins_test_1.PtermFactor_c.synthesizedAttributes[origins_test_1.Init.origins_test_1_ast_Expr__ON__origins_test_1_Term_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((origins_test_1.NExpr)context.childDecorated(origins_test_1.PtermFactor_c.i_f).synthesized(origins_test_1.Init.origins_test_1_ast_Expr__ON__origins_test_1_Factor_c)); } };

	}

	public static final common.NodeFactory<PtermFactor_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtermFactor_c> {

		@Override
		public PtermFactor_c invoke(final Object[] children, final Object[] annotations) {
			return new PtermFactor_c(children[0]);
		}
	};

}