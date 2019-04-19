package lesson.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  // Выбираем, где будет работать анотация
public @interface MyAn1 {
        int priority() default 5;
}
