package org.example.elemts.button;

import org.example.atributes.ButtonAtributes;
import org.example.elemts.MyElemet;

public class Button extends MyElemet implements ButtonAtributes{


    public Button() {
        super("button");
    }

    public Button(String text) {
        super("button");
        text(text);

    }


    @Override
    public void setType(TypeButton type) {
        this.setType(type.getCode());
    }

    @Override
    public void setFormAction(String formAction) {

    }

    @Override
    public void setFormMethod(String formMethod) {

    }

    @Override
    public void setFormEnctype(String formEnctype) {

    }

    @Override
    public void setFormTarget(String formTarget) {

    }

    @Override
    public void setFormNoValidate(boolean formNoValidate) {

    }

    @Override
    public void setFormTargetBlank(boolean formTargetBlank) {

    }
}
