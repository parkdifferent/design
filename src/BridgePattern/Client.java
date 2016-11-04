package BridgePattern;

/**
 * Created by tianf on 2016/8/15.
 */
public class Client {

    public	static	void	main(String	args[])	{
        Image	image;
        ImageImp	imp;
        image	=	new JPGImage();
        imp	=	new LinuxImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
