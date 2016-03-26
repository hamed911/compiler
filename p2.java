//// Generated from phase1.g4 by ANTLR 4.2
//import org.antlr.v4.runtime.atn.*;
//import org.antlr.v4.runtime.dfa.DFA;
//import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.misc.*;
//import org.antlr.v4.runtime.tree.*;
//
//
//import java.util.List;
//import java.util.Iterator;
//import java.util.ArrayList;
//
//@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
//public class phase1Parser extends Parser {
//	private String funcType;
//	private String funcName;
//	private String className;
//	private String classType;
//	protected SymbolTable MainSymbolTable = new SymbolTable("MainSymbolTable");
//	
//	protected static final DFA[] _decisionToDFA;
//	protected static final PredictionContextCache _sharedContextCache =
//		new PredictionContextCache();
//	public static final int
//		WHITESPACE=1, LINECOMMENT=2, COMMENT=3, INTEGER=4, INHERITS=5, CLASS=6, 
//		LET=7, MULTI=8, DIVID=9, ADD=10, SUB=11, ASSIGN=12, TRUE=13, FALSE=14, 
//		DOUBLE_COT=15, OPENP=16, CLOSEP=17, NOT_FLAG=18, EQUAL=19, LESS_EQUAL=20, 
//		LESS=21, NOT=22, ISVOID=23, NEW=24, START_CASE=25, END_CASE=26, OF=27, 
//		BIGER_EQUAL=28, IN=29, WHILE=30, START_LOOP=31, END_LOOP=32, START_IF=33, 
//		END_IF=34, ELSE=35, THEN=36, OPENA=37, CLOSEA=38, SEM=39, COM=40, DOTS=41, 
//		DOT=42, AT=43, STRING=44, ID=45, TYPE=46;
//	public static final String[] tokenNames = {
//		"<INVALID>", "WHITESPACE", "LINECOMMENT", "COMMENT", "INTEGER", "INHERITS", 
//		"CLASS", "LET", "'*'", "'/'", "'+'", "'-'", "'<-'", "TRUE", "FALSE", "'\"'", 
//		"'('", "')'", "NOT_FLAG", "'='", "'<='", "'<'", "'~'", "ISVOID", "NEW", 
//		"START_CASE", "END_CASE", "OF", "'=>'", "IN", "WHILE", "START_LOOP", "END_LOOP", 
//		"START_IF", "END_IF", "ELSE", "THEN", "'{'", "'}'", "';'", "','", "':'", 
//		"'.'", "'@'", "STRING", "ID", "TYPE"
//	};
//	public static final int
//		RULE_program = 0, RULE_classdef = 1, RULE_feature = 2, RULE_formal = 3, 
//		RULE_expr = 4, RULE_t = 5, RULE_a = 6, RULE_aa = 7, RULE_b = 8, RULE_bb = 9, 
//		RULE_c = 10, RULE_cc = 11, RULE_f = 12, RULE_z = 13, RULE_d = 14, RULE_g = 15, 
//		RULE_e = 16;
//	public static final String[] ruleNames = {
//		"program", "classdef", "feature", "formal", "expr", "t", "a", "aa", "b", 
//		"bb", "c", "cc", "f", "z", "d", "g", "e"
//	};
//
//	@Override
//	public String getGrammarFileName() { return "phase1.g4"; }
//
//	@Override
//	public String[] getTokenNames() { return tokenNames; }
//
//	@Override
//	public String[] getRuleNames() { return ruleNames; }
//
//	@Override
//	public String getSerializedATN() { return _serializedATN; }
//
//	@Override
//	public ATN getATN() { return _ATN; }
//
//	public phase1Parser(TokenStream input) {
//		super(input);
//		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
//	}
//	public static class ProgramContext extends ParserRuleContext {
//		public ClassdefContext classdef(int i) {
//			return getRuleContext(ClassdefContext.class,i);
//		}
//		public List<TerminalNode> SEM() { return getTokens(phase1Parser.SEM); }
//		public TerminalNode SEM(int i) {
//			return getToken(phase1Parser.SEM, i);
//		}
//		public List<ClassdefContext> classdef() {
//			return getRuleContexts(ClassdefContext.class);
//		}
//		public ProgramContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_program; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterProgram(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitProgram(this);
//		}
//	}
//
//	public final ProgramContext program() throws RecognitionException {
//		/// initialized MainSymbolTable...
//			MainSymbolTable.initialized();
//		///
//		
//		ProgramContext _localctx = new ProgramContext(_ctx, getState());
//		enterRule(_localctx, 0, RULE_program);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			System.out.println("1-");
//			setState(38); 
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			do {
//				{
//				{
//				setState(35); classdef();
//				setState(36); match(SEM);
//				}
//				}
//				setState(40); 
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			} while ( _la==CLASS );
//			//System.out.println("InheritanceGraph:");
//			System.out.println("****MainSymbolTable****");
//			MainSymbolTable.printSymbolTable();
//			System.out.println("***********************");
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class ClassdefContext extends ParserRuleContext {
//		public Token m;
//		public Token n;
//		public TerminalNode CLOSEA() { return getToken(phase1Parser.CLOSEA, 0); }
//		public TerminalNode OPENA() { return getToken(phase1Parser.OPENA, 0); }
//		public List<FeatureContext> feature() {
//			return getRuleContexts(FeatureContext.class);
//		}
//		public FeatureContext feature(int i) {
//			return getRuleContext(FeatureContext.class,i);
//		}
//		public List<TerminalNode> SEM() { return getTokens(phase1Parser.SEM); }
//		public TerminalNode INHERITS() { return getToken(phase1Parser.INHERITS, 0); }
//		public TerminalNode TYPE(int i) {
//			return getToken(phase1Parser.TYPE, i);
//		}
//		public TerminalNode SEM(int i) {
//			return getToken(phase1Parser.SEM, i);
//		}
//		public List<TerminalNode> TYPE() { return getTokens(phase1Parser.TYPE); }
//		public TerminalNode CLASS() { return getToken(phase1Parser.CLASS, 0); }
//		public ClassdefContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_classdef; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterClassdef(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitClassdef(this);
//		}
//	}
//
//	public final ClassdefContext classdef() throws RecognitionException {
//		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
//		enterRule(_localctx, 2, RULE_classdef);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			System.out.println("2");
//			setState(45); match(CLASS);
//			setState(46); ((ClassdefContext)_localctx).m = match(TYPE);
//			setState(49);
//			_la = _input.LA(1);
//			if (_la==INHERITS) {
//				{
//				setState(47); match(INHERITS);
//				setState(48); ((ClassdefContext)_localctx).n = match(TYPE);
//				}
//			}
//			
//			/////
//			
//			className = ((ClassdefContext)_localctx).m.getText();
//			
//			MainSymbolTable.addClass( ((ClassdefContext)_localctx).n,  ((ClassdefContext)_localctx).m, MainSymbolTable);
//			
//			/////
//
//			setState(51); match(OPENA);
//			setState(57);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			while (_la==ID) {
//				{
//				{
//				setState(52); feature();
//				setState(53); match(SEM);
//				}
//				}
//				setState(59);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			}
//			setState(60); match(CLOSEA);
//			System.out.println("class defenition: "+((ClassdefContext)_localctx).m.getText() );
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class FeatureContext extends ParserRuleContext {
//		public Token function;
//		public Token returnType;
//		public Token variableId;
//		public Token variableType;
//		public TerminalNode CLOSEA() { return getToken(phase1Parser.CLOSEA, 0); }
//		public TerminalNode COM(int i) {
//			return getToken(phase1Parser.COM, i);
//		}
//		public TerminalNode OPENA() { return getToken(phase1Parser.OPENA, 0); }
//		public TerminalNode DOTS() { return getToken(phase1Parser.DOTS, 0); }
//		public FormalContext formal(int i) {
//			return getRuleContext(FormalContext.class,i);
//		}
//		public List<FormalContext> formal() {
//			return getRuleContexts(FormalContext.class);
//		}
//		public TerminalNode CLOSEP() { return getToken(phase1Parser.CLOSEP, 0); }
//		public ExprContext expr() {
//			return getRuleContext(ExprContext.class,0);
//		}
//		public TerminalNode ASSIGN() { return getToken(phase1Parser.ASSIGN, 0); }
//		public TerminalNode ID() { return getToken(phase1Parser.ID, 0); }
//		public TerminalNode OPENP() { return getToken(phase1Parser.OPENP, 0); }
//		public TerminalNode TYPE() { return getToken(phase1Parser.TYPE, 0); }
//		public List<TerminalNode> COM() { return getTokens(phase1Parser.COM); }
//		public FeatureContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_feature; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterFeature(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitFeature(this);
//		}
//	}
//
//	public final FeatureContext feature() throws RecognitionException {
//		FeatureContext _localctx = new FeatureContext(_ctx, getState());
//		enterRule(_localctx, 4, RULE_feature);
//		int _la;
//		try {
//			setState(94);
//			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("3");
//				setState(64); ((FeatureContext)_localctx).function = match(ID);
//				funcName =  ((FeatureContext)_localctx).function.getText();
//				TrivialOperation.addFunc(funcName);
//				//System.out.println("new function!");
//				setState(66); match(OPENP);
//				setState(75);
//				_la = _input.LA(1);
//				if (_la==ID) {
//					{
//					setState(67); formal();
//					setState(72);
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//					while (_la==COM) {
//						{
//						{
//						setState(68); match(COM);
//						setState(69); formal();
//						}
//						}
//						setState(74);
//						_errHandler.sync(this);
//						_la = _input.LA(1);
//					}
//					}
//				}
//
//				setState(77); match(CLOSEP);
//				setState(78); match(DOTS);
//				setState(79); ((FeatureContext)_localctx).returnType = match(TYPE);
//				setState(80); match(OPENA);
//				setState(81); expr();
//				setState(82); match(CLOSEA);
//				System.out.println(((FeatureContext)_localctx).function.getText()+"(...) : "+((FeatureContext)_localctx).returnType.getText());
//				
//				///
//				funcType = TrivialOperation.getFunctionType(funcName, ((FeatureContext)_localctx).returnType);
//				
//				MainSymbolTable.addFunction(((FeatureContext)_localctx).function,MainSymbolTable,className,funcType);
//		
//				////
//				
//				}
//				break;
//
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				System.out.println("4");
//				setState(86); ((FeatureContext)_localctx).variableId = match(ID);
//				setState(87); match(DOTS);
//				setState(88); ((FeatureContext)_localctx).variableType = match(TYPE);
//				setState(91);
//				_la = _input.LA(1);
//				if (_la==ASSIGN) {
//					{
//					setState(89); match(ASSIGN);
//					setState(90); expr();
//					}
//				}
//
//				System.out.println(((FeatureContext)_localctx).variableId.getText()+" : "+((FeatureContext)_localctx).variableType.getText());
//				
//				////
//				
//				MainSymbolTable.addVariable(((FeatureContext)_localctx).variableId,((FeatureContext)_localctx).variableType,MainSymbolTable,className);
//				
//				////
//				
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class FormalContext extends ParserRuleContext {
//		public Token inputId;
//		public Token inputType;
//		public TerminalNode DOTS() { return getToken(phase1Parser.DOTS, 0); }
//		public TerminalNode ID() { return getToken(phase1Parser.ID, 0); }
//		public TerminalNode TYPE() { return getToken(phase1Parser.TYPE, 0); }
//		public FormalContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_formal; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterFormal(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitFormal(this);
//		}
//	}
//
//	public final FormalContext formal() throws RecognitionException {
//		FormalContext _localctx = new FormalContext(_ctx, getState());
//		enterRule(_localctx, 6, RULE_formal);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			System.out.println("5");
//			setState(97); ((FormalContext)_localctx).inputId = match(ID);
//			setState(98); match(DOTS);
//			setState(99); ((FormalContext)_localctx).inputType = match(TYPE);
//			System.out.println(((FormalContext)_localctx).inputId.getText()+" : "+((FormalContext)_localctx).inputType.getText());
//			TrivialOperation.addArguType(funcName,((FormalContext)_localctx).inputType);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class ExprContext extends ParserRuleContext {
//		public TerminalNode CLOSEA() { return getToken(phase1Parser.CLOSEA, 0); }
//		public List<TerminalNode> DOTS() { return getTokens(phase1Parser.DOTS); }
//		public TerminalNode END_CASE() { return getToken(phase1Parser.END_CASE, 0); }
//		public TerminalNode START_CASE() { return getToken(phase1Parser.START_CASE, 0); }
//		public TContext t() {
//			return getRuleContext(TContext.class,0);
//		}
//		public TerminalNode TYPE(int i) {
//			return getToken(phase1Parser.TYPE, i);
//		}
//		public TerminalNode BIGER_EQUAL(int i) {
//			return getToken(phase1Parser.BIGER_EQUAL, i);
//		}
//		public TerminalNode START_LOOP() { return getToken(phase1Parser.START_LOOP, 0); }
//		public TerminalNode IN() { return getToken(phase1Parser.IN, 0); }
//		public TerminalNode WHILE() { return getToken(phase1Parser.WHILE, 0); }
//		public TerminalNode OPENA() { return getToken(phase1Parser.OPENA, 0); }
//		public TerminalNode END_IF() { return getToken(phase1Parser.END_IF, 0); }
//		public List<TerminalNode> BIGER_EQUAL() { return getTokens(phase1Parser.BIGER_EQUAL); }
//		public TerminalNode LET() { return getToken(phase1Parser.LET, 0); }
//		public List<ExprContext> expr() {
//			return getRuleContexts(ExprContext.class);
//		}
//		public TerminalNode END_LOOP() { return getToken(phase1Parser.END_LOOP, 0); }
//		public ExprContext expr(int i) {
//			return getRuleContext(ExprContext.class,i);
//		}
//		public TerminalNode OF() { return getToken(phase1Parser.OF, 0); }
//		public List<TerminalNode> TYPE() { return getTokens(phase1Parser.TYPE); }
//		public List<TerminalNode> COM() { return getTokens(phase1Parser.COM); }
//		public TerminalNode ID(int i) {
//			return getToken(phase1Parser.ID, i);
//		}
//		public TerminalNode THEN() { return getToken(phase1Parser.THEN, 0); }
//		public TerminalNode COM(int i) {
//			return getToken(phase1Parser.COM, i);
//		}
//		public TerminalNode START_IF() { return getToken(phase1Parser.START_IF, 0); }
//		public TerminalNode OPENP() { return getToken(phase1Parser.OPENP, 0); }
//		public List<TerminalNode> ID() { return getTokens(phase1Parser.ID); }
//		public TerminalNode SEM(int i) {
//			return getToken(phase1Parser.SEM, i);
//		}
//		public TerminalNode NEW() { return getToken(phase1Parser.NEW, 0); }
//		public TerminalNode CLOSEP() { return getToken(phase1Parser.CLOSEP, 0); }
//		public TerminalNode DOTS(int i) {
//			return getToken(phase1Parser.DOTS, i);
//		}
//		public TerminalNode ELSE() { return getToken(phase1Parser.ELSE, 0); }
//		public List<TerminalNode> ASSIGN() { return getTokens(phase1Parser.ASSIGN); }
//		public List<TerminalNode> SEM() { return getTokens(phase1Parser.SEM); }
//		public TerminalNode ASSIGN(int i) {
//			return getToken(phase1Parser.ASSIGN, i);
//		}
//		public ExprContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_expr; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterExpr(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitExpr(this);
//		}
//	}
//
//	public final ExprContext expr() throws RecognitionException {
//		ExprContext _localctx = new ExprContext(_ctx, getState());
//		enterRule(_localctx, 8, RULE_expr);
//		int _la;
//		try {
//			setState(192);
//			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("6");
//				setState(103); match(ID);
//				setState(104); match(ASSIGN);
//				setState(105); expr();
//				}
//				break;
//
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				System.out.println("8");
//				setState(107); match(ID);
//				setState(108); match(OPENP);
//				setState(117);
//				_la = _input.LA(1);
//				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
//					{
//					setState(109); expr();
//					setState(114);
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//					while (_la==COM) {
//						{
//						{
//						setState(110); match(COM);
//						setState(111); expr();
//						}
//						}
//						setState(116);
//						_errHandler.sync(this);
//						_la = _input.LA(1);
//					}
//					}
//				}
//
//				setState(119); match(CLOSEP);
//				}
//				break;
//
//			case 3:
//				enterOuterAlt(_localctx, 3);
//				{
//				System.out.println("9");
//				setState(121); match(START_IF);
//				setState(122); expr();
//				setState(123); match(THEN);
//				setState(124); expr();
//				setState(125); match(ELSE);
//				setState(126); expr();
//				setState(127); match(END_IF);
//				}
//				break;
//
//			case 4:
//				enterOuterAlt(_localctx, 4);
//				{
//				System.out.println("10");
//				setState(130); match(WHILE);
//				setState(131); expr();
//				setState(132); match(START_LOOP);
//				setState(133); expr();
//				setState(134); match(END_LOOP);
//				}
//				break;
//
//			case 5:
//				enterOuterAlt(_localctx, 5);
//				{
//				System.out.println("11");
//				setState(137); match(OPENA);
//				setState(141); 
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				do {
//					{
//					{
//					setState(138); expr();
//					setState(139); match(SEM);
//					}
//					}
//					setState(143); 
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0) );
//				setState(145); match(CLOSEA);
//				}
//				break;
//
//			case 6:
//				enterOuterAlt(_localctx, 6);
//				{
//				System.out.println("12");
//				setState(148); match(LET);
//				setState(149); match(ID);
//				setState(150); match(DOTS);
//				setState(151); match(TYPE);
//				setState(154);
//				_la = _input.LA(1);
//				if (_la==ASSIGN) {
//					{
//					setState(152); match(ASSIGN);
//					setState(153); expr();
//					}
//				}
//
//				setState(166);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				while (_la==COM) {
//					{
//					{
//					setState(156); match(COM);
//					setState(157); match(ID);
//					setState(158); match(DOTS);
//					setState(159); match(TYPE);
//					setState(162);
//					_la = _input.LA(1);
//					if (_la==ASSIGN) {
//						{
//						setState(160); match(ASSIGN);
//						setState(161); expr();
//						}
//					}
//
//					}
//					}
//					setState(168);
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//				}
//				setState(169); match(IN);
//				setState(170); expr();
//				}
//				break;
//
//			case 7:
//				enterOuterAlt(_localctx, 7);
//				{
//				System.out.println("13");
//				setState(172); match(START_CASE);
//				setState(173); expr();
//				setState(174); match(OF);
//				setState(182); 
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				do {
//					{
//					{
//					setState(175); match(ID);
//					setState(176); match(DOTS);
//					setState(177); match(TYPE);
//					setState(178); match(BIGER_EQUAL);
//					setState(179); expr();
//					setState(180); match(SEM);
//					}
//					}
//					setState(184); 
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//				} while ( _la==ID );
//				setState(186); match(END_CASE);
//				}
//				break;
//
//			case 8:
//				enterOuterAlt(_localctx, 8);
//				{
//				System.out.println("14");
//				setState(189); match(NEW);
//				setState(190); match(TYPE);
//				}
//				break;
//
//			case 9:
//				enterOuterAlt(_localctx, 9);
//				{
//				setState(191); t();
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class TContext extends ParserRuleContext {
//		public AContext a() {
//			return getRuleContext(AContext.class,0);
//		}
//		public TerminalNode NOT_FLAG() { return getToken(phase1Parser.NOT_FLAG, 0); }
//		public TContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_t; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterT(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitT(this);
//		}
//	}
//
//	public final TContext t() throws RecognitionException {
//		TContext _localctx = new TContext(_ctx, getState());
//		enterRule(_localctx, 10, RULE_t);
//		try {
//			setState(198);
//			switch (_input.LA(1)) {
//			case NOT_FLAG:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("24");
//				setState(195); match(NOT_FLAG);
//				setState(196); a();
//				}
//				break;
//			case INTEGER:
//			case LET:
//			case SUB:
//			case TRUE:
//			case FALSE:
//			case OPENP:
//			case NOT:
//			case ISVOID:
//			case NEW:
//			case START_CASE:
//			case WHILE:
//			case START_IF:
//			case OPENA:
//			case STRING:
//			case ID:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(197); a();
//				}
//				break;
//			default:
//				throw new NoViableAltException(this);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class AContext extends ParserRuleContext {
//		public BContext b() {
//			return getRuleContext(BContext.class,0);
//		}
//		public AaContext aa() {
//			return getRuleContext(AaContext.class,0);
//		}
//		public AContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_a; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterA(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitA(this);
//		}
//	}
//
//	public final AContext a() throws RecognitionException {
//		AContext _localctx = new AContext(_ctx, getState());
//		enterRule(_localctx, 12, RULE_a);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(200); b();
//			setState(201); aa();
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class AaContext extends ParserRuleContext {
//		public BContext b() {
//			return getRuleContext(BContext.class,0);
//		}
//		public TerminalNode LESS_EQUAL() { return getToken(phase1Parser.LESS_EQUAL, 0); }
//		public TerminalNode LESS() { return getToken(phase1Parser.LESS, 0); }
//		public AaContext aa() {
//			return getRuleContext(AaContext.class,0);
//		}
//		public TerminalNode EQUAL() { return getToken(phase1Parser.EQUAL, 0); }
//		public AaContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_aa; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterAa(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitAa(this);
//		}
//	}
//
//	public final AaContext aa() throws RecognitionException {
//		AaContext _localctx = new AaContext(_ctx, getState());
//		enterRule(_localctx, 14, RULE_aa);
//		try {
//			setState(219);
//			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("21");
//				setState(204); match(LESS);
//				setState(205); b();
//				setState(206); aa();
//				}
//				break;
//
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				System.out.println("22");
//				setState(209); match(LESS_EQUAL);
//				setState(210); b();
//				setState(211); aa();
//				}
//				break;
//
//			case 3:
//				enterOuterAlt(_localctx, 3);
//				{
//				System.out.println("23");
//				setState(214); match(EQUAL);
//				setState(215); b();
//				setState(216); aa();
//				}
//				break;
//
//			case 4:
//				enterOuterAlt(_localctx, 4);
//				{
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class BContext extends ParserRuleContext {
//		public CContext c() {
//			return getRuleContext(CContext.class,0);
//		}
//		public BbContext bb() {
//			return getRuleContext(BbContext.class,0);
//		}
//		public BContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_b; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterB(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitB(this);
//		}
//	}
//
//	public final BContext b() throws RecognitionException {
//		BContext _localctx = new BContext(_ctx, getState());
//		enterRule(_localctx, 16, RULE_b);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(221); c();
//			setState(222); bb();
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class BbContext extends ParserRuleContext {
//		public CContext c() {
//			return getRuleContext(CContext.class,0);
//		}
//		public BbContext bb() {
//			return getRuleContext(BbContext.class,0);
//		}
//		public TerminalNode SUB() { return getToken(phase1Parser.SUB, 0); }
//		public TerminalNode ADD() { return getToken(phase1Parser.ADD, 0); }
//		public BbContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_bb; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterBb(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitBb(this);
//		}
//	}
//
//	public final BbContext bb() throws RecognitionException {
//		BbContext _localctx = new BbContext(_ctx, getState());
//		enterRule(_localctx, 18, RULE_bb);
//		try {
//			setState(235);
//			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("16");
//				setState(225); match(ADD);
//				setState(226); c();
//				setState(227); bb();
//				}
//				break;
//
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				System.out.println("17");
//				setState(230); match(SUB);
//				setState(231); c();
//				setState(232); bb();
//				}
//				break;
//
//			case 3:
//				enterOuterAlt(_localctx, 3);
//				{
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class CContext extends ParserRuleContext {
//		public CcContext cc() {
//			return getRuleContext(CcContext.class,0);
//		}
//		public FContext f() {
//			return getRuleContext(FContext.class,0);
//		}
//		public CContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_c; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterC(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitC(this);
//		}
//	}
//
//	public final CContext c() throws RecognitionException {
//		CContext _localctx = new CContext(_ctx, getState());
//		enterRule(_localctx, 20, RULE_c);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(237); f();
//			setState(238); cc();
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class CcContext extends ParserRuleContext {
//		public TerminalNode MULTI() { return getToken(phase1Parser.MULTI, 0); }
//		public TerminalNode DIVID() { return getToken(phase1Parser.DIVID, 0); }
//		public CcContext cc() {
//			return getRuleContext(CcContext.class,0);
//		}
//		public FContext f() {
//			return getRuleContext(FContext.class,0);
//		}
//		public CcContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_cc; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterCc(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitCc(this);
//		}
//	}
//
//	public final CcContext cc() throws RecognitionException {
//		CcContext _localctx = new CcContext(_ctx, getState());
//		enterRule(_localctx, 22, RULE_cc);
//		try {
//			setState(251);
//			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("18");
//				setState(241); match(MULTI);
//				setState(242); f();
//				setState(243); cc();
//				}
//				break;
//
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				System.out.println("19");
//				setState(246); match(DIVID);
//				setState(247); f();
//				setState(248); cc();
//				}
//				break;
//
//			case 3:
//				enterOuterAlt(_localctx, 3);
//				{
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class FContext extends ParserRuleContext {
//		public DContext d() {
//			return getRuleContext(DContext.class,0);
//		}
//		public ZContext z() {
//			return getRuleContext(ZContext.class,0);
//		}
//		public FContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_f; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterF(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitF(this);
//		}
//	}
//
//	public final FContext f() throws RecognitionException {
//		FContext _localctx = new FContext(_ctx, getState());
//		enterRule(_localctx, 24, RULE_f);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(253); d();
//			setState(254); z();
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class ZContext extends ParserRuleContext {
//		public TerminalNode COM(int i) {
//			return getToken(phase1Parser.COM, i);
//		}
//		public TerminalNode CLOSEP() { return getToken(phase1Parser.CLOSEP, 0); }
//		public TerminalNode DOT() { return getToken(phase1Parser.DOT, 0); }
//		public List<ExprContext> expr() {
//			return getRuleContexts(ExprContext.class);
//		}
//		public ZContext z() {
//			return getRuleContext(ZContext.class,0);
//		}
//		public ExprContext expr(int i) {
//			return getRuleContext(ExprContext.class,i);
//		}
//		public TerminalNode OPENP() { return getToken(phase1Parser.OPENP, 0); }
//		public TerminalNode ID() { return getToken(phase1Parser.ID, 0); }
//		public TerminalNode AT() { return getToken(phase1Parser.AT, 0); }
//		public TerminalNode TYPE() { return getToken(phase1Parser.TYPE, 0); }
//		public List<TerminalNode> COM() { return getTokens(phase1Parser.COM); }
//		public ZContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_z; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterZ(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitZ(this);
//		}
//	}
//
//	public final ZContext z() throws RecognitionException {
//		ZContext _localctx = new ZContext(_ctx, getState());
//		enterRule(_localctx, 26, RULE_z);
//		int _la;
//		try {
//			setState(277);
//			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("7");
//				setState(259);
//				_la = _input.LA(1);
//				if (_la==AT) {
//					{
//					setState(257); match(AT);
//					setState(258); match(TYPE);
//					}
//				}
//
//				setState(261); match(DOT);
//				setState(262); match(ID);
//				setState(263); match(OPENP);
//				setState(272);
//				_la = _input.LA(1);
//				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
//					{
//					setState(264); expr();
//					setState(269);
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//					while (_la==COM) {
//						{
//						{
//						setState(265); match(COM);
//						setState(266); expr();
//						}
//						}
//						setState(271);
//						_errHandler.sync(this);
//						_la = _input.LA(1);
//					}
//					}
//				}
//
//				setState(274); match(CLOSEP);
//				setState(275); z();
//				}
//				break;
//
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class DContext extends ParserRuleContext {
//		public TerminalNode NOT() { return getToken(phase1Parser.NOT, 0); }
//		public GContext g() {
//			return getRuleContext(GContext.class,0);
//		}
//		public DContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_d; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterD(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitD(this);
//		}
//	}
//
//	public final DContext d() throws RecognitionException {
//		DContext _localctx = new DContext(_ctx, getState());
//		enterRule(_localctx, 28, RULE_d);
//		try {
//			setState(283);
//			switch (_input.LA(1)) {
//			case NOT:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("20");
//				setState(280); match(NOT);
//				setState(281); g();
//				}
//				break;
//			case INTEGER:
//			case LET:
//			case SUB:
//			case TRUE:
//			case FALSE:
//			case OPENP:
//			case ISVOID:
//			case NEW:
//			case START_CASE:
//			case WHILE:
//			case START_IF:
//			case OPENA:
//			case STRING:
//			case ID:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(282); g();
//				}
//				break;
//			default:
//				throw new NoViableAltException(this);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class GContext extends ParserRuleContext {
//		public TerminalNode ISVOID() { return getToken(phase1Parser.ISVOID, 0); }
//		public EContext e() {
//			return getRuleContext(EContext.class,0);
//		}
//		public GContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_g; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterG(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitG(this);
//		}
//	}
//
//	public final GContext g() throws RecognitionException {
//		GContext _localctx = new GContext(_ctx, getState());
//		enterRule(_localctx, 30, RULE_g);
//		try {
//			setState(289);
//			switch (_input.LA(1)) {
//			case ISVOID:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("15");
//				setState(286); match(ISVOID);
//				setState(287); e();
//				}
//				break;
//			case INTEGER:
//			case LET:
//			case SUB:
//			case TRUE:
//			case FALSE:
//			case OPENP:
//			case NEW:
//			case START_CASE:
//			case WHILE:
//			case START_IF:
//			case OPENA:
//			case STRING:
//			case ID:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(288); e();
//				}
//				break;
//			default:
//				throw new NoViableAltException(this);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static class EContext extends ParserRuleContext {
//		public TerminalNode CLOSEA() { return getToken(phase1Parser.CLOSEA, 0); }
//		public List<TerminalNode> DOTS() { return getTokens(phase1Parser.DOTS); }
//		public TerminalNode END_CASE() { return getToken(phase1Parser.END_CASE, 0); }
//		public TerminalNode TRUE() { return getToken(phase1Parser.TRUE, 0); }
//		public TerminalNode START_CASE() { return getToken(phase1Parser.START_CASE, 0); }
//		public TerminalNode TYPE(int i) {
//			return getToken(phase1Parser.TYPE, i);
//		}
//		public TerminalNode BIGER_EQUAL(int i) {
//			return getToken(phase1Parser.BIGER_EQUAL, i);
//		}
//		public TerminalNode START_LOOP() { return getToken(phase1Parser.START_LOOP, 0); }
//		public TerminalNode IN() { return getToken(phase1Parser.IN, 0); }
//		public TerminalNode WHILE() { return getToken(phase1Parser.WHILE, 0); }
//		public TerminalNode OPENA() { return getToken(phase1Parser.OPENA, 0); }
//		public TerminalNode END_IF() { return getToken(phase1Parser.END_IF, 0); }
//		public List<TerminalNode> BIGER_EQUAL() { return getTokens(phase1Parser.BIGER_EQUAL); }
//		public TerminalNode LET() { return getToken(phase1Parser.LET, 0); }
//		public List<ExprContext> expr() {
//			return getRuleContexts(ExprContext.class);
//		}
//		public TerminalNode END_LOOP() { return getToken(phase1Parser.END_LOOP, 0); }
//		public ExprContext expr(int i) {
//			return getRuleContext(ExprContext.class,i);
//		}
//		public TerminalNode OF() { return getToken(phase1Parser.OF, 0); }
//		public List<TerminalNode> TYPE() { return getTokens(phase1Parser.TYPE); }
//		public TerminalNode ID(int i) {
//			return getToken(phase1Parser.ID, i);
//		}
//		public List<TerminalNode> COM() { return getTokens(phase1Parser.COM); }
//		public TerminalNode COM(int i) {
//			return getToken(phase1Parser.COM, i);
//		}
//		public TerminalNode THEN() { return getToken(phase1Parser.THEN, 0); }
//		public TerminalNode START_IF() { return getToken(phase1Parser.START_IF, 0); }
//		public List<TerminalNode> ID() { return getTokens(phase1Parser.ID); }
//		public TerminalNode OPENP() { return getToken(phase1Parser.OPENP, 0); }
//		public TerminalNode SEM(int i) {
//			return getToken(phase1Parser.SEM, i);
//		}
//		public TerminalNode NEW() { return getToken(phase1Parser.NEW, 0); }
//		public TerminalNode CLOSEP() { return getToken(phase1Parser.CLOSEP, 0); }
//		public TerminalNode DOTS(int i) {
//			return getToken(phase1Parser.DOTS, i);
//		}
//		public TerminalNode ELSE() { return getToken(phase1Parser.ELSE, 0); }
//		public List<TerminalNode> ASSIGN() { return getTokens(phase1Parser.ASSIGN); }
//		public List<TerminalNode> SEM() { return getTokens(phase1Parser.SEM); }
//		public TerminalNode ASSIGN(int i) {
//			return getToken(phase1Parser.ASSIGN, i);
//		}
//		public TerminalNode STRING() { return getToken(phase1Parser.STRING, 0); }
//		public TerminalNode INTEGER() { return getToken(phase1Parser.INTEGER, 0); }
//		public TerminalNode FALSE() { return getToken(phase1Parser.FALSE, 0); }
//		public EContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_e; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).enterE(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof phase1Listener ) ((phase1Listener)listener).exitE(this);
//		}
//	}
//
//	public final EContext e() throws RecognitionException {
//		EContext _localctx = new EContext(_ctx, getState());
//		enterRule(_localctx, 32, RULE_e);
//		int _la;
//		try {
//			setState(399);
//			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				System.out.println("25");
//				setState(292); match(OPENP);
//				setState(293); expr();
//				setState(294); match(CLOSEP);
//				}
//				break;
//
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				System.out.println("27");
//				setState(299);
//				switch (_input.LA(1)) {
//				case SUB:
//					{
//					setState(297); match(SUB);
//					}
//					break;
//				case INTEGER:
//					{
//					}
//					break;
//				default:
//					throw new NoViableAltException(this);
//				}
//				setState(301); match(INTEGER);
//				}
//				break;
//
//			case 3:
//				enterOuterAlt(_localctx, 3);
//				{
//				System.out.println("28");
//				setState(303); match(STRING);
//				}
//				break;
//
//			case 4:
//				enterOuterAlt(_localctx, 4);
//				{
//				System.out.println("29");
//				setState(305); match(TRUE);
//				}
//				break;
//
//			case 5:
//				enterOuterAlt(_localctx, 5);
//				{
//				System.out.println("30");
//				setState(307); match(FALSE);
//				}
//				break;
//
//			case 6:
//				enterOuterAlt(_localctx, 6);
//				{
//				System.out.println("26");
//				setState(309); match(ID);
//				}
//				break;
//
//			case 7:
//				enterOuterAlt(_localctx, 7);
//				{
//				System.out.println("6");
//				setState(311); match(ID);
//				setState(312); match(ASSIGN);
//				setState(313); expr();
//				}
//				break;
//
//			case 8:
//				enterOuterAlt(_localctx, 8);
//				{
//				System.out.println("8");
//				setState(315); match(ID);
//				setState(316); match(OPENP);
//				setState(325);
//				_la = _input.LA(1);
//				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0)) {
//					{
//					setState(317); expr();
//					setState(322);
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//					while (_la==COM) {
//						{
//						{
//						setState(318); match(COM);
//						setState(319); expr();
//						}
//						}
//						setState(324);
//						_errHandler.sync(this);
//						_la = _input.LA(1);
//					}
//					}
//				}
//
//				setState(327); match(CLOSEP);
//				}
//				break;
//
//			case 9:
//				enterOuterAlt(_localctx, 9);
//				{
//				System.out.println("9");
//				setState(329); match(START_IF);
//				setState(330); expr();
//				setState(331); match(THEN);
//				setState(332); expr();
//				setState(333); match(ELSE);
//				setState(334); expr();
//				setState(335); match(END_IF);
//				}
//				break;
//
//			case 10:
//				enterOuterAlt(_localctx, 10);
//				{
//				System.out.println("10");
//				setState(338); match(WHILE);
//				setState(339); expr();
//				setState(340); match(START_LOOP);
//				setState(341); expr();
//				setState(342); match(END_LOOP);
//				}
//				break;
//
//			case 11:
//				enterOuterAlt(_localctx, 11);
//				{
//				System.out.println("11");
//				setState(345); match(OPENA);
//				setState(349); 
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				do {
//					{
//					{
//					setState(346); expr();
//					setState(347); match(SEM);
//					}
//					}
//					setState(351); 
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LET) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << OPENP) | (1L << NOT_FLAG) | (1L << NOT) | (1L << ISVOID) | (1L << NEW) | (1L << START_CASE) | (1L << WHILE) | (1L << START_IF) | (1L << OPENA) | (1L << STRING) | (1L << ID))) != 0) );
//				setState(353); match(CLOSEA);
//				}
//				break;
//
//			case 12:
//				enterOuterAlt(_localctx, 12);
//				{
//				System.out.println("12");
//				setState(356); match(LET);
//				setState(357); match(ID);
//				setState(358); match(DOTS);
//				setState(359); match(TYPE);
//				setState(362);
//				_la = _input.LA(1);
//				if (_la==ASSIGN) {
//					{
//					setState(360); match(ASSIGN);
//					setState(361); expr();
//					}
//				}
//
//				setState(374);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				while (_la==COM) {
//					{
//					{
//					setState(364); match(COM);
//					setState(365); match(ID);
//					setState(366); match(DOTS);
//					setState(367); match(TYPE);
//					setState(370);
//					_la = _input.LA(1);
//					if (_la==ASSIGN) {
//						{
//						setState(368); match(ASSIGN);
//						setState(369); expr();
//						}
//					}
//
//					}
//					}
//					setState(376);
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//				}
//				setState(377); match(IN);
//				setState(378); expr();
//				}
//				break;
//
//			case 13:
//				enterOuterAlt(_localctx, 13);
//				{
//				System.out.println("13");
//				setState(380); match(START_CASE);
//				setState(381); expr();
//				setState(382); match(OF);
//				setState(390); 
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				do {
//					{
//					{
//					setState(383); match(ID);
//					setState(384); match(DOTS);
//					setState(385); match(TYPE);
//					setState(386); match(BIGER_EQUAL);
//					setState(387); expr();
//					setState(388); match(SEM);
//					}
//					}
//					setState(392); 
//					_errHandler.sync(this);
//					_la = _input.LA(1);
//				} while ( _la==ID );
//				setState(394); match(END_CASE);
//				}
//				break;
//
//			case 14:
//				enterOuterAlt(_localctx, 14);
//				{
//				System.out.println("14");
//				setState(397); match(NEW);
//				setState(398); match(TYPE);
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public static final String _serializedATN =
//		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0194\4\2\t\2"+
//		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
//		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
//		"\3\2\3\2\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\64"+
//		"\n\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
//		"\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\3"+
//		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\5\4a\n\4\3\5\3\5\3\5\3"+
//		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6s\n\6\f\6\16\6v"+
//		"\13\6\5\6x\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
//		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0090\n\6\r\6\16\6\u0091\3\6\3\6"+
//		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009d\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
//		"\u00a5\n\6\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
//		"\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00b9\n\6\r\6\16\6\u00ba\3\6\3\6\3\6\3"+
//		"\6\3\6\3\6\5\6\u00c3\n\6\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\3\b\3\b\3\b\3\t"+
//		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00de"+
//		"\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
//		"\5\13\u00ee\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
//		"\r\5\r\u00fe\n\r\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u0106\n\17\3\17\3"+
//		"\17\3\17\3\17\3\17\3\17\7\17\u010e\n\17\f\17\16\17\u0111\13\17\5\17\u0113"+
//		"\n\17\3\17\3\17\3\17\5\17\u0118\n\17\3\20\3\20\3\20\3\20\5\20\u011e\n"+
//		"\20\3\21\3\21\3\21\3\21\5\21\u0124\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
//		"\3\22\3\22\5\22\u012e\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
//		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0143\n\22\f\22"+
//		"\16\22\u0146\13\22\5\22\u0148\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
//		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
//		"\3\22\6\22\u0160\n\22\r\22\16\22\u0161\3\22\3\22\3\22\3\22\3\22\3\22\3"+
//		"\22\3\22\3\22\5\22\u016d\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0175"+
//		"\n\22\7\22\u0177\n\22\f\22\16\22\u017a\13\22\3\22\3\22\3\22\3\22\3\22"+
//		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u0189\n\22\r\22\16\22\u018a"+
//		"\3\22\3\22\3\22\3\22\3\22\5\22\u0192\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
//		"\22\24\26\30\32\34\36 \"\2\2\u01bb\2$\3\2\2\2\4.\3\2\2\2\6`\3\2\2\2\b"+
//		"b\3\2\2\2\n\u00c2\3\2\2\2\f\u00c8\3\2\2\2\16\u00ca\3\2\2\2\20\u00dd\3"+
//		"\2\2\2\22\u00df\3\2\2\2\24\u00ed\3\2\2\2\26\u00ef\3\2\2\2\30\u00fd\3\2"+
//		"\2\2\32\u00ff\3\2\2\2\34\u0117\3\2\2\2\36\u011d\3\2\2\2 \u0123\3\2\2\2"+
//		"\"\u0191\3\2\2\2$(\b\2\1\2%&\5\4\3\2&\'\7)\2\2\')\3\2\2\2(%\3\2\2\2)*"+
//		"\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\b\2\1\2-\3\3\2\2\2./\b\3\1\2"+
//		"/\60\7\b\2\2\60\63\7\60\2\2\61\62\7\7\2\2\62\64\7\60\2\2\63\61\3\2\2\2"+
//		"\63\64\3\2\2\2\64\65\3\2\2\2\65;\7\'\2\2\66\67\5\6\4\2\678\7)\2\28:\3"+
//		"\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>"+
//		"?\7(\2\2?@\b\3\1\2@\5\3\2\2\2AB\b\4\1\2BC\7/\2\2CD\b\4\1\2DM\7\22\2\2"+
//		"EJ\5\b\5\2FG\7*\2\2GI\5\b\5\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
//		"KN\3\2\2\2LJ\3\2\2\2ME\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\23\2\2PQ\7+\2\2"+
//		"QR\7\60\2\2RS\7\'\2\2ST\5\n\6\2TU\7(\2\2UV\b\4\1\2Va\3\2\2\2WX\b\4\1\2"+
//		"XY\7/\2\2YZ\7+\2\2Z]\7\60\2\2[\\\7\16\2\2\\^\5\n\6\2][\3\2\2\2]^\3\2\2"+
//		"\2^_\3\2\2\2_a\b\4\1\2`A\3\2\2\2`W\3\2\2\2a\7\3\2\2\2bc\b\5\1\2cd\7/\2"+
//		"\2de\7+\2\2ef\7\60\2\2fg\b\5\1\2g\t\3\2\2\2hi\b\6\1\2ij\7/\2\2jk\7\16"+
//		"\2\2k\u00c3\5\n\6\2lm\b\6\1\2mn\7/\2\2nw\7\22\2\2ot\5\n\6\2pq\7*\2\2q"+
//		"s\5\n\6\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
//		"wo\3\2\2\2wx\3\2\2\2xy\3\2\2\2y\u00c3\7\23\2\2z{\b\6\1\2{|\7#\2\2|}\5"+
//		"\n\6\2}~\7&\2\2~\177\5\n\6\2\177\u0080\7%\2\2\u0080\u0081\5\n\6\2\u0081"+
//		"\u0082\7$\2\2\u0082\u00c3\3\2\2\2\u0083\u0084\b\6\1\2\u0084\u0085\7 \2"+
//		"\2\u0085\u0086\5\n\6\2\u0086\u0087\7!\2\2\u0087\u0088\5\n\6\2\u0088\u0089"+
//		"\7\"\2\2\u0089\u00c3\3\2\2\2\u008a\u008b\b\6\1\2\u008b\u008f\7\'\2\2\u008c"+
//		"\u008d\5\n\6\2\u008d\u008e\7)\2\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2"+
//		"\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
//		"\u0093\3\2\2\2\u0093\u0094\7(\2\2\u0094\u00c3\3\2\2\2\u0095\u0096\b\6"+
//		"\1\2\u0096\u0097\7\t\2\2\u0097\u0098\7/\2\2\u0098\u0099\7+\2\2\u0099\u009c"+
//		"\7\60\2\2\u009a\u009b\7\16\2\2\u009b\u009d\5\n\6\2\u009c\u009a\3\2\2\2"+
//		"\u009c\u009d\3\2\2\2\u009d\u00a8\3\2\2\2\u009e\u009f\7*\2\2\u009f\u00a0"+
//		"\7/\2\2\u00a0\u00a1\7+\2\2\u00a1\u00a4\7\60\2\2\u00a2\u00a3\7\16\2\2\u00a3"+
//		"\u00a5\5\n\6\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
//		"\2\2\u00a6\u009e\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
//		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\37"+
//		"\2\2\u00ac\u00c3\5\n\6\2\u00ad\u00ae\b\6\1\2\u00ae\u00af\7\33\2\2\u00af"+
//		"\u00b0\5\n\6\2\u00b0\u00b8\7\35\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7+"+
//		"\2\2\u00b3\u00b4\7\60\2\2\u00b4\u00b5\7\36\2\2\u00b5\u00b6\5\n\6\2\u00b6"+
//		"\u00b7\7)\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b9\u00ba\3\2"+
//		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
//		"\u00bd\7\34\2\2\u00bd\u00c3\3\2\2\2\u00be\u00bf\b\6\1\2\u00bf\u00c0\7"+
//		"\32\2\2\u00c0\u00c3\7\60\2\2\u00c1\u00c3\5\f\7\2\u00c2h\3\2\2\2\u00c2"+
//		"l\3\2\2\2\u00c2z\3\2\2\2\u00c2\u0083\3\2\2\2\u00c2\u008a\3\2\2\2\u00c2"+
//		"\u0095\3\2\2\2\u00c2\u00ad\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00c1\3\2"+
//		"\2\2\u00c3\13\3\2\2\2\u00c4\u00c5\b\7\1\2\u00c5\u00c6\7\24\2\2\u00c6\u00c9"+
//		"\5\16\b\2\u00c7\u00c9\5\16\b\2\u00c8\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2"+
//		"\u00c9\r\3\2\2\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\5\20\t\2\u00cc\17\3"+
//		"\2\2\2\u00cd\u00ce\b\t\1\2\u00ce\u00cf\7\27\2\2\u00cf\u00d0\5\22\n\2\u00d0"+
//		"\u00d1\5\20\t\2\u00d1\u00de\3\2\2\2\u00d2\u00d3\b\t\1\2\u00d3\u00d4\7"+
//		"\26\2\2\u00d4\u00d5\5\22\n\2\u00d5\u00d6\5\20\t\2\u00d6\u00de\3\2\2\2"+
//		"\u00d7\u00d8\b\t\1\2\u00d8\u00d9\7\25\2\2\u00d9\u00da\5\22\n\2\u00da\u00db"+
//		"\5\20\t\2\u00db\u00de\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00cd\3\2\2\2"+
//		"\u00dd\u00d2\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\21"+
//		"\3\2\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e1\5\24\13\2\u00e1\23\3\2\2\2\u00e2"+
//		"\u00e3\b\13\1\2\u00e3\u00e4\7\f\2\2\u00e4\u00e5\5\26\f\2\u00e5\u00e6\5"+
//		"\24\13\2\u00e6\u00ee\3\2\2\2\u00e7\u00e8\b\13\1\2\u00e8\u00e9\7\r\2\2"+
//		"\u00e9\u00ea\5\26\f\2\u00ea\u00eb\5\24\13\2\u00eb\u00ee\3\2\2\2\u00ec"+
//		"\u00ee\3\2\2\2\u00ed\u00e2\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ec\3\2"+
//		"\2\2\u00ee\25\3\2\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\5\30\r\2\u00f1"+
//		"\27\3\2\2\2\u00f2\u00f3\b\r\1\2\u00f3\u00f4\7\n\2\2\u00f4\u00f5\5\32\16"+
//		"\2\u00f5\u00f6\5\30\r\2\u00f6\u00fe\3\2\2\2\u00f7\u00f8\b\r\1\2\u00f8"+
//		"\u00f9\7\13\2\2\u00f9\u00fa\5\32\16\2\u00fa\u00fb\5\30\r\2\u00fb\u00fe"+
//		"\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd"+
//		"\u00fc\3\2\2\2\u00fe\31\3\2\2\2\u00ff\u0100\5\36\20\2\u0100\u0101\5\34"+
//		"\17\2\u0101\33\3\2\2\2\u0102\u0105\b\17\1\2\u0103\u0104\7-\2\2\u0104\u0106"+
//		"\7\60\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2"+
//		"\u0107\u0108\7,\2\2\u0108\u0109\7/\2\2\u0109\u0112\7\22\2\2\u010a\u010f"+
//		"\5\n\6\2\u010b\u010c\7*\2\2\u010c\u010e\5\n\6\2\u010d\u010b\3\2\2\2\u010e"+
//		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2"+
//		"\2\2\u0111\u010f\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
//		"\u0114\3\2\2\2\u0114\u0115\7\23\2\2\u0115\u0118\5\34\17\2\u0116\u0118"+
//		"\3\2\2\2\u0117\u0102\3\2\2\2\u0117\u0116\3\2\2\2\u0118\35\3\2\2\2\u0119"+
//		"\u011a\b\20\1\2\u011a\u011b\7\30\2\2\u011b\u011e\5 \21\2\u011c\u011e\5"+
//		" \21\2\u011d\u0119\3\2\2\2\u011d\u011c\3\2\2\2\u011e\37\3\2\2\2\u011f"+
//		"\u0120\b\21\1\2\u0120\u0121\7\31\2\2\u0121\u0124\5\"\22\2\u0122\u0124"+
//		"\5\"\22\2\u0123\u011f\3\2\2\2\u0123\u0122\3\2\2\2\u0124!\3\2\2\2\u0125"+
//		"\u0126\b\22\1\2\u0126\u0127\7\22\2\2\u0127\u0128\5\n\6\2\u0128\u0129\7"+
//		"\23\2\2\u0129\u0192\3\2\2\2\u012a\u012d\b\22\1\2\u012b\u012e\7\r\2\2\u012c"+
//		"\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2"+
//		"\2\2\u012f\u0192\7\6\2\2\u0130\u0131\b\22\1\2\u0131\u0192\7.\2\2\u0132"+
//		"\u0133\b\22\1\2\u0133\u0192\7\17\2\2\u0134\u0135\b\22\1\2\u0135\u0192"+
//		"\7\20\2\2\u0136\u0137\b\22\1\2\u0137\u0192\7/\2\2\u0138\u0139\b\22\1\2"+
//		"\u0139\u013a\7/\2\2\u013a\u013b\7\16\2\2\u013b\u0192\5\n\6\2\u013c\u013d"+
//		"\b\22\1\2\u013d\u013e\7/\2\2\u013e\u0147\7\22\2\2\u013f\u0144\5\n\6\2"+
//		"\u0140\u0141\7*\2\2\u0141\u0143\5\n\6\2\u0142\u0140\3\2\2\2\u0143\u0146"+
//		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
//		"\u0144\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2"+
//		"\2\2\u0149\u0192\7\23\2\2\u014a\u014b\b\22\1\2\u014b\u014c\7#\2\2\u014c"+
//		"\u014d\5\n\6\2\u014d\u014e\7&\2\2\u014e\u014f\5\n\6\2\u014f\u0150\7%\2"+
//		"\2\u0150\u0151\5\n\6\2\u0151\u0152\7$\2\2\u0152\u0192\3\2\2\2\u0153\u0154"+
//		"\b\22\1\2\u0154\u0155\7 \2\2\u0155\u0156\5\n\6\2\u0156\u0157\7!\2\2\u0157"+
//		"\u0158\5\n\6\2\u0158\u0159\7\"\2\2\u0159\u0192\3\2\2\2\u015a\u015b\b\22"+
//		"\1\2\u015b\u015f\7\'\2\2\u015c\u015d\5\n\6\2\u015d\u015e\7)\2\2\u015e"+
//		"\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2"+
//		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7(\2\2\u0164"+
//		"\u0192\3\2\2\2\u0165\u0166\b\22\1\2\u0166\u0167\7\t\2\2\u0167\u0168\7"+
//		"/\2\2\u0168\u0169\7+\2\2\u0169\u016c\7\60\2\2\u016a\u016b\7\16\2\2\u016b"+
//		"\u016d\5\n\6\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0178\3\2"+
//		"\2\2\u016e\u016f\7*\2\2\u016f\u0170\7/\2\2\u0170\u0171\7+\2\2\u0171\u0174"+
//		"\7\60\2\2\u0172\u0173\7\16\2\2\u0173\u0175\5\n\6\2\u0174\u0172\3\2\2\2"+
//		"\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u016e\3\2\2\2\u0177\u017a"+
//		"\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a"+
//		"\u0178\3\2\2\2\u017b\u017c\7\37\2\2\u017c\u0192\5\n\6\2\u017d\u017e\b"+
//		"\22\1\2\u017e\u017f\7\33\2\2\u017f\u0180\5\n\6\2\u0180\u0188\7\35\2\2"+
//		"\u0181\u0182\7/\2\2\u0182\u0183\7+\2\2\u0183\u0184\7\60\2\2\u0184\u0185"+
//		"\7\36\2\2\u0185\u0186\5\n\6\2\u0186\u0187\7)\2\2\u0187\u0189\3\2\2\2\u0188"+
//		"\u0181\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
//		"\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7\34\2\2\u018d\u0192\3\2\2\2\u018e"+
//		"\u018f\b\22\1\2\u018f\u0190\7\32\2\2\u0190\u0192\7\60\2\2\u0191\u0125"+
//		"\3\2\2\2\u0191\u012a\3\2\2\2\u0191\u0130\3\2\2\2\u0191\u0132\3\2\2\2\u0191"+
//		"\u0134\3\2\2\2\u0191\u0136\3\2\2\2\u0191\u0138\3\2\2\2\u0191\u013c\3\2"+
//		"\2\2\u0191\u014a\3\2\2\2\u0191\u0153\3\2\2\2\u0191\u015a\3\2\2\2\u0191"+
//		"\u0165\3\2\2\2\u0191\u017d\3\2\2\2\u0191\u018e\3\2\2\2\u0192#\3\2\2\2"+
//		"$*\63;JM]`tw\u0091\u009c\u00a4\u00a8\u00ba\u00c2\u00c8\u00dd\u00ed\u00fd"+
//		"\u0105\u010f\u0112\u0117\u011d\u0123\u012d\u0144\u0147\u0161\u016c\u0174"+
//		"\u0178\u018a\u0191";
//	public static final ATN _ATN =
//		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
//	static {
//		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
//		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
//			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
//		}
//	}
//}