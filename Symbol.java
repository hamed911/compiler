/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hamed Ara
 */
public class Symbol {
	
    private String id;
    private Kind kind;
    private String type;
    private int pareCount=0;
    public int getParentCount(){
    	return pareCount;
    }
    public void setParentCount(int pa){
    	this.pareCount = pa;
    }
    public Symbol(String i,Kind k,String t){
    	setId(i);
    	setKind(k);
    	setType(t);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    
}