package model;

import java.util.Map;
import java.util.Random;

/**
 * Created by Tim on 2017/12/23
 */
public abstract class Staff {
    private String name;
    private int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }

    public abstract Map accept(Visitor visitor);
}
