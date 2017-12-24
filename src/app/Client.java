package app;

import model.BussinessReport;
import model.CEOVisitor;
import model.CTOVisitor;

public class Client {

    public static void main(String[] args) {
        BussinessReport report = new BussinessReport();
        System.out.println("========== 给CEO看的报表 ==========");
        report.showReport(new CEOVisitor());
        System.out.println("\n========== 给CTO看的报表 ==========");
        report.showReport(new CTOVisitor());
    }
}
