package org.example.browser;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OpenGeneratedHtmlInBrowser {
    public static void open(String htmlContent){

        try {
        // Tworzenie pliku HTML i zapisywanie w nim wygenerowanego HTML
        File htmlFile = new File("generated.html");
        FileWriter fileWriter = new FileWriter(htmlFile);
        fileWriter.write(htmlContent);
        fileWriter.close();

        // Otwieranie pliku HTML w przeglądarce
        Desktop desktop = Desktop.getDesktop();
        desktop.open(htmlFile);
    } catch (IOException e) {
        e.printStackTrace();
    }}

}
