package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 2017/12/23
 */
public class BusinessReport {
    private List<Staff> staffs = new ArrayList<>();
    private Visitor visitor;

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public BusinessReport() {
        staffs.add(new Manager("杨经理"));
        staffs.add(new Engineer("工程师-Bro.Bear"));
        staffs.add(new Engineer("工程师-Mars Ding"));
        staffs.add(new Engineer("工程师-Yong Zhao"));
        staffs.add(new Engineer("工程师-Wisetim"));
    }

    public void showReport() {
        for (Staff staff : staffs) {
            staff.accept(visitor);
        }
    }
}
