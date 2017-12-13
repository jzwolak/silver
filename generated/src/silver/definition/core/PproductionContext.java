
package silver.definition.core;

// top::BlockContext ::= sig::NamedSignature g::ProductionGraph 
public final class PproductionContext extends silver.definition.core.NBlockContext {

	public static final int i_sig = 0;
	public static final int i_g = 1;


	public static final Class<?> childTypes[] = {silver.definition.env.NNamedSignature.class,silver.definition.flow.driver.NProductionGraph.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_definition_core_productionContext;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.definition.core.NBlockContext.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.definition.core.NBlockContext.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_sig] = new common.Lazy[silver.definition.env.NNamedSignature.num_inh_attrs];
	childInheritedAttributes[i_g] = new common.Lazy[silver.definition.flow.driver.NProductionGraph.num_inh_attrs];

	}

	public PproductionContext(final Object c_sig, final Object c_g) {
		super();
		this.child_sig = c_sig;
		this.child_g = c_g;

	}

	private Object child_sig;
	public final silver.definition.env.NNamedSignature getChild_sig() {
		return (silver.definition.env.NNamedSignature) (child_sig = common.Util.demand(child_sig));
	}

	private Object child_g;
	public final silver.definition.flow.driver.NProductionGraph getChild_g() {
		return (silver.definition.flow.driver.NProductionGraph) (child_g = common.Util.demand(child_g));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_sig: return getChild_sig();
			case i_g: return getChild_g();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_sig: return child_sig;
			case i_g: return child_g;

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
		throw new common.exceptions.SilverInternalError("Production silver:definition:core:productionContext erroneously claimed to forward");
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
		return "silver:definition:core:productionContext";
	}

	static void initProductionAttributeDefinitions() {
		// top.fullName = sig.fullName
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_env_fullName__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(silver.definition.core.PproductionContext.i_sig).synthesized(silver.definition.env.Init.silver_definition_env_fullName__ON__silver_definition_env_NamedSignature)); } };
		// top.lhsNtName = sig.outputElement.typerep.typeName
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_lhsNtName__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((silver.definition.type.NType)((silver.definition.env.NNamedSignatureElement)context.childDecorated(silver.definition.core.PproductionContext.i_sig).synthesized(silver.definition.env.Init.silver_definition_env_outputElement__ON__silver_definition_env_NamedSignature)).decorate(context, (common.Lazy[])null).synthesized(silver.definition.env.Init.silver_definition_env_typerep__ON__silver_definition_env_NamedSignatureElement)).decorate(context, (common.Lazy[])null).synthesized(silver.definition.env.Init.silver_definition_env_typeName__ON__silver_definition_type_Type)); } };
		// top.signature = sig
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_signature__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.childDecorated(silver.definition.core.PproductionContext.i_sig).undecorate(); } };
		// top.sourceGrammar = substring(0, lastIndexOf(":", top.fullName), top.fullName)
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_env_sourceGrammar__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)core.Psubstring.invoke(Integer.valueOf((int)0), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((Integer)core.PlastIndexOf.invoke((new common.StringCatter(":")), context.contextSynthesizedLazy(silver.definition.core.Init.silver_definition_env_fullName__ON__silver_definition_core_BlockContext))); } }, context.contextSynthesizedLazy(silver.definition.core.Init.silver_definition_env_fullName__ON__silver_definition_core_BlockContext))); } };
		// top.prodFlowGraph = just(g)
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_prodFlowGraph__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NMaybe)new core.Pjust(common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.definition.core.PproductionContext.i_g)))); } };
		// top.permitForward = true
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_permitForward__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// top.hasPartialSignature = true
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_hasPartialSignature__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// top.hasFullSignature = true
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_hasFullSignature__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// top.permitProductionAttributes = true
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_permitProductionAttributes__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// top.permitLocalAttributes = true
		silver.definition.core.PproductionContext.synthesizedAttributes[silver.definition.core.Init.silver_definition_core_permitLocalAttributes__ON__silver_definition_core_BlockContext] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };

	}

	public static final common.NodeFactory<PproductionContext> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PproductionContext> {

		@Override
		public PproductionContext invoke(final Object[] children, final Object[] annotations) {
			return new PproductionContext(children[0], children[1]);
		}
	};

}