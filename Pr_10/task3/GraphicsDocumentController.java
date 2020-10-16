package Pr_10.task3;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GraphicsDocumentController<T extends IDocument, F extends ICreateDocument> implements IController {
    String newfilename = "textfile.txt";
    T document;
    F factory;

    GraphicsDocumentController(T document, F factory) {
        this.document = document;
        this.factory = factory;
    }

    @Override
    public void onFileNewAction(IGraphics graphics) {
        document = (T) factory.createNew(newfilename);
        graphics.createTextSpace("");
    }

    @Override
    public void onFileOpenAction(IGraphics graphics) {
        document = (T) factory.createOpen(newfilename);
        try {
            String content = new String(Files.readAllBytes(Paths.get(newfilename)));
            graphics.createTextSpace(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFileSaveAction(IGraphics graphics, String text) {
        document.writeText(text);
        document.save();
        graphics.closeDocument();
    }

    @Override
    public void onFileExitAction(IGraphics graphics) {
        if(document != null) document.exit();
        graphics.exitProgram();

    }
}
