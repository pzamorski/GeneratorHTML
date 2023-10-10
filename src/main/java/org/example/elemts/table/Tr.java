package org.example.elemts.table;

import org.example.elemts.MyElemet;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;


public class Tr extends MyElemet {
    public Tr() {
        super("tr");
    }

    public Tr(String text) {
        super("tr");
        text(text);
    }

    public static Tr toDiv(Element[] elements) {
        return new Tr().add(elements);
    }

    public Tr add(Node... node) {
        for (Node nodeToAdd : node) {
            appendChild(nodeToAdd);

        }
        return this;
    }

}
