
package patt;

// t::Test ::= 
public final class PgeneratedTest_Basics_sv_29_52 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__patt_generatedTest_Basics_sv_29_52;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_Basics_sv_29_52() {
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
		return true;
	}

	@Override
	public common.Node evalForward(final common.DecoratedNode context) {
		return ((silver.testing.NTest)new silver.testing.PdefTest());
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
		return "patt:generatedTest_Basics_sv_29_52";
	}

	static void initProductionAttributeDefinitions() {
		// value = basic2(pair(just(true,), nothing(,),),)
		patt.PgeneratedTest_Basics_sv_29_52.localAttributes[patt.Init.value__ON__patt_generatedTest_Basics_sv_29_52] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)patt.Pbasic2.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NPair)new core.Ppair(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NMaybe)new core.Pjust(true)); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NMaybe)new core.Pnothing()); } })); } })); } };
		// expected = false
		patt.PgeneratedTest_Basics_sv_29_52.localAttributes[patt.Init.expected__ON__patt_generatedTest_Basics_sv_29_52] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return false; } };
		// t.msg = "Test at 'Basics.sv', 29, 0, 29, 81, 846, 927 failed.\nChecking that expression\n   basic2(pair(just(true,), nothing(,),),)\nshould be same as expression\n   false\nActual value:\n   " ++ toStringFromBoolean(value,) ++ "\nExpected value: \n   " ++ toStringFromBoolean(expected,) ++ "\n" ++ ""
		patt.PgeneratedTest_Basics_sv_29_52.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'Basics.sv', 29, 0, 29, 81, 846, 927 failed.\nChecking that expression\n   basic2(pair(just(true,), nothing(,),),)\nshould be same as expression\n   false\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromBoolean.invoke(context.localAsIsLazy(patt.Init.value__ON__patt_generatedTest_Basics_sv_29_52))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromBoolean.invoke(context.localAsIsLazy(patt.Init.expected__ON__patt_generatedTest_Basics_sv_29_52))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsBoolean(value, expected,)
		patt.PgeneratedTest_Basics_sv_29_52.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsBoolean.invoke(context.localAsIsLazy(patt.Init.value__ON__patt_generatedTest_Basics_sv_29_52), context.localAsIsLazy(patt.Init.expected__ON__patt_generatedTest_Basics_sv_29_52))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_Basics_sv_29_52> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_Basics_sv_29_52> {

		@Override
		public PgeneratedTest_Basics_sv_29_52 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_Basics_sv_29_52();
		}
	};

}
