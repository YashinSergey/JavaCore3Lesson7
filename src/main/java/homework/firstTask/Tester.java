package homework.firstTask;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tester {
    private static Object lock = new Object();

    public static synchronized void start(Object obj) throws InvocationTargetException, IllegalAccessException {
        Class c = obj.getClass();
        Method[] methods = c.getDeclaredMethods();
        int countBS = 0;
        synchronized (lock){
            for (Method o : methods) {
                if (o.isAnnotationPresent(BeforeSuite.class)) {
                    if (countBS >= 1) {
                        throw new RuntimeException("BeforeSuite annotation is more then 1");
                    }
                    o.invoke(obj);
                    countBS++;
                }
            }
        }
        synchronized (lock) {
            for (Method o : methods) {
                if (o.isAnnotationPresent(Test.class)) {
                    o.invoke(obj);
                }
            }
        }
        int countAS = 0;
        synchronized (lock) {
            for (Method o : methods) {
                if (o.isAnnotationPresent(AfterSuite.class)) {
                    if (countAS >= 1) {
                        throw new RuntimeException("AfterSuite annotation is more then 1");
                    }
                    o.invoke(obj);
                    countAS++;
                }
            }
        }
    }
}
