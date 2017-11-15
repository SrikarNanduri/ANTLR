// Generated from D:/Test\Samp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SampLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, QUOTE=2, WORD=3, DT=4, WHITESPACE=5, NEWLINE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "COMMA", "QUOTE", "WORD", "DT", "WHITESPACE", 
		"NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "QUOTE", "WORD", "DT", "WHITESPACE", "NEWLINE"
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


	public SampLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Samp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b9\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6#\n\6\r\6\16\6$\3\7\6"+
		"\7(\n\7\r\7\16\7)\3\b\6\b-\n\b\r\b\16\b.\3\t\5\t\62\n\t\3\t\3\t\6\t\66"+
		"\n\t\r\t\16\t\67\2\2\n\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\3\2\6\3\2c|"+
		"\3\2C\\\5\2//\62<C\\\4\2\13\13\"\"\2>\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7"+
		"\27\3\2\2\2\t\33\3\2\2\2\13\"\3\2\2\2\r\'\3\2\2\2\17,\3\2\2\2\21\65\3"+
		"\2\2\2\23\24\t\2\2\2\24\4\3\2\2\2\25\26\t\3\2\2\26\6\3\2\2\2\27\30\7."+
		"\2\2\30\31\3\2\2\2\31\32\b\4\2\2\32\b\3\2\2\2\33\34\7$\2\2\34\35\3\2\2"+
		"\2\35\36\b\5\2\2\36\n\3\2\2\2\37#\5\3\2\2 #\5\5\3\2!#\7a\2\2\"\37\3\2"+
		"\2\2\" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\f\3\2\2\2&"+
		"(\t\4\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\16\3\2\2\2+-\t\5"+
		"\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\20\3\2\2\2\60\62\7\17\2"+
		"\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\66\7\f\2\2\64\66\7\17"+
		"\2\2\65\61\3\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2"+
		"\28\22\3\2\2\2\13\2\"$\').\61\65\67\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}