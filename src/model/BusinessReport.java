package model;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Tim on 2017/12/23
 */
public class BusinessReport {
    private List<Staff> staffs = new ArrayList<>();
    private Visitor visitor;
    private List<String> tableTitle;

    public List<String> getTableTitle() {
        return tableTitle;
    }

    public void setTableTitle(List<String> tableTitle) {
        this.tableTitle = tableTitle;
    }

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

    public BusinessReport() {//data
        staffs.add(new Manager("杨XX"));
        staffs.add(new Engineer("Bro.Bear"));
        staffs.add(new Engineer("Mars Ding"));
        staffs.add(new Engineer("Yong Zhao"));
        staffs.add(new Engineer("Wisetim"));

    }

    public void showReport(String outFile) {

        //创建工作薄
        WritableWorkbook workbook = null;
        try {
            workbook = Workbook.createWorkbook(new FileOutputStream(outFile));

            //创建新的一页
            WritableSheet sheet = workbook.createSheet("First Sheet", 0);
            //创建要显示的内容,创建一个单元格，第一个参数为列坐标，第二个参数为行坐标，第三个参数为内容
            Map<String, String> map;
            int i = 0;
            for (int j = 0; j < tableTitle.size(); j++) {
                sheet.addCell(new Label(j,i, tableTitle.get(j)));
            }
            i++;
            for (Staff staff : staffs) {
                map = staff.accept(visitor);
                for (int j = 0; j < tableTitle.size(); j++) {
                    String aj=map.get(tableTitle.get(j));
                    if(aj!=null){
                        sheet.addCell(new Label(j,i,aj));
                    }
                }
                i++;
            }

            //把创建的内容写入到输出流中，并关闭输出流
            workbook.write();
            workbook.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
    }

}
