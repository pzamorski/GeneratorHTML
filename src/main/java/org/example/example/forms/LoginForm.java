package org.example.example.forms;

import org.example.browser.OpenGeneratedHtmlInBrowser;
import org.example.dokument.MainForm;
import org.example.elemts.br.Br;
import org.example.elemts.button.Button;
import org.example.elemts.button.TypeButton;
import org.example.elemts.form.Form;
import org.example.elemts.form.TypeMethod;
import org.example.elemts.input.Input;
import org.example.elemts.input.InputType;
import org.example.elemts.label.Label;
import org.example.elemts.paragraph.Paragraph;

public class LoginForm {

    public static void main(String[] args) {


        MainForm mainForm = new MainForm("Logowanie");
        mainForm.addStylesheet("styles.css");
        Form formLogin = new Form("/Hello", TypeMethod.GET,"login");

        Input inputLogin = new Input(InputType.TEXT,"login");
        Label labelLogin = inputLogin.createLabel("Login: ");

        Input inputPassword = new Input(InputType.PASSWORD,"password");
        Label labelPassword = inputPassword.createLabel("Password: ");

        Button bubuttonSend = new Button("Login");
        bubuttonSend.setId("log");




        formLogin.add(
                Paragraph.set("Logowanie"),
                labelLogin,
                Br.add(),
                inputLogin,
                Br.add(),
                labelPassword,
                Br.add(),
                inputPassword,
                Br.add(),
                bubuttonSend);

        mainForm.add(formLogin);
        String html = mainForm.outerHtml();
        System.out.println(html);
        OpenGeneratedHtmlInBrowser.open(html);
    }


}
