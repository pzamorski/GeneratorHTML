package org.example.elemts.label;

import org.example.atributes.LabelAttributes;
import org.example.elemts.MyElemet;
import org.example.elemts.br.Br;
import org.jsoup.nodes.Element;

public class Label extends MyElemet implements LabelAttributes {



    public Label() {
        super("label");
    }

    public Label(String text) {
        super("label");
        text(text);

    }

    public Label setText(String text){
        text(text);
        return this;
    }


    @Override
    public Label setFor(String htmlFor) {
        attr("for", htmlFor);
        return this;
    }

    public Label newLine() {
        appendChild(new Br());
        return this;
    }
}
