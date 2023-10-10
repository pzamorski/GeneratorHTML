package org.example.elemts.thymeleaf.utilities;

import java.lang.reflect.Field;

public class StructClass {
    public StructClass(String name, Field[] fields) {
        this.name = name;
        this.fields = fields;
    }

    String name;
    Field[] fields;

    public String getName() {
        return name;
    }

    public String[] getFields() {
        String[] ret = new String[fields.length];

        for (int i = 0; i < fields.length; i++) {
            ret[i]=fields[i].getName();
        }
        return ret;
    }

    public Class<?>[] getType() {
        Class<?>[] ret = new Class[fields.length];

        for (int i = 0; i < fields.length; i++) {
            ret[i] = fields[i].getType();
        }
        return ret;
    }
}
