// Generated from test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CODES=1, EXPRE=2, FUNC=3, SUB=4, NUMBER=5, ID=6, VALUE=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CODES", "EXPRE", "FUNC", "SUB", "NUMBER", "ID", "VALUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CODES", "EXPRE", "FUNC", "SUB", "NUMBER", "ID", "VALUE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nh\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\3\3\3\7\3"+
		"&\n\3\f\3\16\3)\13\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\5\3\64"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\6\6M\n\6\r\6\16\6N\3\6\3\6\7\6S\n\6"+
		"\f\6\16\6V\13\6\3\7\6\7Y\n\7\r\7\16\7Z\3\b\3\b\6\b_\n\b\r\b\16\b`\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\7\3"+
		"\2\f\f\3\2\62;\4\2C\\c|\4\2\13\f\17\17\5\2\13\f\17\17\"\"\2t\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\3\26\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\tA\3\2\2\2"+
		"\13L\3\2\2\2\rX\3\2\2\2\17\\\3\2\2\2\21d\3\2\2\2\23\27\5\t\5\2\24\27\5"+
		"\7\4\2\25\27\5\5\3\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\4\3"+
		"\2\2\2\30\31\5\r\7\2\31\32\7?\2\2\32\36\5\17\b\2\33\35\t\2\2\2\34\33\3"+
		"\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\64\3\2\2\2 \36\3\2\2"+
		"\2!\"\5\r\7\2\"#\7?\2\2#\'\5\13\6\2$&\t\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(\64\3\2\2\2)\'\3\2\2\2*+\5\r\7\2+,\7?\2\2,\60\5\r\7"+
		"\2-/\t\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\63\30\3\2\2\2\63!\3\2\2\2\63*\3\2\2\2\64\6\3\2\2\2"+
		"\65\66\5\r\7\2\66\67\7?\2\2\678\5\r\7\289\7*\2\29:\5\r\7\2:>\7+\2\2;="+
		"\t\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\b\3\2\2\2@>\3\2\2\2"+
		"AB\5\r\7\2BC\7*\2\2CD\5\r\7\2DH\7+\2\2EG\t\2\2\2FE\3\2\2\2GJ\3\2\2\2H"+
		"F\3\2\2\2HI\3\2\2\2I\n\3\2\2\2JH\3\2\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2"+
		"NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2PQ\7\60\2\2QS\t\3\2\2RP\3\2\2\2SV\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2U\f\3\2\2\2VT\3\2\2\2WY\t\4\2\2XW\3\2\2\2YZ\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\16\3\2\2\2\\^\7$\2\2]_\n\5\2\2^]\3\2\2\2_`\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7$\2\2c\20\3\2\2\2de\t\6\2\2ef"+
		"\3\2\2\2fg\b\t\2\2g\22\3\2\2\2\16\2\26\36\'\60\63>HNTZ`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}