
package silver.translation.java.core;

public final class PmakeAnnoAssign extends common.FunctionNode {

	public static final int i_n = 0;


	public static final Class<?> childTypes[] = { silver.definition.env.NNamedSignatureElement.class };

	public static final int num_local_attrs = Init.count_local__ON__silver_translation_java_core_makeAnnoAssign;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_n] = new common.Lazy[silver.definition.env.NNamedSignatureElement.num_inh_attrs];

	}

	public PmakeAnnoAssign(final Object c_n) {
		this.child_n = c_n;

	}

	private Object child_n;
	public final silver.definition.env.NNamedSignatureElement getChild_n() {
		return (silver.definition.env.NNamedSignatureElement) (child_n = common.Util.demand(child_n));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_n: return getChild_n();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_n: return child_n;

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
		return "silver:translation:java:core:makeAnnoAssign";
	}

	public static common.StringCatter invoke(final Object c_n) {
		try {
		final common.DecoratedNode context = new PmakeAnnoAssign(c_n).decorate();
		//"\t\tthis.anno_" ++ fn ++ " = a_" ++ fn ++ ";\n"
		return (common.StringCatter)(new common.StringCatter((common.StringCatter)(new common.StringCatter("\t\tthis.anno_")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localAsIs(silver.translation.java.core.Init.fn__ON__silver_translation_java_core_makeAnnoAssign)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" = a_")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localAsIs(silver.translation.java.core.Init.fn__ON__silver_translation_java_core_makeAnnoAssign)), (common.StringCatter)(new common.StringCatter(";\n")))))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function silver:translation:java:core:makeAnnoAssign", t);
		}
	}

	public static final common.NodeFactory<common.StringCatter> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.StringCatter> {
		@Override
		public common.StringCatter invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PmakeAnnoAssign.invoke(children[0]);
		}
	};
}