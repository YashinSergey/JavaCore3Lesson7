package homework.firstTask;

import java.lang.reflect.InvocationTargetException;

public class MainTest {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        try {
            Tester.start(test1);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
