import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class MyApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Employee("Kairat", "Tuyakbayev" , "POvar" , 150000.00));
        persons.add(new Employee("Ayan", "Andreyev" , "Ohrannik" , 85000.00));
        persons.add(new Student("Danial", "Shaimurat" , 2.54));
        persons.add(new Student("Rabat", "Karabek" , 3.18));
        Collections.sort(persons);
        printdata(persons);
    }
    public static void printdata(Iterable<Person> persons){
        for(Person person : persons){
            System.out.println(person + ": " + person.getPaymentAmount() + "tenge");
        }
    }
}