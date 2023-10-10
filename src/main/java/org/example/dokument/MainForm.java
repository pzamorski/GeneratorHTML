package org.example.dokument;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class MainForm extends Document {


    Element styleTag = new Element("style");

    public MainForm(String title) {
        super("");
        title(title);
    }

    public void add(Node... node) {
        for (Node nodeToAdd : node) {
            body().appendChild(nodeToAdd);
        }
    }

    public void add(Node node) {
        body().appendChild(node);

    }

    public void thymeleaf(){
        select("html").first()
                .attr("lang", "en")
                .attr("xmlns:th", "http://www.thymeleaf.org");
    }

    public void addStylesheet(String stylesheetLink) {
        Element linkElement = new Element("link");
        linkElement.attr("rel", "stylesheet");
        linkElement.attr("href", stylesheetLink);
        head().appendChild(linkElement);
    }

}
