package lesson.reflection;

import java.lang.reflect.Field;

public class MainRef2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Cat cat1 = new Cat("Barsik", 2, "White");
        Class c = Cat.class;
        cat1.info1();
        Field f = c.getDeclaredField("color");
        f.setAccessible(true);
        f.set(cat1, "Black");
        cat1.info1();

        Cat cat2 = new Cat("Murzik", 3, "Grey");
        cat2.info1();
        f.set(cat2, "Red");
        cat2.info1();

    }
}
