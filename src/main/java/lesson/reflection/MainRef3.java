package lesson.reflection;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class MainRef3 {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class humanClass = URLClassLoader.newInstance(new URL[]
                {new File("F:/Java").toURL()}).loadClass("Human");

        Constructor constructor =  humanClass.getConstructor(/*String.class, String.class*/);

        Object human = constructor.newInstance(/*"Bob", "peeper"*/);

        Method m = humanClass.getDeclaredMethod("info");

        Field[] fields = humanClass.getDeclaredFields();
        for (Field o : fields) {
            System.out.println(o);
        }

        m.invoke(human);

    }
}
