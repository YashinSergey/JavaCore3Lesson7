package lesson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  // Выбираем, где будет работать анотация
@Target(ElementType.FIELD)
public @interface MyAn2 {
    int priority() default 5;
}
