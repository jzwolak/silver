
package silver_features.anno;

// t::Test ::= 
public final class PgeneratedTest_Anno_sv_70_196 extends silver.testing.NTest {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__silver_features_anno_generatedTest_Anno_sv_70_196;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[silver.testing.NTest.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[silver.testing.NTest.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PgeneratedTest_Anno_sv_70_196() {
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
		return "silver_features:anno:generatedTest_Anno_sv_70_196";
	}

	static void initProductionAttributeDefinitions() {
		// value = nt3.what
		silver_features.anno.PgeneratedTest_Anno_sv_70_196.localAttributes[silver_features.anno.Init.value__ON__silver_features_anno_generatedTest_Anno_sv_70_196] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)((silver_features.anno.NAnnoNT)silver_features.anno.Init.nt3.eval()).getAnno_silver_features_anno_what()); } };
		// expected = 5
		silver_features.anno.PgeneratedTest_Anno_sv_70_196.localAttributes[silver_features.anno.Init.expected__ON__silver_features_anno_generatedTest_Anno_sv_70_196] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return Integer.valueOf((int)5); } };
		// t.msg = "Test at 'Anno.sv', 70, 0, 70, 53, 1574, 1627 failed.\nChecking that expression\n   nt3.what\nshould be same as expression\n   5\nActual value:\n   " ++ toStringFromInteger(value,) ++ "\nExpected value: \n   " ++ toStringFromInteger(expected,) ++ "\n" ++ ""
		silver_features.anno.PgeneratedTest_Anno_sv_70_196.synthesizedAttributes[silver.testing.Init.silver_testing_msg__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Test at 'Anno.sv', 70, 0, 70, 53, 1574, 1627 failed.\nChecking that expression\n   nt3.what\nshould be same as expression\n   5\nActual value:\n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(silver_features.anno.Init.value__ON__silver_features_anno_generatedTest_Anno_sv_70_196))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nExpected value: \n   ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)lib.extcore.PtoStringFromInteger.invoke(context.localAsIsLazy(silver_features.anno.Init.expected__ON__silver_features_anno_generatedTest_Anno_sv_70_196))), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n")), (common.StringCatter)(new common.StringCatter(""))))))); } };
		// t.pass = equalsInteger(value, expected,)
		silver_features.anno.PgeneratedTest_Anno_sv_70_196.synthesizedAttributes[silver.testing.Init.silver_testing_pass__ON__silver_testing_Test] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Boolean)lib.extcore.PequalsInteger.invoke(context.localAsIsLazy(silver_features.anno.Init.value__ON__silver_features_anno_generatedTest_Anno_sv_70_196), context.localAsIsLazy(silver_features.anno.Init.expected__ON__silver_features_anno_generatedTest_Anno_sv_70_196))); } };

	}

	public static final common.NodeFactory<PgeneratedTest_Anno_sv_70_196> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgeneratedTest_Anno_sv_70_196> {

		@Override
		public PgeneratedTest_Anno_sv_70_196 invoke(final Object[] children, final Object[] annotations) {
			return new PgeneratedTest_Anno_sv_70_196();
		}
	};

}
