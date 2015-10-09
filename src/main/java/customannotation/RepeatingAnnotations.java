package customannotation;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ajay
 */
public class RepeatingAnnotations {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class)
    public @interface Filter {
        String value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Filter("filter1")
    @Filter("filter2")
    public interface Filterable {

    }

    public static void main(String args[]) {
        Annotation[] annotation = Filterable.class.getAnnotationsByType(Filter.class);
        new ArrayList<>(Arrays.asList(annotation)).forEach(annotation1 -> {
            Filter filter = (Filter) annotation1;
            System.out.println(filter.value());
        });
    }
}
