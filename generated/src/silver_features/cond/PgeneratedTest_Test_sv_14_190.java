
package silver_features.cond;

// t::Test ::= 
public final class PgeneratedTest_Test_sv_14_190 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_features_cond_generatedTest_Test_sv_14_190;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_Test_sv_14_190() {
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
		return "silver_features:cond:generatedTest_Test_sv_14_190";
	}

	static void initProductionAttributeDefinitions() {
		// value = silver_features:cond:c:aVal
		silver_features.cond.PgeneratedTest_Test_sv_14_190.localAttributes[silver_features.cond.Init.value__ON__silver_features_cond_generatedTest_Test_sv_14_190] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)silver_features.cond.c.Init.aVal.eval()); } };
		// expected = 1
		silver_features.cond.PgeneratedTest_Test_sv_14_190.localAttributes[silver_features.cond.Init.expected__ON__silver_features_cond_generatedTest_Test_sv_14_190] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)1); } };
		// t.msg = "Test at 'Test.sv', 14, 0, 14, 68, 231, 299 failed.\nChecking that expression\n   silver_features:cond:c:aVal\nshould be same as expression\n   1\nActual value:\n   " ++ toStringFromInteger(value,) ++ "\nExpected value: \n   " ++ toStringFromInteger(expected,) ++ "\n" ++ ""
		silver_features.cond.PgeneratedTest_Test_sv_14_190.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'Test.sv', 14, 0, 14, 68, 231, 299 failed.\nChecking that expression\n   silver_features:cond:c:aVal\nshould be same as expression\n   1\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(silver_features.cond.Init.value__ON__silver_features_cond_generatedTest_Test_sv_14_190))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(silver_features.cond.Init.expected__ON__silver_features_cond_generatedTest_Test_sv_14_190))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsInteger(value, expected,)
		silver_features.cond.PgeneratedTest_Test_sv_14_190.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsInteger.invoke(context.localAsIsLazy(silver_features.cond.Init.value__ON__silver_features_cond_generatedTest_Test_sv_14_190), context.localAsIsLazy(silver_features.cond.Init.expected__ON__silver_features_cond_generatedTest_Test_sv_14_190))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_Test_sv_14_190> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_Test_sv_14_190> {

		@Override
		public PgeneratedTest_Test_sv_14_190 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_Test_sv_14_190();
		}
	};

}
