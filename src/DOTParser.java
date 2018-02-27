// Generated from DOT.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, STRICT=11, GRAPH=12, DIGRAPH=13, NODE=14, EDGE=15, SUBGRAPH=16, 
		NUMBER=17, STRING=18, ID=19, HTML_STRING=20, COMMENT=21, LINE_COMMENT=22, 
		PREPROC=23, WS=24;
	public static final int
		RULE_graph = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_attr_stmt = 3, 
		RULE_attr_list = 4, RULE_a_list = 5, RULE_edge_stmt = 6, RULE_edgeRHS = 7, 
		RULE_edgeop = 8, RULE_node_stmt = 9, RULE_node_id = 10, RULE_port = 11, 
		RULE_subgraph = 12, RULE_id = 13;
	public static final String[] ruleNames = {
		"graph", "stmt_list", "stmt", "attr_stmt", "attr_list", "a_list", "edge_stmt", 
		"edgeRHS", "edgeop", "node_stmt", "node_id", "port", "subgraph", "id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'->'", "'--'", 
		"':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "STRICT", 
		"GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "NUMBER", "STRING", "ID", 
		"HTML_STRING", "COMMENT", "LINE_COMMENT", "PREPROC", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DOT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DOTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GraphContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(DOTParser.GRAPH, 0); }
		public TerminalNode DIGRAPH() { return getToken(DOTParser.DIGRAPH, 0); }
		public TerminalNode STRICT() { return getToken(DOTParser.STRICT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: graph");
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(29);
				match(STRICT);
				}
			}

			setState(32);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) {
				{
				setState(33);
				id();
				}
			}

			setState(36);
			match(T__0);
			setState(37);
			stmt_list();
			setState(38);
			match(T__1);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: stmt_list");
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << GRAPH) | (1L << NODE) | (1L << EDGE) | (1L << SUBGRAPH) | (1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) {
				{
				{
				setState(41);
				stmt();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(42);
					match(T__2);
					}
				}

				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StmtContext extends ParserRuleContext {
		public Node_stmtContext node_stmt() {
			return getRuleContext(Node_stmtContext.class,0);
		}
		public Edge_stmtContext edge_stmt() {
			return getRuleContext(Edge_stmtContext.class,0);
		}
		public Attr_stmtContext attr_stmt() {
			return getRuleContext(Attr_stmtContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("RULE: stmt");
				setState(51);
				node_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				edge_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				attr_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				id();
				setState(55);
				match(T__3);
				setState(56);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				subgraph();
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

	public static class Attr_stmtContext extends ParserRuleContext {
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(DOTParser.GRAPH, 0); }
		public TerminalNode NODE() { return getToken(DOTParser.NODE, 0); }
		public TerminalNode EDGE() { return getToken(DOTParser.EDGE, 0); }
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterAttr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitAttr_stmt(this);
		}
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: attr_stmt");
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << NODE) | (1L << EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(63);
			attr_list();
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

	public static class Attr_listContext extends ParserRuleContext {
		public List<A_listContext> a_list() {
			return getRuleContexts(A_listContext.class);
		}
		public A_listContext a_list(int i) {
			return getRuleContext(A_listContext.class,i);
		}
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterAttr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitAttr_list(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: attr_list");
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				match(T__4);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) {
					{
					setState(67);
					a_list();
					}
				}

				setState(70);
				match(T__5);
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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

	public static class A_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public A_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterA_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitA_list(this);
		}
	}

	public final A_listContext a_list() throws RecognitionException {
		A_listContext _localctx = new A_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_a_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: a_list");
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				id();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(77);
					match(T__3);
					setState(78);
					id();
					}
				}

				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(81);
					match(T__6);
					}
				}

				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0) );
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

	public static class Edge_stmtContext extends ParserRuleContext {
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Edge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterEdge_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitEdge_stmt(this);
		}
	}

	public final Edge_stmtContext edge_stmt() throws RecognitionException {
		Edge_stmtContext _localctx = new Edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_edge_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: edge_stmt");
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING:
			case ID:
			case HTML_STRING:
				{
				setState(89);
				node_id();
				}
				break;
			case T__0:
			case SUBGRAPH:
				{
				setState(90);
				subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			edgeRHS();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(94);
				attr_list();
				}
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

	public static class EdgeRHSContext extends ParserRuleContext {
		public List<EdgeopContext> edgeop() {
			return getRuleContexts(EdgeopContext.class);
		}
		public EdgeopContext edgeop(int i) {
			return getRuleContext(EdgeopContext.class,i);
		}
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public List<SubgraphContext> subgraph() {
			return getRuleContexts(SubgraphContext.class);
		}
		public SubgraphContext subgraph(int i) {
			return getRuleContext(SubgraphContext.class,i);
		}
		public EdgeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeRHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterEdgeRHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitEdgeRHS(this);
		}
	}

	public final EdgeRHSContext edgeRHS() throws RecognitionException {
		EdgeRHSContext _localctx = new EdgeRHSContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edgeRHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: edgeRHS");
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				edgeop();
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case STRING:
				case ID:
				case HTML_STRING:
					{
					setState(99);
					node_id();
					}
					break;
				case T__0:
				case SUBGRAPH:
					{
					setState(100);
					subgraph();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==T__8 );
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

	public static class EdgeopContext extends ParserRuleContext {
		public EdgeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterEdgeop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitEdgeop(this);
		}
	}

	public final EdgeopContext edgeop() throws RecognitionException {
		EdgeopContext _localctx = new EdgeopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edgeop);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("RULE: edgeop");
				setState(108);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__8);
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

	public static class Node_stmtContext extends ParserRuleContext {
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Node_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterNode_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitNode_stmt(this);
		}
	}

	public final Node_stmtContext node_stmt() throws RecognitionException {
		Node_stmtContext _localctx = new Node_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_node_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: node_stmt");
			setState(113);
			node_id();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(114);
				attr_list();
				}
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

	public static class Node_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public Node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterNode_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitNode_id(this);
		}
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_node_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: node_id");
			setState(118);
			id();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(119);
				port();
				}
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

	public static class PortContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitPort(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: port");
			setState(123);
			match(T__9);
			setState(124);
			id();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(125);
				match(T__9);
				setState(126);
				id();
				}
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

	public static class SubgraphContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode SUBGRAPH() { return getToken(DOTParser.SUBGRAPH, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SubgraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subgraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterSubgraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitSubgraph(this);
		}
	}

	public final SubgraphContext subgraph() throws RecognitionException {
		SubgraphContext _localctx = new SubgraphContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subgraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("RULE: subgraph");
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(130);
				match(SUBGRAPH);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) {
					{
					setState(131);
					id();
					}
				}

				}
			}

			setState(136);
			match(T__0);
			setState(137);
			stmt_list();
			setState(138);
			match(T__1);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DOTParser.ID, 0); }
		public TerminalNode STRING() { return getToken(DOTParser.STRING, 0); }
		public TerminalNode HTML_STRING() { return getToken(DOTParser.HTML_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DOTParser.NUMBER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_id);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("RULE: id");
				setState(141);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(STRING);
				}
				break;
			case HTML_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(HTML_STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(NUMBER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\5\2!\n\2\3\2\3\2\5\2"+
		"%\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3.\n\3\7\3\60\n\3\f\3\16\3\63\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\5\6G\n\6\3\6\6\6J\n\6\r\6\16\6K\3\7\3\7\3\7\3\7\5\7R\n\7\3\7\5\7"+
		"U\n\7\6\7W\n\7\r\7\16\7X\3\b\3\b\3\b\5\b^\n\b\3\b\3\b\5\bb\n\b\3\t\3\t"+
		"\3\t\3\t\5\th\n\t\6\tj\n\t\r\t\16\tk\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3"+
		"\13\5\13v\n\13\3\f\3\f\3\f\5\f{\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0082\n\r"+
		"\3\16\3\16\3\16\5\16\u0087\n\16\5\16\u0089\n\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0094\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\4\3\2\16\17\4\2\16\16\20\21\2\u00a1\2\36\3\2\2\2"+
		"\4*\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nC\3\2\2\2\fM\3\2\2\2\16Z\3\2\2\2\20"+
		"c\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26w\3\2\2\2\30|\3\2\2\2\32\u0083\3\2"+
		"\2\2\34\u0093\3\2\2\2\36 \b\2\1\2\37!\7\r\2\2 \37\3\2\2\2 !\3\2\2\2!\""+
		"\3\2\2\2\"$\t\2\2\2#%\5\34\17\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\3\2"+
		"\2\'(\5\4\3\2()\7\4\2\2)\3\3\2\2\2*\61\b\3\1\2+-\5\6\4\2,.\7\5\2\2-,\3"+
		"\2\2\2-.\3\2\2\2.\60\3\2\2\2/+\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64\65\b\4\1\2\65>\5\24\13\2\66>\5"+
		"\16\b\2\67>\5\b\5\289\5\34\17\29:\7\6\2\2:;\5\34\17\2;>\3\2\2\2<>\5\32"+
		"\16\2=\64\3\2\2\2=\66\3\2\2\2=\67\3\2\2\2=8\3\2\2\2=<\3\2\2\2>\7\3\2\2"+
		"\2?@\b\5\1\2@A\t\3\2\2AB\5\n\6\2B\t\3\2\2\2CI\b\6\1\2DF\7\7\2\2EG\5\f"+
		"\7\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\7\b\2\2ID\3\2\2\2JK\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2L\13\3\2\2\2MV\b\7\1\2NQ\5\34\17\2OP\7\6\2\2PR\5\34\17\2"+
		"QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\7\t\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2"+
		"VN\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2Z]\b\b\1\2[^\5\26\f"+
		"\2\\^\5\32\16\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_a\5\20\t\2`b\5\n\6\2a`"+
		"\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ci\b\t\1\2dg\5\22\n\2eh\5\26\f\2fh\5\32"+
		"\16\2ge\3\2\2\2gf\3\2\2\2hj\3\2\2\2id\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2l\21\3\2\2\2mn\b\n\1\2nq\7\n\2\2oq\7\13\2\2pm\3\2\2\2po\3\2\2\2"+
		"q\23\3\2\2\2rs\b\13\1\2su\5\26\f\2tv\5\n\6\2ut\3\2\2\2uv\3\2\2\2v\25\3"+
		"\2\2\2wx\b\f\1\2xz\5\34\17\2y{\5\30\r\2zy\3\2\2\2z{\3\2\2\2{\27\3\2\2"+
		"\2|}\b\r\1\2}~\7\f\2\2~\u0081\5\34\17\2\177\u0080\7\f\2\2\u0080\u0082"+
		"\5\34\17\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2\u0083"+
		"\u0088\b\16\1\2\u0084\u0086\7\22\2\2\u0085\u0087\5\34\17\2\u0086\u0085"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\3\2\2\u008b\u008c\5\4"+
		"\3\2\u008c\u008d\7\4\2\2\u008d\33\3\2\2\2\u008e\u008f\b\17\1\2\u008f\u0094"+
		"\7\25\2\2\u0090\u0094\7\24\2\2\u0091\u0094\7\26\2\2\u0092\u0094\7\23\2"+
		"\2\u0093\u008e\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\35\3\2\2\2\27 $-\61=FKQTX]agkpuz\u0081\u0086\u0088\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}