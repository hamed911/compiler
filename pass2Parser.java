// Generated from pass2.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pass2Parser extends Parser {
	
	
        protected String nameFunction="";
        protected String className ="";
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, LINECOMMENT=2, COMMENT=3, INTEGER=4, INHERITS=5, CLASS=6, 
		LET=7, MULTI=8, DIVID=9, ADD=10, SUB=11, ASSIGN=12, TRUE=13, FALSE=14, 
		DOUBLE_COT=15, OPENP=16, CLOSEP=17, NOT_FLAG=18, EQUAL=19, LESS_EQUAL=20, 
		LESS=21, NOT=22, ISVOID=23, NEW=24, START_CASE=25, END_CASE=26, OF=27, 
		BIGER_EQUAL=28, IN=29, WHILE=30, START_LOOP=31, END_LOOP=32, START_IF=33, 
		END_IF=34, ELSE=35, THEN=36, OPENA=37, CLOSEA=38, SEM=39, COM=40, DOTS=41, 
		DOT=42, AT=43, STRING=44, ID=45, TYPE=46;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "LINECOMMENT", "COMMENT", "INTEGER", "INHERITS", 
		"CLASS", "LET", "'*'", "'/'", "'+'", "'-'", "'<-'", "TRUE", "FALSE", "'\"'", 
		"'('", "')'", "NOT_FLAG", "'='", "'<='", "'<'", "'~'", "ISVOID", "NEW", 
		"START_CASE", "END_CASE", "OF", "'=>'", "IN", "WHILE", "START_LOOP", "END_LOOP", 
		"START_IF", "END_IF", "ELSE", "THEN", "'{'", "'}'", "';'", "','", "':'", 
		"'.'", "'@'", "STRING", "ID", "TYPE"
	};
	public static final int
		RULE_program = 0, RULE_classdef = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4, RULE_t = 5, RULE_a = 6, RULE_aa = 7, RULE_b = 8, RULE_bb = 9, 
		RULE_c = 10, RULE_cc = 11, RULE_f = 12, RULE_z = 13, RULE_d = 14, RULE_g = 15, 
		RULE_e = 16;
	public static final String[] ruleNames = {
		"program", "classdef", "feature", "formal", "expr", "t", "a", "aa", "b", 
		"bb", "c", "cc", "f", "z", "d", "g", "e"
	};

	@Override
	public String getGrammarFileName() { return "pass2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pass2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ClassdefContext classdef(int i) {
			return getRuleContext(ClassdefContext.class,i);
		}
		public List<ClassdefContext> classdef() {
			return getRuleContexts(ClassdefContext.class);
		}
		public TerminalNode SEM(int i) {
			return getToken(pass2Parser.SEM, i);
		}
		public List<TerminalNode> SEM() { return getTokens(pass2Parser.SEM); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
                
		if(MainProgram.error){
			System.out.println("  ----> ERROR in pass1! <----  ");
			return null;
		}

		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			//System.out.println("1-");
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35); classdef();
				setState(36); match(SEM);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
//			System.out.println("InheritanceGraph:");
			
//			System.out.println("****MainSymbolTable****");
//			MainProgram.MainSymbolTable.printSymbolTable();
//			System.out.println("***********************");
			
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdefContext extends ParserRuleContext {
		public Token m;
		public Token n;
		public TerminalNode CLOSEA() { return getToken(pass2Parser.CLOSEA, 0); }
		public List<TerminalNode> TYPE() { return getTokens(pass2Parser.TYPE); }
		public TerminalNode OPENA() { return getToken(pass2Parser.OPENA, 0); }
		public TerminalNode SEM(int i) {
			return getToken(pass2Parser.SEM, i);
		}
		public List<TerminalNode> SEM() { return getTokens(pass2Parser.SEM); }
		public TerminalNode TYPE(int i) {
			return getToken(pass2Parser.TYPE, i);
		}
		public TerminalNode INHERITS() { return getToken(pass2Parser.INHERITS, 0); }
		public TerminalNode CLASS() { return getToken(pass2Parser.CLASS, 0); }
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitClassdef(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
//			System.out.println("2");
			setState(45); match(CLASS);
			setState(46); ((ClassdefContext)_localctx).m = match(TYPE);
                        className = ((ClassdefContext)_localctx).m.getText();
			setState(49);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(47); match(INHERITS);
				setState(48); ((ClassdefContext)_localctx).n = match(TYPE);
				}
			}

			setState(51); match(OPENA);
                        ///////////
                        MainProgram.getRuntimeSymbolTable().enterClass(((ClassdefContext)_localctx).m.getText() );
                        
                        //////
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(52); feature();
				setState(53); match(SEM);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); match(CLOSEA);
