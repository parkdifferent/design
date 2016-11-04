package BuilderPattern;

/**
 * Created by tianf on 2016/8/12.
 */

//游戏角色创建控制器：指挥者
public class ActorController {

    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildCostume();
        ab.buildFace();
        ab.buildHairstyle();
        ab.buildSex();
        ab.buildType();
        actor = ab.createActor();
        return actor;
    }
}

