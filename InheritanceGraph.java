import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.Enumeration;


public class InheritanceGraph {

	protected static ArrayList<Node> inheritanceGraph = new ArrayList<>();
	protected static Node[] basicClasses = new Node[5];
	
	public static void initializeBasicClasses(){
		basicClasses[0] = new Node(null,"Object");
		basicClasses[1] = new Node(basicClasses[0],"IO");
		basicClasses[2] = new Node(basicClasses[0],"String");
		basicClasses[3] = new Node(basicClasses[0],"Int");
		basicClasses[4] = new Node(basicClasses[0],"Bool");
	}
	public static boolean IsBasicClass(String name){
		for (int j = 0; j < basicClasses.length; j++) 
    		if(basicClasses[j].getName().equals(name))
    			return true;
		return false;
	}
	
	public static boolean printInhertanceGraph(){
		
		Token useless = null;
		errorHandling(1,useless);
		
		boolean cycle= false;
		for (int i = 0; i < inheritanceGraph.size(); i++) {
			//System.out.println("["+inheritanceGraph.get(i).getName()+"]");
			if(showNode(inheritanceGraph.get(i)))
				cycle = true;
		}
		
		boolean e1 = true,e2 = true,e3 = true,e4 = true,e5 = true;
		for (int i = 0; i < inheritanceGraph.size(); i++) {
			if(inheritanceGraph.get(i).getName().equals(basicClasses[0].getName()))
				e1 = false;
			if(inheritanceGraph.get(i).getName().equals(basicClasses[1].getName()))
				e2 = false;
			if(inheritanceGraph.get(i).getName().equals(basicClasses[2].getName()))
				e3 = false;
			if(inheritanceGraph.get(i).getName().equals(basicClasses[3].getName()))
				e4 = false;
			if(inheritanceGraph.get(i).getName().equals(basicClasses[4].getName()))
				e5 = false;
		}
		
		if(e1)
			inheritanceGraph.add(basicClasses[0]);
		if(e2)
			inheritanceGraph.add(basicClasses[1]);
		if(e3)
			inheritanceGraph.add(basicClasses[2]);
		if(e4)
			inheritanceGraph.add(basicClasses[3]);
		if(e5)
			inheritanceGraph.add(basicClasses[4]);
		
		return cycle;
	}
	public static ArrayList<String> returnAllParrent(String name){
		//Alert.info("\t\t --->>"+ name);
            ArrayList<String> ancestors = new ArrayList<>();
            for(int i=0;i<inheritanceGraph.size(); i++)
                if(inheritanceGraph.get(i).getName().equals(name)){
                    Node currenNode = inheritanceGraph.get(i);
                    while(currenNode!=null){
                        ancestors.add( currenNode.getName() );
                        currenNode = currenNode.getParent();
                    }
                    return ancestors;
                }
            return ancestors;
        }
	public static int parentNumber(String name){
		int parentNum = 0;
		for(int i=0;i<MainProgram.MainSymbolTable.childs.size(); i++)
            if((MainProgram.MainSymbolTable.childs.get(i).getId()).equals(name)){
                Node currenNode = existNode(MainProgram.MainSymbolTable.childs.get(i).getId());
                while(currenNode!=null){
                    parentNum++;
                    currenNode = currenNode.getParent();
                }
                return parentNum;
            }
		Alert.info("class "+ name+" has no parent!!");
		return 1;
		
	}
        public static String getIfReturnType(String condition,String ifBody,String elseBody){
            ArrayList<String> cond = returnAllParrent(condition);
            ArrayList<String> ifBo = returnAllParrent(ifBody);
            ArrayList<String> elseB = returnAllParrent(elseBody);
            for(int i=0; i<cond.size(); i++)
                for(int j=0; j<ifBo.size();j++)
                    for(int k=0; k<elseB.size(); k++)
                        if( cond.get(i).equals(ifBo.get(j)) && 
                                     cond.get(i).equals(elseB.get(k)) && ifBo.get(j).equals(elseB.get(k)) )
                            return cond.get(i);
            Alert.info("getIFReturnType work wierd!!");
            return "Object";
        }
        
        
	public static boolean showNode(Node n){
		if(n.getParent()!=null){
			if(!n.getVisited()){
				n.setVisited(true);
				System.out.print(n.getName() + " -> ");
				showNode(n.getParent());
				n.setVisited(false);
			}
			else{
				System.out.println(n.getName()+ " => There is cycle here!");
				n.setVisited(false);
				return true;
			}
		}else{
			System.out.println(n.getName());
			n.setVisited(false);
		}
		return false;
			
	}
	public static Node existNode(String name){
		for (int i = 0; i < inheritanceGraph.size(); i++)
			if(inheritanceGraph.get(i).getName().equals(name))
				return inheritanceGraph.get(i);
		return null;
	}
	