//			System.out.println("class defenition: "+((ClassdefContext)_localctx).m.getText() );
                        MainProgram.getRuntimeSymbolTable().exitScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureContext extends ParserRuleContext {
		public Token function;
		public Token returnType;
		public Token variableId;
		public Token variableType;
		public List<TerminalNode> COM() { return getTokens(pass2Parser.COM); }
		public TerminalNode TYPE() { return getToken(pass2Parser.TYPE, 0); }
		public TerminalNode OPENA() { return getToken(pass2Parser.OPENA, 0); }
		public TerminalNode COM(int i) {
			return getToken(pass2Parser.COM, i);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public TerminalNode CLOSEA() { return getToken(pass2Parser.CLOSEA, 0); }
		public TerminalNode OPENP() { return getToken(pass2Parser.OPENP, 0); }
		public TerminalNode ID() { return getToken(pass2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(pass2Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOTS() { return getToken(pass2Parser.DOTS, 0); }
		public TerminalNode CLOSEP() { return getToken(pass2Parser.CLOSEP, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
//				System.out.println("3");
				setState(64); ((FeatureContext)_localctx).function = match(ID);
//				System.out.println("new function!");
                                nameFunction = ((FeatureContext)_localctx).function.getText();
                                MainProgram.getRuntimeSymbolTable().enterFunction(nameFunction  );
				setState(66); match(OPENP);
				setState(75);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(67); formal();
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COM) {
						{
						{
						setState(68); match(COM);
						setState(69); formal();
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(77); match(CLOSEP);
				setState(78); match(DOTS);
				setState(79); ((FeatureContext)_localctx).returnType = match(TYPE);
				setState(80); match(OPENA);
				setState(81); 
                                String returnTyp = ((FeatureContext)_localctx).returnType.getText();
                                if(returnTyp.equals("SELF_TYPE"))
                                	returnTyp=className;
                                String returnTypeFunction= expr().type;
                                if(returnTyp.equals("SELF_TYPE"))
                                    returnTyp = className;
                                
                                 if(!MainProgram.matchTypesInAssign(returnTyp, returnTypeFunction)){
                                	if(((FeatureContext)_localctx).returnType.getText().equals("Bool") || ((FeatureContext)_localctx).returnType.getText().equals("Object"))
                                		Alert.info("return type is match in function "+ nameFunction);
                                	else
                                		Alert.error("return type in function doesn't match with defined return type", ((FeatureContext)_localctx).returnType);
                                }else{
                                    Alert.info("return type is match in function "+ nameFunction);
                                }
                                
				setState(82); match(CLOSEA);
//				System.out.println(((FeatureContext)_localctx).function.getText()+"(...) : "+((FeatureContext)_localctx).returnType.getText());
                                MainProgram.getRuntimeSymbolTable().exitScope();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
//				System.out.println("4");
				setState(86); ((FeatureContext)_localctx).variableId = match(ID);
				setState(87); match(DOTS);
				setState(88); ((FeatureContext)_localctx).variableType = match(TYPE);
				setState(91);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(89); match(ASSIGN);
					setState(90); String variableReturntype = expr().type;
					//Symbol sym = MainProgram.getRuntimeSymbolTable().lookupVariable(variableReturntype);
						String varTyp = ((FeatureContext)_localctx).variableType.getText();
						if(varTyp.equals("SELF_TYPE"))
							varTyp = className;
						if(  !MainProgram.matchTypesInAssign(varTyp , variableReturntype)){
							Alert.error("Types of both side of assignment aren't compatible!", ((FeatureContext)_localctx).variableId);
						}else {
                       
							Alert.info("Types of both side of assignment are compatible!");
						}
					}
				}

//				System.out.println(((FeatureContext)_localctx).variableId.getText()+" : "+((FeatureContext)_localctx).variableType.getText());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public Token inputId;
		public Token inputType;
		public TerminalNode ID() { return getToken(pass2Parser.ID, 0); }
		public TerminalNode DOTS() { return getToken(pass2Parser.DOTS, 0); }
		public TerminalNode TYPE() { return getToken(pass2Parser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
//			System.out.println("5");
			setState(97); ((FormalContext)_localctx).inputId = match(ID);
			setState(98); match(DOTS);
			setState(99); ((FormalContext)_localctx).inputType = match(TYPE);
//			System.out.println(((FormalContext)_localctx).inputId.getText()+" : "+((FormalContext)_localctx).inputType.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public String type=null;
                public Token leftHand;
		public Token functionName;
		public Token letId1;
		public Token letType1;
		public Token letIdn;
		public Token letTypen;
		public Token caseId;
		public Token caseType;
		public Token newType;
		public TerminalNode END_CASE() { return getToken(pass2Parser.END_CASE, 0); }
		public TerminalNode ELSE() { return getToken(pass2Parser.ELSE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TYPE() { return getTokens(pass2Parser.TYPE); }
		public TerminalNode END_IF() { return getToken(pass2Parser.END_IF, 0); }
		public TerminalNode ID(int i) {
			return getToken(pass2Parser.ID, i);
		}
		public TerminalNode COM(int i) {
			return getToken(pass2Parser.COM, i);
		}
		public List<TerminalNode> BIGER_EQUAL() { return getTokens(pass2Parser.BIGER_EQUAL); }
		public TerminalNode BIGER_EQUAL(int i) {
			return getToken(pass2Parser.BIGER_EQUAL, i);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(pass2Parser.ID); }
		public TerminalNode OPENP() { return getToken(pass2Parser.OPENP, 0); }
		public TerminalNode ASSIGN(int i) {
			return getToken(pass2Parser.ASSIGN, i);
		}
		public List<TerminalNode> DOTS() { return getTokens(pass2Parser.DOTS); }
		public TerminalNode OF() { return getToken(pass2Parser.OF, 0); }
		public TerminalNode SEM(int i) {
			return getToken(pass2Parser.SEM, i);
		}
		public TerminalNode START_CASE() { return getToken(pass2Parser.START_CASE, 0); }
		public TerminalNode END_LOOP() { return getToken(pass2Parser.END_LOOP, 0); }
		public TerminalNode START_LOOP() { return getToken(pass2Parser.START_LOOP, 0); }
		public List<TerminalNode> COM() { return getTokens(pass2Parser.COM); }
		public TerminalNode THEN() { return getToken(pass2Parser.THEN, 0); }
		public TerminalNode OPENA() { return getToken(pass2Parser.OPENA, 0); }
		public TerminalNode TYPE(int i) {
			return getToken(pass2Parser.TYPE, i);
		}
		public TerminalNode WHILE() { return getToken(pass2Parser.WHILE, 0); }
		public TerminalNode NEW() { return getToken(pass2Parser.NEW, 0); }
		public TerminalNode IN() { return getToken(pass2Parser.IN, 0); }
		public TerminalNode CLOSEA() { return getToken(pass2Parser.CLOSEA, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(pass2Parser.ASSIGN); }
		public TerminalNode START_IF() { return getToken(pass2Parser.START_IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> SEM() { return getTokens(pass2Parser.SEM); }
		public TerminalNode DOTS(int i) {
			return getToken(pass2Parser.DOTS, i);
		}
		public TerminalNode CLOSEP() { return getToken(pass2Parser.CLOSEP, 0); }
		public TerminalNode LET() { return getToken(pass2Parser.LET, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); ((ExprContext)_localctx).leftHand = match(ID);
                                
                                String desVar = ((ExprContext)_localctx).leftHand.getText();
                                Symbol sym = MainProgram.getRuntimeSymbolTable().lookupVariable(desVar);
                                if(sym== null){
                                    Alert.error("The variable is undefined", ((ExprContext)_localctx).leftHand);
                                }
//				System.out.println("assign expresion\t" + ((ExprContext)_localctx).leftHand.getText() );
				setState(104); match(ASSIGN);
//				System.out.println("assign right hand");
				setState(106); 
                                ExprContext returnType =expr();
                                
                                //if(sym!=null &&( sym instanceof Symbol) && !sym.getType().equals(returnType.type) ){
                                if(sym!=null &&( sym instanceof Symbol) &&  !MainProgram.matchTypesInAssign(sym.getType(), returnType.type) ){
                                	 Alert.error("Types of both side of assignment aren't compatible!", ((ExprContext)_localctx).leftHand);
                                }else if( sym!=null && MainProgram.matchTypesInAssign(sym.getType(), returnType.type) ){
                                    _localctx.type = returnType.type;
                                    Alert.info("Types of both side of assignment are compatible!");
                                }
//				System.out.println("after expression");
                                
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
//				System.out.println("function call");
				setState(110); ((ExprContext)_localctx).functionName = match(ID);
				setState(111); match(OPENP);
				setState(122);
				_la = _input.LA(1);
                                ArrayList<String> funcArguments = new ArrayList<>();
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
					{
//					System.out.println("first argument");
					setState(113);
                                        
                                        ExprContext tempArgument = expr();
                                        funcArguments.add(tempArgument.type); 
                                        
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COM) {
						{
						{
						setState(114); match(COM);
//						System.out.println("all argument");
						setState(116); 
                                                tempArgument = expr();
                                                funcArguments.add(tempArgument.type);
						}
						}
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}
                                String funcName = ((ExprContext)_localctx).functionName.getText();
                                SymbolTable funcSymTable = MainProgram.getRuntimeSymbolTable().lookupFunction(funcName);
                                if(funcSymTable==null){
                                    Alert.error("Function doesn't exist", ((ExprContext)_localctx).functionName);
                                    _localctx.type="ERROR";
                                }else{
                                    if( !MainProgram.argumentCheck(funcArguments, className, funcName) ){
                                        Alert.error("Arguments of function didn't match!", ((ExprContext)_localctx).functionName );
                                        _localctx.type ="ERROR";
                                    }else{
                                        Alert.info("function called properly");
                                        _localctx.type=MainProgram.returnTypeFunction(className, funcName);
                                    }
                                    
                                }
				setState(124); match(CLOSEP);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(START_IF);
				setState(126); 
                                String conditionIf = expr().type;
                                if(!conditionIf.equals("Bool")){
                                    Alert.error("condition expression in if: expected to be Bool but found "+ conditionIf);
                                }
//				System.out.println("condition in if");
				setState(128); match(THEN);
//				System.out.println("if expresion");
				setState(130); 
                                String ifBody =expr().type;
//				System.out.println("end if expresion");
				setState(132); match(ELSE);
//				System.out.println("else expresion");
				setState(134); 
                                String elseBody =expr().type;
//				System.out.println("end else expresion");
				setState(136); match(END_IF);

                                _localctx.type = InheritanceGraph.getIfReturnType(conditionIf, ifBody, elseBody);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138); match(WHILE);
				setState(139);
                                String ty= expr().type;
                                if(!ty.equals("Bool")){
                                    Alert.error("condition expression in while: expected to be Bool but found "+ ty);
                                }
//				System.out.println("condition in while");
				setState(141); match(START_LOOP);
//				System.out.println("while body started");
				setState(143); expr();
//				System.out.println("while body finished");
                                _localctx.type = "Object";
				setState(145); match(END_LOOP);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147); match(OPENA);
//				System.out.println("new block created");
                                    MainProgram.getRuntimeSymbolTable().enterBlock();
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149); 
                                        _localctx.type = expr().type;
					setState(150); match(SEM);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0) );
				setState(156); match(CLOSEA);
//				System.out.println("new block closed");
                                MainProgram.getRuntimeSymbolTable().exitScope();
				}
				break;

			case 6:///////let 
				enterOuterAlt(_localctx, 6);
				{
//				System.out.println("let command");
				setState(160); match(LET);
                                MainProgram.getRuntimeSymbolTable().enterLet();
				setState(161); ((ExprContext)_localctx).letId1 = match(ID);
                                String letId = ((ExprContext)_localctx).letId1.getText();
                                
				setState(162); match(DOTS);
				setState(163); ((ExprContext)_localctx).letType1 = match(TYPE);
                                String letType = ((ExprContext)_localctx).letType1.getText();
                                if(letType.equals("SELF_TYPE"))
                                	letType = className;
                                if( letId.equals("self") ){
                                    Alert.error("variable name cann't be named: self", ((ExprContext)_localctx).letId1);
                                }else{
                                    if(!MainProgram.MainSymbolTable.getHashtable().containsKey(letType)){
                                        Alert.error("type doesn't exit", ((ExprContext)_localctx).letType1 );
                                        letType="ERROR";
                                    }
                                    Symbol temp = new Symbol(letId, Kind.variable, letType);
                                    MainProgram.getRuntimeSymbolTable().addVariableToCurrentSymbolTable(temp);    
                                    
                                }
                                
                                
				setState(168);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(164); match(ASSIGN);
					setState(165); 
                                        String returntype =expr().type;
                                        if( !MainProgram.matchTypesInAssign(letType, returntype) ){
                                            Alert.error("both side of assignment must be equal. assignment must be "+letType+" but found "+" "+returntype, ((ExprContext)_localctx).letType1);
                                        }
//					System.out.println("initial for letid1");
					}
				}
                                
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(170); match(COM);
                                        MainProgram.getRuntimeSymbolTable().enterLet();
					setState(171); ((ExprContext)_localctx).letIdn = match(ID);
                                        letId = ((ExprContext)_localctx).letIdn.getText();
					setState(172); match(DOTS);
					setState(173); ((ExprContext)_localctx).letTypen = match(TYPE);
                                        letType = ((ExprContext)_localctx).letTypen.getText();
                                        if( letType.equals("SELF_TYPE"))
                                        	letType = className;
                                        if( letId.equals("self") ){
                                            Alert.error("variable name cann't be named: self", ((ExprContext)_localctx).letIdn);
                                        }else{
                                            if(!MainProgram.MainSymbolTable.getHashtable().containsKey(letType)){
                                                Alert.error("type doesn't exit", ((ExprContext)_localctx).letTypen );
                                                letType="ERROR";
                                            }
                                            Symbol temp = new Symbol(letId, Kind.variable, letType);
                                            MainProgram.getRuntimeSymbolTable().addVariableToCurrentSymbolTable(temp);    

                                        }
					setState(178);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
                                    		setState(174); match(ASSIGN);
						setState(175);
                                                String returntype =expr().type;
                                                if( !MainProgram.matchTypesInAssign(letType, returntype) ){
                                                    Alert.error("both side of assignment must be equal. assignment must be "+letType+" but found "+" "+returntype, ((ExprContext)_localctx).letTypen);
                                                }
//						System.out.println("initial for letIDn");
						}
					}

					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185); match(IN);
				System.out.println("let body");
				setState(187); 
                                _localctx.type= expr().type;
                                MainProgram.getRuntimeSymbolTable().exitLet();
//				System.out.println("let body finished");
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(190); match(START_CASE);
				setState(191); 
                                MainProgram.getRuntimeSymbolTable().enterBlock();
                                String caseCondition= expr().type;
//				System.out.println("case expresion");
				setState(193); match(OF);
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
                                ArrayList<String> caseId = new ArrayList<>();
                                ArrayList<String> casetype= new ArrayList<>();
                                ArrayList<String> caseExpr = new ArrayList<>();
                                ArrayList<String> caseCondParent = InheritanceGraph.returnAllParrent(caseCondition);
                                
				
                                do {
					{
					{
					setState(194); ((ExprContext)_localctx).caseId = match(ID);
                                        String caseIDn = ((ExprContext)_localctx).caseId.getText();
                                        caseId.add( caseIDn );
					setState(195); match(DOTS);
					setState(196); ((ExprContext)_localctx).caseType = match(TYPE);
                                        String caseType = ((ExprContext)_localctx).caseType.getText();
                                        if(caseType.equals("SELF_TYPE"))
                                        	caseType = className;
                                        if( !MainProgram.MainSymbolTable.getHashtable().containsKey(caseType)){
                                            Alert.error("type doesn't exist", ((ExprContext)_localctx).caseType);
                                        }
                                        casetype.add( ((ExprContext)_localctx).caseType.getText() );
                                        MainProgram.getRuntimeSymbolTable().enterBlock();
                                        MainProgram.getRuntimeSymbolTable().addVariableToCurrentSymbolTable(new Symbol(caseIDn, Kind.variable, caseType));
//					System.out.println("initial new variable! in case");
					setState(198); match(BIGER_EQUAL);
//					System.out.println("case expresion start");
					setState(200); 
                                        caseExpr.add( expr().type );
                                        MainProgram.getRuntimeSymbolTable().exitScope();
//					System.out.println("case expresion ended");
					setState(202); match(SEM);
					}
					}
					setState(206); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
                                int index = MainProgram.compareCaseConditionWithTypes(caseCondParent, casetype);
                                if(index==-1){
                                    Alert.error("case condition doesn't match with any type of case body");
                                    _localctx.type="ERROR";
                                }else{
                                    Symbol sym= new Symbol(caseId.get(index), Kind.variable, casetype.get(index));
                                    MainProgram.getRuntimeSymbolTable().addVariableToCurrentSymbolTable(sym);
//                                    String id = caseId.get(index);
//                                    Symbol sym = MainProgram.getRuntimeSymbolTable().lookupVariable(id);
//                                    if(sym == null){
//                                        Alert.error("Variable "+ id +" is undefined!");
//                                    }else{
//                                        sym.setType( casetype.get(index) );
//                                    }
                                    _localctx.type = caseExpr.get(index);
                                }
                                MainProgram.getRuntimeSymbolTable().exitScope();
				setState(208); match(END_CASE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(210); match(NEW);
				setState(211); ((ExprContext)_localctx).newType = match(TYPE);
				String namClass =((ExprContext)_localctx).newType.getText();
				if(namClass.equals("SELF_TYPE"))
					namClass = className;
                                if(!MainProgram.containClassName(namClass)){
                                    Alert.error("Type doesn't found in new expression", ((ExprContext)_localctx).newType);
                                }
                                else{
                                    _localctx.type = namClass;
                                    Alert.info("type of new is ok!");
                                }
//                                System.out.println("newType");
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(213); 
                                _localctx.type= t().type;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TContext extends ParserRuleContext {
                public String type=null;
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode NOT_FLAG() { return getToken(pass2Parser.NOT_FLAG, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_t);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case NOT_FLAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(NOT_FLAG);
				setState(217); 
                                String t= a().type;
                                if(!t.equals("Bool")){
                                    Alert.error("After NOT we should found Bool type but "+t+" type was found" );
                                    _localctx.type = "ERROR";
                                }else{
                                    Alert.info("After NOT is boolean Type");
                                    _localctx.type = t;
                                }
//				System.out.println("not statement boolean");
				}
				break;
			case INTEGER:
			case LET:
			case SUB:
			case TRUE:
			case FALSE:
			case OPENP:
			case NOT:
			case ISVOID:
			case NEW:
			case START_CASE:
			case WHILE:
			case START_IF:
			case OPENA:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); 
                                _localctx.type= a().type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AContext extends ParserRuleContext {
                public String type=null;
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
                        String t1 = b().type;
//			System.out.println("left side in condition");
			setState(225); 
                        String t2 = aa().type;
                        if(t2== null){
                            _localctx.type=t1;
                        }else if(t2!=null && t1.equals(t2)){
                            _localctx.type = t1;
                            Alert.info("left side in condition is ok!");
                        }else if( t2!= null && !t1.equals(t2)) {
                            Alert.error("ERROR in type checking of <= or = or <");
                            _localctx.type="ERROR";
                        }
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AaContext extends ParserRuleContext {
                public String type=null;
		public TerminalNode LESS() { return getToken(pass2Parser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(pass2Parser.LESS_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(pass2Parser.EQUAL, 0); }
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public AaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterAa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitAa(this);
		}
	}

	public final AaContext aa() throws RecognitionException {
		AaContext _localctx = new AaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aa);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); match(LESS);
				setState(228); 
                                String t1 =b().type;
//				System.out.println("right Side less");
				setState(230); 
                                String t2 = aa().type;
                                if(t2== null){
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right side of < must be int but found "+ t1);
                                    }
                                }
                                else if(t2!= null && t1.equals(t2)){
                                    Alert.info("type was ok around <");
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right sides of < must be int but found "+ t1);
                                    }
                                }else if( t2!=null && !t1.equals(t2)){
                                    Alert.error("types around < are not equal");
                                    _localctx.type="ERROR";
                                }
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); match(LESS_EQUAL);
				setState(233); 
                                String t1 = b().type;
//				System.out.println("right side LESS_EQUAL");
				setState(235); 
                                String t2 =  aa().type;
                                if(t2== null){
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right side of <= must be int but found "+ t1);
                                    }
                                }
                                else if(t2!= null && t1.equals(t2)){
                                    Alert.info("type was ok around <=");
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right sides of <= must be int but found "+ t1);
                                    }
                                }else if( t2!=null && !t1.equals(t2)){
                                    Alert.error("types around <= are not equal");
                                    _localctx.type="ERROR";
                                }
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237); match(EQUAL);
				setState(238); 
                                String t1 = b().type;
//				System.out.println("right side equal");
				setState(240); 
                                String t2= aa().type;
                                if(t2== null){
                                    _localctx.type = t1;
                                }
                                else if(t2!= null && t1.equals(t2)){
                                    Alert.info("type was ok around =");
                                    _localctx.type = t1;
                                }else if( t2!=null && !t1.equals(t2)){
                                    Alert.error("types around = are not equal");
                                    _localctx.type="ERROR";
                                }
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BContext extends ParserRuleContext {
                public String type=null;
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public BbContext bb() {
			return getRuleContext(BbContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
                        String t1= c().type;
//			System.out.println("left side in operation add and sub ");
			setState(247);
                        String t2 = bb().type;
                        if(t2== null){
                            _localctx.type=t1;
                        }else if(t2!=null && t1.equals(t2)){
                            _localctx.type = t1;
                            Alert.info("left side in add or sub is ok!");
                        }else if( t2!= null && !t1.equals(t2)) {
                            Alert.error("ERROR in type checking of + or -");
                            _localctx.type="ERROR";
                        }
//			System.out.println("return type add or sub");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BbContext extends ParserRuleContext {
            public String type=null;
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode SUB() { return getToken(pass2Parser.SUB, 0); }
		public TerminalNode ADD() { return getToken(pass2Parser.ADD, 0); }
		public BbContext bb() {
			return getRuleContext(BbContext.class,0);
		}
		public BbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterBb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitBb(this);
		}
	}

	public final BbContext bb() throws RecognitionException {
		BbContext _localctx = new BbContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bb);
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); match(ADD);
				setState(251);
                                String t1 = c().type;
                                
//				System.out.println("right side in add ");
				setState(253); 
                                String t2 = bb().type;
                                if(t2== null){
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right side of + must be int but found "+ t1);
                                    }
                                }
                                else if(t2!= null && t1.equals(t2)){
                                    Alert.info("type was ok around +");
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right sides of + must be int but found "+ t1);
                                    }
                                }else if( t2!=null && !t1.equals(t2)){
                                    Alert.error("types around + are not equal");
                                    _localctx.type="ERROR";
                                }
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); match(SUB);
				setState(256); 
                                String t1 = c().type;
                               
