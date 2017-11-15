// Generated from D:/Test\Samp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampParser}.
 */
public interface SampListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(SampParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(SampParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(SampParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(SampParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(SampParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(SampParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(SampParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(SampParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(SampParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(SampParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(SampParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(SampParser.DateContext ctx);
}