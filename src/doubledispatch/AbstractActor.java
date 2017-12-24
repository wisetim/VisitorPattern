package doubledispatch;

/**
 * Created by Tim on 2017/12/24
 */
public abstract class AbstractActor {
    public void act(Role role) {
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KungFuRole role) {
        System.out.println("演员可以扮演功夫角色");
    }
}
