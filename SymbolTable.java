import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hamed Ara
 */

//public class SymbolTable {
//    private Hashtable entries;
//    private SymbolTable parent;
//    private String id;
//    public SymbolTable(String id){
//        this.id = id;
//        entries= new Hashtable();
//        parent = null;
//    }
//    public SymbolTable getSymbolTableParent(){
//        return parent;
//    }
//    public void setSymbolTableParent(SymbolTable p){
//        this.parent = p;
//    }
//    public void addSymbol(){
//        
//    }
//    
//}


import java.util.Stack;
import java.util.Hashtable;


public class SymbolTable {
    private SymbolTable parent;
    private Hashtable<String, Object> symbolTable;
    private String id;
    public ArrayList<Symbol> childs;
    
    public void sortChildrenByparentCount(){
    	Collections.sort(childs,new Comparator<Symbol>() {

			@Override
			public int compare(Symbol arg0, Symbol arg1) {
				if(arg0.getParentCount()>arg1.getParentCount())
					return 1;
				else
					return -1;
			}
		});
    }
    
    public void setparentsnumber(){
    	for (int i = 0; i < childs.size(); i++) {
			childs.get(i).setParentCount( InheritanceGraph.parentNumber(childs.get(i).getId()) );
		}
    }
    public void showChildren(){
    	
    	for(int i=0; i<childs.size(); i++){
    		System.out.println( childs.get(i).getId()+ " === parent number ==== " +childs.get(i).getParentCount());
    	}
    }
    
    
    
    public SymbolTable(String i){
        symbolTable = new Hashtable<String, Object>();
        childs = new ArrayList<Symbol>();
        setParent(null);
        setId(i);
    }
    
    
    public Symbol getVariable(String name){
        if( !symbolTable.containsKey(name) )
            return null;
        Object sym= symbolTable.get(name);
        if( sym instanceof Symbol){
            return (Symbol)sym;
        }
        return null;
    }
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SymbolTable getParent() {
		return parent;
	}

	public void setParent(SymbolTable parent) {
		this.parent = parent;
	}
	
    public Hashtable<String, Object> getHashtable(){
    	return symbolTable;
    }
    
//    public void addSymbol(Symbol s,SymbolTable table ) {
//    	symbolTable.put(s.getId(), table );
//    	childs.add(s);
//    	table.parent = this;
//    }
    public void addVariableToTable(Symbol s){
    		
        symbolTable.put(s.getId(), s);
        childs.add(s);
    }
    public void addFunctionOrClassToTable(Symbol s,SymbolTable table){
        symbolTable.put(s.getId(), table);
        childs.add(s);
        table.parent = this;
    }
    
    public void addClass(Token n,Token m,SymbolTable table){
    	Symbol s ;
        if(n != null)
        	s = new Symbol( m.getText(), Kind.clas, n.getText() );
        else
        	s = new Symbol( m.getText(), Kind.clas, null );
        
        SymbolTable st = new SymbolTable(m.getText());
        
        table.addFunctionOrClassToTable(s,st);
    }
    
    public void addArgumentToFunctionSymbolTable(SymbolTable table){
    	ArrayList<Symbol> args = TrivialOperation.getArguments(table.getId());
    	
    	for (int i = 0; i < args.size(); i++) {
    		if(!args.get(i).getId().equals("self")){
    			table.addVariableToTable(args.get(i));
    		}
    		else{
    			System.out.println("\t Error: cannot use 'self' for arguments name!");
    			MainProgram.error_definition.add("\t Error: cannot use 'self' for arguments name!");
    			MainProgram.error = true;
    		}
		}
    	
    }
    
    public void addFunction(Token function,SymbolTable table,String className,String funcType){
    	Hashtable<String, Object> f = table.getHashtable();
		
    	if(!checkDuplicateFunctionsAndVariables(((SymbolTable)(f.get(className))), function.getText())){
    		SymbolTable funcSymbolTable = new SymbolTable(function.getText());
    		addArgumentToFunctionSymbolTable(funcSymbolTable);
    		
    		((SymbolTable)(f.get(className))).addFunctionOrClassToTable(
    				new Symbol(function.getText(), Kind.function, funcType),
    					funcSymbolTable);
    	}
    }
    
