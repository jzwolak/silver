
package silver_features;

// t::Test ::= 
public final class PgeneratedTest_ThunkTransforms_sv_37_102 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_features_generatedTest_ThunkTransforms_sv_37_102;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_ThunkTransforms_sv_37_102() {
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
		return "silver_features:generatedTest_ThunkTransforms_sv_37_102";
	}

	static void initProductionAttributeDefinitions() {
		// value = thunkUndecGoWrong(aDevProd(,),).aDecVal
		silver_features.PgeneratedTest_ThunkTransforms_sv_37_102.localAttributes[silver_features.Init.value__ON__silver_features_generatedTest_ThunkTransforms_sv_37_102] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)((silver_features.NADecoratedValue)silver_features.PthunkUndecGoWrong.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((silver_features.NADecoratedValue)new silver_features.PaDevProd()); } })).decorate(context, (common.Lazy[])null).synthesized(silver_features.Init.silver_features_aDecVal__ON__silver_features_ADecoratedValue)); } };
		// expected = "1234"
		silver_features.PgeneratedTest_ThunkTransforms_sv_37_102.localAttributes[silver_features.Init.expected__ON__silver_features_generatedTest_ThunkTransforms_sv_37_102] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("1234")); } };
		// t.msg = "Test at 'ThunkTransforms.sv', 37, 0, 37, 85, 1245, 1330 failed.\nChecking that expression\n   thunkUndecGoWrong(aDevProd(,),).aDecVal\nshould be same as expression\n   \\\"1234\\\"\nActual value:\n   " ++ toStringFromString(value,) ++ "\nExpected value: \n   " ++ toStringFromString(expected,) ++ "\n" ++ ""
		silver_features.PgeneratedTest_ThunkTransforms_sv_37_102.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'ThunkTransforms.sv', 37, 0, 37, 85, 1245, 1330 failed.\nChecking that expression\n   thunkUndecGoWrong(aDevProd(,),).aDecVal\nshould be same as expression\n   \\\"1234\\\"\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromString.invoke(context.localAsIsLazy(silver_features.Init.value__ON__silver_features_generatedTest_ThunkTransforms_sv_37_102))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromString.invoke(context.localAsIsLazy(silver_features.Init.expected__ON__silver_features_generatedTest_ThunkTransforms_sv_37_102))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsString(value, expected,)
		silver_features.PgeneratedTest_ThunkTransforms_sv_37_102.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsString.invoke(context.localAsIsLazy(silver_features.Init.value__ON__silver_features_generatedTest_ThunkTransforms_sv_37_102), context.localAsIsLazy(silver_features.Init.expected__ON__silver_features_generatedTest_ThunkTransforms_sv_37_102))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_ThunkTransforms_sv_37_102> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_ThunkTransforms_sv_37_102> {

		@Override
		public PgeneratedTest_ThunkTransforms_sv_37_102 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_ThunkTransforms_sv_37_102();
		}
	};

}
