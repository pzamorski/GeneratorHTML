package org.example.example.forms;

import org.example.browser.OpenGeneratedHtmlInBrowser;
import org.example.dokument.MainForm;
import org.example.elemts.button.Button;
import org.example.elemts.button.TypeButton;
import org.example.elemts.div.Div;
import org.example.elemts.form.Form;
import org.example.elemts.form.TypeMethod;
import org.example.elemts.input.Input;
import org.example.elemts.input.InputType;
import org.example.elemts.label.Label;
import org.example.elemts.thymeleaf.data.Employee;
import org.example.elemts.thymeleaf.utilities.StructClass;
import org.example.elemts.thymeleaf.utilities.ThymeleafUtilities;

public class InputForm {

    public static void main(String[] args) {


        MainForm mainForm = new MainForm("Car");
        mainForm.addStylesheet("styles.css");
        Form postForm = new Form("/newCar", TypeMethod.GET,"employer");



        StructClass structClassCar = ThymeleafUtilities.structClass(Employee.class);
        
        String[] fields = structClassCar.getFields();
        Class<?>[] type = structClassCar.getType();
        Input[] inputs=new Input[fields.length];
        Label[] labels=new Label[fields.length];

        for (int i = 0; i < fields.length; i++) {
            inputs[i]=new Input(InputType.TEXT,"in_"+fields[i]);
            labels[i]=inputs[i].createLabel(fields[i].toUpperCase()+": \n");

            Div div = new Div().add(labels[i], inputs[i]);
            postForm.add(div);

        }


        Button bubuttonSend = new Button("SEND");
        bubuttonSend.setType(TypeButton.SUBMIT);
        bubuttonSend.setId("submit-from-"+postForm.className());




        postForm.add(bubuttonSend);

        mainForm.add(postForm);
        mainForm.addStylesheet("styles.css");
        String html = mainForm.outerHtml();


        System.out.println(html);
        OpenGeneratedHtmlInBrowser.open(html);
    }


}
