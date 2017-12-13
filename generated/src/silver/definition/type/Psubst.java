
package silver.definition.type;

public final class Psubst extends common.FunctionNode {

	public static final int i_tv = 0;
	public static final int i_te = 1;


	public static final Class<?> childTypes[] = { silver.definition.type.NTyVar.class,silver.definition.type.NType.class };

	public static final int num_local_attrs = Init.count_local__ON__silver_definition_type_subst;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_tv] = new common.Lazy[silver.definition.type.NTyVar.num_inh_attrs];
	childInheritedAttributes[i_te] = new common.Lazy[silver.definition.type.NType.num_inh_attrs];

	}

	public Psubst(final Object c_tv, final Object c_te) {
		this.child_tv = c_tv;
		this.child_te = c_te;

	}

	private Object child_tv;
	public final silver.definition.type.NTyVar getChild_tv() {
		return (silver.definition.type.NTyVar) (child_tv = common.Util.demand(child_tv));
	}

	private Object child_te;
	public final silver.definition.type.NType getChild_te() {
		return (silver.definition.type.NType) (child_te = common.Util.demand(child_te));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_tv: return getChild_tv();
			case i_te: return getChild_te();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_tv: return child_tv;
			case i_te: return child_te;

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
		return "silver:definition:type:subst";
	}

	public static silver.definition.type.NSubstitution invoke(final Object c_tv, final Object c_te) {
		try {
		final common.DecoratedNode context = new Psubst(c_tv, c_te).decorate();
		//goodSubst([ pair(tv, te) ])
		return (silver.definition.type.NSubstitution)(((silver.definition.type.NSubstitution)new silver.definition.type.PgoodSubst(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NPair)new core.Ppair(common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.definition.type.Psubst.i_tv)), common.Thunk.transformUndecorate(context.childDecoratedLazy(silver.definition.type.Psubst.i_te)))); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } })); } })));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function silver:definition:type:subst", t);
		}
	}

	public static final common.NodeFactory<silver.definition.type.NSubstitution> factory = new Factory();

	public static final class Factory extends common.NodeFactory<silver.definition.type.NSubstitution> {
		@Override
		public silver.definition.type.NSubstitution invoke(final Object[] children, final Object[] namedNotApplicable) {
			return Psubst.invoke(children[0], children[1]);
		}
	};
}