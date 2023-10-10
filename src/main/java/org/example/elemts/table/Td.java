package org.example.elemts.table;

import org.example.elemts.MyElemet;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;


public class Td extends MyElemet {
    public Td() {
        super("td");
    }

    public Td(String text) {
        super("td");
        attr("style", "border: 1px solid black;");
        text(text);
    }

    public static Element toDiv(Element[] elements) {
        return new Td().add(elements);
    }


    public Td add(Node... node) {
        for (Node nodeToAdd : node) {
            appendChild(nodeToAdd);

        }
        return this;
    }

}
