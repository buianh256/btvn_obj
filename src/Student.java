package src;

public class Student {
    private String StudentCode;
    private String name;
    private String dateOfBirth;
    private double PointAverage;
    private String Address;
    private String number;

    public Student(String StudentCode, String name, String dateOfBirth, String Address, String Number) {
        this.StudentCode = StudentCode;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.Address = Address;
        this.number = Number;
    }
    public String getInfo() {
        return "Ma Sinh Vien: " + StudentCode + " Ho ten: " + name + " Ngày Sinh: " + dateOfBirth + " Địa chỉ: " + Address + " Số ĐT: " + number;
    }
    public String getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(String studentCode) {
        StudentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPointAverage(double math, double physical, double chemistry) {
        double ĐTB =(math + physical + chemistry)/3;
        return ĐTB;
    }

    public void setPointAverage(double pointAverage) {
        PointAverage = pointAverage;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
