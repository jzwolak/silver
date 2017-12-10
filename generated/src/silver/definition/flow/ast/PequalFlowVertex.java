
package silver.definition.flow.ast;

public final class PequalFlowVertex extends common.FunctionNode {

	public static final int i_a = 0;
	public static final int i_b = 1;


	public static final Class<?> childTypes[] = { silver.definition.flow.ast.NFlowVertex.class,silver.definition.flow.ast.NFlowVertex.class };

	public static final int num_local_attrs = Init.count_local__ON__silver_definition_flow_ast_equalFlowVertex;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_a] = new common.Lazy[silver.definition.flow.ast.NFlowVertex.num_inh_attrs];
	childInheritedAttributes[i_b] = new common.Lazy[silver.definition.flow.ast.NFlowVertex.num_inh_attrs];

	}

	public PequalFlowVertex(final Object c_a, final Object c_b) {
		this.child_a = c_a;
		this.child_b = c_b;

	}

	private Object child_a;
	public final silver.definition.flow.ast.NFlowVertex getChild_a() {
		return (silver.definition.flow.ast.NFlowVertex) (child_a = common.Util.demand(child_a));
	}

	private Object child_b;
	public final silver.definition.flow.ast.NFlowVertex getChild_b() {
		return (silver.definition.flow.ast.NFlowVertex) (child_b = common.Util.demand(child_b));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_a: return getChild_a();
			case i_b: return getChild_b();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_a: return child_a;
			case i_b: return child_b;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		return "silver:definition:flow:ast:equalFlowVertex";
	}

	public static Boolean invoke(final Object c_a, final Object c_b) {
		try {
		final common.DecoratedNode context = new PequalFlowVertex(c_a, c_b).decorate();
		//case a, b of lhsSynVertex(a1), lhsSynVertex(a2) -> a1 == a2 | lhsInhVertex(a1), lhsInhVertex(a2) -> a1 == a2 | rhsVertex(s1, a1), rhsVertex(s2, a2) -> s1 == s2 && a1 == a2 | localEqVertex(f1), localEqVertex(f2) -> f1 == f2 | localVertex(f1, a1), localVertex(f2, a2) -> f1 == f2 && a1 == a2 | anonEqVertex(f1), anonEqVertex(f2) -> f1 == f2 | anonVertex(f1, a1), anonVertex(f2, a2) -> f1 == f2 && a1 == a2 | _, _ -> false end
		return (Boolean)(((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6252___fail_6253 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return false; } };
return new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.flow.ast.PanonEqVertex) { final common.Thunk<Object> __SV_LOCAL___pv6256___sv_pv_6257_f1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
 return (Boolean)new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.flow.ast.PanonEqVertex) { final common.Thunk<Object> __SV_LOCAL___pv6260___sv_pv_6259_f2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6261_f2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6260___sv_pv_6259_f2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6262_f1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6256___sv_pv_6257_f1.eval())); } };
return ((common.StringCatter)(__SV_LOCAL_6262_f1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6261_f2.eval()))); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL_6252___fail_6253.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.definition.flow.ast.PequalFlowVertex.i_b)); }
else if(scrutineeNode instanceof silver.definition.flow.ast.PanonVertex) { final common.Thunk<Object> __SV_LOCAL___pv6305___sv_pv_6306_f1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv6307___sv_pv_6308_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(1); } };
 return (Boolean)new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.flow.ast.PanonVertex) { final common.Thunk<Object> __SV_LOCAL___pv6313___sv_pv_6314_f2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv6315___sv_pv_6316_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(1); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6312_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6315___sv_pv_6316_a2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6311_f2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6313___sv_pv_6314_f2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6310_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6307___sv_pv_6308_a1.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6309_f1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6305___sv_pv_6306_f1.eval())); } };
return (((common.StringCatter)(__SV_LOCAL_6309_f1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6311_f2.eval()))) && ((common.StringCatter)(__SV_LOCAL_6310_a1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6312_a2.eval())))); } }).eval()); } }).eval()); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL_6252___fail_6253.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.definition.flow.ast.PequalFlowVertex.i_b)); }
else if(scrutineeNode instanceof silver.definition.flow.ast.PlhsInhVertex) { final common.Thunk<Object> __SV_LOCAL___pv6299___sv_pv_6300_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
 return (Boolean)new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.flow.ast.PlhsInhVertex) { final common.Thunk<Object> __SV_LOCAL___pv6303___sv_pv_6304_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6302_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6303___sv_pv_6304_a2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6301_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6299___sv_pv_6300_a1.eval())); } };
