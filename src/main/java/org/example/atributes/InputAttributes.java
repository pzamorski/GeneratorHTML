package org.example.atributes;

public interface InputAttributes {
    void setPlaceholder(String placeholder);

    void setRequired(boolean required);

    void setMaxLength(int maxLength);

    void setMinLength(int minLength);

    void setPattern(String pattern);

    void setSize(int size);

    void setStep(String step);

    void setMultiple(boolean multiple);

    void setAccept(String accept);

    void setAutocomplete(String autocomplete);

    void setChecked(boolean checked);
}
