
package patt;

public final class Ppairmatching extends common.FunctionNode {

	public static final int i_p = 0;


	public static final Class<?> childTypes[] = { core.NPair.class };

	public static final int num_local_attrs = Init.count_local__ON__patt_pairmatching;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_p] = new common.Lazy[core.NPair.num_inh_attrs];

	}

	public Ppairmatching(final Object c_p) {
		this.child_p = c_p;

	}

	private Object child_p;
	public final core.NPair getChild_p() {
		return (core.NPair) (child_p = common.Util.demand(child_p));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_p: return getChild_p();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_p: return child_p;

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
		return "patt:pairmatching";
	}

	public static Boolean invoke(final Object c_p) {
		try {
		final common.DecoratedNode context = new Ppairmatching(c_p).decorate();
		//case p.fst, p.snd of true, true -> true | true, false -> false | false, _ -> true | _, _ -> error("wat",) end
		return (Boolean)(((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_459___fail_460 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((Boolean)core.Perror.invoke((new common.StringCatter("wat")))); } };
return new common.PatternLazy<Boolean, Boolean>() { public final Boolean eval(final common.DecoratedNode context, Boolean scrutineeIter) {final Boolean scrutinee = scrutineeIter; if(scrutinee == false) { return (Boolean)true; }
else if(scrutinee == true) { return (Boolean)new common.PatternLazy<Boolean, Boolean>() { public final Boolean eval(final common.DecoratedNode context, Boolean scrutineeIter) {final Boolean scrutinee = scrutineeIter; if(scrutinee == false) { return (Boolean)false; }
else if(scrutinee == true) { return (Boolean)true; }return ((Boolean)(__SV_LOCAL_459___fail_460.eval()));}}.eval(context, (Boolean)((Boolean)context.childDecorated(patt.Ppairmatching.i_p).synthesized(core.Init.core_snd__ON__core_Pair))); }return ((Boolean)(__SV_LOCAL_459___fail_460.eval()));}}.eval(context, (Boolean)((Boolean)context.childDecorated(patt.Ppairmatching.i_p).synthesized(core.Init.core_fst__ON__core_Pair))); } }).eval()));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function patt:pairmatching", t);
		}
	}

	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {
		@Override
		public Boolean invoke(final Object[] children, final Object[] namedNotApplicable) {
			return Ppairmatching.invoke(children[0]);
		}
	};
}