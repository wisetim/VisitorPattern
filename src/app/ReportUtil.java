package app;

import model.Engineer;
import model.Manager;
import model.Staff;

/**
 * Created by Tim on 2017/12/23
 */
public class ReportUtil {
    public void visitByCEO(Staff staff) {
        if (staff instanceof Manager) {
            Manager manager = (Manager) staff;
            System.out.println("经理：" + manager.getName()
                    + ", KPI：" + manager.getKpi()
                    + ", 新产品数量：" + manager.getProducts());
        } else if (staff instanceof Engineer) {
            Engineer engineer = (Engineer) staff;
            System.out.println("工程师：" + engineer.getName()
                    + ", KPI：" + engineer.getKpi());
        }
    }

    public void visitByCTO(Staff staff) {
        if (staff instanceof Manager) {
            Manager manager = (Manager) staff;
            System.out.println("经理：" + manager.getName()
                    + ", KPI：" + manager.getKpi()
                    + ", 新产品数量：" + manager.getProducts());
        } else if (staff instanceof Engineer) {
            Engineer engineer = (Engineer) staff;
            System.out.println("工程师：" + engineer.getName()
                    + ", 代码行数：" + engineer.getCodeLines());
        }
    }
}
