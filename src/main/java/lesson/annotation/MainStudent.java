package lesson.annotation;

public class MainStudent {
    public static void main(String[] args) {
        Class student = Students.class;
        String tableName = ((XTable)student.getAnnotation(XTable.class)).name();
        System.out.println(tableName);
    }
}
