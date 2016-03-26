// Generated from pass1.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Hashtable;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pass1Parser extends Parser {
	private String funcType;
	private String funcName;
	private String className;
	private String classType;
	private Token argumentName;
	private Token argumentType;
	private boolean add;
	
	
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
	public String getGrammarFileName() { return "pass1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pass1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ClassdefContext classdef(int i) {
			return getRuleContext(ClassdefContext.class,i);
		}
		public List<TerminalNode> SEM() { return getTokens(pass1Parser.SEM); }
		public TerminalNode SEM(int i) {
			return getToken(pass1Parser.SEM, i);
		}
		public List<ClassdefContext> classdef() {
			return getRuleContexts(ClassdefContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		/// initialized MainSymbolTable...
		MainProgram.MainSymbolTable.initialized();
		///
		InheritanceGraph.initializeBasicClasses();
		
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
	//		System.out.println("1");
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
			System.out.println("------------------------------------------------");
			System.out.println("InheritanceGraph:");
			if( InheritanceGraph.printInhertanceGraph() ){
                System.out.println("inheritance graph has cycle!");
                MainProgram.error = true;
                return null;
			}
			
			MainProgram.MainSymbolTable.setparentsnumber();
			System.out.println("********");
			MainProgram.MainSymbolTable.showChildren();
			System.out.println("********");
			
			MainProgram.MainSymbolTable.sortChildrenByparentCount();
			
			System.out.println("********");
			MainProgram.MainSymbolTable.showChildren();
			System.out.println("********");
			
			InheritanceGraph.sync();
			
			System.out.println("****MainSymbolTable****");
			MainProgram.MainSymbolTable.printSymbolTable();
			System.out.println("***********************");
			
			System.out.println();
			System.out.println("------------------------>  ERRORS LIST <------------------------");
			for (int i = 0; i < MainProgram.error_definition.size(); i++) {
				System.out.println(MainProgram.error_definition.get(i));
			}
			System.out.println("----------------------------------------------------------------");
			
			
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
		public TerminalNode CLOSEA() { return getToken(pass1Parser.CLOSEA, 0); }
		public TerminalNode OPENA() { return getToken(pass1Parser.OPENA, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEM() { return getTokens(pass1Parser.SEM); }
		public TerminalNode INHERITS() { return getToken(pass1Parser.INHERITS, 0); }
		public TerminalNode TYPE(int i) {
			return getToken(pass1Parser.TYPE, i);
		}
		public TerminalNode SEM(int i) {
			return getToken(pass1Parser.SEM, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(pass1Parser.TYPE); }
		public TerminalNode CLASS() { return getToken(pass1Parser.CLASS, 0); }
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitClassdef(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
	//		System.out.println("2");
			setState(45); match(CLASS);
			setState(46); ((ClassdefContext)_localctx).m = match(TYPE);
			setState(49);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(47); match(INHERITS);
				setState(48); ((ClassdefContext)_localctx).n = match(TYPE);
				}
			}

			/////
			String k1 = "Int";
			String k2 = "Bool";
			String k3 = "String";
			String k4 = "SELF_TYPE";
			
			if( ((ClassdefContext)_localctx).n!=null  ){
				if( k1.equals( ((ClassdefContext)_localctx).n.getText() ) ||  k2.equals( ((ClassdefContext)_localctx).n.getText() ) ||  k3.equals( ((ClassdefContext)_localctx).n.getText() ) ||  k4.equals( ((ClassdefContext)_localctx).n.getText() )){
					MainProgram.error = true;
					MainProgram.error_definition.add("\t ERROR: Cannot inherits from '"+((ClassdefContext)_localctx).n.getText()+"'");
					System.out.println("\t ERROR: Cannot inherits from '"+((ClassdefContext)_localctx).n.getText()+"'");
					((ClassdefContext)_localctx).n = null;
				}
			}
			
			className = ((ClassdefContext)_localctx).m.getText();
			
			if(k4.equals(className)){
				MainProgram.error_definition.add("\t ERROR: Cannot redefined SELF_TYPE class.");
				System.out.println("\t ERROR: Cannot redefined SELF_TYPE class.");
				MainProgram.error = true;
			}
				
			if(!InheritanceGraph.basicClasses[0].getName().equals(className) &&
					!InheritanceGraph.basicClasses[1].getName().equals(className) &&
					!InheritanceGraph.basicClasses[2].getName().equals(className) &&
					!InheritanceGraph.basicClasses[3].getName().equals(className) &&
					!InheritanceGraph.basicClasses[4].getName().equals(className) &&
					!k4.equals(className)){
			MainProgram.MainSymbolTable.addClass( ((ClassdefContext)_localctx).n,  ((ClassdefContext)_localctx).m, MainProgram.MainSymbolTable);
			add = true;
			}
			else
				add = false;
			
			/////
			
			setState(51); match(OPENA);
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
			System.out.println("------------------------------------------------");
			
			System.out.println("class defenition: "+((ClassdefContext)_localctx).m.getText() );
			System.out.println("token's type is: \t" + TokenType.getType( ((pass1Parser.ClassdefContext)_localctx).m.getType() )  );
           
			System.out.println("------------------------------------------------");
			
			InheritanceGraph.createInheritanceGraph(((pass1Parser.ClassdefContext)_localctx).m, ((pass1Parser.ClassdefContext)_localctx).n);
			
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
		public TerminalNode CLOSEA() { return getToken(pass1Parser.CLOSEA, 0); }
		public TerminalNode COM(int i) {
			return getToken(pass1Parser.COM, i);
		}
		public TerminalNode OPENA() { return getToken(pass1Parser.OPENA, 0); }
		public TerminalNode DOTS() { return getToken(pass1Parser.DOTS, 0); }
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public TerminalNode CLOSEP() { return getToken(pass1Parser.CLOSEP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pass1Parser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(pass1Parser.ID, 0); }
		public TerminalNode OPENP() { return getToken(pass1Parser.OPENP, 0); }
		public TerminalNode TYPE() { return getToken(pass1Parser.TYPE, 0); }
		public List<TerminalNode> COM() { return getTokens(pass1Parser.COM); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("3");
				setState(64); ((FeatureContext)_localctx).function = match(ID);
				funcName =  ((FeatureContext)_localctx).function.getText();
				if(add)
				TrivialOperation.addFunc(funcName);
				argumentName = null;
				argumentType = null;
				
				///
				//funcType = TrivialOperation.getFunctionType(funcName, ((FeatureContext)_localctx).returnType);
				//System.out.println(funcType);
				//System.out.println("------------------------------------------------");
				
				//MainProgram.MainSymbolTable.addFunction(((FeatureContext)_localctx).function,MainProgram.MainSymbolTable,className,funcType);
		
				////
				
				setState(65); match(OPENP);
				setState(74);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(66); formal();
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COM) {
						{
						{
						setState(67); match(COM);
						setState(68); formal();
						}
						}
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(76); match(CLOSEP);
				setState(77); match(DOTS);
				setState(78); ((FeatureContext)_localctx).returnType = match(TYPE);
				setState(79); match(OPENA);
				setState(80); expr();
				setState(81); match(CLOSEA);
				System.out.println(((FeatureContext)_localctx).function.getText()+"(...) : "+((FeatureContext)_localctx).returnType.getText());
				
				
				///
				if(add)
				funcType = TrivialOperation.getFunctionType(funcName, ((FeatureContext)_localctx).returnType);
				System.out.println(funcType);
				System.out.println("------------------------------------------------");
				
				if(add)
					MainProgram.MainSymbolTable.addFunction(((FeatureContext)_localctx).function,MainProgram.MainSymbolTable,className,funcType);
		
				////
				
				// function arguments
				//if(argumentName != null)
				//	MainProgram.MainSymbolTable.addArgument(argumentName, argumentType, MainProgram.getClassSymbolTable(className), funcName);
				//
				
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
		//		System.out.println("4");
				setState(85); ((FeatureContext)_localctx).variableId = match(ID);
				setState(86); match(DOTS);
				setState(87); ((FeatureContext)_localctx).variableType = match(TYPE);
				setState(90);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(88); match(ASSIGN);
					setState(89); expr();
					}
				}
				
				
				System.out.println(((FeatureContext)_localctx).variableId.getText()+" : "+((FeatureContext)_localctx).variableType.getText());
				
				
				////
				
				if(add)
					MainProgram.MainSymbolTable.addVariable(((FeatureContext)_localctx).variableId,((FeatureContext)_localctx).variableType,MainProgram.MainSymbolTable,className);
				
				//System.out.println("------------------------------------------------");
				////
				
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
		public TerminalNode DOTS() { return getToken(pass1Parser.DOTS, 0); }
		public TerminalNode ID() { return getToken(pass1Parser.ID, 0); }
		public TerminalNode TYPE() { return getToken(pass1Parser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
	//		System.out.println("5");
			setState(96); ((FormalContext)_localctx).inputId = match(ID);
			setState(97); match(DOTS);
			setState(98); ((FormalContext)_localctx).inputType = match(TYPE);
			System.out.println(((FormalContext)_localctx).inputId.getText()+" : "+((FormalContext)_localctx).inputType.getText());
			
			argumentName = ((FormalContext)_localctx).inputId;
			argumentType = ((FormalContext)_localctx).inputType;
			
			if(add){
				
			TrivialOperation.addArgu(className,funcName,((FormalContext)_localctx).inputType,((FormalContext)_localctx).inputId);
			}
			
			//if(argumentName != null)
			//	MainProgram.MainSymbolTable.addArgument(argumentName, argumentType, MainProgram.getClassSymbolTable(className), funcName);
			
			
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
		public TerminalNode CLOSEA() { return getToken(pass1Parser.CLOSEA, 0); }
		public List<TerminalNode> DOTS() { return getTokens(pass1Parser.DOTS); }
		public TerminalNode END_CASE() { return getToken(pass1Parser.END_CASE, 0); }
		public TerminalNode START_CASE() { return getToken(pass1Parser.START_CASE, 0); }
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode TYPE(int i) {
			return getToken(pass1Parser.TYPE, i);
		}
		public TerminalNode BIGER_EQUAL(int i) {
			return getToken(pass1Parser.BIGER_EQUAL, i);
		}
		public TerminalNode START_LOOP() { return getToken(pass1Parser.START_LOOP, 0); }
		public TerminalNode IN() { return getToken(pass1Parser.IN, 0); }
		public TerminalNode WHILE() { return getToken(pass1Parser.WHILE, 0); }
		public TerminalNode OPENA() { return getToken(pass1Parser.OPENA, 0); }
		public TerminalNode END_IF() { return getToken(pass1Parser.END_IF, 0); }
		public List<TerminalNode> BIGER_EQUAL() { return getTokens(pass1Parser.BIGER_EQUAL); }
		public TerminalNode LET() { return getToken(pass1Parser.LET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode END_LOOP() { return getToken(pass1Parser.END_LOOP, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(pass1Parser.OF, 0); }
		public List<TerminalNode> TYPE() { return getTokens(pass1Parser.TYPE); }
		public List<TerminalNode> COM() { return getTokens(pass1Parser.COM); }
		public TerminalNode ID(int i) {
			return getToken(pass1Parser.ID, i);
		}
		public TerminalNode THEN() { return getToken(pass1Parser.THEN, 0); }
		public TerminalNode COM(int i) {
			return getToken(pass1Parser.COM, i);
		}
		public TerminalNode START_IF() { return getToken(pass1Parser.START_IF, 0); }
		public TerminalNode OPENP() { return getToken(pass1Parser.OPENP, 0); }
		public List<TerminalNode> ID() { return getTokens(pass1Parser.ID); }
		public TerminalNode SEM(int i) {
			return getToken(pass1Parser.SEM, i);
		}
		public TerminalNode NEW() { return getToken(pass1Parser.NEW, 0); }
		public TerminalNode CLOSEP() { return getToken(pass1Parser.CLOSEP, 0); }
		public TerminalNode DOTS(int i) {
			return getToken(pass1Parser.DOTS, i);
		}
		public TerminalNode ELSE() { return getToken(pass1Parser.ELSE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(pass1Parser.ASSIGN); }
		public List<TerminalNode> SEM() { return getTokens(pass1Parser.SEM); }
		public TerminalNode ASSIGN(int i) {
			return getToken(pass1Parser.ASSIGN, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("6");
				setState(102); match(ID);
				setState(103); match(ASSIGN);
				setState(104); expr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
		//		System.out.println("8");
				setState(106); match(ID);
				setState(107); match(OPENP);
				setState(116);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(108); expr();
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COM) {
						{
						{
						setState(109); match(COM);
						setState(110); expr();
						}
						}
						setState(115);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(118); match(CLOSEP);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
		//		System.out.println("9");
				setState(120); match(START_IF);
				setState(121); expr();
				setState(122); match(THEN);
				setState(123); expr();
				setState(124); match(ELSE);
				setState(125); expr();
				setState(126); match(END_IF);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
		//		System.out.println("10");
				setState(129); match(WHILE);
				setState(130); expr();
				setState(131); match(START_LOOP);
				setState(132); expr();
				setState(133); match(END_LOOP);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
		//		System.out.println("11");
				setState(136); match(OPENA);
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137); expr();
					setState(138); match(SEM);
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0) );
				setState(144); match(CLOSEA);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
		//		System.out.println("12");
				setState(147); match(LET);
				setState(148); match(ID);
				setState(149); match(DOTS);
				setState(150); match(TYPE);
				setState(153);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(151); match(ASSIGN);
					setState(152); expr();
					}
				}

				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(155); match(COM);
					setState(156); match(ID);
					setState(157); match(DOTS);
					setState(158); match(TYPE);
					setState(161);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(159); match(ASSIGN);
						setState(160); expr();
						}
					}

					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168); match(IN);
				setState(169); expr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
		//		System.out.println("13");
				setState(171); match(START_CASE);
				setState(172); expr();
				setState(173); match(OF);
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174); match(ID);
					setState(175); match(DOTS);
					setState(176); match(TYPE);
					setState(177); match(BIGER_EQUAL);
					setState(178); expr();
					setState(179); match(SEM);
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(185); match(END_CASE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
		//		System.out.println("14");
				setState(188); match(NEW);
				setState(189); match(TYPE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(190); t();
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
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode NOT_FLAG() { return getToken(pass1Parser.NOT_FLAG, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_t);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case NOT_FLAG:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("24");
				setState(194); match(NOT_FLAG);
				setState(195); a();
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
				setState(196); a();
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
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); b();
			setState(200); aa();
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
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode LESS_EQUAL() { return getToken(pass1Parser.LESS_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(pass1Parser.LESS, 0); }
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(pass1Parser.EQUAL, 0); }
		public AaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterAa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitAa(this);
		}
	}

	public final AaContext aa() throws RecognitionException {
		AaContext _localctx = new AaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aa);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("21");
				setState(203); match(LESS);
				setState(204); b();
				setState(205); aa();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
		//		System.out.println("22");
				setState(208); match(LESS_EQUAL);
				setState(209); b();
				setState(210); aa();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
		//		System.out.println("23");
				setState(213); match(EQUAL);
				setState(214); b();
				setState(215); aa();
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
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); c();
			setState(221); bb();
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
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public BbContext bb() {
			return getRuleContext(BbContext.class,0);
		}
		public TerminalNode SUB() { return getToken(pass1Parser.SUB, 0); }
		public TerminalNode ADD() { return getToken(pass1Parser.ADD, 0); }
		public BbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterBb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitBb(this);
		}
	}

	public final BbContext bb() throws RecognitionException {
		BbContext _localctx = new BbContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bb);
		try {
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("16");
				setState(224); match(ADD);
				setState(225); c();
				setState(226); bb();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
		//		System.out.println("17");
				setState(229); match(SUB);
				setState(230); c();
				setState(231); bb();
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
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); f();
			setState(237); cc();
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
		public TerminalNode MULTI() { return getToken(pass1Parser.MULTI, 0); }
		public TerminalNode DIVID() { return getToken(pass1Parser.DIVID, 0); }
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public CcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterCc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitCc(this);
		}
	}

	public final CcContext cc() throws RecognitionException {
		CcContext _localctx = new CcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cc);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("18");
				setState(240); match(MULTI);
				setState(241); f();
				setState(242); cc();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
		//		System.out.println("19");
				setState(245); match(DIVID);
				setState(246); f();
				setState(247); cc();
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
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); d();
			setState(253); z();
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
		public TerminalNode COM(int i) {
			return getToken(pass1Parser.COM, i);
		}
		public TerminalNode CLOSEP() { return getToken(pass1Parser.CLOSEP, 0); }
		public TerminalNode DOT() { return getToken(pass1Parser.DOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ZContext z() {
			return getRuleContext(ZContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPENP() { return getToken(pass1Parser.OPENP, 0); }
		public TerminalNode ID() { return getToken(pass1Parser.ID, 0); }
		public TerminalNode AT() { return getToken(pass1Parser.AT, 0); }
		public TerminalNode TYPE() { return getToken(pass1Parser.TYPE, 0); }
		public List<TerminalNode> COM() { return getTokens(pass1Parser.COM); }
		public ZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitZ(this);
		}
	}

	public final ZContext z() throws RecognitionException {
		ZContext _localctx = new ZContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_z);
		int _la;
		try {
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("7");
				setState(258);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(256); match(AT);
					setState(257); match(TYPE);
					}
				}

				setState(260); match(DOT);
				setState(261); match(ID);
				setState(262); match(OPENP);
				setState(271);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(263); expr();
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COM) {
						{
						{
						setState(264); match(COM);
						setState(265); expr();
						}
						}
						setState(270);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(273); match(CLOSEP);
				setState(274); z();
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
		public TerminalNode NOT() { return getToken(pass1Parser.NOT, 0); }
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_d);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("20");
				setState(279); match(NOT);
				setState(280); g();
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
				setState(281); g();
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
		public TerminalNode ISVOID() { return getToken(pass1Parser.ISVOID, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitG(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_g);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case ISVOID:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("15");
				setState(285); match(ISVOID);
				setState(286); e();
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
				setState(287); e();
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
		public TerminalNode CLOSEA() { return getToken(pass1Parser.CLOSEA, 0); }
		public List<TerminalNode> DOTS() { return getTokens(pass1Parser.DOTS); }
		public TerminalNode END_CASE() { return getToken(pass1Parser.END_CASE, 0); }
		public TerminalNode TRUE() { return getToken(pass1Parser.TRUE, 0); }
		public TerminalNode START_CASE() { return getToken(pass1Parser.START_CASE, 0); }
		public TerminalNode TYPE(int i) {
			return getToken(pass1Parser.TYPE, i);
		}
		public TerminalNode BIGER_EQUAL(int i) {
			return getToken(pass1Parser.BIGER_EQUAL, i);
		}
		public TerminalNode START_LOOP() { return getToken(pass1Parser.START_LOOP, 0); }
		public TerminalNode IN() { return getToken(pass1Parser.IN, 0); }
		public TerminalNode WHILE() { return getToken(pass1Parser.WHILE, 0); }
		public TerminalNode OPENA() { return getToken(pass1Parser.OPENA, 0); }
		public TerminalNode END_IF() { return getToken(pass1Parser.END_IF, 0); }
		public List<TerminalNode> BIGER_EQUAL() { return getTokens(pass1Parser.BIGER_EQUAL); }
		public TerminalNode LET() { return getToken(pass1Parser.LET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode END_LOOP() { return getToken(pass1Parser.END_LOOP, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(pass1Parser.OF, 0); }
		public List<TerminalNode> TYPE() { return getTokens(pass1Parser.TYPE); }
		public TerminalNode ID(int i) {
			return getToken(pass1Parser.ID, i);
		}
		public List<TerminalNode> COM() { return getTokens(pass1Parser.COM); }
		public TerminalNode COM(int i) {
			return getToken(pass1Parser.COM, i);
		}
		public TerminalNode THEN() { return getToken(pass1Parser.THEN, 0); }
		public TerminalNode START_IF() { return getToken(pass1Parser.START_IF, 0); }
		public List<TerminalNode> ID() { return getTokens(pass1Parser.ID); }
		public TerminalNode OPENP() { return getToken(pass1Parser.OPENP, 0); }
		public TerminalNode SEM(int i) {
			return getToken(pass1Parser.SEM, i);
		}
		public TerminalNode NEW() { return getToken(pass1Parser.NEW, 0); }
		public TerminalNode CLOSEP() { return getToken(pass1Parser.CLOSEP, 0); }
		public TerminalNode DOTS(int i) {
			return getToken(pass1Parser.DOTS, i);
		}
		public TerminalNode ELSE() { return getToken(pass1Parser.ELSE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(pass1Parser.ASSIGN); }
		public List<TerminalNode> SEM() { return getTokens(pass1Parser.SEM); }
		public TerminalNode ASSIGN(int i) {
			return getToken(pass1Parser.ASSIGN, i);
		}
		public TerminalNode STRING() { return getToken(pass1Parser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(pass1Parser.INTEGER, 0); }
		public TerminalNode FALSE() { return getToken(pass1Parser.FALSE, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pass1Listener ) ((pass1Listener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_e);
		int _la;
		try {
			setState(398);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
		//		System.out.println("25");
				setState(291); match(OPENP);
				setState(292); expr();
				setState(293); match(CLOSEP);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
		//		System.out.println("27");
				setState(298);
				switch (_input.LA(1)) {
				case SUB:
					{
					setState(296); match(SUB);
					}
					break;
				case INTEGER:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300); match(INTEGER);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
		//		System.out.println("28");
				setState(302); match(STRING);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
		//		System.out.println("29");
				setState(304); match(TRUE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
		//		System.out.println("30");
				setState(306); match(FALSE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
		//		System.out.println("26");
				setState(308); match(ID);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
		//		System.out.println("6");
				setState(310); match(ID);
				setState(311); match(ASSIGN);
				setState(312); expr();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
		//		System.out.println("8");
				setState(314); match(ID);
				setState(315); match(OPENP);
				setState(324);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(316); expr();
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COM) {
						{
						{
						setState(317); match(COM);
						setState(318); expr();
						}
						}
						setState(323);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(326); match(CLOSEP);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
		//		System.out.println("9");
				setState(328); match(START_IF);
				setState(329); expr();
				setState(330); match(THEN);
				setState(331); expr();
				setState(332); match(ELSE);
				setState(333); expr();
				setState(334); match(END_IF);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
		//		System.out.println("10");
				setState(337); match(WHILE);
				setState(338); expr();
				setState(339); match(START_LOOP);
				setState(340); expr();
				setState(341); match(END_LOOP);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
		//		System.out.println("11");
				setState(344); match(OPENA);
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(345); expr();
					setState(346); match(SEM);
					}
					}
					setState(350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0) );
				setState(352); match(CLOSEA);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
		//		System.out.println("12");
				setState(355); match(LET);
				setState(356); match(ID);
				setState(357); match(DOTS);
				setState(358); match(TYPE);
				setState(361);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(359); match(ASSIGN);
					setState(360); expr();
					}
				}

				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(363); match(COM);
					setState(364); match(ID);
					setState(365); match(DOTS);
					setState(366); match(TYPE);
					setState(369);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(367); match(ASSIGN);
						setState(368); expr();
						}
					}

					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376); match(IN);
				setState(377); expr();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
		//		System.out.println("13");
				setState(379); match(START_CASE);
				setState(380); expr();
				setState(381); match(OF);
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(382); match(ID);
					setState(383); match(DOTS);
					setState(384); match(TYPE);
					setState(385); match(BIGER_EQUAL);
					setState(386); expr();
					setState(387); match(SEM);
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(393); match(END_CASE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
		//		System.out.println("14");
				setState(396); match(NEW);
				setState(397); match(TYPE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0193\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\5\4M\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\4\5\4`\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6"+
		"\5\6w\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u008f\n\6\r\6\16\6\u0090\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a4"+
		"\n\6\7\6\u00a6\n\6\f\6\16\6\u00a9\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\6\6\u00b8\n\6\r\6\16\6\u00b9\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00c2\n\6\3\7\3\7\3\7\3\7\5\7\u00c8\n\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00dd\n\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00ed\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00fd\n\r\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u0105\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u010d\n\17\f\17\16\17\u0110\13\17\5\17\u0112\n"+
		"\17\3\17\3\17\3\17\5\17\u0117\n\17\3\20\3\20\3\20\3\20\5\20\u011d\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u0123\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u012d\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0142\n\22\f\22\16"+
		"\22\u0145\13\22\5\22\u0147\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\6\22\u015f\n\22\r\22\16\22\u0160\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u016c\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0174\n\22"+
		"\7\22\u0176\n\22\f\22\16\22\u0179\13\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u0188\n\22\r\22\16\22\u0189\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0191\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\2\u01ba\2$\3\2\2\2\4.\3\2\2\2\6_\3\2\2\2\b"+
		"a\3\2\2\2\n\u00c1\3\2\2\2\f\u00c7\3\2\2\2\16\u00c9\3\2\2\2\20\u00dc\3"+
		"\2\2\2\22\u00de\3\2\2\2\24\u00ec\3\2\2\2\26\u00ee\3\2\2\2\30\u00fc\3\2"+
		"\2\2\32\u00fe\3\2\2\2\34\u0116\3\2\2\2\36\u011c\3\2\2\2 \u0122\3\2\2\2"+
		"\"\u0190\3\2\2\2$(\b\2\1\2%&\5\4\3\2&\'\7)\2\2\')\3\2\2\2(%\3\2\2\2)*"+
		"\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\b\2\1\2-\3\3\2\2\2./\b\3\1\2"+
		"/\60\7\b\2\2\60\63\7\60\2\2\61\62\7\7\2\2\62\64\7\60\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\65\3\2\2\2\65;\7\'\2\2\66\67\5\6\4\2\678\7)\2\28:\3"+
		"\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>"+
		"?\7(\2\2?@\b\3\1\2@\5\3\2\2\2AB\b\4\1\2BC\7/\2\2CL\7\22\2\2DI\5\b\5\2"+
		"EF\7*\2\2FH\5\b\5\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2"+
		"KI\3\2\2\2LD\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\23\2\2OP\7+\2\2PQ\7\60\2"+
		"\2QR\7\'\2\2RS\5\n\6\2ST\7(\2\2TU\b\4\1\2U`\3\2\2\2VW\b\4\1\2WX\7/\2\2"+
		"XY\7+\2\2Y\\\7\60\2\2Z[\7\16\2\2[]\5\n\6\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2"+
		"\2\2^`\b\4\1\2_A\3\2\2\2_V\3\2\2\2`\7\3\2\2\2ab\b\5\1\2bc\7/\2\2cd\7+"+
		"\2\2de\7\60\2\2ef\b\5\1\2f\t\3\2\2\2gh\b\6\1\2hi\7/\2\2ij\7\16\2\2j\u00c2"+
		"\5\n\6\2kl\b\6\1\2lm\7/\2\2mv\7\22\2\2ns\5\n\6\2op\7*\2\2pr\5\n\6\2qo"+
		"\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2v"+
		"w\3\2\2\2wx\3\2\2\2x\u00c2\7\23\2\2yz\b\6\1\2z{\7#\2\2{|\5\n\6\2|}\7&"+
		"\2\2}~\5\n\6\2~\177\7%\2\2\177\u0080\5\n\6\2\u0080\u0081\7$\2\2\u0081"+
		"\u00c2\3\2\2\2\u0082\u0083\b\6\1\2\u0083\u0084\7 \2\2\u0084\u0085\5\n"+
		"\6\2\u0085\u0086\7!\2\2\u0086\u0087\5\n\6\2\u0087\u0088\7\"\2\2\u0088"+
		"\u00c2\3\2\2\2\u0089\u008a\b\6\1\2\u008a\u008e\7\'\2\2\u008b\u008c\5\n"+
		"\6\2\u008c\u008d\7)\2\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\7(\2\2\u0093\u00c2\3\2\2\2\u0094\u0095\b\6\1\2\u0095"+
		"\u0096\7\t\2\2\u0096\u0097\7/\2\2\u0097\u0098\7+\2\2\u0098\u009b\7\60"+
		"\2\2\u0099\u009a\7\16\2\2\u009a\u009c\5\n\6\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a7\3\2\2\2\u009d\u009e\7*\2\2\u009e\u009f\7/\2"+
		"\2\u009f\u00a0\7+\2\2\u00a0\u00a3\7\60\2\2\u00a1\u00a2\7\16\2\2\u00a2"+
		"\u00a4\5\n\6\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u009d\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\37"+
		"\2\2\u00ab\u00c2\5\n\6\2\u00ac\u00ad\b\6\1\2\u00ad\u00ae\7\33\2\2\u00ae"+
		"\u00af\5\n\6\2\u00af\u00b7\7\35\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\7+"+
		"\2\2\u00b2\u00b3\7\60\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00b5\5\n\6\2\u00b5"+
		"\u00b6\7)\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\7\34\2\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\b\6\1\2\u00be\u00bf\7"+
		"\32\2\2\u00bf\u00c2\7\60\2\2\u00c0\u00c2\5\f\7\2\u00c1g\3\2\2\2\u00c1"+
		"k\3\2\2\2\u00c1y\3\2\2\2\u00c1\u0082\3\2\2\2\u00c1\u0089\3\2\2\2\u00c1"+
		"\u0094\3\2\2\2\u00c1\u00ac\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\13\3\2\2\2\u00c3\u00c4\b\7\1\2\u00c4\u00c5\7\24\2\2\u00c5\u00c8"+
		"\5\16\b\2\u00c6\u00c8\5\16\b\2\u00c7\u00c3\3\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\r\3\2\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\5\20\t\2\u00cb\17\3"+
		"\2\2\2\u00cc\u00cd\b\t\1\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\5\22\n\2\u00cf"+
		"\u00d0\5\20\t\2\u00d0\u00dd\3\2\2\2\u00d1\u00d2\b\t\1\2\u00d2\u00d3\7"+
		"\26\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\5\20\t\2\u00d5\u00dd\3\2\2\2"+
		"\u00d6\u00d7\b\t\1\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\5\22\n\2\u00d9\u00da"+
		"\5\20\t\2\u00da\u00dd\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00cc\3\2\2\2"+
		"\u00dc\u00d1\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\21"+
		"\3\2\2\2\u00de\u00df\5\26\f\2\u00df\u00e0\5\24\13\2\u00e0\23\3\2\2\2\u00e1"+
		"\u00e2\b\13\1\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\5\26\f\2\u00e4\u00e5\5"+
		"\24\13\2\u00e5\u00ed\3\2\2\2\u00e6\u00e7\b\13\1\2\u00e7\u00e8\7\r\2\2"+
		"\u00e8\u00e9\5\26\f\2\u00e9\u00ea\5\24\13\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed\25\3\2\2\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0\5\30\r\2\u00f0"+
		"\27\3\2\2\2\u00f1\u00f2\b\r\1\2\u00f2\u00f3\7\n\2\2\u00f3\u00f4\5\32\16"+
		"\2\u00f4\u00f5\5\30\r\2\u00f5\u00fd\3\2\2\2\u00f6\u00f7\b\r\1\2\u00f7"+
		"\u00f8\7\13\2\2\u00f8\u00f9\5\32\16\2\u00f9\u00fa\5\30\r\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f1\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\31\3\2\2\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\5\34"+
		"\17\2\u0100\33\3\2\2\2\u0101\u0104\b\17\1\2\u0102\u0103\7-\2\2\u0103\u0105"+
		"\7\60\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0107\7,\2\2\u0107\u0108\7/\2\2\u0108\u0111\7\22\2\2\u0109\u010e"+
		"\5\n\6\2\u010a\u010b\7*\2\2\u010b\u010d\5\n\6\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\7\23\2\2\u0114\u0117\5\34\17\2\u0115\u0117"+
		"\3\2\2\2\u0116\u0101\3\2\2\2\u0116\u0115\3\2\2\2\u0117\35\3\2\2\2\u0118"+
		"\u0119\b\20\1\2\u0119\u011a\7\30\2\2\u011a\u011d\5 \21\2\u011b\u011d\5"+
		" \21\2\u011c\u0118\3\2\2\2\u011c\u011b\3\2\2\2\u011d\37\3\2\2\2\u011e"+
		"\u011f\b\21\1\2\u011f\u0120\7\31\2\2\u0120\u0123\5\"\22\2\u0121\u0123"+
		"\5\"\22\2\u0122\u011e\3\2\2\2\u0122\u0121\3\2\2\2\u0123!\3\2\2\2\u0124"+
		"\u0125\b\22\1\2\u0125\u0126\7\22\2\2\u0126\u0127\5\n\6\2\u0127\u0128\7"+
		"\23\2\2\u0128\u0191\3\2\2\2\u0129\u012c\b\22\1\2\u012a\u012d\7\r\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0191\7\6\2\2\u012f\u0130\b\22\1\2\u0130\u0191\7.\2\2\u0131"+
		"\u0132\b\22\1\2\u0132\u0191\7\17\2\2\u0133\u0134\b\22\1\2\u0134\u0191"+
		"\7\20\2\2\u0135\u0136\b\22\1\2\u0136\u0191\7/\2\2\u0137\u0138\b\22\1\2"+
		"\u0138\u0139\7/\2\2\u0139\u013a\7\16\2\2\u013a\u0191\5\n\6\2\u013b\u013c"+
		"\b\22\1\2\u013c\u013d\7/\2\2\u013d\u0146\7\22\2\2\u013e\u0143\5\n\6\2"+
		"\u013f\u0140\7*\2\2\u0140\u0142\5\n\6\2\u0141\u013f\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0191\7\23\2\2\u0149\u014a\b\22\1\2\u014a\u014b\7#\2\2\u014b"+
		"\u014c\5\n\6\2\u014c\u014d\7&\2\2\u014d\u014e\5\n\6\2\u014e\u014f\7%\2"+
		"\2\u014f\u0150\5\n\6\2\u0150\u0151\7$\2\2\u0151\u0191\3\2\2\2\u0152\u0153"+
		"\b\22\1\2\u0153\u0154\7 \2\2\u0154\u0155\5\n\6\2\u0155\u0156\7!\2\2\u0156"+
		"\u0157\5\n\6\2\u0157\u0158\7\"\2\2\u0158\u0191\3\2\2\2\u0159\u015a\b\22"+
		"\1\2\u015a\u015e\7\'\2\2\u015b\u015c\5\n\6\2\u015c\u015d\7)\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015b\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7(\2\2\u0163"+
		"\u0191\3\2\2\2\u0164\u0165\b\22\1\2\u0165\u0166\7\t\2\2\u0166\u0167\7"+
		"/\2\2\u0167\u0168\7+\2\2\u0168\u016b\7\60\2\2\u0169\u016a\7\16\2\2\u016a"+
		"\u016c\5\n\6\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0177\3\2"+
		"\2\2\u016d\u016e\7*\2\2\u016e\u016f\7/\2\2\u016f\u0170\7+\2\2\u0170\u0173"+
		"\7\60\2\2\u0171\u0172\7\16\2\2\u0172\u0174\5\n\6\2\u0173\u0171\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u016d\3\2\2\2\u0176\u0179"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017b\7\37\2\2\u017b\u0191\5\n\6\2\u017c\u017d\b"+
		"\22\1\2\u017d\u017e\7\33\2\2\u017e\u017f\5\n\6\2\u017f\u0187\7\35\2\2"+
		"\u0180\u0181\7/\2\2\u0181\u0182\7+\2\2\u0182\u0183\7\60\2\2\u0183\u0184"+
		"\7\36\2\2\u0184\u0185\5\n\6\2\u0185\u0186\7)\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0180\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7\34\2\2\u018c\u0191\3\2\2\2\u018d"+
		"\u018e\b\22\1\2\u018e\u018f\7\32\2\2\u018f\u0191\7\60\2\2\u0190\u0124"+
		"\3\2\2\2\u0190\u0129\3\2\2\2\u0190\u012f\3\2\2\2\u0190\u0131\3\2\2\2\u0190"+
		"\u0133\3\2\2\2\u0190\u0135\3\2\2\2\u0190\u0137\3\2\2\2\u0190\u013b\3\2"+
		"\2\2\u0190\u0149\3\2\2\2\u0190\u0152\3\2\2\2\u0190\u0159\3\2\2\2\u0190"+
		"\u0164\3\2\2\2\u0190\u017c\3\2\2\2\u0190\u018d\3\2\2\2\u0191#\3\2\2\2"+
		"$*\63;IL\\_sv\u0090\u009b\u00a3\u00a7\u00b9\u00c1\u00c7\u00dc\u00ec\u00fc"+
		"\u0104\u010e\u0111\u0116\u011c\u0122\u012c\u0143\u0146\u0160\u016b\u0173"+
		"\u0177\u0189\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}