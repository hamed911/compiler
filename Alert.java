import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hamed Ara
 */
public class Alert {
    public static void error(String s){
        System.out.print("ERROR: ");
        System.out.println(s);
    }
    public static void error(String s, Token t){
    	if(t!=null)
        System.out.println("ERROR: in line: "+ t.getLine() + " : around: "+t.getText() +" :\t" +s);
    	else
    		System.out.println("ERROR: " +s);
    }
    public static void info(String s, Token t){
    	if(t!=null)
        System.out.println("INFO: in line: "+  t.getLine() + " : around: "+t.getText() +" :\t" +s);
        else
    		System.out.println("ERROR: " +s);
    }
    public static void info(String s){
        System.out.print("INFO: ");
        System.out.println(s);
        
    }
    
}
