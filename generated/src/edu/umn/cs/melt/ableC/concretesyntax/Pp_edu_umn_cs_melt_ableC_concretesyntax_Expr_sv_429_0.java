
package edu.umn.cs.melt.ableC.concretesyntax;

// top::PostfixExpr_c ::= '(' ty::TypeName_c ')' '{' il::InitializerList_c ',' '}' 
public final class Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0 extends edu.umn.cs.melt.ableC.concretesyntax.NPostfixExpr_c {

	public static final int i__G_6 = 0;
	public static final int i_ty = 1;
	public static final int i__G_4 = 2;
	public static final int i__G_3 = 3;
	public static final int i_il = 4;
	public static final int i__G_1 = 5;
	public static final int i__G_0 = 6;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.TLParen_t.class,edu.umn.cs.melt.ableC.concretesyntax.NTypeName_c.class,edu.umn.cs.melt.ableC.concretesyntax.TRParen_t.class,edu.umn.cs.melt.ableC.concretesyntax.TLCurly_t.class,edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c.class,edu.umn.cs.melt.ableC.concretesyntax.TComma_t.class,edu.umn.cs.melt.ableC.concretesyntax.TRCurly_t.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_p_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NPostfixExpr_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NPostfixExpr_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[7][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_ty] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeName_c.num_inh_attrs];
	childInheritedAttributes[i_il] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c.num_inh_attrs];

	}

	public Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0(final Object c__G_6, final Object c_ty, final Object c__G_4, final Object c__G_3, final Object c_il, final Object c__G_1, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child__G_6 = c__G_6;
		this.child_ty = c_ty;
		this.child__G_4 = c__G_4;
		this.child__G_3 = c__G_3;
		this.child_il = c_il;
		this.child__G_1 = c__G_1;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_6;
	public final edu.umn.cs.melt.ableC.concretesyntax.TLParen_t getChild__G_6() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TLParen_t) (child__G_6 = common.Util.demand(child__G_6));
	}

	private Object child_ty;
	public final edu.umn.cs.melt.ableC.concretesyntax.NTypeName_c getChild_ty() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NTypeName_c) (child_ty = common.Util.demand(child_ty));
	}

	private Object child__G_4;
	public final edu.umn.cs.melt.ableC.concretesyntax.TRParen_t getChild__G_4() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TRParen_t) (child__G_4 = common.Util.demand(child__G_4));
	}

	private Object child__G_3;
	public final edu.umn.cs.melt.ableC.concretesyntax.TLCurly_t getChild__G_3() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TLCurly_t) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child_il;
	public final edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c getChild_il() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c) (child_il = common.Util.demand(child_il));
	}

	private Object child__G_1;
	public final edu.umn.cs.melt.ableC.concretesyntax.TComma_t getChild__G_1() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TComma_t) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child__G_0;
	public final edu.umn.cs.melt.ableC.concretesyntax.TRCurly_t getChild__G_0() {
		return (edu.umn.cs.melt.ableC.concretesyntax.TRCurly_t) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_6: return getChild__G_6();
			case i_ty: return getChild_ty();
			case i__G_4: return getChild__G_4();
			case i__G_3: return getChild__G_3();
			case i_il: return getChild_il();
			case i__G_1: return getChild__G_1();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_6: return child__G_6;
			case i_ty: return child_ty;
			case i__G_4: return child__G_4;
			case i__G_3: return child__G_3;
			case i_il: return child_il;
			case i__G_1: return child__G_1;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 7;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:p_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:p_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = ast:compoundLiteralExpr(ty.ast, ast:foldInit(il.ast,),location=top.location)
		edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_PostfixExpr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr)new edu.umn.cs.melt.ableC.abstractsyntax.host.PcompoundLiteralExpr(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0.i_ty, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeName_c), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NInitList)edu.umn.cs.melt.ableC.abstractsyntax.construction.PfoldInit.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0.i_il, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_InitializerList_c))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.NPostfixExpr_c)context.undecorate()).getAnno_core_location()); } })); } };

	}

	public static final common.NodeFactory<Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0> {

		@Override
		public Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0 invoke(final Object[] children, final Object[] annotations) {
			return new Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_429_0(children[0], children[1], children[2], children[3], children[4], children[5], children[6], annotations[0]);
		}
	};

}
