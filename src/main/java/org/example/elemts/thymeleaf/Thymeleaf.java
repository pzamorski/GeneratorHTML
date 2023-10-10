package org.example.elemts.thymeleaf;

import org.example.elemts.span.Span;
import org.example.elemts.list.Li;
import org.example.elemts.list.Ul;
import org.example.elemts.paragraph.Paragraph;
import org.example.elemts.table.*;
import org.jsoup.nodes.Element;

public class Thymeleaf {
    public static Element p(String message) {
        return new Paragraph().attr("th:text", "${" + message + "}");
    }

    public static Element table(String[] headres, String nameMessageFromServlet,String[] clasFields) {
        Table table = new Table();
        Thead thead = new Thead();


        int numCols = headres.length;
        Th[] th = new Th[numCols];
        String objectName = "object"+nameMessageFromServlet.replace("s","").toUpperCase();
        Tr tr = new Tr();
        tr.attr("th:each", objectName + ":${" + nameMessageFromServlet + "}");



        for (int i = 0; i < th.length; i++) {
            th[i] = new Th(headres[i]);
        }

        Td td[] = new Td[clasFields.length];

        for (int i = 0; i < td.length; i++) {
            td[i]=new Td();
            td[i].attr("th:text", "${" + objectName+"."+clasFields[i]+"}");
            td[i].attr("style", "border: 1px solid black;");
        }

        tr.add(td);
        table.add(thead.add(th).add(tr));
        return table;
    }

    public static Element list(String items){
        Ul ulThymelea = new Ul();
        Li li = new Li();
        String objectname=items+items.toUpperCase();
        li.attr("th:each",objectname+" : ${"+items+"}");
        li.add(new Span().attr("th:text","${"+objectname+"}"));
        ulThymelea.add(li);

        return ulThymelea;
    }

}
