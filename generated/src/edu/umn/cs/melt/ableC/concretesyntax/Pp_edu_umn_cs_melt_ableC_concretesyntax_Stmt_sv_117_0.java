
package edu.umn.cs.melt.ableC.concretesyntax;

// top::JumpStmt_c ::= 'continue' ';' 
public final class Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0 extends edu.umn.cs.melt.ableC.concretesyntax.NJumpStmt_c {

	public static final int i__G_1 = 0;
	public static final int i__G_0 = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.TCONTINUE.class,edu.umn.cs.melt.ableC.concretesyntax.TSemi_t.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_p_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NJumpStmt_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NJumpStmt_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0(final Object c__G_1, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child__G_1 = c__G_1;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_1;
	public final edu.umn.cs.melt.ableC.concretesyntax.TCONTINUE getChild__G_1() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TCONTINUE) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child__G_0;
	public final edu.umn.cs.melt.ableC.concretesyntax.TSemi_t getChild__G_0() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TSemi_t) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_1: return getChild__G_1();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_1: return child__G_1;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:p_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:p_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = ast:continueStmt(,)
		edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_JumpStmt_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NStmt)new edu.umn.cs.melt.ableC.abstractsyntax.host.PcontinueStmt()); } };

	}

	public static final common.NodeFactory<Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0> {

		@Override
		public Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0 invoke(final Object[] children, final Object[] annotations) {
			return new Pp_edu_umn_cs_melt_ableC_concretesyntax_Stmt_sv_117_0(children[0], children[1], annotations[0]);
		}
	};

}
