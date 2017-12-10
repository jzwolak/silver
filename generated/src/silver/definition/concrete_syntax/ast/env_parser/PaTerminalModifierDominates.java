
package silver.definition.concrete_syntax.ast.env_parser;

// top::ITerminalModifier ::= 'dom' '(' n::INames ')' 
public final class PaTerminalModifierDominates extends silver.definition.concrete_syntax.ast.env_parser.NITerminalModifier {

	public static final int i__G_3 = 0;
	public static final int i__G_2 = 1;
	public static final int i_n = 2;
	public static final int i__G_0 = 3;


	public static final Class<?> childTypes[] = {silver.definition.concrete_syntax.ast.env_parser.TDomTerm.class,silver.definition.env.env_parser.TLParent_t.class,silver.definition.env.env_parser.NINames.class,silver.definition.env.env_parser.TRParent_t.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_definition_concrete_syntax_ast_env_parser_aTerminalModifierDominates;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.definition.concrete_syntax.ast.env_parser.NITerminalModifier.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.definition.concrete_syntax.ast.env_parser.NITerminalModifier.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_n] = new common.Lazy[silver.definition.env.env_parser.NINames.num_inh_attrs];

	}

	public PaTerminalModifierDominates(final Object c__G_3, final Object c__G_2, final Object c_n, final Object c__G_0) {
		super();
		this.child__G_3 = c__G_3;
		this.child__G_2 = c__G_2;
		this.child_n = c_n;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_3;
	public final silver.definition.concrete_syntax.ast.env_parser.TDomTerm getChild__G_3() {
		return (silver.definition.concrete_syntax.ast.env_parser.TDomTerm) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child__G_2;
	public final silver.definition.env.env_parser.TLParent_t getChild__G_2() {
		return (silver.definition.env.env_parser.TLParent_t) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_n;
	public final silver.definition.env.env_parser.NINames getChild_n() {
		return (silver.definition.env.env_parser.NINames) (child_n = common.Util.demand(child_n));
	}

	private Object child__G_0;
	public final silver.definition.env.env_parser.TRParent_t getChild__G_0() {
		return (silver.definition.env.env_parser.TRParent_t) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_3: return getChild__G_3();
			case i__G_2: return getChild__G_2();
			case i_n: return getChild_n();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_3: return child__G_3;
			case i__G_2: return child__G_2;
			case i_n: return child_n;
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
		throw new common.exceptions.SilverInternalError("Production silver:definition:concrete_syntax:ast:env_parser:aTerminalModifierDominates erroneously claimed to forward");
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
		return "silver:definition:concrete_syntax:ast:env_parser:aTerminalModifierDominates";
	}

	static void initProductionAttributeDefinitions() {
		// top.terminalModifiers = [ termDominates(n.names) ]
		silver.definition.concrete_syntax.ast.env_parser.PaTerminalModifierDominates.synthesizedAttributes[silver.definition.concrete_syntax.ast.env_parser.Init.silver_definition_concrete_syntax_ast_env_parser_terminalModifiers__ON__silver_definition_concrete_syntax_ast_env_parser_ITerminalModifier] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver.definition.concrete_syntax.ast.NSyntaxTerminalModifier)new silver.definition.concrete_syntax.ast.PtermDominates(context.childDecoratedSynthesizedLazy(silver.definition.concrete_syntax.ast.env_parser.PaTerminalModifierDominates.i_n, silver.definition.env.env_parser.Init.silver_definition_env_env_parser_names__ON__silver_definition_env_env_parser_INames))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } })); } };

	}

	public static final common.NodeFactory<PaTerminalModifierDominates> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PaTerminalModifierDominates> {

		@Override
		public PaTerminalModifierDominates invoke(final Object[] children, final Object[] annotations) {
			return new PaTerminalModifierDominates(children[0], children[1], children[2], children[3]);
		}
	};

}