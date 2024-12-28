package OOPS;

public class Person {
    private String firstName ;
    private String lastName ;
    private int age ;
    private String gender ;

    public Person( String firstName , String lastName , String gender , int age){
        this.age = age ;
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.gender = gender ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        return ( this.gender.equals(((Person) obj).gender) && this.firstName.equals(((Person) obj).firstName) &&
                this.lastName.equals(((Person) obj).lastName) && this.age == ((Person) obj).age
                );
    }

    public static void main(String[] args) {
        Person p1 = new Person("Abhishek" , "Kanade" , "Male" ,21) ;
        Person p2 = new Person("Abhishek" , "Kanade" , "Male" ,21) ;
        System.out.println(p1.equals(p2));


    }
}
