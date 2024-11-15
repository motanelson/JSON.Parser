// Generated from JSON.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(JSONParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(JSONParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(JSONParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(JSONParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(JSONParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(JSONParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(JSONParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(JSONParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTrueValue(JSONParser.TrueValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTrueValue(JSONParser.TrueValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFalseValue(JSONParser.FalseValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFalseValue(JSONParser.FalseValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(JSONParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullValue}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(JSONParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(JSONParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(JSONParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONParser.ArrayContext ctx);
}