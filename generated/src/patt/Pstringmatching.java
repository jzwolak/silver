
package patt;

public final class Pstringmatching extends common.FunctionNode {

	public static final int i_s = 0;


	public static final Class<?> childTypes[] = { common.StringCatter.class };

	public static final int num_local_attrs = Init.count_local__ON__patt_stringmatching;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public Pstringmatching(final Object c_s) {
		this.child_s = c_s;

	}

	private Object child_s;
	public final common.StringCatter getChild_s() {
		return (common.StringCatter) (child_s = common.Util.demand(child_s));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_s: return getChild_s();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_s: return child_s;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		return "patt:stringmatching";
	}

	public static Boolean invoke(final Object c_s) {
		try {
		final common.DecoratedNode context = new Pstringmatching(c_s).decorate();
		//case s of "true" -> true | "false" -> false end
		return (Boolean)(new common.PatternLazy<common.StringCatter, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.StringCatter scrutineeIter) {final common.StringCatter scrutinee = scrutineeIter; if(scrutinee.equals("false")) { return (Boolean)false; }
else if(scrutinee.equals("true")) { return (Boolean)true; }return ((Boolean)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at patt 'Normal.sv', 6, 9, 9, 12, 72, 148\n"))));}}.eval(context, (common.StringCatter)((common.StringCatter)context.childAsIs(patt.Pstringmatching.i_s))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function patt:stringmatching", t);
		}
	}

	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {
		@Override
		public Boolean invoke(final Object[] children, final Object[] namedNotApplicable) {
			return Pstringmatching.invoke(children[0]);
		}
	};
}