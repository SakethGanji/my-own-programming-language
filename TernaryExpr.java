public class TernaryExpr extends Expr {
    private Expr condition;
    private Expr trueExpr;
    private Expr falseExpr;

    public TernaryExpr(Expr condition, Expr trueExpr, Expr falseExpr) {
        this.condition = condition;
        this.trueExpr = trueExpr;
        this.falseExpr = falseExpr;
    }

    public String toString(int t) {
        return "(" + condition.toString(0) + " ? " + trueExpr.toString(0) + " : " + falseExpr.toString(0) + ")";
    }
}
