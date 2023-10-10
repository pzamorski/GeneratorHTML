package org.example.example.forms;

import org.example.browser.OpenGeneratedHtmlInBrowser;
import org.example.dokument.MainForm;
import org.example.elemts.form.Form;
import org.example.elemts.form.TypeMethod;
import org.example.elemts.list.Li;
import org.example.elemts.list.Ul;
import org.example.elemts.paragraph.Paragraph;
import org.example.elemts.thymeleaf.Thymeleaf;

public class ListForm {

    public static void main(String[] args) {


        MainForm mainForm = new MainForm("Lista");
        mainForm.addStylesheet("styles.css");
        Form formList = new Form("/List", TypeMethod.GET,"lista");
        Ul ul = new Ul();

        ul.add(new Li("Jabłka"));
        ul.add(new Li("Marchewki"));
        ul.add(new Li("Pomidory"));
        ul.add(new Li("Banany"));




        formList.add(
                Paragraph.set("Lista"),
                ul,
                Paragraph.set("Thymelea"),
                Thymeleaf.list("Items")
                );

        mainForm.add(formList);
        String html = mainForm.outerHtml();
        System.out.println(html);
        OpenGeneratedHtmlInBrowser.open(html);
    }


}
