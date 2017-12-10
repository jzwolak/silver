
package silver.extension.doc.core;

public final class PtoMarkdown extends common.FunctionNode {

	public static final int i_c = 0;


	public static final Class<?> childTypes[] = { silver.extension.doc.core.NCommentItem.class };

	public static final int num_local_attrs = Init.count_local__ON__silver_extension_doc_core_toMarkdown;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_c] = new common.Lazy[silver.extension.doc.core.NCommentItem.num_inh_attrs];

	}

	public PtoMarkdown(final Object c_c) {
		this.child_c = c_c;

	}

	private Object child_c;
	public final silver.extension.doc.core.NCommentItem getChild_c() {
		return (silver.extension.doc.core.NCommentItem) (child_c = common.Util.demand(child_c));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_c: return getChild_c();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_c: return child_c;

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
		return "silver:extension:doc:core:toMarkdown";
	}

	public static common.StringCatter invoke(final Object c_c) {
		try {
		final common.DecoratedNode context = new PtoMarkdown(c_c).decorate();
		//case c of dclCommentItem(mod, name, sig, file, body) -> let signature :: String = if 0 == length(sig) then "" else "\n###### `" ++ sig ++ "`" in "\n\n#### _" ++ mod ++ "_ `" ++ name ++ "`" ++ signature ++ "\n> " ++ body.body ++ "\nIn file: " ++ file end | bodilessDclCommentItem(mod, name, sig, file) -> let signature :: String = if 0 == length(sig) then "" else "\n###### `" ++ sig ++ "`" in "\n\n#### _" ++ mod ++ "_ `" ++ name ++ "`" ++ signature ++ "\nIn file: " ++ file end end
		return (common.StringCatter)(new common.PatternLazy<common.DecoratedNode, common.StringCatter>() { public final common.StringCatter eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof silver.extension.doc.core.PbodilessDclCommentItem) { final common.Thunk<Object> __SV_LOCAL___pv11308___sv_pv_11309_mod = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv11310___sv_pv_11311_name = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(1); } };
final common.Thunk<Object> __SV_LOCAL___pv11312___sv_pv_11313_sig = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(2); } };
final common.Thunk<Object> __SV_LOCAL___pv11314___sv_pv_11307_file = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(3); } };
 return (common.StringCatter)((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11315_file = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv11314___sv_pv_11307_file.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11316_sig = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv11312___sv_pv_11313_sig.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11317_name = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv11310___sv_pv_11311_name.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11318_mod = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv11308___sv_pv_11309_mod.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11322_signature = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (Integer.valueOf((int)0).equals(Integer.valueOf(((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11316_sig.eval()))).length())) ? (new common.StringCatter("")) : new common.StringCatter((common.StringCatter)(new common.StringCatter("\n###### `")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11316_sig.eval())), (common.StringCatter)(new common.StringCatter("`"))))); } };
return new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n#### _")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11318_mod.eval())), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("_ `")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11317_name.eval())), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("`")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11322_signature.eval())), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nIn file: ")), (common.StringCatter)((common.StringCatter)(__SV_LOCAL_11315_file.eval()))))))))); } }).eval()); } }).eval()); } }).eval()); } }).eval()); } }).eval()); }
else if(scrutineeNode instanceof silver.extension.doc.core.PdclCommentItem) { final common.Thunk<Object> __SV_LOCAL___pv11326___sv_pv_11327_mod = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___pv11328___sv_pv_11329_name = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(1); } };
final common.Thunk<Object> __SV_LOCAL___pv11330___sv_pv_11331_sig = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(2); } };
final common.Thunk<Object> __SV_LOCAL___pv11332___sv_pv_11333_file = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.StringCatter)scrutinee.childAsIs(3); } };
final common.Thunk<Object> __SV_LOCAL___pv11334___sv_pv_11325_body = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (common.DecoratedNode)scrutinee.childAsIs(4); } };
 return (common.StringCatter)((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11335_body = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.DecoratedNode)(__SV_LOCAL___pv11334___sv_pv_11325_body.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11336_file = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv11332___sv_pv_11333_file.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11337_sig = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv11330___sv_pv_11331_sig.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11338_name = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv11328___sv_pv_11329_name.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11339_mod = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return ((common.StringCatter)(__SV_LOCAL___pv11326___sv_pv_11327_mod.eval())); } };
return ((common.StringCatter)(new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { final common.Thunk<Object> __SV_LOCAL_11345_signature = new common.Thunk<Object>(context) { public final Object doEval(final common.DecoratedNode context) { return (Integer.valueOf((int)0).equals(Integer.valueOf(((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11337_sig.eval()))).length())) ? (new common.StringCatter("")) : new common.StringCatter((common.StringCatter)(new common.StringCatter("\n###### `")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11337_sig.eval())), (common.StringCatter)(new common.StringCatter("`"))))); } };
return new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n#### _")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11339_mod.eval())), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("_ `")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11338_name.eval())), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("`")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)(__SV_LOCAL_11345_signature.eval())), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n> ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)((common.DecoratedNode)(__SV_LOCAL_11335_body.eval())).synthesized(silver.extension.doc.core.Init.silver_extension_doc_core_body__ON__silver_extension_doc_core_DclComment)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\nIn file: ")), (common.StringCatter)((common.StringCatter)(__SV_LOCAL_11336_file.eval()))))))))))); } }).eval()); } }).eval()); } }).eval()); } }).eval()); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((common.StringCatter)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at silver:extension:doc:core 'RootSpec.sv', 81, 9, 105, 19, 2091, 2670\n"))));}}.eval(context, (common.DecoratedNode)context.childDecorated(silver.extension.doc.core.PtoMarkdown.i_c)));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function silver:extension:doc:core:toMarkdown", t);
		}
	}

	public static final common.NodeFactory<common.StringCatter> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.StringCatter> {
		@Override
		public common.StringCatter invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PtoMarkdown.invoke(children[0]);
		}
	};
}