     public void addVariable(Token variableId,Token variableType,SymbolTable table,String className){
    	Hashtable<String, Object> f = table.getHashtable();
		String str = "SELF_TYPE";
    	
		if(!variableId.getText().equals("self")){
    		if(!checkDuplicateFunctionsAndVariables(((SymbolTable)(f.get(className))), "9"+variableId.getText())){
    			
    			Symbol s = new Symbol("9"+variableId.getText(), Kind.variable, variableType.getText());
    			if(str.equals(variableType.getText()))
    				s.setType(className);
    			((SymbolTable)(f.get(className))).addVariableToTable(s);
    		}
    	}
    	else{
    		System.out.println("\t Error: cannot use 'self' for attribute name!");
    		MainProgram.error_definition.add("\t Error: cannot use 'self' for attribute name!");
    		MainProgram.error = true;
    	}
    }
    
    //    public void addArgument(Token variableId,Token variableType,SymbolTable table,String funcName){
//    	Hashtable<String, Object> f = table.getHashtable();
//		//System.out.println("### "+ f.size());
//    	if(!checkDuplicateFunctionsAndVariables(((SymbolTable)(f.get(funcName))), "9"+variableId.getText())){
//    		Symbol s = new Symbol(variableId.getText(), Kind.variable, variableType.getText());
//    		((SymbolTable)(f.get(funcName))).addVariableToTable(s);
//    	}
//    }
    
    public SymbolTable getFunctionSymbolTable(String name){
//    	Enumeration<String> e = this.getHashtable().keys();
//    	while(e.hasMoreElements()){
//    		String n = e.nextElement();
//    		System.out.println("[ "+n+" ]");
//    		if(n.equals(name))
//    			return (SymbolTable)this.getHashtable().get(name);
//    	}
//    	return null;
        if(!this.getHashtable().containsKey(name))
            return null;
        return (SymbolTable)this.getHashtable().get(name);
    }
    
