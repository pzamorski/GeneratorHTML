package org.example.elemts.form;

public class TypeMethod {

    public static final TypeMethod GET = new TypeMethod("get");
    public static final TypeMethod POST = new TypeMethod("post");
    public static final TypeMethod PUT = new TypeMethod("put");

    private String code;

    public TypeMethod(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
