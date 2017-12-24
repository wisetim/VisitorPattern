package doubledispatch;

/**
 * Created by Tim on 2017/12/24
 */
public class OldActor extends AbstractActor {
    @Override
    public void act(KungFuRole role) {
        System.out.println("年龄大了，演不了功夫角色");
    }
}
