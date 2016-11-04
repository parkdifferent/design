package BuilderPattern;

/**
 * Created by tianf on 2016/8/12.
 */

//角色建造器：抽象建造者
abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public	abstract void	buildType();
    public	abstract void	buildSex();
    public	abstract void	buildFace();
    public	abstract void	buildCostume();
    public	abstract void	buildHairstyle();

    public Actor createActor() {
        return actor;
    }


}
