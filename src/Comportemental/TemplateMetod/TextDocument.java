package Comportemental.TemplateMetod;

import Comportemental.TemplateMetod.Document;

public class TextDocument extends Document {

    void open() {
        System.out.println("Opening Text Document");
    }

    void modify() {
        System.out.println("Modifying Text Document");
    }

    void save() {
        System.out.println("Saving Text Document");
    }
}
