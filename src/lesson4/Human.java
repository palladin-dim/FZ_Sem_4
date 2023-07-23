package lesson4;

public class Human {

    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Human){
            Human human = (Human) obj;
            if (name.equals(human.name) && age == human.age)
                return true;
        }
        return false;
    }
}