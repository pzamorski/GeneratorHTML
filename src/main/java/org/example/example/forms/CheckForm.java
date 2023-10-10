package org.example.example.forms;

import org.example.browser.OpenGeneratedHtmlInBrowser;
import org.example.dokument.MainForm;
import org.example.elemts.button.Button;
import org.example.elemts.form.Form;
import org.example.elemts.form.TypeMethod;
import org.example.elemts.image.Img;
import org.example.elemts.input.Input;
import org.example.elemts.input.InputType;
import org.example.elemts.paragraph.Paragraph;

public class CheckForm {


    public static void main(String[] args) {
        MainForm mainForm = new MainForm("Nowa Strona");
        mainForm.addStylesheet("styles.css");
        mainForm.outputSettings().prettyPrint(true);

        String[] sosy = {"Ostry", "Łagodny", "Mieszany", "Majonez"};
        String[] bulki = {"Jasna", "Ciemna"};
        String[] miesa = {"Dziczyzna", "Sarnina", "Kebs"};

        Form form = new Form("/SendForm", TypeMethod.GET, "send");
        form.add(Paragraph.set("Sosy: "));
        form.add(Input.create(InputType.CHECKBOX,sosy));
        form.add(Paragraph.set("Bulki: "));
        form.add(Input.create(InputType.CHECKBOX,bulki));
        form.add(Paragraph.set("Mieso: "));
        form.add(Input.create(InputType.CHECKBOX,miesa));
        form.add(Paragraph.set(""));
        form.add(new Button("Send"));

        form.add(new Img("TacoCloud.png"));

        mainForm.add(form);


        String html = mainForm.outerHtml();


        System.out.println(html);

        OpenGeneratedHtmlInBrowser.open(html);
    }
}
