package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tim on 2017/12/23
 */
public class CTOVisitor implements Visitor {
    @Override
    public Map visit(Engineer engineer) {
        Map<String, String> a = new HashMap<>();
        a.put("职务", "工程师");
        a.put("姓名", engineer.getName());
        a.put("代码行数", String.valueOf(engineer.getCodeLines()));
        return a;
    }

    @Override
    public Map visit(Manager manager) {
        Map<String, String> a = new HashMap<>();
        a.put("职务", "工程师");
        a.put("姓名", manager.getName());
        a.put("KPI", String.valueOf(manager.getKpi()));
        a.put("新产品数量", String.valueOf(manager.getProducts()));
        return a;

    }
}
