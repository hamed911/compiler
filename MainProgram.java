
import java.util.ArrayList;
import java.util.Enumeration;


public class MainProgram {
	public static ArrayList<String> error_definition = new ArrayList<>();
	public static boolean error = false;
	public static SymbolTable MainSymbolTable = new SymbolTable("MainSymbolTable");
        public static RuntimeSymbolTable runTimeSymbolTable = new RuntimeSymbolTable();
        
        public static RuntimeSymbolTable getRuntimeSymbolTable(){
            return runTimeSymbolTable;
        }
        public static SymbolTable getClassSymbolTable(String className){
            Enumeration<String> key = MainSymbolTable.getHashtable().keys();
            while(key.hasMoreElements()){
                String name = key.nextElement();
                if(name.equals(className))
                    return (SymbolTable) MainSymbolTable.getHashtable().get(className);
            }
            return null;
        }
        
        public static boolean matchTypesInAssign(String leftType,String rightType){
        	ArrayList<String> parents = InheritanceGraph.returnAllParrent(rightType);
        
        	if(parents!=null){
        	for (int i = 0; i < parents.size(); i++) {
				if(parents.get(i).equals(leftType))
					return true;
			}
        	}
        	
        	return false;
        }
        
        public static boolean containClassName(String className){
            SymbolTable temp = MainSymbolTable.getFunctionSymbolTable(className);
            if(temp== null)
                return false;
            else 
                return true;
        }
        
        public static int compareCaseConditionWithTypes(ArrayList<String> parent,ArrayList<String> types){
            int k=-1;
            for(int i=0;i<parent.size(); i++){
                for(int j=0;j<types.size(); j++){
                    if(parent.get(i).equals(types.get(j))){
                        if(k==-1)
                            k=i;
                        else{
                            Alert.error("type in case is not unique");
                        }
                    }
                }
                if(k!=-1)
                    break;
            }
            return k;
        }
        
        public static String returnTypeFunction(String className,String funcName){
            String type="";
            String[] parts;
            
           // MainSymbolTable.get
            SymbolTable table = getClassSymbolTable(className);
            for (int i = 0; i < table.childs.size(); i++) {
                if(table.childs.get(i).getKind() == Kind.function && table.childs.get(i).getId().equals(funcName)){
                    type = table.childs.get(i).getType();
                    break;
                }
            }
            
            parts = type.split(" ");
            
            
            return parts[parts.length - 1];
        }
        
        public static ArrayList<Symbol> getchildsOfSymbolTable(String className,String funcName){
            return (((SymbolTable)(getClassSymbolTable(className))).getFunctionSymbolTable(funcName)).childs;
        }
        
        public static boolean argumentCheck(ArrayList<String> ar,String className,String funcName){
        int count = 0;
        int index = 0;
       
        
        ArrayList<Symbol> childs = getchildsOfSymbolTable(className, funcName);
        
       // System.out.println("["+funcName+"  "+className+"  "+childs.size()+"]");
        
        for (int i = 0; i < childs.size(); i++) {
            if(childs.get(i).getKind() == Kind.argument){
                count ++;
               // System.out.print("\t"+childs.get(i).getType());
            }
        }
        
        if(count != ar.size())
            return false;
        
        for (int i = 0; i < childs.size(); i++) {
            if(childs.get(i).getKind() == Kind.argument){
                if(!childs.get(i).getType().equals(ar.get(index)))
                    return false;
             //   System.out.print("\t"+ar.get(index));
                index++;
            }
        }
       // System.out.println();
        
        return true;
        }
}
