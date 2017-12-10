
package silver.extension.bidirtransform;

public final class PfilterDefs extends common.FunctionNode {

	public static final int i_input = 0;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class };

	public static final int num_local_attrs = Init.count_local__ON__silver_extension_bidirtransform_filterDefs;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PfilterDefs(final Object c_input) {
		this.child_input = c_input;

	}

	private Object child_input;
	public final common.ConsCell getChild_input() {
		return (common.ConsCell) (child_input = common.Util.demand(child_input));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_input: return getChild_input();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_input: return child_input;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		return "silver:extension:bidirtransform:filterDefs";
	}

	public static common.ConsCell invoke(final Object c_input) {
		try {
		final common.DecoratedNode context = new PfilterDefs(c_input).decorate();
		//if null(input) then [] else case hd of aliasedLhsDef(_, _, _, _, _) -> tl | lhsDef(_, _, _, _) -> tl | forwardDef(_, _, _) -> tl | prodDclDef(_) -> tl | _ -> [ hd ] ++ tl end
		return (common.ConsCell)((((Boolean)core.Pnull.invoke(context.childAsIsLazy(silver.extension.bidirtransform.PfilterDefs.i_input))) ? ((common.ConsCell)core.Pnil.invoke()) : ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_13277___fail_13278 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(common.Thunk.transformUndecorate(context.localDecoratedLazy(silver.extension.bidirtransform.Init.hd__ON__silver_extension_bidirtransform_filterDefs)), new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } })); } }, context.localAsIsLazy(silver.extension.bidirtransform.Init.tl__ON__silver_extension_bidirtransform_filterDefs))); } };
return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.definition.env.PaliasedLhsDef) { final common.Thunk<Object> __SV_LOCAL___pv13286___sv_tmp_pv_13287 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv13288___sv_tmp_pv_13289 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.DecoratedNode)scrutinee.childDecorated(1); } };
final common.Thunk<Object> __SV_LOCAL___pv13290___sv_tmp_pv_13291 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(2); } };
final common.Thunk<Object> __SV_LOCAL___pv13292___sv_tmp_pv_13293 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.DecoratedNode)scrutinee.childDecorated(3); } };
final common.Thunk<Object> __SV_LOCAL___pv13294___sv_tmp_pv_13295 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(4); } };
 return (common.ConsCell)((common.ConsCell)context.localAsIs(silver.extension.bidirtransform.Init.tl__ON__silver_extension_bidirtransform_filterDefs)); }
else if(scrutineeNode instanceof silver.definition.env.PforwardDef) { final common.Thunk<Object> __SV_LOCAL___pv13296___sv_tmp_pv_13297 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv13298___sv_tmp_pv_13299 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.DecoratedNode)scrutinee.childDecorated(1); } };
final common.Thunk<Object> __SV_LOCAL___pv13300___sv_tmp_pv_13301 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.DecoratedNode)scrutinee.childDecorated(2); } };
 return (common.ConsCell)((common.ConsCell)context.localAsIs(silver.extension.bidirtransform.Init.tl__ON__silver_extension_bidirtransform_filterDefs)); }
else if(scrutineeNode instanceof silver.definition.env.PlhsDef) { final common.Thunk<Object> __SV_LOCAL___pv13302___sv_tmp_pv_13303 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv13304___sv_tmp_pv_13305 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.DecoratedNode)scrutinee.childDecorated(1); } };
final common.Thunk<Object> __SV_LOCAL___pv13306___sv_tmp_pv_13307 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(2); } };
final common.Thunk<Object> __SV_LOCAL___pv13308___sv_tmp_pv_13309 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.DecoratedNode)scrutinee.childDecorated(3); } };
 return (common.ConsCell)((common.ConsCell)context.localAsIs(silver.extension.bidirtransform.Init.tl__ON__silver_extension_bidirtransform_filterDefs)); }
else if(scrutineeNode instanceof silver.definition.env.PprodDclDef) { final common.Thunk<Object> __SV_LOCAL___pv13310___sv_tmp_pv_13311 = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.DecoratedNode)scrutinee.childDecorated(0); } };
 return (common.ConsCell)((common.ConsCell)context.localAsIs(silver.extension.bidirtransform.Init.tl__ON__silver_extension_bidirtransform_filterDefs)); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)(__SV_LOCAL_13277___fail_13278.eval()));}}.eval(context, (common.DecoratedNode)context.localDecorated(silver.extension.bidirtransform.Init.hd__ON__silver_extension_bidirtransform_filterDefs)); } }).eval())));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function silver:extension:bidirtransform:filterDefs", t);
		}
	}

	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {
		@Override
		public common.ConsCell invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PfilterDefs.invoke(children[0]);
		}
	};
}