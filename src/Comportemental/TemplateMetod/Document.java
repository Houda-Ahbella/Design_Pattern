package Comportemental.TemplateMetod;

// Template modéle
public abstract class Document {
    // Template method
    public final void processDocument() {
        open();
        modify();
        save();
    }

    // Méthodes abstraites (étapes spécifiques à implémenter dans les sous-classes)
    abstract void open();
    abstract void modify();
    abstract void save();
}
