
package silver_features;

// t::Test ::= 
public final class PgeneratedTest_Collections_sv_137_89 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_features_generatedTest_Collections_sv_137_89;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_Collections_sv_137_89() {
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
		return "silver_features:generatedTest_Collections_sv_137_89";
	}

	static void initProductionAttributeDefinitions() {
		// value = fromMaybe(2, colTest1(,).colFun,)
		silver_features.PgeneratedTest_Collections_sv_137_89.localAttributes[silver_features.Init.value__ON__silver_features_generatedTest_Collections_sv_137_89] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)core.PfromMaybe.invoke(Integer.valueOf((int)2), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((core.NMaybe)((silver_features.NColNT)new silver_features.PcolTest1()).decorate(context, (common.Lazy[])null).synthesized(silver_features.Init.silver_features_colFun__ON__silver_features_ColNT)); } })); } };
		// expected = 1
		silver_features.PgeneratedTest_Collections_sv_137_89.localAttributes[silver_features.Init.expected__ON__silver_features_generatedTest_Collections_sv_137_89] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)1); } };
		// t.msg = "Test at 'Collections.sv', 137, 0, 137, 74, 3678, 3752 failed.\nChecking that expression\n   fromMaybe(2, colTest1(,).colFun,)\nshould be same as expression\n   1\nActual value:\n   " ++ toStringFromInteger(value,) ++ "\nExpected value: \n   " ++ toStringFromInteger(expected,) ++ "\n" ++ ""
		silver_features.PgeneratedTest_Collections_sv_137_89.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'Collections.sv', 137, 0, 137, 74, 3678, 3752 failed.\nChecking that expression\n   fromMaybe(2, colTest1(,).colFun,)\nshould be same as expression\n   1\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(silver_features.Init.value__ON__silver_features_generatedTest_Collections_sv_137_89))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(silver_features.Init.expected__ON__silver_features_generatedTest_Collections_sv_137_89))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsInteger(value, expected,)
		silver_features.PgeneratedTest_Collections_sv_137_89.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsInteger.invoke(context.localAsIsLazy(silver_features.Init.value__ON__silver_features_generatedTest_Collections_sv_137_89), context.localAsIsLazy(silver_features.Init.expected__ON__silver_features_generatedTest_Collections_sv_137_89))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_Collections_sv_137_89> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_Collections_sv_137_89> {

		@Override
		public PgeneratedTest_Collections_sv_137_89 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_Collections_sv_137_89();
		}
	};

}
