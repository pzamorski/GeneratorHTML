package org.example.atributes;

import org.example.elemts.button.TypeButton;

public interface ButtonAtributes {

    void setType(TypeButton type);

    void setFormAction(String formAction);

    void setFormMethod(String formMethod);

    void setFormEnctype(String formEnctype);

    void setFormTarget(String formTarget);

    void setFormNoValidate(boolean formNoValidate);

    void setFormTargetBlank(boolean formTargetBlank);

}
