package org.example.elemts.thymeleaf.utilities;

public class ThymeleafUtilities {

    public static StructClass structClass(Class<?> clazz) {
        return new StructClass(Class.class.getName(),clazz.getDeclaredFields());
    }
    public static StructClass structClass(Object o) {
        Class<?> clazz = o.getClass();
        return new StructClass(Class.class.getName(),clazz.getDeclaredFields());
    }

}
