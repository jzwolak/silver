
package stdlib.rawtreemap;

// t::Test ::= 
public final class PgeneratedTest_TestTreeMap_sv_57_406 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__stdlib_rawtreemap_generatedTest_TestTreeMap_sv_57_406;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_TestTreeMap_sv_57_406() {
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
		return "stdlib:rawtreemap:generatedTest_TestTreeMap_sv_57_406";
	}

	static void initProductionAttributeDefinitions() {
		// value = head(l2,).fst
		stdlib.rawtreemap.PgeneratedTest_TestTreeMap_sv_57_406.localAttributes[stdlib.rawtreemap.Init.value__ON__stdlib_rawtreemap_generatedTest_TestTreeMap_sv_57_406] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((core.NPair)core.Phead.invoke(stdlib.rawtreemap.Init.l2)).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_fst__ON__core_Pair)); } };
		// expected = "hello"
		stdlib.rawtreemap.PgeneratedTest_TestTreeMap_sv_57_406.localAttributes[stdlib.rawtreemap.Init.expected__ON__stdlib_rawtreemap_generatedTest_TestTreeMap_sv_57_406] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("hello")); } };
		// t.msg = "Test at 'TestTreeMap.sv', 57, 0, 57, 60, 2724, 2784 failed.\nChecking that expression\n   head(l2,).fst\nshould be same as expression\n   \\\"hello\\\"\nActual value:\n   " ++ toStringFromString(value,) ++ "\nExpected value: \n   " ++ toStringFromString(expected,) ++ "\n" ++ ""
		stdlib.rawtreemap.PgeneratedTest_TestTreeMap_sv_57_406.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'TestTreeMap.sv', 57, 0, 57, 60, 2724, 2784 failed.\nChecking that expression\n   head(l2,).fst\nshould be same as expression\n   \\\"hello\\\"\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromString.invoke(context.localAsIsLazy(stdlib.rawtreemap.Init.value__ON__stdlib_rawtreemap_generatedTest_TestTreeMap_sv_57_406))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromString.invoke(context.localAsIsLazy(stdlib.rawtreemap.Init.expected__ON__stdlib_rawtreemap_generatedTest_TestTreeMap_sv_57_406))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsString(value, expected,)
		stdlib.rawtreemap.PgeneratedTest_TestTreeMap_sv_57_406.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsString.invoke(context.localAsIsLazy(stdlib.rawtreemap.Init.value__ON__stdlib_rawtreemap_generatedTest_TestTreeMap_sv_57_406), context.localAsIsLazy(stdlib.rawtreemap.Init.expected__ON__stdlib_rawtreemap_generatedTest_TestTreeMap_sv_57_406))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_TestTreeMap_sv_57_406> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_TestTreeMap_sv_57_406> {

		@Override
		public PgeneratedTest_TestTreeMap_sv_57_406 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_TestTreeMap_sv_57_406();
		}
	};

}
