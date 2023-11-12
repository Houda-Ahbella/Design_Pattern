package Comportemental.TemplateMetod;

import Comportemental.TemplateMetod.Document;

public class SpreadsheetDocument extends Document {
    void open() {
        System.out.println("Opening Spreadsheet Document");
    }

    void modify() {
        System.out.println("Modifying Spreadsheet Document");
    }

    void save() {
        System.out.println("Saving Spreadsheet Document");
    }
}
