package app;

import model.BusinessReport;
import model.CEOVisitor;
import model.CTOVisitor;
import model.Visitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
               "applicationContext.xml");


        BusinessReport report = (BusinessReport)ctx.getBean("report");
//        System.out.println("========== 给CEO看的报表 ==========");
//        report.showReport(new CEOVisitor());
//        System.out.println("\n========== 给CTO看的报表 ==========");
//        System.out.println("========== 给Visitor1看的报表 ==========");
//        report.showReport(new CTOVisitor());
//        System.out.println("========== 报表 ==========");
        report.showReport("报表.xls");
        System.out.println("已经生成！");
    }
}
