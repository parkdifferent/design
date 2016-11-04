package BuilderPattern;

/**
 * Created by tianf on 2016/8/12.
 */

//英雄角色建造器：具体建造者
public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");

    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");

    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");

    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("飘逸");

    }
}
