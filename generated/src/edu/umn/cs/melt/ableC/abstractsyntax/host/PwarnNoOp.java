
package edu.umn.cs.melt.ableC.abstractsyntax.host;

// top::UnaryOp ::= msg::[Message] 
public final class PwarnNoOp extends edu.umn.cs.melt.ableC.abstractsyntax.host.NUnaryOp {

	public static final int i_msg = 0;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_warnNoOp;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NUnaryOp.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.host.NUnaryOp.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PwarnNoOp(final Object c_msg, final Object a_core_location) {
		super(a_core_location);
		this.child_msg = c_msg;

	}

	private Object child_msg;
	public final common.ConsCell getChild_msg() {
		return (common.ConsCell) (child_msg = common.Util.demand(child_msg));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_msg: return getChild_msg();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_msg: return child_msg;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:host:warnNoOp erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:host:warnNoOp";
	}

	static void initProductionAttributeDefinitions() {
		// top.host = edu:umn:cs:melt:ableC:abstractsyntax:host:warnNoOp(, msg,, location=top.location)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_host__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NUnaryOp)new edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.i_msg), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.host.NUnaryOp)context.undecorate()).getAnno_core_location()); } })); } };
		// top.lifted = edu:umn:cs:melt:ableC:abstractsyntax:host:warnNoOp(, msg,, location=top.location)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_lifted__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NUnaryOp)new edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.i_msg), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.host.NUnaryOp)context.undecorate()).getAnno_core_location()); } })); } };
		// top.pp = text("",)
		edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("")))); } };
		// top.preExpr = true
		edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_preExpr__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// top.noLvalueConversion = false
		edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_noLvalueConversion__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return false; } };
		// top.typerep = top.op.typerep.defaultLvalueConversion.integerPromotions
		edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.host.NType)((edu.umn.cs.melt.ableC.abstractsyntax.host.NType)((edu.umn.cs.melt.ableC.abstractsyntax.host.NType)((common.DecoratedNode)context.inherited(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_op__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp)).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Expr)).decorate(context, (common.Lazy[])null).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_defaultLvalueConversion__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Type)).decorate(context, (common.Lazy[])null).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_integerPromotions__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_Type)); } };
		// top.injectedQualifiers := []
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_injectedQualifiers__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_injectedQualifiers__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] = new edu.umn.cs.melt.ableC.abstractsyntax.host.CAinjectedQualifiers(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_injectedQualifiers__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.edu_umn_cs_melt_ableC_abstractsyntax_host_injectedQualifiers__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });
		// top.errors := []
		if(edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.host.PwarnNoOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.host.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_host_UnaryOp]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });

	}

	public static final common.NodeFactory<PwarnNoOp> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PwarnNoOp> {

		@Override
		public PwarnNoOp invoke(final Object[] children, final Object[] annotations) {
			return new PwarnNoOp(children[0], annotations[0]);
		}
	};

}