//				System.out.println("right side in SUB ");
				setState(258); 
                                String t2 = bb().type;
                                if(t2== null){
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right side of - must be int but found "+ t1);
                                    }
                                }
                                else if(t2!= null && t1.equals(t2)){
                                    Alert.info("type was ok around -");
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right sides of - must be int but found "+ t1);
                                    }
                                }else if( t2!=null && !t1.equals(t2)){
                                    Alert.error("types around - are not equal");
                                    _localctx.type="ERROR";
                                }
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
                                    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CContext extends ParserRuleContext {
            public String type=null;
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
                        String t1 = f().type;
                       
//			System.out.println("left side in operation mult and div ");
			setState(265);
                        String t2 = cc().type;
                        if(t2== null){
                            _localctx.type=t1;
                        }else if(t2!=null && t1.equals(t2)){
                            _localctx.type = t1;
                            Alert.info("left side in multiply or divide is ok!");
                        }else if( t2!= null && !t1.equals(t2)) {
                            Alert.error("ERROR in type checking of * or /");
                            _localctx.type="ERROR";
                        }
                        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CcContext extends ParserRuleContext {
            public String type=null;
		public TerminalNode MULTI() { return getToken(pass2Parser.MULTI, 0); }
		public TerminalNode DIVID() { return getToken(pass2Parser.DIVID, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public CcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterCc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitCc(this);
		}
	}

	public final CcContext cc() throws RecognitionException {
		CcContext _localctx = new CcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cc);
		try {
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); match(MULTI);
				setState(268);
                                String t1 =f().type;
                               
//				System.out.println("right side in multi ");
				setState(270); 
                                String t2 = cc().type;
                                if(t2== null){
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right side of * must be int but found "+ t1);
                                    }
                                }
                                else if(t2!= null && t1.equals(t2)){
                                    Alert.info("type was ok around *");
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right sides of * must be int but found "+ t1);
                                    }
                                }else if( t2!=null && !t1.equals(t2)){
                                    Alert.error("types around * are not equal");
                                    _localctx.type="ERROR";
                                }
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272); match(DIVID);
				setState(273);
                                String t1= f().type;
                              
