
package silver_features;

// t::Test ::= 
public final class PgeneratedTest_Lambda_sv_22_43 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_features_generatedTest_Lambda_sv_22_43;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_Lambda_sv_22_43() {
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
		return "silver_features:generatedTest_Lambda_sv_22_43";
	}

	static void initProductionAttributeDefinitions() {
		// value = addThree(param,)
		silver_features.PgeneratedTest_Lambda_sv_22_43.localAttributes[silver_features.Init.value__ON__silver_features_generatedTest_Lambda_sv_22_43] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)((common.NodeFactory<Integer>)silver_features.Init.addThree.eval()).invoke(new Object[]{silver_features.Init.param}, null)); } };
		// expected = 7
		silver_features.PgeneratedTest_Lambda_sv_22_43.localAttributes[silver_features.Init.expected__ON__silver_features_generatedTest_Lambda_sv_22_43] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)7); } };
		// t.msg = "Test at 'Lambda.sv', 22, 0, 22, 56, 771, 827 failed.\nChecking that expression\n   addThree(param,)\nshould be same as expression\n   7\nActual value:\n   " ++ toStringFromInteger(value,) ++ "\nExpected value: \n   " ++ toStringFromInteger(expected,) ++ "\n" ++ ""
		silver_features.PgeneratedTest_Lambda_sv_22_43.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'Lambda.sv', 22, 0, 22, 56, 771, 827 failed.\nChecking that expression\n   addThree(param,)\nshould be same as expression\n   7\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(silver_features.Init.value__ON__silver_features_generatedTest_Lambda_sv_22_43))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(silver_features.Init.expected__ON__silver_features_generatedTest_Lambda_sv_22_43))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsInteger(value, expected,)
		silver_features.PgeneratedTest_Lambda_sv_22_43.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsInteger.invoke(context.localAsIsLazy(silver_features.Init.value__ON__silver_features_generatedTest_Lambda_sv_22_43), context.localAsIsLazy(silver_features.Init.expected__ON__silver_features_generatedTest_Lambda_sv_22_43))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_Lambda_sv_22_43> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_Lambda_sv_22_43> {

		@Override
		public PgeneratedTest_Lambda_sv_22_43 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_Lambda_sv_22_43();
		}
	};

}
