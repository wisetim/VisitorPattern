package doubledispatch;

/**
 * Created by Tim on 2017/12/24
 */
public class Client {
    public static void main(String[] args) {
        AbstractActor actor = new OldActor();
        Role role = new KungFuRole();
        actor.act(role);
        actor.act(new KungFuRole());
    }
}
