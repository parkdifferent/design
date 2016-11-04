package BuilderPattern;

/**
 * Created by tianf on 2016/8/12.
 */

//恶魔角色建造器：具体建造者
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");

    }

    @Override
    public void buildFace() {
        actor.setFace("妖艳");

    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑裙");

    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("红发");

    }


}
