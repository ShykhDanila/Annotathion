import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Method {
    public static void show(Object o , Class c) throws IllegalAccessException {
        Field[] declaredFields = c.getDeclaredFields();
        for (Field fild:
             declaredFields) {
            Annotation[] declaredAnnotations = fild.getDeclaredAnnotations();
            for (Annotation annotation:
                 declaredAnnotations) {
                if (annotation.annotationType().equals(Show.class)){
                    System.out.println(fild.get(o));
                }
            }
        }
    }
}
