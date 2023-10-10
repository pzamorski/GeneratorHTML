package org.example.elemts.table;

import org.example.elemts.MyElemet;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;


public class Thead extends MyElemet {
    public Thead() {
        super("thead");
    }


    public static Thead toDiv(Element[] elements) {
        return new Thead().add(elements);
    }

    public Thead add(Node... node) {
        for (Node nodeToAdd : node) {
            appendChild(nodeToAdd);

        }
        return this;
    }

}
