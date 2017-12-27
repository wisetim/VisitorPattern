package model;

import java.util.Map;

/**
 * Created by Tim on 2017/12/23
 */
public interface Visitor {
    public Map visit(Engineer engineer);
    public Map visit(Manager manager);
}
