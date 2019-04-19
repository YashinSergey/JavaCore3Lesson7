package lesson.reflection;

import java.lang.reflect.Field;

public class MainRef1 {
    public static void main(String[] args) {
        Class c = Cat.class;
//        Field[] fields = c.getFields(); // показывает только поля public
        Field[] fields = c.getDeclaredFields(); // показывает все поля

        for (Field o : fields) {
            System.out.println(o);
        }
    }
}
