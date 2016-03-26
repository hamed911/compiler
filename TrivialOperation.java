import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;


import java.util.*;


public class TrivialOperation {
	private static Map<String,ArrayList<Symbol>> functionsList = new HashMap<>();
        
	public static String getFunctionType(String funcName,Token returnType){
		String funcType = "";
		for (int i = 0; i < functionsList.get(funcName).size(); i++) {
			funcType += functionsList.get(funcName).get(i).getType();
			//System.out.print(functionsList.get(funcName).get(i));
			if(i!= functionsList.get(funcName).size() -1){
				funcType += " x ";
			//	System.out.print(" x ");
			}
		}
		//System.out.println(" = "+returnType.getText());
		funcType += " = "+returnType.getText();
		
		return funcType;
	}
	
	public static void addFunc(String funcName){
		functionsList.put(funcName, new ArrayList<Symbol>());
	}
	
	public static void addArgu(String className,String funcName,Token inputType,Token inputId){
		if(checkArgu(funcName, inputId)){
			String t  = inputType.getText();
			String str = "SELF_TYPE";
			if(str.equals(t))
				t = className;
			functionsList.get(funcName).add(new Symbol(inputId.getText(), Kind.argument, inputType.getText()) );
		}
	}
        
        public static ArrayList<Symbol> getArguments(String funcName){
		return functionsList.get(funcName);
	}
	
	public static boolean checkArgu(String funcName, Token inputId){
		for (int i = 0; i < functionsList.get(funcName).size(); i++) {
			if(functionsList.get(funcName).get(i).getId().equals(inputId.getText())){
				MainProgram.error_definition.add("\t Error: Argument with this name is already exist!");
				System.out.println("\t Error: Argument with this name is already exist!");
				MainProgram.error = true;
				return false;
			}
		}
		return true;
	}
	
}
