

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hamed Ara
 */
public class TokenType {
    public static final int type = 46;
    public static final int id = 45;
    public static final int intger = 4;
    public TokenType(){
    }
    public static String getType(int n){
        switch(n){
            case type: return "Type";
            case id: return "id";
            case intger: return "integer";
        }
        return "unknown";
    }
}