	public static void errorHandling(int typeOferror,Token m){
		if(typeOferror == 0){/// print error if basic classes are redefined
//			for (int j = 0; j < basicClasses.length; j++) {
//        		if(m.getText().equals(basicClasses[j].getName()))
//        		{
//        			System.out.println("\t Error: This class is the basic class, you cannot define it again!");
//        			break;
//        		}
//			}
			if(IsBasicClass(m.getText())){
				MainProgram.error_definition.add("\t Error: This class is the basic class, you cannot define it again!");
				System.out.println("\t Error: This class is the basic class, you cannot define it again!");
				MainProgram.error = true;
			}
		}
		else if(typeOferror == 1){/// print error if a class is used but not defined.
			for (int i = 0; i < inheritanceGraph.size(); i++) {
				if(inheritanceGraph.get(i).getParent() != null)
					if(!inheritanceGraph.get(i).getParent().IsDefined() && inheritanceGraph.get(i).getParent().IsUsed() && !IsBasicClass(inheritanceGraph.get(i).getParent().getName())){
						MainProgram.error_definition.add("\t Error: The class with "+'"'+inheritanceGraph.get(i).getParent().getName()+'"'+" name is not defined, you cannot inherits of this class!");
						System.out.println("\t Error: The class with "+'"'+inheritanceGraph.get(i).getParent().getName()+'"'+" name is not defined, you cannot inherits of this class!");
						MainProgram.error = true;
						
						inheritanceGraph.get(i).setParent(existNode("Object"));
					}
			}
		}
		else if(typeOferror == 2){/// print error if another classes are redefined
			MainProgram.error_definition.add("\t Error: The class with "+'"'+m.getText()+'"'+" name is defined, you cannot define it again!");
			System.out.println("\t Error: The class with "+'"'+m.getText()+'"'+" name is defined, you cannot define it again!");
			MainProgram.error = true;
		}
		
	}
	
	public static void createInheritanceGraph(Token m,Token n){
			
//			errorHandling(0,m);
		if(IsBasicClass(m.getText())){
			MainProgram.error_definition.add("\t Error: This class is the basic class, you cannot define it again!");
			System.out.println("\t Error: This class is the basic class, you cannot define it again!");
			MainProgram.error = true;
		}
		else{
		
			if(existNode("Object") == null){
				inheritanceGraph.add(new Node(null, "Object"));
			}
		
            Node child = existNode( m.getText());
            if(child != null && child.IsDefined())
            	errorHandling(2, m);
            
            Node par = null;
            if( n!=null){
                par = existNode( n.getText());
               
            }
            else
            	par = existNode("Object");

            if( par == null && n!=null){                
                par = new Node(existNode("Object"), n.getText() );
                inheritanceGraph.add(par);
            }
            if( child == null){
                System.out.println("new class exists in line \t :\t"+ m.getLine());
                par.setUsed(true);
                child = new Node(par, m.getText() );
                child.setDefined(true);
                inheritanceGraph.add(child);
            }
            else{
            	child.setDefined(true);
            	par.setUsed(true);
                child.setParent(par);
            }
		}
        }
        
        
	
	public static SymbolTable returnSymbolTableOfNode(Node clas){
		Enumeration<String> e = MainProgram.MainSymbolTable.getHashtable().keys();
	    while (e.hasMoreElements()){
	    	String name = e.nextElement();
	    	if(name.equals(clas.getName())){
	    		return (SymbolTable) MainProgram.MainSymbolTable.getHashtable().get(name);
	    	}
	    }
	    return null;
	}
	
