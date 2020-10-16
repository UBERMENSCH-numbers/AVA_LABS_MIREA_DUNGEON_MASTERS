package Pr_10.task3;

public class Main {
    public static void main (String[] args) {
        TextDocument textDocument = null;
        CreateTextDocument createTextDocument = new CreateTextDocument();
        IController graphicsController = new GraphicsDocumentController(textDocument, createTextDocument);
        Graphics graphics = new Graphics(graphicsController);
    }
}
