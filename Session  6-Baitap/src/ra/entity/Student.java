package ra.entity;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float htmlScore;
    private float cssScore;
    private float javascriptScore;
    private float avgScore;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean sex, float htmlScore, float cssScore, float javascriptScore, float avgScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javascriptScore = javascriptScore;
        this.avgScore = avgScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public float getHtmlScore() {
        return htmlScore;
    }

    public float getCssScore() {
        return cssScore;
    }

    public float getJavascriptScore() {
        return javascriptScore;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setHtmlScore(float htmlScore) {
        this.htmlScore = htmlScore;
    }

    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }

    public void setJavascriptScore(float javascriptScore) {
        this.javascriptScore = javascriptScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào điểm HTML: ");
        this.htmlScore = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào điểm CSS: ");
        this.cssScore = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào điểm Javascript:");
        this.javascriptScore = Float.parseFloat(scanner.nextLine());
    }
    public void displayData() {
        String sexDisplay = this.sex ? "Nam" : "Nữ";
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d - Giới tính: %s\n", this.studentId, this.studentName, this.age, sexDisplay);
        System.out.printf("HTML: %.1f - CSS: %.1f - Javascript: %.1f - Avg Score: %.1f\n", this.htmlScore, this.cssScore, this.javascriptScore, this.avgScore);
    }
    public void calAvgScore(){
        this.avgScore = (this.htmlScore+this.cssScore+this.javascriptScore)/3;
    }
}
