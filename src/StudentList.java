package src;

public class StudentList {
    private Student[] list;

    public StudentList() {
        this.list = new Student[0];
    }
    public void getInfo() {
        for (int i = 0; i < this.list.length; i++) {
            System.out.println(list[i].getInfo());
        }
    }
    public void addStudent(Student data){
        Student[] newData = new Student[list.length+1];
        for (int i = 0; i < this.list.length; i++) {
             newData[i] = this.list[i];
        }
        newData[this.list.length]= data;
        this.list = newData;
    }
    public  void removeStudent(String name){
        Student[] newData = new Student[list.length-1];
        int k = 0;
        for (int i = 0; i < this.list.length; i++) {
                if(this.list[i].getName().equals(name)){
                    continue;
                }
                newData[k] = this.list[i];
                k++;
        }
        this.list = newData;
    }
    public void searchNameStudent(String name){
        for (int i = 0; i < this.list.length; i++) {
            if(this.list[i].getName().equals(name) || this.list[i].getStudentCode().equals(name)){
                System.out.println(list[i].getInfo());
            }
        }
    }
}
