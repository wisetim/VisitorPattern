package doubledispatch;

/**
 * Created by Tim on 2017/12/24
 */
public class CommonRole implements Role {
    @Override
    public void accept(AbstractActor actor) {
        actor.act(this);
    }
}
