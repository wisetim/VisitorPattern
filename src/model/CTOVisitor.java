package model;

/**
 * Created by Tim on 2017/12/23
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.getName()
                + ", 代码行数：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.getName()
                + ", KPI：" + manager.getKpi()
                + ", 新产品数量：" + manager.getProducts());
    }
}
