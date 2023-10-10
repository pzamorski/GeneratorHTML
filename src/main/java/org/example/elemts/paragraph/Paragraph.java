package org.example.elemts.paragraph;

import org.example.elemts.button.Button;
import org.example.elemts.label.Label;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class Paragraph extends Element {
    public Paragraph(Element element) {
        super("p");
        appendChild(element);
    }

    public Paragraph(Element... element) {
        super("p");
        for (Element e : element) {
            appendChild(e);
        }
    }

    public Paragraph(String text) {
        super("p");
        text(text);
    }

    public static Paragraph get(Element... elements) {
        return new Paragraph(elements);
    }


    public static Node set(String text) {
        return new Paragraph(text);
    }
}
