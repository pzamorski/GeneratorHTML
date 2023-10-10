package org.example.elemts.table;

import org.example.elemts.MyElemet;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;


public class Th extends MyElemet {
    public Th() {
        super("th");
        attr("style", "border: 1px solid black;");
    }

    public Th(String text) {
        super("th");
        attr("style", "border: 2px solid black;");
        text(text);
    }

    public static Th toDiv(Element[] elements) {
        return new Th().add(elements);
    }

    public Th add(Node... node) {
        for (Node nodeToAdd : node) {
            appendChild(nodeToAdd);

        }
        return this;
    }

}