    public void initialized(){
    	
	///// class Object
		SymbolTable s1 = new SymbolTable("Object");
		s1.addFunctionOrClassToTable(new Symbol("abort", Kind.function, " = Object"), new SymbolTable("abort"));
		s1.addFunctionOrClassToTable(new Symbol("type_name", Kind.function, " = String"), new SymbolTable("type_name"));
		s1.addFunctionOrClassToTable(new Symbol("copy", Kind.function, " = SELF_TYPE"), new SymbolTable("copy"));
		addFunctionOrClassToTable(new Symbol("Object",Kind.clas,"Type"), s1);
	// symbol table for functions
	///// class IO
		SymbolTable s2 = new SymbolTable("IO");
		
		SymbolTable out1 = new SymbolTable("out_string");
		Symbol out1_s = new Symbol("x",Kind.argument,"String");
		out1.getHashtable().put("x",out1_s);
		out1.childs.add(out1_s);
		
		s2.addFunctionOrClassToTable(new Symbol("out_string", Kind.function, "String = SELF_TYPE"), out1);
		
		SymbolTable out = new SymbolTable("out_int");
		Symbol out_s = new Symbol("x",Kind.argument,"Int");
		out.getHashtable().put("x",out_s);
		out.childs.add(out_s);
		
		
		s2.addFunctionOrClassToTable(new Symbol("out_int", Kind.function, "Int = SELF_TYPE"), out);
		s2.addFunctionOrClassToTable(new Symbol("in_string", Kind.function, " = String"), new SymbolTable("in_string"));
		s2.addFunctionOrClassToTable(new Symbol("in_int", Kind.function, " = Int"), new SymbolTable("in_int"));
		
		// parent = Object
		s2.addFunctionOrClassToTable(new Symbol("abort", Kind.function, " = Object"), new SymbolTable("abort"));
		s2.addFunctionOrClassToTable(new Symbol("type_name", Kind.function, " = String"), new SymbolTable("type_name"));
		s2.addFunctionOrClassToTable(new Symbol("copy", Kind.function, " = SELF_TYPE"), new SymbolTable("copy"));
		
		addFunctionOrClassToTable(new Symbol("IO",Kind.clas,"Type"), s2);
	// symbol table for functions
	///// class Int
		SymbolTable s3 = new SymbolTable("Int");
		
		// parent = Object
		s3.addFunctionOrClassToTable(new Symbol("abort", Kind.function, " = Object"), new SymbolTable("abort"));
		s3.addFunctionOrClassToTable(new Symbol("type_name", Kind.function, " = String"), new SymbolTable("type_name"));
		s3.addFunctionOrClassToTable(new Symbol("copy", Kind.function, " = SELF_TYPE"), new SymbolTable("copy"));
		
		addFunctionOrClassToTable(new Symbol("Int",Kind.clas,"Type"), s3);
	///// class String
		SymbolTable s4 = new SymbolTable("String");
		s4.addFunctionOrClassToTable(new Symbol("length", Kind.function, " = Int"), new SymbolTable("lenght"));
		
		SymbolTable con = new SymbolTable("concat");
		Symbol con_s = new Symbol("s",Kind.argument,"String");
		con.getHashtable().put("s",con_s);
		con.childs.add(con_s);
		
		s4.addFunctionOrClassToTable(new Symbol("concat", Kind.function, "String = String"), con);
		SymbolTable sub = new SymbolTable("substr");
		Symbol sub_s1 = new Symbol("i",Kind.argument,"Int");
		Symbol sub_s2 = new Symbol("l",Kind.argument,"Int");
		sub.getHashtable().put("i",sub_s1);
		sub.getHashtable().put("l",sub_s2);
		sub.childs.add(sub_s1);
		sub.childs.add(sub_s2);
		
		
		s4.addFunctionOrClassToTable(new Symbol("substr", Kind.function, "Int x Int = String"), sub);
		
		// parent = Object
		s4.addFunctionOrClassToTable(new Symbol("abort", Kind.function, " = Object"), new SymbolTable("abort"));
		s4.addFunctionOrClassToTable(new Symbol("type_name", Kind.function, " = String"), new SymbolTable("type_name"));
		s4.addFunctionOrClassToTable(new Symbol("copy", Kind.function, " = SELF_TYPE"), new SymbolTable("copy"));
		
		addFunctionOrClassToTable(new Symbol("String",Kind.clas,"Type"), s4);
	// symbol table for functions
	///// class Bool
		SymbolTable s5 = new SymbolTable("Bool");
		
		// parent = Object
		s5.addFunctionOrClassToTable(new Symbol("abort", Kind.function, " = Object"), new SymbolTable("abort"));
		s5.addFunctionOrClassToTable(new Symbol("type_name", Kind.function, " = String"), new SymbolTable("type_name"));
		s5.addFunctionOrClassToTable(new Symbol("copy", Kind.function, " = SELF_TYPE"), new SymbolTable("copy"));
		
		addFunctionOrClassToTable(new Symbol("Bool",Kind.clas,"Type"), s5);
		
		
    }
//    public Object lookup(AbstractSymbol sym) {
//	if (tbl.empty()) {
////	    Utilities.fatalError("lookup: no scope in symbol table.");
//	}
//	// I break the abstraction here a bit by knowing that stack is 
//	// really a vector...
//	for (int i = tbl.size() - 1; i >= 0; i--) {
//	    Object info = ((Hashtable)tbl.elementAt(i)).get(sym);
//	    if (info != null) return info;
//	}
//	return null;
//    }

	

//    public Object probe(AbstractSymbol sym) {
//	if (tbl.empty()) {
////	    Utilities.fatalError("lookup: no scope in symbol table.");
//	}
//	return ((Hashtable)tbl.peek()).get(sym);
//    }
    
//    public String toString() {
//	String res = "";
//	// I break the abstraction here a bit by knowing that stack is 
//	// really a vector...
//	for (int i = tbl.size() - 1, j = 0; i >= 0; i--, j++) {
//	    res += "Scope " + j + ": " + tbl.elementAt(i) + "\n";
//	}
//	return res;
//    }
    
     
    public boolean checkDuplicateFunctionsAndVariables(SymbolTable table,String name){// in function vase error e fekonam bebarim tu class e MainProgram behtar bashe
    	Enumeration<String> keys = table.getHashtable().keys();
    	int count = 0;
    	while (keys.hasMoreElements()){
	    	if(name.equals(keys.nextElement()))
	    		count ++;
    	}
    	if(count > 0)
    	{
    		String var="";
    		if(name.length() > 1)
    			var = name.substring(0,1);
    		
    		if(var.equals("9")){
    			MainProgram.error_definition.add("\t Error: Variable with this name is already defined!");
    			System.out.println("\t Error: Variable with this name is already defined!");
    		}
    		//System.out.println("\t Error: Variable with '"+name.substring(1)+"' name is already defined!");
    		else{
    			System.out.println("\t Error: Function with this name is already defined!");
    			MainProgram.error_definition.add("\t Error: Function with this name is already defined!");
    		}
   		 
    		MainProgram.error = true;
    		return true;
    	}
    	return false;
    }
    
