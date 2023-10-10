package org.example.elemts.input;

public class InputType {
    public static final InputType TEXT = new InputType("text");
    public static final InputType PASSWORD = new InputType("password");
    public static final InputType CHECKBOX = new InputType("checkbox");
    public static final InputType RADIO = new InputType("radio");
    public static final InputType HIDDEN = new InputType("hidden");
    public static final InputType SUBMIT = new InputType("submit");
    public static final InputType RESET = new InputType("reset");
    public static final InputType BUTTON = new InputType("button");
    public static final InputType IMAGE = new InputType("image");

    private final String code;

    private InputType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}
