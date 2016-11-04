package CompositePattern;

/**
 * Created by tianf on 2016/8/15.
 */

//抽象文件类：抽象构件
public abstract class AbstractFile {

    public	abstract	void	add(AbstractFile	file);
    public	abstract	void	remove(AbstractFile	file);
    public	abstract	AbstractFile	getChild(int	i);
    public	abstract	void	killVirus();
}
