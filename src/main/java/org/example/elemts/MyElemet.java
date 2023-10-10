package org.example.elemts;

import org.example.atributes.global.Atributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class MyElemet extends Element implements Atributes {

    public MyElemet(String tag) {
        super(tag);
    }

    public Element add(Node... node) {
        for (Node nodeToAdd : node) {
            appendChild(nodeToAdd);
        }
        return this;
    }

    public Element add(Node node) {
        appendChild(node);
        return this;
    }

    @Override
    public void setType(String type) {
        attr("type", type);
    }

    @Override
    public void setName(String name) {
        attr("name", name);
    }

    @Override
    public void setValue(String value) {
        attr("value", value);
    }

    @Override
    public void setId(String id) {
        attr("id", id);
    }

    @Override
    public void setClassAttribute(String classAttribute) {
        attr("classAttribute", classAttribute);
    }

    @Override
    public void setDisabled(boolean disabled) {
        attr("disabled", disabled);
    }

    @Override
    public void setAutofocus(boolean autofocus) {
        attr("autofocus", autofocus);
    }

    @Override
    public void setForm(String form) {
        attr("form", form);
    }
}
