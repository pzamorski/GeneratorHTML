package org.example.elemts.button;

public class TypeButton {

    public static final TypeButton SUBMIT = new TypeButton("submit");
    public static final TypeButton BUTTON = new TypeButton("button");
    public static final TypeButton RESET = new TypeButton("reset");

    private String code;

    public TypeButton(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
