package Comportemental.TemplateMetod;

public class Client {
    public static void main(String args[]) {

        Document textDocument = new TextDocument();
        textDocument.processDocument();

        System.out.println ();

        Document spreadsheetDocument = new SpreadsheetDocument();
        spreadsheetDocument.processDocument();

    }
}
