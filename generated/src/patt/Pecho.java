
package patt;

// t::Echo<a> ::= 
public final class Pecho extends patt.NEcho {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__patt_echo;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[patt.NEcho.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[patt.NEcho.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public Pecho() {
		super();

	}



	@Override
	public Object getChild(final int index) {
		switch(index) {

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 0;
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
		throw new common.exceptions.SilverInternalError("Production patt:echo erroneously claimed to forward");
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
		return "patt:echo";
	}

	static void initProductionAttributeDefinitions() {
		// t.output = t.input
		patt.Pecho.synthesizedAttributes[patt.Init.patt_output__ON__patt_Echo] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)context.inherited(patt.Init.patt_input__ON__patt_Echo)); } };

	}

	public static final common.NodeFactory<Pecho> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pecho> {

		@Override
		public Pecho invoke(final Object[] children, final Object[] annotations) {
			return new Pecho();
		}
	};

}
