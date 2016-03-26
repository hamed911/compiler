
import org.antlr.v4.runtime.*;

import java.util.HashMap;
public class Main {
	
	public static void main(String[] args) throws Exception{
		CharStream input = new ANTLRFileStream("hello-world.cl");
		pass1Lexer lexer=new pass1Lexer(input);
		CommonTokenStream ts=new CommonTokenStream(lexer);
		pass1Parser parser1 = new pass1Parser(ts);
		System.out.println("pass1 : ");
		System.out.println();
		parser1.program();
		
		System.out.println();
		
		//if(!error){
			input = new ANTLRFileStream("hello-world.cl");
			lexer=new pass1Lexer(input);
			ts=new CommonTokenStream(lexer);
			pass2Parser parser2=new pass2Parser(ts);
			System.out.println("pass2 : ");
			System.out.println();
			parser2.program();
		//}
		//else
		//	System.out.println(" ----> ERROR in pass1! <----"); // mitoonim error ro ham inja chap konim. error tu ye moteghayere static e dg rikhte beshe o inja print beshe
		// error e vujude class va function e main check shavad
	}
}
