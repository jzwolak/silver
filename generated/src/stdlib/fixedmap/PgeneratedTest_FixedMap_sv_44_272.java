
package stdlib.fixedmap;

// t::Test ::= 
public final class PgeneratedTest_FixedMap_sv_44_272 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__stdlib_fixedmap_generatedTest_FixedMap_sv_44_272;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_FixedMap_sv_44_272() {
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
		return "stdlib:fixedmap:generatedTest_FixedMap_sv_44_272";
	}

	static void initProductionAttributeDefinitions() {
		// value = head(tail(tail(l2,),),).snd
		stdlib.fixedmap.PgeneratedTest_FixedMap_sv_44_272.localAttributes[stdlib.fixedmap.Init.value__ON__stdlib_fixedmap_generatedTest_FixedMap_sv_44_272] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)((core.NPair)core.Phead.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Ptail.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Ptail.invoke(stdlib.fixedmap.Init.l2)); } })); } })).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_snd__ON__core_Pair)); } };
		// expected = 6
		stdlib.fixedmap.PgeneratedTest_FixedMap_sv_44_272.localAttributes[stdlib.fixedmap.Init.expected__ON__stdlib_fixedmap_generatedTest_FixedMap_sv_44_272] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)6); } };
		// t.msg = "Test at 'FixedMap.sv', 44, 0, 44, 67, 2064, 2131 failed.\nChecking that expression\n   head(tail(tail(l2,),),).snd\nshould be same as expression\n   6\nActual value:\n   " ++ toStringFromInteger(value,) ++ "\nExpected value: \n   " ++ toStringFromInteger(expected,) ++ "\n" ++ ""
		stdlib.fixedmap.PgeneratedTest_FixedMap_sv_44_272.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'FixedMap.sv', 44, 0, 44, 67, 2064, 2131 failed.\nChecking that expression\n   head(tail(tail(l2,),),).snd\nshould be same as expression\n   6\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(stdlib.fixedmap.Init.value__ON__stdlib_fixedmap_generatedTest_FixedMap_sv_44_272))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(stdlib.fixedmap.Init.expected__ON__stdlib_fixedmap_generatedTest_FixedMap_sv_44_272))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsInteger(value, expected,)
		stdlib.fixedmap.PgeneratedTest_FixedMap_sv_44_272.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsInteger.invoke(context.localAsIsLazy(stdlib.fixedmap.Init.value__ON__stdlib_fixedmap_generatedTest_FixedMap_sv_44_272), context.localAsIsLazy(stdlib.fixedmap.Init.expected__ON__stdlib_fixedmap_generatedTest_FixedMap_sv_44_272))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_FixedMap_sv_44_272> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_FixedMap_sv_44_272> {

		@Override
		public PgeneratedTest_FixedMap_sv_44_272 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_FixedMap_sv_44_272();
		}
	};

}
