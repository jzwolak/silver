
package silver_features;

// t::Test ::= 
public final class PgeneratedTest_Types_sv_99_26 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_features_generatedTest_Types_sv_99_26;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_Types_sv_99_26() {
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
		return "silver_features:generatedTest_Types_sv_99_26";
	}

	static void initProductionAttributeDefinitions() {
		// value = stringToChars(stfcTestString,)
		silver_features.PgeneratedTest_Types_sv_99_26.localAttributes[silver_features.Init.value__ON__silver_features_generatedTest_Types_sv_99_26] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.PstringToChars.invoke(silver_features.Init.stfcTestString)); } };
		// expected = stfcTestChars
		silver_features.PgeneratedTest_Types_sv_99_26.localAttributes[silver_features.Init.expected__ON__silver_features_generatedTest_Types_sv_99_26] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)silver_features.Init.stfcTestChars.eval()); } };
		// t.msg = "Test at 'Types.sv', 99, 0, 99, 84, 2686, 2770 failed.\nChecking that expression\n   stringToChars(stfcTestString,)\nshould be same as expression\n   stfcTestChars\nActual value:\n   " ++ toStringFromList(toStringFromInteger, value,) ++ "\nExpected value: \n   " ++ toStringFromList(toStringFromInteger, expected,) ++ "\n" ++ ""
		silver_features.PgeneratedTest_Types_sv_99_26.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'Types.sv', 99, 0, 99, 84, 2686, 2770 failed.\nChecking that expression\n   stringToChars(stfcTestString,)\nshould be same as expression\n   stfcTestChars\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromList.invoke(lib.extcore.PtoStringFromInteger.factory, context.localAsIsLazy(silver_features.Init.value__ON__silver_features_generatedTest_Types_sv_99_26))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromList.invoke(lib.extcore.PtoStringFromInteger.factory, context.localAsIsLazy(silver_features.Init.expected__ON__silver_features_generatedTest_Types_sv_99_26))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsList(equalsInteger, value, expected,)
		silver_features.PgeneratedTest_Types_sv_99_26.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsList.invoke(lib.extcore.PequalsInteger.factory, context.localAsIsLazy(silver_features.Init.value__ON__silver_features_generatedTest_Types_sv_99_26), context.localAsIsLazy(silver_features.Init.expected__ON__silver_features_generatedTest_Types_sv_99_26))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_Types_sv_99_26> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_Types_sv_99_26> {

		@Override
		public PgeneratedTest_Types_sv_99_26 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_Types_sv_99_26();
		}
	};

}
