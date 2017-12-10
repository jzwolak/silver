
package silver.definition.core;

// top::ForwardInh ::= lhs::ForwardLHSExpr '=' e::Expr ';' 
public final class PforwardInh extends silver.definition.core.NForwardInh {

	public static final int i_lhs = 0;
	public static final int i__G_2 = 1;
	public static final int i_e = 2;
	public static final int i__G_0 = 3;


	public static final Class<?> childTypes[] = {silver.definition.core.NForwardLHSExpr.class,silver.definition.core.TEqual_t.class,silver.definition.core.NExpr.class,silver.definition.core.TSemi_t.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_definition_core_forwardInh;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.definition.core.NForwardInh.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.definition.core.NForwardInh.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_lhs] = new common.Lazy[silver.definition.core.NForwardLHSExpr.num_inh_attrs];
	childInheritedAttributes[i_e] = new common.Lazy[silver.definition.core.NExpr.num_inh_attrs];

	}

	public PforwardInh(final Object c_lhs, final Object c__G_2, final Object c_e, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child_lhs = c_lhs;
		this.child__G_2 = c__G_2;
		this.child_e = c_e;
		this.child__G_0 = c__G_0;

	}

	private Object child_lhs;
	public final silver.definition.core.NForwardLHSExpr getChild_lhs() {
		return (silver.definition.core.NForwardLHSExpr) (child_lhs = common.Util.demand(child_lhs));
	}

	private Object child__G_2;
	public final silver.definition.core.TEqual_t getChild__G_2() {
		return (silver.definition.core.TEqual_t) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_e;
	public final silver.definition.core.NExpr getChild_e() {
		return (silver.definition.core.NExpr) (child_e = common.Util.demand(child_e));
	}

	private Object child__G_0;
	public final silver.definition.core.TSemi_t getChild__G_0() {
		return (silver.definition.core.TSemi_t) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_lhs: return getChild_lhs();
			case i__G_2: return getChild__G_2();
			case i_e: return getChild_e();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_lhs: return child_lhs;
			case i__G_2: return child__G_2;
			case i_e: return child_e;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 4;
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
		throw new common.exceptions.SilverInternalError("Production silver:definition:core:forwardInh erroneously claimed to forward");
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
		return "silver:definition:core:forwardInh";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = lhs.pp ++ " = " ++ e.pp ++ ";"
		silver.definition.core.PforwardInh.synthesizedAttributes[silver.definition.core.Init.silver_definition_env_pp__ON__silver_definition_core_ForwardInh] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(silver.definition.core.PforwardInh.i_lhs).synthesized(silver.definition.core.Init.silver_definition_env_pp__ON__silver_definition_core_ForwardLHSExpr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" = ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(silver.definition.core.PforwardInh.i_e).synthesized(silver.definition.core.Init.silver_definition_env_pp__ON__silver_definition_core_Expr)), (common.StringCatter)(new common.StringCatter(";"))))); } };
		// top.errors := lhs.errors ++ e.errors
		if(silver.definition.core.PforwardInh.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_errors__ON__silver_definition_core_ForwardInh] == null)
			silver.definition.core.PforwardInh.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_errors__ON__silver_definition_core_ForwardInh] = new silver.definition.core.CAerrors(silver.definition.core.Init.silver_definition_core_errors__ON__silver_definition_core_ForwardInh);
		((common.CollectionAttribute)silver.definition.core.PforwardInh.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_errors__ON__silver_definition_core_ForwardInh]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(silver.definition.core.PforwardInh.i_lhs, silver.definition.core.Init.silver_definition_core_errors__ON__silver_definition_core_ForwardLHSExpr), context.childDecoratedSynthesizedLazy(silver.definition.core.PforwardInh.i_e, silver.definition.core.Init.silver_definition_core_errors__ON__silver_definition_core_Expr))); } });

	}

	public static final common.NodeFactory<PforwardInh> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PforwardInh> {

		@Override
		public PforwardInh invoke(final Object[] children, final Object[] annotations) {
			return new PforwardInh(children[0], children[1], children[2], children[3], annotations[0]);
		}
	};

}