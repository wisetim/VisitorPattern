package model;

/**
 * Created by Tim on 2017/12/23
 */
public interface Visitor {
    public void visit(Engineer engineer);
    public void visit(Manager manager);
}