return ((common.StringCatter)(__SV_LOCAL_6301_a1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6302_a2.eval()))); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL_6252___fail_6253.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.definition.flow.ast.PequalFlowVertex.i_b)); }
else if(scrutineeNode instanceof silver.definition.flow.ast.PlhsSynVertex) { final common.Thunk<Object> __SV_LOCAL___pv6293___sv_pv_6294_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
 return (Boolean)new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.flow.ast.PlhsSynVertex) { final common.Thunk<Object> __SV_LOCAL___pv6297___sv_pv_6298_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6296_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6297___sv_pv_6298_a2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6295_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6293___sv_pv_6294_a1.eval())); } };
return ((common.StringCatter)(__SV_LOCAL_6295_a1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6296_a2.eval()))); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL_6252___fail_6253.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.definition.flow.ast.PequalFlowVertex.i_b)); }
else if(scrutineeNode instanceof silver.definition.flow.ast.PlocalEqVertex) { final common.Thunk<Object> __SV_LOCAL___pv6287___sv_pv_6288_f1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
 return (Boolean)new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.flow.ast.PlocalEqVertex) { final common.Thunk<Object> __SV_LOCAL___pv6291___sv_pv_6292_f2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6290_f2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6291___sv_pv_6292_f2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6289_f1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6287___sv_pv_6288_f1.eval())); } };
return ((common.StringCatter)(__SV_LOCAL_6289_f1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6290_f2.eval()))); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL_6252___fail_6253.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.definition.flow.ast.PequalFlowVertex.i_b)); }
else if(scrutineeNode instanceof silver.definition.flow.ast.PlocalVertex) { final common.Thunk<Object> __SV_LOCAL___pv6275___sv_pv_6276_f1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv6277___sv_pv_6278_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(1); } };
 return (Boolean)new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.flow.ast.PlocalVertex) { final common.Thunk<Object> __SV_LOCAL___pv6283___sv_pv_6284_f2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv6285___sv_pv_6286_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(1); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6282_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6285___sv_pv_6286_a2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6281_f2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6283___sv_pv_6284_f2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6280_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6277___sv_pv_6278_a1.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6279_f1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6275___sv_pv_6276_f1.eval())); } };
return (((common.StringCatter)(__SV_LOCAL_6279_f1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6281_f2.eval()))) && ((common.StringCatter)(__SV_LOCAL_6280_a1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6282_a2.eval())))); } }).eval()); } }).eval()); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL_6252___fail_6253.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.definition.flow.ast.PequalFlowVertex.i_b)); }
else if(scrutineeNode instanceof silver.definition.flow.ast.PrhsVertex) { final common.Thunk<Object> __SV_LOCAL___pv6263___sv_pv_6264_s1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv6265___sv_pv_6266_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(1); } };
 return (Boolean)new common.PatternLazy<common.DecoratedNode, Boolean>() { public final Boolean eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.flow.ast.PrhsVertex) { final common.Thunk<Object> __SV_LOCAL___pv6271___sv_pv_6272_s2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv6273___sv_pv_6274_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(1); } };
 return (Boolean)((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6270_a2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6273___sv_pv_6274_a2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6269_s2 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6271___sv_pv_6272_s2.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6268_a1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6265___sv_pv_6266_a1.eval())); } };
return ((Boolean)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_6267_s1 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv6263___sv_pv_6264_s1.eval())); } };
return (((common.StringCatter)(__SV_LOCAL_6267_s1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6269_s2.eval()))) && ((common.StringCatter)(__SV_LOCAL_6268_a1.eval())).equals(((common.StringCatter)(__SV_LOCAL_6270_a2.eval())))); } }).eval()); } }).eval()); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL_6252___fail_6253.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.definition.flow.ast.PequalFlowVertex.i_b)); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((Boolean)(__SV_LOCAL_6252___fail_6253.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.definition.flow.ast.PequalFlowVertex.i_a)); } }).eval()));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function silver:definition:flow:ast:equalFlowVertex", t);
		}
	}

	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {
		@Override
		public Boolean invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PequalFlowVertex.invoke(children[0], children[1]);
		}
	};
}