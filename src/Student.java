public class Student extends Person{
    private double Gpa;
    private double sti = 36660.00;
    public String toString(){
        return "Student: " + super.toString();
    }
    public void setGpa(double Gpa){
        this.Gpa = Gpa;
    }
    public double getGpa(){
        return getGpa();
    }
    public Student(){}
    public Student(String name, String surname, double Gpa){
        super(name,surname);
        this.Gpa = Gpa;
    }
    public double getPaymentAmount(){
        return (Gpa>2.67) ? sti : 0.00;
    }
}
