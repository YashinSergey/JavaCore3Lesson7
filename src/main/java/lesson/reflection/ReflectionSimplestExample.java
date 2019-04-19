package lesson.reflection;

public class ReflectionSimplestExample {
    public static void main(String[] args) {
        String str = "Java";
        Class strClass = str.getClass();
        System.out.println(strClass);
    }
}
