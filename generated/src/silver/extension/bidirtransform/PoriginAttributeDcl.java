
package silver.extension.bidirtransform;

// top::AGDcl ::= 'origins' 'attribute' qns::QNameList ';' 
public final class PoriginAttributeDcl extends silver.definition.core.NAGDcl {

	public static final int i__G_3 = 0;
	public static final int i__G_2 = 1;
	public static final int i_qns = 2;
	public static final int i__G_0 = 3;


	public static final Class<?> childTypes[] = {silver.extension.bidirtransform.TOrigins_kwd.class,silver.definition.core.TAttribute_kwd.class,silver.extension.bidirtransform.NQNameList.class,silver.definition.core.TSemi_t.class};

	public static final int num_local_attrs = Init.count_local__ON__silver_extension_bidirtransform_originAttributeDcl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.definition.core.NAGDcl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.definition.core.NAGDcl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_qns] = new common.Lazy[silver.extension.bidirtransform.NQNameList.num_inh_attrs];

	}

	public PoriginAttributeDcl(final Object c__G_3, final Object c__G_2, final Object c_qns, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child__G_3 = c__G_3;
		this.child__G_2 = c__G_2;
		this.child_qns = c_qns;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_3;
	public final silver.extension.bidirtransform.TOrigins_kwd getChild__G_3() {
		return (silver.extension.bidirtransform.TOrigins_kwd) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child__G_2;
	public final silver.definition.core.TAttribute_kwd getChild__G_2() {
		return (silver.definition.core.TAttribute_kwd) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_qns;
	public final silver.extension.bidirtransform.NQNameList getChild_qns() {
		return (silver.extension.bidirtransform.NQNameList) (child_qns = common.Util.demand(child_qns));
	}

	private Object child__G_0;
	public final silver.definition.core.TSemi_t getChild__G_0() {
		return (silver.definition.core.TSemi_t) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_3: return getChild__G_3();
			case i__G_2: return getChild__G_2();
			case i_qns: return getChild_qns();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_3: return child__G_3;
			case i__G_2: return child__G_2;
			case i_qns: return child_qns;
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
		return true;
	}

	@Override
	public common.Node evalForward(final common.DecoratedNode context) {
		return ((silver.definition.core.NAGDcl)new silver.extension.bidirtransform.PoriginAttributes(context.childDecoratedSynthesizedLazy(silver.extension.bidirtransform.PoriginAttributeDcl.i_qns, silver.extension.bidirtransform.Init.silver_extension_bidirtransform_qList__ON__silver_extension_bidirtransform_QNameList), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NLocation)((silver.definition.core.NAGDcl)context.undecorate()).getAnno_core_location()); } }));
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
		return "silver:extension:bidirtransform:originAttributeDcl";
	}

	static void initProductionAttributeDefinitions() {
		// top.moduleNames = []
		silver.extension.bidirtransform.PoriginAttributeDcl.synthesizedAttributes[silver.definition.core.Init.silver_definition_env_moduleNames__ON__silver_definition_core_AGDcl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		// top.mdaSpecs = []
		silver.extension.bidirtransform.PoriginAttributeDcl.synthesizedAttributes[silver.modification.copper_mda.Init.silver_modification_copper_mda_mdaSpecs__ON__silver_definition_core_AGDcl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };

	}

	public static final common.NodeFactory<PoriginAttributeDcl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PoriginAttributeDcl> {

		@Override
		public PoriginAttributeDcl invoke(final Object[] children, final Object[] annotations) {
			return new PoriginAttributeDcl(children[0], children[1], children[2], children[3], annotations[0]);
		}
	};

}