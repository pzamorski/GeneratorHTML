package org.example.example.forms;

import org.example.browser.OpenGeneratedHtmlInBrowser;
import org.example.dokument.MainForm;
import org.example.elemts.thymeleaf.Thymeleaf;
import org.example.elemts.thymeleaf.data.Car;
import org.example.elemts.thymeleaf.utilities.StructClass;
import org.example.elemts.thymeleaf.utilities.ThymeleafUtilities;

public class ThymeleaForm {
    public static void main(String[] args) {

        Car car = new Car("BMW","E38","Seba","Staszica 134");
        StructClass structClassCar = ThymeleafUtilities.structClass(Car.class);

        MainForm mainForm = new MainForm("Thymeleaf");
        mainForm.addStylesheet("styles.css");
        mainForm.thymeleaf();

        String[] headres = new String[]{"Marka", "Model","User","Adres"};
        String[] clasFields = structClassCar.getFields();

        mainForm.add(Thymeleaf.table(headres,"cars",clasFields));

        String html = mainForm.outerHtml();


        System.out.println(html);
        OpenGeneratedHtmlInBrowser.open(html);




    }
}
