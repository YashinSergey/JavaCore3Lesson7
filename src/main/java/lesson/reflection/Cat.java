package lesson.reflection;

import lesson.annotation.MyAn1;
import lesson.annotation.MyAn2;
import lesson.annotation.XType;

@XType
public class Cat {

    String name;

    @MyAn2(priority = 7)
    public int age;

    private final String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    @MyAn1(priority = 7)
    public void test1(){
        System.out.println("test1");
    }

    @MyAn1(priority = 3)
    public void test2(){
        System.out.println("test2");
    }

    @MyAn1
    public void info1(){
        System.out.println(name + " " +  age + " " + color);
    }

    private void info2(){
        System.out.println(name + " " +  age + " " + color);
    }
}
