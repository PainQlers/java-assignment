class Info {
    private String name;
    private int age;
    private String hobby;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void setLocation(String hobby) {
        this.hobby = hobby;
    }

    String getLocation() {
        return this.hobby;
    }
}

class Person extends Info {
    void say() {
        System.out.println("My name is " + this.getName() + ". I'm " + this.getAge() + " years old. " + "I'm from " + this.getLocation() + ".");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Brian");
        person.setAge(24);
        person.setLocation("Korea");
        person.say();
    }
}