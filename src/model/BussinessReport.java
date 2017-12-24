package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 2017/12/23
 */
public class BussinessReport {
    private List<Staff> staffs = new ArrayList<>();

    public BussinessReport() {
        staffs.add(new Manager("杨经理"));
        staffs.add(new Engineer("工程师-Bro.Bear"));
        staffs.add(new Manager("工程师-Mars Ding"));
        staffs.add(new Manager("工程师-Yong Zhao"));
        staffs.add(new Manager("工程师-Wisetim"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : staffs) {
            staff.accept(visitor);
        }
    }
}
