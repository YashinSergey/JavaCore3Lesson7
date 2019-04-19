package lesson.annotation;

import lesson.reflection.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainAn {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class c = Cat.class;
        Cat cat = new Cat("Cat1", 5, "yellow");
        Method[] methods = c.getDeclaredMethods();
        for (Method o: methods) {
           if(o.isAnnotationPresent(MyAn1.class)){
               System.out.println(o.getAnnotation(MyAn1.class).priority());
               o.invoke(cat);
           }
        }
    }
}