//				System.out.println("right side in divid ");
				setState(275); 
                                String t2 = cc().type;
                                if(t2== null){
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right side of / must be int but found "+ t1);
                                    }
                                }
                                else if(t2!= null && t1.equals(t2)){
                                    Alert.info("type was ok around /");
                                    _localctx.type = t1;
                                    if(!t1.equals("Int")){
                                        Alert.error("right sides of / must be int but found "+ t1);
                                    }
                                }else if( t2!=null && !t1.equals(t2)){
                                    Alert.error("types around / are not equal");
                                    _localctx.type="ERROR";
                                }
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
                                    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
            public String type=null;
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public ZContext z() {
			return getRuleContext(ZContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
                        String t1 = d().type;
//			System.out.println("store variable");
			setState(282);
                        String t2 = z(t1).type;
                        if(t2== null){
                            _localctx.type = t1;
                        }else{
                            _localctx.type = t2;
                        }
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZContext extends ParserRuleContext {
            public String type=null;
		public Token parentType;
		public Token parentFunc;
		public ExprContext parArg1;
		public ExprContext parArg2;
		public TerminalNode AT() { return getToken(pass2Parser.AT, 0); }
		public TerminalNode DOT() { return getToken(pass2Parser.DOT, 0); }
		public TerminalNode OPENP() { return getToken(pass2Parser.OPENP, 0); }
		public TerminalNode ID() { return getToken(pass2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COM() { return getTokens(pass2Parser.COM); }
		public TerminalNode TYPE() { return getToken(pass2Parser.TYPE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSEP() { return getToken(pass2Parser.CLOSEP, 0); }
		public TerminalNode COM(int i) {
			return getToken(pass2Parser.COM, i);
		}
		public ZContext z() {
			return getRuleContext(ZContext.class,0);
		}
		public ZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitZ(this);
		}
	}

	public final ZContext z( String instanceType) throws RecognitionException {
		ZContext _localctx = new ZContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_z);
		int _la;
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                                String numClass=null;
				setState(286);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(284); match(AT);
					setState(285); ((ZContext)_localctx).parentType = match(TYPE);
                                        numClass = ((ZContext)_localctx).parentType.getText();
					}
				}
//                                        Object obj = MainProgram.getRuntimeSymbolTable().lookup(tempInstance.type);
//                                        String classType = null;
//                                        if(obj== null ){
//                                            Alert.error("The variable is undefined", ((ExprContext)_localctx).leftHand);
//                                        }
//                                        else if(obj instanceof Symbol){
//                                           classType = ((Symbol)obj).getType();
//                                        }else if(obj instanceof SymbolTable){
//                                            classType = tempInstance.type;
//                                        }
                                if(numClass==null)
                                    numClass=instanceType;
				setState(288); match(DOT);
				setState(289); ((ZContext)_localctx).parentFunc = match(ID);
				
                                    
                                ArrayList<String> args = new ArrayList<>();
                                setState(290); match(OPENP);
				setState(302);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(291); ((ZContext)_localctx).parArg1 = expr();
                                        args.add( ((ZContext)_localctx).parArg1.type );
//					System.out.println("add father function arg1");
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COM) {
						{
						{
						setState(293); match(COM);
						setState(294); ((ZContext)_localctx).parArg2 = expr();
                                                args.add( ((ZContext)_localctx).parArg2.type );
//						System.out.println("add father function argN");
						}
						}
						setState(301);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(304); match(CLOSEP);
//				System.out.println("call father function");
                                String parentFuncName = ((ZContext)_localctx).parentFunc.getText();
                                String returnType="ERROR";
                                if( MainProgram.getClassSymbolTable(numClass)==null ){
                                    Alert.error("class type doesn't exist", ((ZContext)_localctx).parentType );
                                    _localctx.type = "ERROR";
                                }else{
                                    SymbolTable func = MainProgram.getClassSymbolTable(numClass).getFunctionSymbolTable(parentFuncName);
                                   
                                    if(func==null){
                                        Alert.error("function doesn't exist in the class of parent", ((ZContext)_localctx).parentFunc);
                                        _localctx.type = "ERROR";
                                    }else{
                                        if( !MainProgram.argumentCheck(args, numClass, parentFuncName) ){
                                            Alert.error("arguments weren't the same", ((ZContext)_localctx).parentFunc);
                                            _localctx.type = "ERROR";
                                        }else{
                                            returnType= MainProgram.returnTypeFunction(numClass, parentFuncName);
                                            Alert.info("return type from parent function set successfully", ((ZContext)_localctx).parentFunc);
                                        }
                                        
                                    }
                                }
				setState(306); 
                                 ZContext finalType= z(returnType);
                                 if(finalType.type==null){
                                     _localctx.type = returnType;
                                 }else{
                                     _localctx.type = finalType.type;
                                 }
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DContext extends ParserRuleContext {
            public String type=null;
		public TerminalNode NOT() { return getToken(pass2Parser.NOT, 0); }
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_d);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); match(NOT);
				setState(311);
                                String t = g().type;
                                if(!t.equals("Int")){
                                    Alert.error("After ~ should come Int but found "+ t);
                                    _localctx.type = "ERROR";
                                }else{
                                    Alert.info("After ~ int came!");
                                    _localctx.type="Int";
                                }
//				System.out.println("not expression");
				}
				break;
			case INTEGER:
			case LET:
			case SUB:
			case TRUE:
			case FALSE:
			case OPENP:
			case ISVOID:
			case NEW:
			case START_CASE:
			case WHILE:
			case START_IF:
			case OPENA:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(314); 
                                _localctx.type =g().type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GContext extends ParserRuleContext {
		public String type=null;
                public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode ISVOID() { return getToken(pass2Parser.ISVOID, 0); }
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitG(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_g);
		try {
			setState(322);
			switch (_input.LA(1)) {
			case ISVOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); match(ISVOID);
				setState(318); e();
                                _localctx.type =  "Bool";
//				System.out.println("is void expresion");
				}
				break;
			case INTEGER:
			case LET:
			case SUB:
			case TRUE:
			case FALSE:
			case OPENP:
			case NEW:
			case START_CASE:
			case WHILE:
			case START_IF:
			case OPENA:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); 
                                _localctx.type = e().type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
            public String type=null;
		public Token number;
		public Token generalId;
		public Token leftHand;
		public Token functionName;
		public Token letId1;
		public Token letType1;
		public Token letIdn;
		public Token letTypen;
		public Token caseId;
		public Token caseType;
		public Token newType;
		public TerminalNode END_CASE() { return getToken(pass2Parser.END_CASE, 0); }
		public TerminalNode ELSE() { return getToken(pass2Parser.ELSE, 0); }
		public TerminalNode INTEGER() { return getToken(pass2Parser.INTEGER, 0); }
		public TerminalNode FALSE() { return getToken(pass2Parser.FALSE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TYPE() { return getTokens(pass2Parser.TYPE); }
		public TerminalNode END_IF() { return getToken(pass2Parser.END_IF, 0); }
		public TerminalNode ID(int i) {
			return getToken(pass2Parser.ID, i);
		}
		public TerminalNode COM(int i) {
			return getToken(pass2Parser.COM, i);
		}
		public List<TerminalNode> BIGER_EQUAL() { return getTokens(pass2Parser.BIGER_EQUAL); }
		public TerminalNode BIGER_EQUAL(int i) {
			return getToken(pass2Parser.BIGER_EQUAL, i);
		}
		public TerminalNode OPENP() { return getToken(pass2Parser.OPENP, 0); }
		public List<TerminalNode> ID() { return getTokens(pass2Parser.ID); }
		public TerminalNode ASSIGN(int i) {
			return getToken(pass2Parser.ASSIGN, i);
		}
		public List<TerminalNode> DOTS() { return getTokens(pass2Parser.DOTS); }
		public TerminalNode OF() { return getToken(pass2Parser.OF, 0); }
		public TerminalNode SEM(int i) {
			return getToken(pass2Parser.SEM, i);
		}
		public TerminalNode START_CASE() { return getToken(pass2Parser.START_CASE, 0); }
		public TerminalNode END_LOOP() { return getToken(pass2Parser.END_LOOP, 0); }
		public TerminalNode START_LOOP() { return getToken(pass2Parser.START_LOOP, 0); }
		public List<TerminalNode> COM() { return getTokens(pass2Parser.COM); }
		public TerminalNode TRUE() { return getToken(pass2Parser.TRUE, 0); }
		public TerminalNode THEN() { return getToken(pass2Parser.THEN, 0); }
		public TerminalNode OPENA() { return getToken(pass2Parser.OPENA, 0); }
		public TerminalNode TYPE(int i) {
			return getToken(pass2Parser.TYPE, i);
		}
		public TerminalNode STRING() { return getToken(pass2Parser.STRING, 0); }
		public TerminalNode WHILE() { return getToken(pass2Parser.WHILE, 0); }
		public TerminalNode NEW() { return getToken(pass2Parser.NEW, 0); }
		public TerminalNode IN() { return getToken(pass2Parser.IN, 0); }
		public TerminalNode CLOSEA() { return getToken(pass2Parser.CLOSEA, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(pass2Parser.ASSIGN); }
		public TerminalNode START_IF() { return getToken(pass2Parser.START_IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> SEM() { return getTokens(pass2Parser.SEM); }
		public TerminalNode DOTS(int i) {
			return getToken(pass2Parser.DOTS, i);
		}
		public TerminalNode CLOSEP() { return getToken(pass2Parser.CLOSEP, 0); }
		public TerminalNode LET() { return getToken(pass2Parser.LET, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass2Listener ) ((pass2Listener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_e);
		int _la;
		try {
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); match(OPENP);
                                MainProgram.getRuntimeSymbolTable().enterBlock();
				setState(325); 
                                _localctx.type = expr().type;
				setState(326); match(CLOSEP);
                                MainProgram.getRuntimeSymbolTable().exitScope();
//				System.out.println("expression in pranthesess");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(329); match(SUB);
					}
					break;
				case INTEGER:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(333); ((EContext)_localctx).number = match(INTEGER);
//				System.out.println("integer usage\t" + ((EContext)_localctx).number.getText() );
                                _localctx.type = "Int";
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335); match(STRING);
//				System.out.println("String used");
                                _localctx.type = "String";
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337); match(TRUE);
//				System.out.println("true used");
                                _localctx.type = "Bool";
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339); match(FALSE);
//				System.out.println("false used");
                                _localctx.type = "Bool";
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(341); ((EContext)_localctx).generalId = match(ID);
                                String var = ((EContext)_localctx).generalId.getText();
                                if(!var.equals("self")){
                                    Symbol sym = MainProgram.getRuntimeSymbolTable().lookupVariable(var);
                                    if( sym==null ){
                                        Alert.error(" The variable is undefined", ((EContext)_localctx).generalId);
                                        _localctx.type = "ERROR";
                                    }else{
                                       _localctx.type = sym.getType();
                                       Alert.info("variable type found correctly!", ((EContext)_localctx).generalId );
                                    }
                                }else{
                                    _localctx.type = className;
                                }
//				System.out.println("here is id\t" + ((EContext)_localctx).generalId.getText() );
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(343); ((EContext)_localctx).leftHand = match(ID);
                                String desVar = ((EContext)_localctx).leftHand.getText();
                                Symbol sym = MainProgram.getRuntimeSymbolTable().lookupVariable(desVar);
                                if(sym== null){
                                    Alert.error("The variable is undefined", ((EContext)_localctx).leftHand);
                                }
//				System.out.println("assign expresion\t"+ ((EContext)_localctx).leftHand.getText() );
				setState(345); match(ASSIGN);
//				System.out.println("assign right hand started");
				setState(347); 
                                ExprContext returnType = expr();
                                if(sym!=null &&( sym instanceof Symbol) && !sym.getType().equals(returnType.type) ){
                                    Alert.error("Types of Both side of assignment aren't equal", ((EContext)_localctx).leftHand);
                                }else if( sym!=null && sym.getType().equals(returnType.type) ){
                                    _localctx.type = returnType.type;
                                    Alert.info("both side of assignment are equal");
                                }
//				System.out.println("assign right hand finished");
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
//				System.out.println("function call");
				setState(351); ((EContext)_localctx).functionName = match(ID);
				setState(352); match(OPENP);
				setState(363);
				_la = _input.LA(1);
                                ArrayList<String> funcArguments = new ArrayList<>();
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
					{
//					System.out.println("first argument");
					setState(354); 
                                        funcArguments.add( expr().type) ;
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COM) {
						{
						{
						setState(355); match(COM);
//						System.out.println("all argument");
						setState(357); 
                                                funcArguments.add(expr().type);
						}
						}
						setState(362);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}
                                
                                String funcName = ((EContext)_localctx).functionName.getText();
                                SymbolTable funcSymTable = MainProgram.getRuntimeSymbolTable().lookupFunction(funcName);
                                if(funcSymTable==null){
                                    Alert.error("Function doesn't exist", ((EContext)_localctx).functionName);
                                    _localctx.type="ERROR";
                                }else{
                                    if( !MainProgram.argumentCheck(funcArguments, className, funcName) ){
                                        Alert.error("Arguments of function didn't match!", ((EContext)_localctx).functionName );
                                        _localctx.type ="ERROR";
                                    }else{
                                        Alert.info("function called properly");
                                        _localctx.type=MainProgram.returnTypeFunction(className, funcName);
                                    }
                                    
                                }
                                
				setState(365); match(CLOSEP);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(366); match(START_IF);
				setState(367); 
                                String conditionIf = expr().type;
//				System.out.println("condition in if");
				setState(369); match(THEN);
//				System.out.println("if expresion");
				setState(371); 
                                String ifBody = expr().type;
//				System.out.println("end if expresion");
				setState(373); match(ELSE);
//				System.out.println("else expresion");
				setState(375); 
                                String elseBody = expr().type;
//				System.out.println("end else expresion");
				setState(377); match(END_IF);
                                _localctx.type = InheritanceGraph.getIfReturnType(conditionIf, ifBody, elseBody);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(379); match(WHILE);
				setState(380); 
                                String ty= expr().type;
                                if(!ty.equals("Bool")){
                                    Alert.error("condition expression in while: expected to be Bool but found "+ ty);
                                }
//				System.out.println("condition in while");
				setState(382); match(START_LOOP);
                                _localctx.type = "Object";
//				System.out.println("while body started");
				setState(384); expr();
//				System.out.println("while body finished");
				setState(386); match(END_LOOP);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(388); match(OPENA);
//				System.out.println("new block created");
                                MainProgram.getRuntimeSymbolTable().enterBlock();
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(390);
                                        _localctx.type =expr().type;
					setState(391); match(SEM);
					}
					}
					setState(395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0) );
				setState(397); match(CLOSEA);
                                MainProgram.getRuntimeSymbolTable().exitScope();
//				System.out.println("new block closed");
				}
				break;

			case 12://////let!!
				enterOuterAlt(_localctx, 12);
				{
//				System.out.println("let command");
				setState(401); match(LET);
                                MainProgram.getRuntimeSymbolTable().enterLet();
				setState(402); ((EContext)_localctx).letId1 = match(ID);
                                String letId = ((EContext)_localctx).letId1.getText();
				setState(403); match(DOTS);
				setState(404); ((EContext)_localctx).letType1 = match(TYPE);
                                String letType = ((EContext)_localctx).letType1.getText();
                                if(letType.equals("SELF_TYPE"))
                                	letType = className;
                                if( letId.equals("self") ){
                                    Alert.error("variable name cann't be named: self", ((EContext)_localctx).letId1);
                                }else{
                                    if(!MainProgram.MainSymbolTable.getHashtable().containsKey(letType)){
                                        Alert.error("type doesn't exit", ((EContext)_localctx).letType1 );
                                        letType="ERROR";
                                    }
                                    Symbol temp = new Symbol(letId, Kind.variable, letType);
                                    MainProgram.getRuntimeSymbolTable().addVariableToCurrentSymbolTable(temp);    
                                    
                                }
				setState(409);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(405); match(ASSIGN);
					setState(406);
                                        String returntype =expr().type;
                                        if( !MainProgram.matchTypesInAssign(letType, returntype) ){
                                            Alert.error("both side of assignment must be equal. assignment must be "+letType+" but found "+" "+returntype, ((EContext)_localctx).letType1);
                                        }
//					System.out.println("initial for letid1");
					}
				}

				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(411); match(COM);
                                        MainProgram.getRuntimeSymbolTable().enterLet();
					setState(412); ((EContext)_localctx).letIdn = match(ID);
                                        letId = ((EContext)_localctx).letIdn.getText();
					setState(413); match(DOTS);
					setState(414); ((EContext)_localctx).letTypen = match(TYPE);
					letType = ((EContext)_localctx).letTypen.getText();
					if(letType.equals("SELF_TYPE"))
						letType = className;
						if( letId.equals("self") ){
                                            Alert.error("variable name cann't be named: self", ((EContext)_localctx).letIdn);
                                        }else{
                                            if(!MainProgram.MainSymbolTable.getHashtable().containsKey(letType)){
                                                Alert.error("type doesn't exit", ((EContext)_localctx).letTypen );
                                                letType="ERROR";
                                            }
                                            Symbol temp = new Symbol(letId, Kind.variable, letType);
                                            MainProgram.getRuntimeSymbolTable().addVariableToCurrentSymbolTable(temp);    

                                        }
                                        setState(419);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(415); match(ASSIGN);
						setState(416);
                                                String returntype =expr().type;
                                                if( !MainProgram.matchTypesInAssign(letType, returntype) ){
                                                    Alert.error("both side of assignment must be equal. assignment must be "+letType+" but found "+" "+returntype, ((EContext)_localctx).letTypen);
                                                }
