package org.example.elemts.br;

import org.example.elemts.MyElemet;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class Br extends MyElemet {

    public Br() {
        super("br");
    }

    public static Node add() {
        return new Br();
    }
}
