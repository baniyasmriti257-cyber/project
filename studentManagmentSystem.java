interface LibraryHelper{
    void bookBorrowed(int books);
}
abstract class student{
    String name;
    int roll;
    double fee;
    student(String name, int roll, double fee) {
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }
    abstract void attendClass();
    abstract void giveExam();
    void payFee(){
        System.out.println("fee paid"+fee);
    }
}
class studentCEIV extends student implements LibraryHelper{
    int marks;
    studentCEIV(String name,int roll,double fee,int marks){
        super(name,roll,fee);
        this.marks=marks;
    }
    void attendClass(){
        System.out.println(name + " is attending class");
    }
    void giveExam(){
        System.out.println(name + " is giving exam");
    }
    public void bookBorrowed(int books){
        System.out.println( " book borrowed " + books );
    }
    void displayInfo(){
        System.out.println("\n--student information");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
       
        System.out.println("Marks: " + marks);
    }
    void gradeStudent(){
        if(marks>=80){
            System.out.println("Grade: A");
        }else if(marks>=60){
            System.out.println("Grade: B");
        }else if(marks>=40){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}
public class studentManagmentSystem {
    public static void main(String[] args) {
        studentCEIV student1 = new studentCEIV("Aaaa", 101, 5000.0, 85);
        student1.attendClass();
        student1.giveExam();
        student1.payFee();
        student1.bookBorrowed(3);
        student1.displayInfo();
        student1.gradeStudent();
    }
}