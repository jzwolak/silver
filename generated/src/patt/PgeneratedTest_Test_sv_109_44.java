
package patt;

// t::Test ::= 
public final class PgeneratedTest_Test_sv_109_44 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__patt_generatedTest_Test_sv_109_44;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_Test_sv_109_44() {
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
		return "patt:generatedTest_Test_sv_109_44";
	}

	static void initProductionAttributeDefinitions() {
		// value = typeEquals(arrow(unitT(,), unitT(,),), arrow(unitT(,), unitT(,),),).isJust
		patt.PgeneratedTest_Test_sv_109_44.localAttributes[patt.Init.value__ON__patt_generatedTest_Test_sv_109_44] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)((core.NMaybe)patt.PtypeEquals.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((patt.NType)new patt.Parrow(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((patt.NType)new patt.PunitT()); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((patt.NType)new patt.PunitT()); } })); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((patt.NType)new patt.Parrow(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((patt.NType)new patt.PunitT()); } }, new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((patt.NType)new patt.PunitT()); } })); } })).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_isJust__ON__core_Maybe)); } };
		// expected = true
		patt.PgeneratedTest_Test_sv_109_44.localAttributes[patt.Init.expected__ON__patt_generatedTest_Test_sv_109_44] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// t.msg = "Test at 'Test.sv', 109, 0, 109, 109, 3259, 3368 failed.\nChecking that expression\n   typeEquals(arrow(unitT(,), unitT(,),), arrow(unitT(,), unitT(,),),).isJust\nshould be same as expression\n   true\nActual value:\n   " ++ toStringFromBoolean(value,) ++ "\nExpected value: \n   " ++ toStringFromBoolean(expected,) ++ "\n" ++ ""
		patt.PgeneratedTest_Test_sv_109_44.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'Test.sv', 109, 0, 109, 109, 3259, 3368 failed.\nChecking that expression\n   typeEquals(arrow(unitT(,), unitT(,),), arrow(unitT(,), unitT(,),),).isJust\nshould be same as expression\n   true\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromBoolean.invoke(context.localAsIsLazy(patt.Init.value__ON__patt_generatedTest_Test_sv_109_44))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromBoolean.invoke(context.localAsIsLazy(patt.Init.expected__ON__patt_generatedTest_Test_sv_109_44))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsBoolean(value, expected,)
		patt.PgeneratedTest_Test_sv_109_44.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsBoolean.invoke(context.localAsIsLazy(patt.Init.value__ON__patt_generatedTest_Test_sv_109_44), context.localAsIsLazy(patt.Init.expected__ON__patt_generatedTest_Test_sv_109_44))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_Test_sv_109_44> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_Test_sv_109_44> {

		@Override
		public PgeneratedTest_Test_sv_109_44 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_Test_sv_109_44();
		}
	};

}
