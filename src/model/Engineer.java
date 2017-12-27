package model;

import java.util.Map;
import java.util.Random;

/**
 * Created by Tim on 2017/12/23
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public Map accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
