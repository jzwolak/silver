
package copper_features.test_layout.basics;

// t::Test ::= 
public final class PgeneratedTest_Basics_sv_26_55 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__copper_features_test_layout_basics_generatedTest_Basics_sv_26_55;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_Basics_sv_26_55() {
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
		return "copper_features:test_layout:basics:generatedTest_Basics_sv_26_55";
	}

	static void initProductionAttributeDefinitions() {
		// value = basic_parse(" asdf asdf ", "",).parseSuccess
		copper_features.test_layout.basics.PgeneratedTest_Basics_sv_26_55.localAttributes[copper_features.test_layout.basics.Init.value__ON__copper_features_test_layout_basics_generatedTest_Basics_sv_26_55] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)((core.NParseResult)copper_features.test_layout.basics.Pbasic_parse.invoke((new common.StringCatter(" asdf asdf ")), (new common.StringCatter("")))).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_parseSuccess__ON__core_ParseResult)); } };
		// expected = false
		copper_features.test_layout.basics.PgeneratedTest_Basics_sv_26_55.localAttributes[copper_features.test_layout.basics.Init.expected__ON__copper_features_test_layout_basics_generatedTest_Basics_sv_26_55] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return false; } };
		// t.msg = "Test at 'Basics.sv', 26, 0, 26, 91, 775, 866 failed.\nChecking that expression\n   basic_parse(\\\" asdf asdf \\\", \\\"\\\",).parseSuccess\nshould be same as expression\n   false\nActual value:\n   " ++ toStringFromBoolean(value,) ++ "\nExpected value: \n   " ++ toStringFromBoolean(expected,) ++ "\n" ++ ""
		copper_features.test_layout.basics.PgeneratedTest_Basics_sv_26_55.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'Basics.sv', 26, 0, 26, 91, 775, 866 failed.\nChecking that expression\n   basic_parse(\\\" asdf asdf \\\", \\\"\\\",).parseSuccess\nshould be same as expression\n   false\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromBoolean.invoke(context.localAsIsLazy(copper_features.test_layout.basics.Init.value__ON__copper_features_test_layout_basics_generatedTest_Basics_sv_26_55))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromBoolean.invoke(context.localAsIsLazy(copper_features.test_layout.basics.Init.expected__ON__copper_features_test_layout_basics_generatedTest_Basics_sv_26_55))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsBoolean(value, expected,)
		copper_features.test_layout.basics.PgeneratedTest_Basics_sv_26_55.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsBoolean.invoke(context.localAsIsLazy(copper_features.test_layout.basics.Init.value__ON__copper_features_test_layout_basics_generatedTest_Basics_sv_26_55), context.localAsIsLazy(copper_features.test_layout.basics.Init.expected__ON__copper_features_test_layout_basics_generatedTest_Basics_sv_26_55))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_Basics_sv_26_55> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_Basics_sv_26_55> {

		@Override
		public PgeneratedTest_Basics_sv_26_55 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_Basics_sv_26_55();
		}
	};

}
