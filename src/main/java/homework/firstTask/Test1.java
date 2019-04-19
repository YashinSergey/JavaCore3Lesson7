package homework.firstTask;

public class Test1 {

    @BeforeSuite
    public void beforeSuiteTest(){
        System.out.println("beforeSuiteTest");
    }
    @Test(priority = 3)
    public void test1(){
        System.out.println("test1");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("test2");
    }
    @Test(priority = 7)
    public void test3(){
        System.out.println("test3");
    }
    @Test(priority = 4)
    public void test4(){
        System.out.println("test4");
    }
    @AfterSuite
    public void afterSuiteTest(){
        System.out.println("afterSuiteTest");
    }
}