//						System.out.println("initial for letIDn");
						}
					}

					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426); match(IN);
//				System.out.println("let body");
				setState(428);
                                _localctx.type= expr().type;
                                MainProgram.getRuntimeSymbolTable().exitLet();
//				System.out.println("let body finished");
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(431); match(START_CASE);
				setState(432);
                                MainProgram.getRuntimeSymbolTable().enterBlock();
                                String caseCondition= expr().type;
//				System.out.println("case expresion");
				setState(434); match(OF);
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
                                ArrayList<String> caseId = new ArrayList<>();
                                ArrayList<String> casetype= new ArrayList<>();
                                ArrayList<String> caseExpr = new ArrayList<>();
                                ArrayList<String> caseCondParent = InheritanceGraph.returnAllParrent(caseCondition);
				do {
					{
					{
					setState(435); ((EContext)_localctx).caseId = match(ID);
										String caseIDn = ((EContext)_localctx).caseId.getText();
                                        caseId.add( caseIDn );
					setState(436); match(DOTS);
					setState(437); ((EContext)_localctx).caseType = match(TYPE);
                                        String caseType = ((EContext)_localctx).caseType.getText();
                                        if(caseType.equals("SELF_TYPE"))
                                        	caseType = className;
                                        if( !MainProgram.MainSymbolTable.getHashtable().containsKey(caseType)){
                                            Alert.error("type doesn't exist", ((EContext)_localctx).caseType);
                                        }
                                        casetype.add( ((EContext)_localctx).caseType.getText() );
                                        MainProgram.getRuntimeSymbolTable().enterBlock();
                                        MainProgram.getRuntimeSymbolTable().addVariableToCurrentSymbolTable(new Symbol(caseIDn, Kind.variable, caseType));
//					System.out.println("initial new variable! in case");
					setState(439); match(BIGER_EQUAL);
//					System.out.println("case expresion start");
					setState(441);
                                        caseExpr.add( expr().type );
                                        MainProgram.getRuntimeSymbolTable().exitScope();
//					System.out.println("case expresion ended");
					setState(443); match(SEM);
					}
					}
					setState(447); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
                                int index = MainProgram.compareCaseConditionWithTypes(caseCondParent, casetype);
                                if(index==-1){
                                    Alert.error("case condition doesn't match with any type of case body");
                                    _localctx.type="ERROR";
                                }else{
                                    Symbol sym= new Symbol(caseId.get(index), Kind.variable, casetype.get(index));
                                    MainProgram.getRuntimeSymbolTable().addVariableToCurrentSymbolTable(sym);
//                                    String id = caseId.get(index);
//                                    Symbol sym = MainProgram.getRuntimeSymbolTable().lookupVariable(id);
//                                    if(sym == null){
//                                        Alert.error("Variable "+ id +" is undefined!");
//                                    }else{
//                                        sym.setType( casetype.get(index) );
//                                    }
                                    _localctx.type = caseExpr.get(index);
                                }
                                MainProgram.getRuntimeSymbolTable().exitScope();
				setState(449); match(END_CASE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(451); match(NEW);
				setState(452); ((EContext)_localctx).newType = match(TYPE);
                                
				String namClass =((EContext)_localctx).newType.getText();
                                if(!MainProgram.containClassName(namClass)){
                                    Alert.error("Type doesn't found in new expression", ((EContext)_localctx).newType);
                                }
                                else{
                                    _localctx.type = namClass;
                                    Alert.info("type of new is ok!");
                                }
                                
//                                System.out.println("newType");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u01cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\5\4a\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6x\n\6\f\6\16\6{\13\6\5\6}\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\6\6\u009b\n\6\r\6\16\6\u009c\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b5"+
		"\n\6\7\6\u00b7\n\6\f\6\16\6\u00ba\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00cf\n\6\r\6\16\6\u00d0"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d9\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00e0\n"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00f6\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0108\n\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0119\n\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\5\17\u0121\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u012c\n\17\f\17\16\17\u012f\13\17\5\17\u0131\n\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0137\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u013e\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0145\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u014e\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0169\n\22\f\22\16\22\u016c\13\22\5\22\u016e\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u018c\n\22"+
		"\r\22\16\22\u018d\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u019c\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u01a6\n\22\7\22\u01a8\n\22\f\22\16\22\u01ab\13\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\6\22\u01c0\n\22\r\22\16\22\u01c1\3\22\3\22\3\22\3\22\3\22\5\22\u01c9"+
		"\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\u01f2"+
		"\2$\3\2\2\2\4.\3\2\2\2\6`\3\2\2\2\bb\3\2\2\2\n\u00d8\3\2\2\2\f\u00df\3"+
		"\2\2\2\16\u00e1\3\2\2\2\20\u00f5\3\2\2\2\22\u00f7\3\2\2\2\24\u0107\3\2"+
		"\2\2\26\u0109\3\2\2\2\30\u0118\3\2\2\2\32\u011a\3\2\2\2\34\u0136\3\2\2"+
		"\2\36\u013d\3\2\2\2 \u0144\3\2\2\2\"\u01c8\3\2\2\2$(\b\2\1\2%&\5\4\3\2"+
		"&\'\7)\2\2\')\3\2\2\2(%\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2"+
		"\2,-\b\2\1\2-\3\3\2\2\2./\b\3\1\2/\60\7\b\2\2\60\63\7\60\2\2\61\62\7\7"+
		"\2\2\62\64\7\60\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65;\7\'"+
		"\2\2\66\67\5\6\4\2\678\7)\2\28:\3\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7(\2\2?@\b\3\1\2@\5\3\2\2\2AB\b\4\1"+
		"\2BC\7/\2\2CD\b\4\1\2DM\7\22\2\2EJ\5\b\5\2FG\7*\2\2GI\5\b\5\2HF\3\2\2"+
		"\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2ME\3\2\2\2MN\3\2\2"+
		"\2NO\3\2\2\2OP\7\23\2\2PQ\7+\2\2QR\7\60\2\2RS\7\'\2\2ST\5\n\6\2TU\7(\2"+
		"\2UV\b\4\1\2Va\3\2\2\2WX\b\4\1\2XY\7/\2\2YZ\7+\2\2Z]\7\60\2\2[\\\7\16"+
		"\2\2\\^\5\n\6\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a\b\4\1\2`A\3\2\2\2`W\3"+
		"\2\2\2a\7\3\2\2\2bc\b\5\1\2cd\7/\2\2de\7+\2\2ef\7\60\2\2fg\b\5\1\2g\t"+
		"\3\2\2\2hi\7/\2\2ij\b\6\1\2jk\7\16\2\2kl\b\6\1\2lm\5\n\6\2mn\b\6\1\2n"+
		"\u00d9\3\2\2\2op\b\6\1\2pq\7/\2\2q|\7\22\2\2rs\b\6\1\2sy\5\n\6\2tu\7*"+
		"\2\2uv\b\6\1\2vx\5\n\6\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2|r\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u00d9\7\23\2\2\177\u0080"+
		"\7#\2\2\u0080\u0081\5\n\6\2\u0081\u0082\b\6\1\2\u0082\u0083\7&\2\2\u0083"+
		"\u0084\b\6\1\2\u0084\u0085\5\n\6\2\u0085\u0086\b\6\1\2\u0086\u0087\7%"+
		"\2\2\u0087\u0088\b\6\1\2\u0088\u0089\5\n\6\2\u0089\u008a\b\6\1\2\u008a"+
		"\u008b\7$\2\2\u008b\u00d9\3\2\2\2\u008c\u008d\7 \2\2\u008d\u008e\5\n\6"+
		"\2\u008e\u008f\b\6\1\2\u008f\u0090\7!\2\2\u0090\u0091\b\6\1\2\u0091\u0092"+
		"\5\n\6\2\u0092\u0093\b\6\1\2\u0093\u0094\7\"\2\2\u0094\u00d9\3\2\2\2\u0095"+
		"\u0096\7\'\2\2\u0096\u009a\b\6\1\2\u0097\u0098\5\n\6\2\u0098\u0099\7)"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7("+
		"\2\2\u009f\u00a0\b\6\1\2\u00a0\u00d9\3\2\2\2\u00a1\u00a2\b\6\1\2\u00a2"+
		"\u00a3\7\t\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\7+\2\2\u00a5\u00aa\7\60"+
		"\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9\b\6\1\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b8\3\2"+
		"\2\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\7/\2\2\u00ae\u00af\7+\2\2\u00af\u00b4"+
		"\7\60\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\b\6\1\2"+
		"\u00b3\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\37"+
		"\2\2\u00bc\u00bd\b\6\1\2\u00bd\u00be\5\n\6\2\u00be\u00bf\b\6\1\2\u00bf"+
		"\u00d9\3\2\2\2\u00c0\u00c1\7\33\2\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3\b"+
		"\6\1\2\u00c3\u00ce\7\35\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7+\2\2\u00c6"+
		"\u00c7\7\60\2\2\u00c7\u00c8\b\6\1\2\u00c8\u00c9\7\36\2\2\u00c9\u00ca\b"+
		"\6\1\2\u00ca\u00cb\5\n\6\2\u00cb\u00cc\b\6\1\2\u00cc\u00cd\7)\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00c4\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\34\2\2\u00d3"+
		"\u00d9\3\2\2\2\u00d4\u00d5\7\32\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00d9\b"+
		"\6\1\2\u00d7\u00d9\5\f\7\2\u00d8h\3\2\2\2\u00d8o\3\2\2\2\u00d8\177\3\2"+
		"\2\2\u00d8\u008c\3\2\2\2\u00d8\u0095\3\2\2\2\u00d8\u00a1\3\2\2\2\u00d8"+
		"\u00c0\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\13\3\2\2"+
		"\2\u00da\u00db\7\24\2\2\u00db\u00dc\5\16\b\2\u00dc\u00dd\b\7\1\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00e0\5\16\b\2\u00df\u00da\3\2\2\2\u00df\u00de\3"+
		"\2\2\2\u00e0\r\3\2\2\2\u00e1\u00e2\5\22\n\2\u00e2\u00e3\b\b\1\2\u00e3"+
		"\u00e4\5\20\t\2\u00e4\17\3\2\2\2\u00e5\u00e6\7\27\2\2\u00e6\u00e7\5\22"+
		"\n\2\u00e7\u00e8\b\t\1\2\u00e8\u00e9\5\20\t\2\u00e9\u00f6\3\2\2\2\u00ea"+
		"\u00eb\7\26\2\2\u00eb\u00ec\5\22\n\2\u00ec\u00ed\b\t\1\2\u00ed\u00ee\5"+
		"\20\t\2\u00ee\u00f6\3\2\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\5\22\n\2"+
		"\u00f1\u00f2\b\t\1\2\u00f2\u00f3\5\20\t\2\u00f3\u00f6\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\21\3\2\2\2\u00f7\u00f8\5\26\f\2\u00f8\u00f9\b\n\1"+
		"\2\u00f9\u00fa\5\24\13\2\u00fa\u00fb\b\n\1\2\u00fb\23\3\2\2\2\u00fc\u00fd"+
		"\7\f\2\2\u00fd\u00fe\5\26\f\2\u00fe\u00ff\b\13\1\2\u00ff\u0100\5\24\13"+
		"\2\u0100\u0108\3\2\2\2\u0101\u0102\7\r\2\2\u0102\u0103\5\26\f\2\u0103"+
		"\u0104\b\13\1\2\u0104\u0105\5\24\13\2\u0105\u0108\3\2\2\2\u0106\u0108"+
		"\3\2\2\2\u0107\u00fc\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\25\3\2\2\2\u0109\u010a\5\32\16\2\u010a\u010b\b\f\1\2\u010b\u010c\5\30"+
		"\r\2\u010c\27\3\2\2\2\u010d\u010e\7\n\2\2\u010e\u010f\5\32\16\2\u010f"+
		"\u0110\b\r\1\2\u0110\u0111\5\30\r\2\u0111\u0119\3\2\2\2\u0112\u0113\7"+
		"\13\2\2\u0113\u0114\5\32\16\2\u0114\u0115\b\r\1\2\u0115\u0116\5\30\r\2"+
		"\u0116\u0119\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u010d\3\2\2\2\u0118\u0112"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119\31\3\2\2\2\u011a\u011b\5\36\20\2\u011b"+
		"\u011c\b\16\1\2\u011c\u011d\5\34\17\2\u011d\33\3\2\2\2\u011e\u011f\7-"+
		"\2\2\u011f\u0121\7\60\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\7,\2\2\u0123\u0124\7/\2\2\u0124\u0130\7\22"+
		"\2\2\u0125\u0126\5\n\6\2\u0126\u012d\b\17\1\2\u0127\u0128\7*\2\2\u0128"+
		"\u0129\5\n\6\2\u0129\u012a\b\17\1\2\u012a\u012c\3\2\2\2\u012b\u0127\3"+
		"\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0125\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\23\2\2\u0133\u0134\b\17\1\2\u0134"+
		"\u0137\5\34\17\2\u0135\u0137\3\2\2\2\u0136\u0120\3\2\2\2\u0136\u0135\3"+
		"\2\2\2\u0137\35\3\2\2\2\u0138\u0139\7\30\2\2\u0139\u013a\5 \21\2\u013a"+
		"\u013b\b\20\1\2\u013b\u013e\3\2\2\2\u013c\u013e\5 \21\2\u013d\u0138\3"+
		"\2\2\2\u013d\u013c\3\2\2\2\u013e\37\3\2\2\2\u013f\u0140\7\31\2\2\u0140"+
		"\u0141\5\"\22\2\u0141\u0142\b\21\1\2\u0142\u0145\3\2\2\2\u0143\u0145\5"+
		"\"\22\2\u0144\u013f\3\2\2\2\u0144\u0143\3\2\2\2\u0145!\3\2\2\2\u0146\u0147"+
		"\7\22\2\2\u0147\u0148\5\n\6\2\u0148\u0149\7\23\2\2\u0149\u014a\b\22\1"+
		"\2\u014a\u01c9\3\2\2\2\u014b\u014e\7\r\2\2\u014c\u014e\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\6\2\2\u0150"+
		"\u01c9\b\22\1\2\u0151\u0152\7.\2\2\u0152\u01c9\b\22\1\2\u0153\u0154\7"+
		"\17\2\2\u0154\u01c9\b\22\1\2\u0155\u0156\7\20\2\2\u0156\u01c9\b\22\1\2"+
		"\u0157\u0158\7/\2\2\u0158\u01c9\b\22\1\2\u0159\u015a\7/\2\2\u015a\u015b"+
		"\b\22\1\2\u015b\u015c\7\16\2\2\u015c\u015d\b\22\1\2\u015d\u015e\5\n\6"+
		"\2\u015e\u015f\b\22\1\2\u015f\u01c9\3\2\2\2\u0160\u0161\b\22\1\2\u0161"+
		"\u0162\7/\2\2\u0162\u016d\7\22\2\2\u0163\u0164\b\22\1\2\u0164\u016a\5"+
		"\n\6\2\u0165\u0166\7*\2\2\u0166\u0167\b\22\1\2\u0167\u0169\5\n\6\2\u0168"+
		"\u0165\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0163\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u01c9\7\23\2\2\u0170\u0171\7"+
		"#\2\2\u0171\u0172\5\n\6\2\u0172\u0173\b\22\1\2\u0173\u0174\7&\2\2\u0174"+
		"\u0175\b\22\1\2\u0175\u0176\5\n\6\2\u0176\u0177\b\22\1\2\u0177\u0178\7"+
		"%\2\2\u0178\u0179\b\22\1\2\u0179\u017a\5\n\6\2\u017a\u017b\b\22\1\2\u017b"+
		"\u017c\7$\2\2\u017c\u01c9\3\2\2\2\u017d\u017e\7 \2\2\u017e\u017f\5\n\6"+
		"\2\u017f\u0180\b\22\1\2\u0180\u0181\7!\2\2\u0181\u0182\b\22\1\2\u0182"+
		"\u0183\5\n\6\2\u0183\u0184\b\22\1\2\u0184\u0185\7\"\2\2\u0185\u01c9\3"+
		"\2\2\2\u0186\u0187\7\'\2\2\u0187\u018b\b\22\1\2\u0188\u0189\5\n\6\2\u0189"+
		"\u018a\7)\2\2\u018a\u018c\3\2\2\2\u018b\u0188\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\7(\2\2\u0190\u0191\b\22\1\2\u0191\u01c9\3\2\2\2\u0192\u0193\b\22"+
		"\1\2\u0193\u0194\7\t\2\2\u0194\u0195\7/\2\2\u0195\u0196\7+\2\2\u0196\u019b"+
		"\7\60\2\2\u0197\u0198\7\16\2\2\u0198\u0199\5\n\6\2\u0199\u019a\b\22\1"+
		"\2\u019a\u019c\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a9"+
		"\3\2\2\2\u019d\u019e\7*\2\2\u019e\u019f\7/\2\2\u019f\u01a0\7+\2\2\u01a0"+
		"\u01a5\7\60\2\2\u01a1\u01a2\7\16\2\2\u01a2\u01a3\5\n\6\2\u01a3\u01a4\b"+
		"\22\1\2\u01a4\u01a6\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u019d\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01ad\7\37\2\2\u01ad\u01ae\b\22\1\2\u01ae\u01af\5\n\6\2\u01af\u01b0\b"+
		"\22\1\2\u01b0\u01c9\3\2\2\2\u01b1\u01b2\7\33\2\2\u01b2\u01b3\5\n\6\2\u01b3"+
		"\u01b4\b\22\1\2\u01b4\u01bf\7\35\2\2\u01b5\u01b6\7/\2\2\u01b6\u01b7\7"+
		"+\2\2\u01b7\u01b8\7\60\2\2\u01b8\u01b9\b\22\1\2\u01b9\u01ba\7\36\2\2\u01ba"+
		"\u01bb\b\22\1\2\u01bb\u01bc\5\n\6\2\u01bc\u01bd\b\22\1\2\u01bd\u01be\7"+
		")\2\2\u01be\u01c0\3\2\2\2\u01bf\u01b5\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7\34"+
		"\2\2\u01c4\u01c9\3\2\2\2\u01c5\u01c6\7\32\2\2\u01c6\u01c7\7\60\2\2\u01c7"+
		"\u01c9\b\22\1\2\u01c8\u0146\3\2\2\2\u01c8\u014d\3\2\2\2\u01c8\u0151\3"+
		"\2\2\2\u01c8\u0153\3\2\2\2\u01c8\u0155\3\2\2\2\u01c8\u0157\3\2\2\2\u01c8"+
		"\u0159\3\2\2\2\u01c8\u0160\3\2\2\2\u01c8\u0170\3\2\2\2\u01c8\u017d\3\2"+
		"\2\2\u01c8\u0186\3\2\2\2\u01c8\u0192\3\2\2\2\u01c8\u01b1\3\2\2\2\u01c8"+
		"\u01c5\3\2\2\2\u01c9#\3\2\2\2$*\63;JM]`y|\u009c\u00aa\u00b4\u00b8\u00d0"+
		"\u00d8\u00df\u00f5\u0107\u0118\u0120\u012d\u0130\u0136\u013d\u0144\u014d"+
		"\u016a\u016d\u018d\u019b\u01a5\u01a9\u01c1\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}