
package silver.modification.collection.env_parser;

// top::IDclInfo ::= 'loccol' '(' l::ILocation ',' fn::IName ',' t::ITypeRep ',' o::IOperation ')' 
public final class PaDclInfoLocalCol extends silver.definition.env.env_parser.NIDclInfo {

	public static final int i__G_9 = 0;
	public static final int i__G_8 = 1;
	public static final int i_l = 2;
	public static final int i__G_6 = 3;
	public static final int i_fn = 4;
	public static final int i__G_4 = 5;
	public static final int i_t = 6;
	public static final int i__G_2 = 7;
	public static final int i_o = 8;
	public static final int i__G_0 = 9;


	public static final Class<?> childTypes[] = {silver.modification.collection.env_parser.TLocColTerm.class,silver.definition.env.env_parser.TLParent_t.class,silver.definition.env.env_parser.NILocation.class,silver.definition.env.env_parser.TComma_t.class,silver.definition.env.env_parser.NIName.class,silver.definition.env.env_parser.TComma_t.class,silver.definition.env.env_parser.NITypeRep.class,silver.definition.env.env_parser.TComma_t.class,silver.modification.collection.env_parser.NIOperation.class,silver.definition.env.env_parser.TRParent_t.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_modification_collection_env_parser_aDclInfoLocalCol;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.definition.env.env_parser.NIDclInfo.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.definition.env.env_parser.NIDclInfo.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[10][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_l] = new common.Lazy[silver.definition.env.env_parser.NILocation.num_inh_attrs];
	childInheritedAttributes[i_fn] = new common.Lazy[silver.definition.env.env_parser.NIName.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[silver.definition.env.env_parser.NITypeRep.num_inh_attrs];
	childInheritedAttributes[i_o] = new common.Lazy[silver.modification.collection.env_parser.NIOperation.num_inh_attrs];

	}

	public PaDclInfoLocalCol(final Object c__G_9, final Object c__G_8, final Object c_l, final Object c__G_6, final Object c_fn, final Object c__G_4, final Object c_t, final Object c__G_2, final Object c_o, final Object c__G_0) {
		super();
		this.child__G_9 = c__G_9;
		this.child__G_8 = c__G_8;
		this.child_l = c_l;
		this.child__G_6 = c__G_6;
		this.child_fn = c_fn;
		this.child__G_4 = c__G_4;
		this.child_t = c_t;
		this.child__G_2 = c__G_2;
		this.child_o = c_o;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_9;
	public final silver.modification.collection.env_parser.TLocColTerm getChild__G_9() {
		return (silver.modification.collection.env_parser.TLocColTerm) (child__G_9 = common.Util.demand(child__G_9));
	}

	private Object child__G_8;
	public final silver.definition.env.env_parser.TLParent_t getChild__G_8() {
		return (silver.definition.env.env_parser.TLParent_t) (child__G_8 = common.Util.demand(child__G_8));
	}

	private Object child_l;
	public final silver.definition.env.env_parser.NILocation getChild_l() {
		return (silver.definition.env.env_parser.NILocation) (child_l = common.Util.demand(child_l));
	}

	private Object child__G_6;
	public final silver.definition.env.env_parser.TComma_t getChild__G_6() {
		return (silver.definition.env.env_parser.TComma_t) (child__G_6 = common.Util.demand(child__G_6));
	}

	private Object child_fn;
	public final silver.definition.env.env_parser.NIName getChild_fn() {
		return (silver.definition.env.env_parser.NIName) (child_fn = common.Util.demand(child_fn));
	}

	private Object child__G_4;
	public final silver.definition.env.env_parser.TComma_t getChild__G_4() {
		return (silver.definition.env.env_parser.TComma_t) (child__G_4 = common.Util.demand(child__G_4));
	}

	private Object child_t;
	public final silver.definition.env.env_parser.NITypeRep getChild_t() {
		return (silver.definition.env.env_parser.NITypeRep) (child_t = common.Util.demand(child_t));
	}

	private Object child__G_2;
	public final silver.definition.env.env_parser.TComma_t getChild__G_2() {
		return (silver.definition.env.env_parser.TComma_t) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_o;
	public final silver.modification.collection.env_parser.NIOperation getChild_o() {
		return (silver.modification.collection.env_parser.NIOperation) (child_o = common.Util.demand(child_o));
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
			case i_l: return getChild_l();
			case i__G_6: return getChild__G_6();
			case i_fn: return getChild_fn();
			case i__G_4: return getChild__G_4();
			case i_t: return getChild_t();
			case i__G_2: return getChild__G_2();
			case i_o: return getChild_o();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_9: return child__G_9;
			case i__G_8: return child__G_8;
			case i_l: return child_l;
			case i__G_6: return child__G_6;
			case i_fn: return child_fn;
			case i__G_4: return child__G_4;
			case i_t: return child_t;
			case i__G_2: return child__G_2;
			case i_o: return child_o;
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
		throw new common.exceptions.SilverInternalError("Production silver:modification:collection:env_parser:aDclInfoLocalCol erroneously claimed to forward");
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
		return "silver:modification:collection:env_parser:aDclInfoLocalCol";
	}

	static void initProductionAttributeDefinitions() {
		// top.defs = [ localColDef(top.grammarName, l.alocation, fn.aname, t.typerep, o.operation) ]
		silver.modification.collection.env_parser.PaDclInfoLocalCol.synthesizedAttributes[silver.definition.env.env_parser.Init.silver_definition_env_defs__ON__silver_definition_env_env_parser_IDclInfo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.definition.env.NDef)silver.modification.collection.PlocalColDef.invoke(context.contextInheritedLazy(silver.definition.env.env_parser.Init.silver_definition_core_grammarName__ON__silver_definition_env_env_parser_IDclInfo), context.childDecoratedSynthesizedLazy(silver.modification.collection.env_parser.PaDclInfoLocalCol.i_l, silver.definition.env.env_parser.Init.silver_definition_env_env_parser_alocation__ON__silver_definition_env_env_parser_ILocation), context.childDecoratedSynthesizedLazy(silver.modification.collection.env_parser.PaDclInfoLocalCol.i_fn, silver.definition.env.env_parser.Init.silver_definition_env_env_parser_aname__ON__silver_definition_env_env_parser_IName), context.childDecoratedSynthesizedLazy(silver.modification.collection.env_parser.PaDclInfoLocalCol.i_t, silver.definition.env.env_parser.Init.silver_definition_env_typerep__ON__silver_definition_env_env_parser_ITypeRep), context.childDecoratedSynthesizedLazy(silver.modification.collection.env_parser.PaDclInfoLocalCol.i_o, silver.modification.collection.env_parser.Init.silver_modification_collection_operation__ON__silver_modification_collection_env_parser_IOperation))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } })); } };

	}

	public static final common.NodeFactory<PaDclInfoLocalCol> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PaDclInfoLocalCol> {

		@Override
		public PaDclInfoLocalCol invoke(final Object[] children, final Object[] annotations) {
			return new PaDclInfoLocalCol(children[0], children[1], children[2], children[3], children[4], children[5], children[6], children[7], children[8], children[9]);
		}
	};

}