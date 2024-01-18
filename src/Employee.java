import javax.swing.text.Position;

public class Employee extends Person {
    private int id;
    private String position;
    private double salary;
    @Override
    public String toString() {
        return position + ": " + super.toString();
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }
    public String getPosition(){
        return position;
    }
    public double getSalary(){
        return salary;
    }
    public Employee(){
    }
    public Employee(String name, String surname, String position, double salary){
        super(name,surname);
        this.position = position;
        this.salary = salary;
    }
    public double getPaymentAmount(){
        return salary;
    }

}
