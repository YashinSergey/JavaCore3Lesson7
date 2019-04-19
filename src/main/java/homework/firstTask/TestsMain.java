package homework.firstTask;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestsMain {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Test1 t1 = new Test1();
        Class test1 = t1.getClass();
        Test1 t = (Test1)test1.newInstance();
        try {
            start(test1);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void start(Class c) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = c.getDeclaredMethods();
        int countBS = 0;
        int countAS = 0;
        for (Method o: methods) {
            if (o.isAnnotationPresent(BeforeSuite.class)) {
                if(countBS >= 1){
                    throw new RuntimeException("BeforeSuite annotation is more then 1");
                }
                    o.invoke(c);
                    countBS++;
            }else if(o.isAnnotationPresent(Test.class)){
                    o.invoke(c);
            }else if(o.isAnnotationPresent(AfterSuite.class)){
                if(countAS >= 1){
                    throw new RuntimeException("AfterSuite annotation is more then 1");
                }
                o.invoke(c);
                countAS++;
            }
        }
    }
}
