
package edu.umn.cs.melt.ableC.concretesyntax;

// top::SelectionStmt_c ::= 'switch' '(' cond::Expr_c ')' body::Stmt_c 
public final class Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0 extends edu.umn.cs.melt.ableC.concretesyntax.NSelectionStmt_c {

	public static final int i__G_4 = 0;
	public static final int i__G_3 = 1;
	public static final int i_cond = 2;
	public static final int i__G_1 = 3;
	public static final int i_body = 4;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.TSWITCH.class,edu.umn.cs.melt.ableC.concretesyntax.TLParen_t.class,edu.umn.cs.melt.ableC.concretesyntax.NExpr_c.class,edu.umn.cs.melt.ableC.concretesyntax.TRParen_t.class,edu.umn.cs.melt.ableC.concretesyntax.NStmt_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_p_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NSelectionStmt_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NSelectionStmt_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[5][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_cond] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NExpr_c.num_inh_attrs];
	childInheritedAttributes[i_body] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NStmt_c.num_inh_attrs];

	}

	public Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0(final Object c__G_4, final Object c__G_3, final Object c_cond, final Object c__G_1, final Object c_body, final Object a_core_location) {
		super(a_core_location);
		this.child__G_4 = c__G_4;
		this.child__G_3 = c__G_3;
		this.child_cond = c_cond;
		this.child__G_1 = c__G_1;
		this.child_body = c_body;

	}

	private Object child__G_4;
	public final edu.umn.cs.melt.ableC.concretesyntax.TSWITCH getChild__G_4() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TSWITCH) (child__G_4 = common.Util.demand(child__G_4));
	}

	private Object child__G_3;
	public final edu.umn.cs.melt.ableC.concretesyntax.TLParen_t getChild__G_3() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TLParen_t) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child_cond;
	public final edu.umn.cs.melt.ableC.concretesyntax.NExpr_c getChild_cond() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NExpr_c) (child_cond = common.Util.demand(child_cond));
	}

	private Object child__G_1;
	public final edu.umn.cs.melt.ableC.concretesyntax.TRParen_t getChild__G_1() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TRParen_t) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child_body;
	public final edu.umn.cs.melt.ableC.concretesyntax.NStmt_c getChild_body() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NStmt_c) (child_body = common.Util.demand(child_body));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_4: return getChild__G_4();
			case i__G_3: return getChild__G_3();
			case i_cond: return getChild_cond();
			case i__G_1: return getChild__G_1();
			case i_body: return getChild_body();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_4: return child__G_4;
			case i__G_3: return child__G_3;
			case i_cond: return child_cond;
			case i__G_1: return child__G_1;
			case i_body: return child_body;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 5;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:p_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:p_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = ast:switchStmt(cond.ast, body.ast,)
		edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_SelectionStmt_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NStmt)new edu.umn.cs.melt.ableC.abstractsyntax.host.PswitchStmt(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0.i_cond, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Expr_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0.i_body, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Stmt_c))); } };

	}

	public static final common.NodeFactory<Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0> {

		@Override
		public Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0 invoke(final Object[] children, final Object[] annotations) {
			return new Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_88_0(children[0], children[1], children[2], children[3], children[4], annotations[0]);
		}
	};

}
