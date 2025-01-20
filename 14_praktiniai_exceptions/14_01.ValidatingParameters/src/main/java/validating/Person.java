package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

        if (age >= 120 || age<0) {
            throw new IllegalArgumentException("age incorect");
        }
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("wrong name");
        };


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
