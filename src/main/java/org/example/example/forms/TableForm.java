package org.example.example.forms;

import org.example.browser.OpenGeneratedHtmlInBrowser;
import org.example.dokument.MainForm;
import org.example.elemts.table.Table;

public class TableForm {
    public static void main(String[] args) {

        MainForm mainForm = new MainForm("Thymeleaf");
        mainForm.addStylesheet("styles.css");


        Table table = new Table("Tabela danych:");
        table.addClass("table");
        table.setId("idTable");


        String[] headres = new String[]{"id", "name", "email"};
        String[][] data = new String[][]{{"3w24", "patryk", "p.za@o2.pl"},
                                         {"4543", "Kamil", "kamil@o2.pl"},
                                         {"35345", "Robert", "son@o2.pl"}};

        table.createTable(headres, data);


        mainForm.add(table);



        String html = mainForm.outerHtml();


        System.out.println(html);
        OpenGeneratedHtmlInBrowser.open(html);
    }
}
