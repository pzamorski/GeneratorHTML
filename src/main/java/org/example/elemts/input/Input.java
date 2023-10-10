package org.example.elemts.input;

import org.example.elemts.MyElemet;
import org.example.elemts.br.Br;
import org.example.elemts.label.Label;

public class Input extends MyElemet {

    public Input(InputType inputType) {
        super("input");
        attr("type", inputType.getCode());
    }

    public Input(InputType inputType, String name) {
        super("input");
        attr("type", inputType.getCode());
        setId(name);
        setName(name);
    }

    public static Input[] create(InputType type, String[] names) {
        Input[] retInputs =new Input[names.length];
        for (int i = 0; i < names.length; i++) {
            Input input = new Input(type, names[i]);
            input.text(names[i]);
            retInputs[i]=input;
        }
        return retInputs;

    }


    public void newLine() {
        appendChild(new Br());
    }

    public Label createLabel(String label) {
        return new Label().setText(label).setFor(id());
    }
}
