
package stdlib.deque;

// t::Test ::= 
public final class PgeneratedTest_TestDeque_sv_25_302 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__stdlib_deque_generatedTest_TestDeque_sv_25_302;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_TestDeque_sv_25_302() {
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
		return "stdlib:deque:generatedTest_TestDeque_sv_25_302";
	}

	static void initProductionAttributeDefinitions() {
		// value = dqLast(dq2,)
		stdlib.deque.PgeneratedTest_TestDeque_sv_25_302.localAttributes[stdlib.deque.Init.value__ON__stdlib_deque_generatedTest_TestDeque_sv_25_302] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)silver.util.deque.PdqLast.invoke(stdlib.deque.Init.dq2)); } };
		// expected = 1
		stdlib.deque.PgeneratedTest_TestDeque_sv_25_302.localAttributes[stdlib.deque.Init.expected__ON__stdlib_deque_generatedTest_TestDeque_sv_25_302] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)1); } };
		// t.msg = "Test at 'TestDeque.sv', 25, 0, 25, 54, 687, 741 failed.\nChecking that expression\n   dqLast(dq2,)\nshould be same as expression\n   1\nActual value:\n   " ++ toStringFromInteger(value,) ++ "\nExpected value: \n   " ++ toStringFromInteger(expected,) ++ "\n" ++ ""
		stdlib.deque.PgeneratedTest_TestDeque_sv_25_302.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'TestDeque.sv', 25, 0, 25, 54, 687, 741 failed.\nChecking that expression\n   dqLast(dq2,)\nshould be same as expression\n   1\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(stdlib.deque.Init.value__ON__stdlib_deque_generatedTest_TestDeque_sv_25_302))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(stdlib.deque.Init.expected__ON__stdlib_deque_generatedTest_TestDeque_sv_25_302))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsInteger(value, expected,)
		stdlib.deque.PgeneratedTest_TestDeque_sv_25_302.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsInteger.invoke(context.localAsIsLazy(stdlib.deque.Init.value__ON__stdlib_deque_generatedTest_TestDeque_sv_25_302), context.localAsIsLazy(stdlib.deque.Init.expected__ON__stdlib_deque_generatedTest_TestDeque_sv_25_302))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_TestDeque_sv_25_302> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_TestDeque_sv_25_302> {

		@Override
		public PgeneratedTest_TestDeque_sv_25_302 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_TestDeque_sv_25_302();
		}
	};

}
