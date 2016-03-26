
import java.util.Stack;
import java.util.Hashtable;


class RuntimeSymbolTable {
    private Stack tbl;
    private static int blockCount =0;
    private static int letCount = 0;
    /** Creates an empty symbol table. */
    public RuntimeSymbolTable() {
	tbl = new Stack();
    }
    
    /** Enters a new scope. A scope must be entered before anything
     * can be added to the table.
     * */
    public void addSymbolTable(SymbolTable s){
        tbl.push(s);
    }
    public void enterClass(String name){
        SymbolTable classSymbol= MainProgram.getClassSymbolTable(name);
        if(classSymbol== null){
                Alert.error("SymbolTable of "+ name + " class does'nt exist");
                return;
            }
        tbl.push(classSymbol);
        Alert.info("enter to class " +name);
    }
    public void enterFunction(String name){
    	//Alert.info("\t\t ---> "+((SymbolTable)tbl.peek()).getId());
        SymbolTable f = ( (SymbolTable)tbl.peek() ).getFunctionSymbolTable(name);
        if(f==null){
            Alert.error("SymbolTable of "+ name + " function does'nt exist!");
            return;
        }
        tbl.push(f);
        Alert.info("enter function "+name);
    }
    public void enterBlock() {
    	//Alert.info("enter to new block");
	tbl.push(new SymbolTable("block"+blockCount));
        blockCount++;
    }
    
    public void enterLet(){
    	Alert.info("enter new let");
        tbl.push(new SymbolTable("let"+letCount));
        blockCount++;
    }
    public void addVariableToCurrentSymbolTable(Symbol s){
        Object obj =tbl.peek();
        if( !(obj instanceof SymbolTable) ){
            Alert.info("top of the stack is not symbol table! it's wierd!");
        }else{
            SymbolTable sym =(SymbolTable)obj;
            sym.addVariableToTable(s);
            Alert.info("symbol add successfully in curent table");
        }
    }
    public void exitLet(){
        while(letCount>0){
            if (tbl.empty()) {
            Alert.error("existLet: can't remove scope from an empty symbol table.");
            }
            else
                tbl.pop();
            
            
            letCount--;
        }
        Alert.info("exit from let");
    }
    
    /** Exits the most recently entered scope. */
    public void exitScope() {
	if (tbl.empty()) {
            Alert.error("existScope: can't remove scope from an empty symbol table.");
	}
        else
            tbl.pop();
        Alert.info("exit from scope");
    }

    /** Adds a new entry to the symbol table.
     *
     * @param id the symbol
     * @param info the data asosciated with id
     * */
//    public void addId(AbstractSymbol id, Object info) {
//	if (tbl.empty()) {
////	    Utilities.fatalError("addId: can't add a symbol without a scope.");
//	}
//	((Hashtable)tbl.peek()).put(id, info);
//    }

    /**
     * Looks up an item through all scopes of the symbol table.  If
     * found it returns the associated information field, if not it
     * returns <code>null</code>.
     * 
     * @param sym the symbol
     * @return the info associated with sym, or null if not found
     * */
    public SymbolTable lookupFunction(String name) {
	if (tbl.empty()) {
	    Alert.error("runtime stack symbol table is empty!");
            return null;
	}
	for (int i = tbl.size() - 1; i >= 0; i--) {
	    Object info = ((SymbolTable)tbl.elementAt(i)).getHashtable().get(name);
	    if(info instanceof SymbolTable)
                return (SymbolTable)info; 
	}
        
	return null;
    }
    public Symbol lookupVariable( String name){
        if (tbl.empty()) {
	    Alert.error("runtime stack symbol table is empty!");
            return null;
	}
	for (int i = tbl.size() - 1; i >= 0; i--) {
	    Object info = ((SymbolTable)tbl.elementAt(i)).getHashtable().get(name);
            if(info instanceof Symbol)
                return (Symbol)info;
        }
	for (int i = tbl.size() - 1; i >= 0; i--) {
	    Object info = ((SymbolTable)tbl.elementAt(i)).getHashtable().get("9"+name);
	    if (info instanceof Symbol)
                return (Symbol)info;
	}
        
	return null;
    }

    /** 
     * Probes the symbol table.  Check the top scope (only) for the
     * symbol <code>sym</code>.  If found, return the information field.
     * If not return <code>null</code>.
     *
     * @param sym the symbol
     * @return the info associated with sym, or null if not found
     * */
//    public Object probe(AbstractSymbol sym) {
//	if (tbl.empty()) {
////	    Utilities.fatalError("lookup: no scope in symbol table.");
//	}
//	return ((Hashtable)tbl.peek()).get(sym);
//    }
    
    /** Gets the string representation of the symbol table.  
     *
     * @return the string rep
     * */
    public String toString() {
	String res = "";
	// I break the abstraction here a bit by knowing that stack is 
	// really a vector...
	for (int i = tbl.size() - 1, j = 0; i >= 0; i--, j++) {
	    res += "Scope " + j + ": " + tbl.elementAt(i) + "\n";
	}
	return res;
    }
}
    
	
	
