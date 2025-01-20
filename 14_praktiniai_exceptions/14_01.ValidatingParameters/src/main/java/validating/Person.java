package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

        if (age > 120 || age<0) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name can't be null,empty or longer then 40 symbols");
        };


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
