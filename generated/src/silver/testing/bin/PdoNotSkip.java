
package silver.testing.bin;

public final class PdoNotSkip extends common.FunctionNode {

	public static final int i_absoluteFilePath = 0;
	public static final int i_ioIn = 1;


	public static final Class<?> childTypes[] = { common.StringCatter.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__silver_testing_bin_doNotSkip;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PdoNotSkip(final Object c_absoluteFilePath, final Object c_ioIn) {
		this.child_absoluteFilePath = c_absoluteFilePath;
		this.child_ioIn = c_ioIn;

	}

	private Object child_absoluteFilePath;
	public final common.StringCatter getChild_absoluteFilePath() {
		return (common.StringCatter) (child_absoluteFilePath = common.Util.demand(child_absoluteFilePath));
	}

	private Object child_ioIn;
	public final Object getChild_ioIn() {
		return (Object) (child_ioIn = common.Util.demand(child_ioIn));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_absoluteFilePath: return getChild_absoluteFilePath();
			case i_ioIn: return getChild_ioIn();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_absoluteFilePath: return child_absoluteFilePath;
			case i_ioIn: return child_ioIn;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		return "silver:testing:bin:doNotSkip";
	}

	public static core.NIOVal invoke(final Object c_absoluteFilePath, final Object c_ioIn) {
		try {
		final common.DecoratedNode context = new PdoNotSkip(c_absoluteFilePath, c_ioIn).decorate();
		//ioval(ioIn, false,)
		return (core.NIOVal)(((core.NIOVal)new core.Pioval(context.childAsIsLazy(silver.testing.bin.PdoNotSkip.i_ioIn), false)));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function silver:testing:bin:doNotSkip", t);
		}
	}

	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {
		@Override
		public core.NIOVal invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PdoNotSkip.invoke(children[0], children[1]);
		}
	};
}