// Generated from DOT.g4 by ANTLR 4.7
// Edited by Jonah Tollefson

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an implementation of {@link DOTListener},
 * which upon walking through the DOTParser, can return a correctly formatted
 * dot code.
 * NOTE: Unused methods were not deleted, simply left empty and uncommented.
 */
public class DOTBaseListener implements DOTListener {

         private StringBuffer formatted = new StringBuffer(100);
         private int indentNum = 0;
    
         // Appends strict (if there), digraph/graph, digraph id and {
         // then starts new line and adds 3 spaces to indentNum
	@Override public void enterGraph(DOTParser.GraphContext ctx) {
            int count = 0;
            while (!ctx.getChild(count).getText().equals("{"))
                formatted.append(ctx.getChild(count++).getText()+ " ");
            formatted.append("{\n");  
            indentNum= indentNum + 3;
        }

        // Appends } and deducts 3 spaces from indentNum
	@Override public void exitGraph(DOTParser.GraphContext ctx) { 
            formatted.append("}\n");
            indentNum= indentNum - 3;
        }

	@Override public void enterStmt_list(DOTParser.Stmt_listContext ctx) { }

	@Override public void exitStmt_list(DOTParser.Stmt_listContext ctx) { }

        // Checks if statement has more than one child, if it does then it is a
        // a property and can be appended here. Otherwise does nothing.
	@Override public void enterStmt(DOTParser.StmtContext ctx) { 
            if(ctx.getChildCount() > 1) {
                for(int k = 0; k < indentNum; k++)
                    formatted.append(" ");
                for (int i=0; i < ctx.getChildCount()-1; i++) {
                    formatted.append(ctx.getChild(i).getText() + " ");
                }
                formatted.append(ctx.getChild(ctx.getChildCount()-1).getText() + ";\n");
            }
        }

	@Override public void exitStmt(DOTParser.StmtContext ctx) { }

        // Appends indentation spaces and first token in the stmt and leaves 
        // the rest for Attr_list & A_list to append.
	@Override public void enterAttr_stmt(DOTParser.Attr_stmtContext ctx) { 
            for(int k = 0; k < indentNum; k++)
                formatted.append(" ");
            formatted.append(ctx.getStart().getText());
        }

        // Appends semi-colon and starts new line.
	@Override public void exitAttr_stmt(DOTParser.Attr_stmtContext ctx) { 
            formatted.append(";\n");
        }

        // Appends left bracket.
	@Override public void enterAttr_list(DOTParser.Attr_listContext ctx) { 
            formatted.append("[");
        }

        // Appends right bracket
	@Override public void exitAttr_list(DOTParser.Attr_listContext ctx) { 
            formatted.append("]");
        }

        // Appends each attribute in list, that is split by a comma.
	@Override public void enterA_list(DOTParser.A_listContext ctx) { 
            for (int i=0; i < ctx.getChildCount()-1; i++) {
                    if(ctx.getChild(i+1).getText().equals(","))
                        formatted.append(ctx.getChild(i).getText());
                    else
                        formatted.append(ctx.getChild(i).getText() + " ");
                }
            formatted.append(ctx.getChild(ctx.getChildCount()-1).getText() + "");
        }
        
	@Override public void exitA_list(DOTParser.A_listContext ctx) { }

        // Appends indentation spaces
	@Override public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx) {
            for(int k = 0; k < indentNum; k++)
                formatted.append(" ");
        }

        // Appends semi-colon and starts a new line
	@Override public void exitEdge_stmt(DOTParser.Edge_stmtContext ctx) { 
            formatted.append(";\n");
        }

	@Override public void enterEdgeRHS(DOTParser.EdgeRHSContext ctx) { }

        // Appends indentation spaces.
	@Override public void exitEdgeRHS(DOTParser.EdgeRHSContext ctx) { 
            if(ctx.getParent().getChildCount() > 2)
                formatted.append(" ");
        }

        // Appends value of edge operator.
	@Override public void enterEdgeop(DOTParser.EdgeopContext ctx) { 
            formatted.append(" " + ctx.getStart().getText() + " ");
        }

	@Override public void exitEdgeop(DOTParser.EdgeopContext ctx) { }

        // Appends indentation spaces.
	@Override public void enterNode_stmt(DOTParser.Node_stmtContext ctx) { 
            for(int k = 0; k < indentNum; k++)
                formatted.append(" ");
        }

        // Appends semi-colon and starts a new line.
	@Override public void exitNode_stmt(DOTParser.Node_stmtContext ctx) { 
            formatted.append(";\n");
        }

        // Appends value of node ID
	@Override public void enterNode_id(DOTParser.Node_idContext ctx) { 
            formatted.append(ctx.getStart().getText());
        }

	@Override public void exitNode_id(DOTParser.Node_idContext ctx) { }

	@Override public void enterPort(DOTParser.PortContext ctx) { }

	@Override public void exitPort(DOTParser.PortContext ctx) { }

        // Appends indentation spaces then adds 3 to indentNum then
        // ppends subgraph, the subgraph id, and { then starts a new line
	@Override public void enterSubgraph(DOTParser.SubgraphContext ctx) { 
            for(int k = 0; k < indentNum; k++)
                    formatted.append(" ");
            indentNum= indentNum + 3;
            formatted.append(ctx.getChild(0).getText() + " " + 
                    ctx.getChild(1).getText() + " {\n");
        }
	
        // Deducts 3 from indentNum then appends indentation spaces and then
        // appends } and starts a new line.
	@Override public void exitSubgraph(DOTParser.SubgraphContext ctx) { 
            indentNum = indentNum - 3;
            for(int k = 0; k < indentNum; k++)
                    formatted.append(" ");
            formatted.append("}\n");
        }

	@Override public void enterId(DOTParser.IdContext ctx) { }

	@Override public void exitId(DOTParser.IdContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
        
        // Returns appended formatted string.
        public String formmatedString() {
            return formatted.toString();
        }
}