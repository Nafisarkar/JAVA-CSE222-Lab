import java.util.ArrayList;
public class Person {
    private final String name;
    private final int age;
    public Person(String n,int a){
        this.name=n;
        this.age=a;
    }
    public void display(){
        System.out.println("Name : "+this.name+" | Age : "+this.age);
    }

    public static void main(String[] args){
        Person p1 = new Person("Nafi",20);
        Person p2 = new Person("Asif",21);
        Person p3 = new Person("Peya",22);

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        for (Person temp_p : people) {
            temp_p.display();
        }
    }
}
