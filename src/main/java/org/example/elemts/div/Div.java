package org.example.elemts.div;

import org.example.elemts.MyElemet;
import org.jsoup.nodes.Element;

import org.jsoup.nodes.Node;

public class Div extends MyElemet {
    public Div() {
        super("div");
    }

    public Div(String text) {
        super("div");
        text(text);
    }

    public static Div toDiv(Element[] elements) {
        return new Div().add(elements);
    }

    public Div add(Node... node) {
        for (Node nodeToAdd : node) {
            appendChild(nodeToAdd);
        }
        return this;
    }

}
