
package edu.umn.cs.melt.ableC.concretesyntax;

// top::AssignExpr_c ::= e::ConditionalExpr_c 
public final class Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0 extends edu.umn.cs.melt.ableC.concretesyntax.NAssignExpr_c {

	public static final int i_e = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NConditionalExpr_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_p_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NAssignExpr_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NAssignExpr_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NConditionalExpr_c.num_inh_attrs];

	}

	public Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0(final Object c_e, final Object a_core_location) {
		super(a_core_location);
		this.child_e = c_e;

	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.concretesyntax.NConditionalExpr_c getChild_e() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NConditionalExpr_c) (child_e = common.Util.demand(child_e));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_e: return getChild_e();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_e: return child_e;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:p_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:p_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = e.ast
		edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_AssignExpr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NExpr)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0.i_e).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_ConditionalExpr_c)); } };
		// top.directName = e.directName
		edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_directName__ON__edu_umn_cs_melt_ableC_concretesyntax_AssignExpr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NMaybe)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0.i_e).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_directName__ON__edu_umn_cs_melt_ableC_concretesyntax_ConditionalExpr_c)); } };

	}

	public static final common.NodeFactory<Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0> {

		@Override
		public Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0 invoke(final Object[] children, final Object[] annotations) {
			return new Pp_edu_umn_cs_melt_ableC_concretesyntax_Expr_sv_22_0(children[0], annotations[0]);
		}
	};

}
