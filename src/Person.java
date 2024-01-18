public class Person implements Payable,Comparable<Person>{
    private static int nextid = 1;
    private int id;
    private String name;
    private String surname;
    public Person(){
        this.id = nextid++;
    }
    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;
        this.id = nextid++;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String toString(){
        return id + "." + name + " " + surname;
    }
    public String getPosition() {
        return "Student";
    }
    public int compareTo(Person o){
        return Double.compare(getPaymentAmount(), o.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}

