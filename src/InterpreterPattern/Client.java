package InterpreterPattern;

/**
 * Created by tianf on 2016/8/15.
 */
public class Client {

    public	static	void	main(String	args[])	{
        String	instruction	=	"up	move	5	and	down	run	10	and	left	move	5";
        InstructionHandler	handler	=	new	InstructionHandler();
        handler.handle(instruction);
        String	outString;
        outString	=	handler.output();
        System.out.println(outString);


    }
}