    public void printfunctionSymbolTable(SymbolTable table){
    	boolean flag = true;
    	for (int i = 0; i < table.childs.size(); i++) {
			if(table.childs.get(i).getKind() == Kind.argument){
				if(flag){
					System.out.println("\t\t"+"--> Arguments of this function:");
					flag = false;
				}
				System.out.println("\t\t"+table.childs.get(i).getId()+" : "+table.childs.get(i).getType());
			}
		}
    }
	
	public void printSymbolTable(){
		boolean MainClassFlag = false;
		boolean MainFunctionFlag = false;
		
		Enumeration<String> e = symbolTable.keys();
	   for(int j = 0;j<childs.size();j++) {
	    	String name = childs.get(j).getId();
	    	
	    	System.out.println(name+":");
	    	
	    	Node n = InheritanceGraph.existNode(name);
	    	if(n!=null){
	    	InheritanceGraph.syncOneNodeWithParents(n);
	    	
	    	
	    		SymbolTable a = (SymbolTable) symbolTable.get(name);
	    		
	    		
	    		if(name.equals("Main"))
	    			MainClassFlag = true;
	    		
	    		boolean flag1 = true;
	    		boolean flag2 = true;
	    		for (int i = 0; i < a.childs.size(); i++) {
	    			
	    			if(a.childs.get(i).getKind() == Kind.variable)
	    			{
	    				if(flag2){
	    					System.out.println("\t"+"--> variables of this class:");
	    					flag2 = false;
	    				}
	    				String id = a.childs.get(i).getId().substring(1);
	    				System.out.println("\t"+id+" : "+a.childs.get(i).getType());
	    			}
				}
	    		for (int i = 0; i < a.childs.size(); i++) {
	    			if(a.childs.get(i).getKind() == Kind.function){
	    				if(flag1){
	    					System.out.println("\t"+"--> functions of this class:");
	    					flag1 = false;
	    				}
	    				System.out.println("\t"+a.childs.get(i).getId()+" : "+a.childs.get(i).getType());
	    				
	    				if(a.childs.get(i).getId().equals("main"))
	    					MainFunctionFlag = true;
	    			
	    				
	    				printfunctionSymbolTable(a.getFunctionSymbolTable(a.childs.get(i).getId()));
	    			}
	    			
				}
	    		
	    }
	    }
	    
	    if(MainClassFlag == false){
	    	System.out.println();
			System.out.println("\t Error: 'Main' class undefined!");
			MainProgram.error_definition.add("\t Error: 'Main' class undefined!");
			
			MainProgram.error = true;
		}
	    else if(MainClassFlag == true && MainFunctionFlag == false){
	    	System.out.println();
			System.out.println("\t Error: 'main' function undefined!");
			MainProgram.error_definition.add("\t Error: 'main' function undefined!");
		
			MainProgram.error = true;
		}
	    
			
	}
	
	
}
    
	
	