	public static void syncOneNodeWithParents(Node n){
		Node m = n;
		if(m.getParent()!=null){
			SymbolTable par = returnSymbolTableOfNode(m.getParent());
			SymbolTable mine = returnSymbolTableOfNode(n);
			
			for (int i = 0; i < par.childs.size(); i++) {
				boolean add = true;
				
				for (int j = 0; j < mine.childs.size(); j++) {
					if(par.childs.get(i).getId().equals(mine.childs.get(j).getId()))
					{
						if(par.childs.get(i).getKind() == Kind.variable){
							MainProgram.error = true;
							mine.childs.set(j, par.childs.get(i));
							String nam = par.childs.get(i).getId();
							if(par.childs.get(i).getId().substring(0,1).equals("9"))
								nam = par.childs.get(i).getId().substring(1);
								
							MainProgram.error_definition.add("\t Error in "+mine.getId()+": '"+ nam +"' exists in "+par.getId()+". Cannot redefine variable of your parent!");
							System.out.println("\t Error in "+mine.getId()+": '"+ nam +"' exists in "+par.getId()+". Cannot redefine variable of your parent!");
							
							
							//mine.getHashtable().put(par.childs.get(i).getId(), arg1)
						}
						else if(par.childs.get(i).getKind() == Kind.function){
							if(!par.childs.get(i).getType().equals(mine.childs.get(j).getType()))
							{
								MainProgram.error = true;
								mine.childs.set(j, par.childs.get(i));
								MainProgram.error_definition.add("\t Error in "+mine.getId()+": '"+ par.childs.get(i).getId() +"(...)' exists in "+par.getId()+". Cannot redefine function of your parent without considering the arguments!");
								System.out.println("\t Error in "+mine.getId()+": '"+ par.childs.get(i).getId() +"(...)' exists in "+par.getId()+". Cannot redefine function of your parent without considering the arguments!");
								
							}
						}
						
						mine.getHashtable().put(par.childs.get(i).getId(),par.getHashtable().get(par.childs.get(i).getId()));
						add = false;
					}
				}
				if(add){
					mine.childs.add(par.childs.get(i));
					//System.out.println("["+mine.childs.get(mine.childs.size()-1).getId()+" --> "+mine.childs.get(mine.childs.size()-1).getKind()+"]");
					mine.getHashtable().put(par.childs.get(i).getId(), par.getHashtable().get(par.childs.get(i).getId()));
				}
			}
			
//			Enumeration<String> e = par.getHashtable().keys();
//		    while (e.hasMoreElements()){
//		    	boolean add = true;
//		    	String name = e.nextElement();
//		    	Enumeration<String> e1 = mine.getHashtable().keys();
//			    while (e1.hasMoreElements()){
//			    	if(name.equals(e1.nextElement())){
//			    		add = false;
//			    	}
//			    }
//			    if(add){
//			    	mine.getHashtable().put(name, par.getHashtable().get(name));
//			    }
//		    }
			
			
			//m = m.getParent();	
		}
		
	}
	
	public static void sync(){
//		for (int i = 0; i < inheritanceGraph.size(); i++) {
//			syncOneNodeWithParents(inheritanceGraph.get(i));
//		}
	}
	
}

class Node {
	private Node parent ;
	private boolean visited;
	private String name;
	public int countOfParents;
	private boolean defined;
	private boolean used;
	
	public Node(Node par,String name){
		this.parent = par;
		this.visited = false;
		this.name = name;
		this.countOfParents = -1;
		this.defined = false;
		this.used = false;
	}
	public String getName (){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setVisited(boolean b){
		this.visited = b;
	}
	public boolean getVisited(){
		return visited;
	}
	public void setParent(Node p){
		this.parent = p;
	}
	public Node getParent(){
		return parent;
	}
	
	public void setUsed(boolean b){
		this.used = b;
	}
	public boolean IsUsed(){
		return used;
	}
	public void setDefined(boolean b){
		this.defined = b;
	}
	public boolean IsDefined(){
		return defined;
	}
}
