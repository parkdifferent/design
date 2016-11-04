package InterpreterPattern;

/**
 * Created by tianf on 2016/8/15.
 */

//动作解释：终结符表达式
public class ActionNode extends AbstractNode {

    private	String	action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if	(action.equalsIgnoreCase("move"))	{
            return	"移动";
        }

        else	if	(action.equalsIgnoreCase("run"))	{
            return	"快速移动";
        }
        else	{
            return	"无效指令";
        }
    }
}
