
package silver.definition.flow.env_parser;

// top::IFlow ::= 'extra' '(' prod::IName ',' ifv::IFlowVertex ',' fv::IFlowVertexes ',' a::IBool ')' 
public final class PaFlowExtra extends silver.definition.flow.env_parser.NIFlow {

	public static final int i__G_9 = 0;
	public static final int i__G_8 = 1;
	public static final int i_prod = 2;
	public static final int i__G_6 = 3;
	public static final int i_ifv = 4;
	public static final int i__G_4 = 5;
	public static final int i_fv = 6;
	public static final int i__G_2 = 7;
	public static final int i_a = 8;
	public static final int i__G_0 = 9;


	public static final Class<?> childTypes[] = {silver.definition.flow.env_parser.TExtraTerm.class,silver.definition.env.env_parser.TLParent_t.class,silver.definition.env.env_parser.NIName.class,silver.definition.env.env_parser.TComma_t.class,silver.definition.flow.env_parser.NIFlowVertex.class,silver.definition.env.env_parser.TComma_t.class,silver.definition.flow.env_parser.NIFlowVertexes.class,silver.definition.env.env_parser.TComma_t.class,silver.definition.env.env_parser.NIBool.class,silver.definition.env.env_parser.TRParent_t.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_definition_flow_env_parser_aFlowExtra;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.definition.flow.env_parser.NIFlow.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.definition.flow.env_parser.NIFlow.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[10][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_prod] = new common.Lazy[silver.definition.env.env_parser.NIName.num_inh_attrs];
	childInheritedAttributes[i_ifv] = new common.Lazy[silver.definition.flow.env_parser.NIFlowVertex.num_inh_attrs];
	childInheritedAttributes[i_fv] = new common.Lazy[silver.definition.flow.env_parser.NIFlowVertexes.num_inh_attrs];
	childInheritedAttributes[i_a] = new common.Lazy[silver.definition.env.env_parser.NIBool.num_inh_attrs];

	}

	public PaFlowExtra(final Object c__G_9, final Object c__G_8, final Object c_prod, final Object c__G_6, final Object c_ifv, final Object c__G_4, final Object c_fv, final Object c__G_2, final Object c_a, final Object c__G_0) {
		super();
		this.child__G_9 = c__G_9;
		this.child__G_8 = c__G_8;
		this.child_prod = c_prod;
		this.child__G_6 = c__G_6;
		this.child_ifv = c_ifv;
		this.child__G_4 = c__G_4;
		this.child_fv = c_fv;
		this.child__G_2 = c__G_2;
		this.child_a = c_a;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_9;
	public final silver.definition.flow.env_parser.TExtraTerm getChild__G_9() {
		return (silver.definition.flow.env_parser.TExtraTerm) (child__G_9 = common.Util.demand(child__G_9));
	}

	private Object child__G_8;
	public final silver.definition.env.env_parser.TLParent_t getChild__G_8() {
		return (silver.definition.env.env_parser.TLParent_t) (child__G_8 = common.Util.demand(child__G_8));
	}

	private Object child_prod;
	public final silver.definition.env.env_parser.NIName getChild_prod() {
		return (silver.definition.env.env_parser.NIName) (child_prod = common.Util.demand(child_prod));
	}

	private Object child__G_6;
	public final silver.definition.env.env_parser.TComma_t getChild__G_6() {
		return (silver.definition.env.env_parser.TComma_t) (child__G_6 = common.Util.demand(child__G_6));
	}

	private Object child_ifv;
	public final silver.definition.flow.env_parser.NIFlowVertex getChild_ifv() {
		return (silver.definition.flow.env_parser.NIFlowVertex) (child_ifv = common.Util.demand(child_ifv));
	}

	private Object child__G_4;
	public final silver.definition.env.env_parser.TComma_t getChild__G_4() {
		return (silver.definition.env.env_parser.TComma_t) (child__G_4 = common.Util.demand(child__G_4));
	}

	private Object child_fv;
	public final silver.definition.flow.env_parser.NIFlowVertexes getChild_fv() {
		return (silver.definition.flow.env_parser.NIFlowVertexes) (child_fv = common.Util.demand(child_fv));
	}

	private Object child__G_2;
	public final silver.definition.env.env_parser.TComma_t getChild__G_2() {
		return (silver.definition.env.env_parser.TComma_t) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_a;
	public final silver.definition.env.env_parser.NIBool getChild_a() {
		return (silver.definition.env.env_parser.NIBool) (child_a = common.Util.demand(child_a));
	}

	private Object child__G_0;
	public final silver.definition.env.env_parser.TRParent_t getChild__G_0() {
		return (silver.definition.env.env_parser.TRParent_t) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_9: return getChild__G_9();
			case i__G_8: return getChild__G_8();
			case i_prod: return getChild_prod();
			case i__G_6: return getChild__G_6();
			case i_ifv: return getChild_ifv();
			case i__G_4: return getChild__G_4();
			case i_fv: return getChild_fv();
			case i__G_2: return getChild__G_2();
			case i_a: return getChild_a();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_9: return child__G_9;
			case i__G_8: return child__G_8;
			case i_prod: return child_prod;
			case i__G_6: return child__G_6;
			case i_ifv: return child_ifv;
			case i__G_4: return child__G_4;
			case i_fv: return child_fv;
			case i__G_2: return child__G_2;
			case i_a: return child_a;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 10;
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
		throw new common.exceptions.SilverInternalError("Production silver:definition:flow:env_parser:aFlowExtra erroneously claimed to forward");
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
		return "silver:definition:flow:env_parser:aFlowExtra";
	}

	static void initProductionAttributeDefinitions() {
		// top.flowDefs = [ extraEq(prod.aname, head(ifv.flowDeps), fv.flowDeps, a.bval) ]
		silver.definition.flow.env_parser.PaFlowExtra.synthesizedAttributes[silver.definition.flow.env_parser.Init.silver_definition_flow_env_flowDefs__ON__silver_definition_flow_env_parser_IFlow] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.definition.flow.ast.NFlowDef)new silver.definition.flow.ast.PextraEq(context.childDecoratedSynthesizedLazy(silver.definition.flow.env_parser.PaFlowExtra.i_prod, silver.definition.env.env_parser.Init.silver_definition_env_env_parser_aname__ON__silver_definition_env_env_parser_IName), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.definition.flow.ast.NFlowVertex)core.Phead.invoke(context.childDecoratedSynthesizedLazy(silver.definition.flow.env_parser.PaFlowExtra.i_ifv, silver.definition.flow.env_parser.Init.silver_definition_flow_env_flowDeps__ON__silver_definition_flow_env_parser_IFlowVertex))); } }, context.childDecoratedSynthesizedLazy(silver.definition.flow.env_parser.PaFlowExtra.i_fv, silver.definition.flow.env_parser.Init.silver_definition_flow_env_flowDeps__ON__silver_definition_flow_env_parser_IFlowVertexes), context.childDecoratedSynthesizedLazy(silver.definition.flow.env_parser.PaFlowExtra.i_a, silver.definition.env.env_parser.Init.silver_definition_env_env_parser_bval__ON__silver_definition_env_env_parser_IBool))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } })); } };

	}

	public static final common.NodeFactory<PaFlowExtra> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PaFlowExtra> {

		@Override
		public PaFlowExtra invoke(final Object[] children, final Object[] annotations) {
			return new PaFlowExtra(children[0], children[1], children[2], children[3], children[4], children[5], children[6], children[7], children[8], children[9]);
		}
	};

}