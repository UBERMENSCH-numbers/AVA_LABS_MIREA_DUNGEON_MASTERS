package Pr_10.task3;

public interface IController {
    void onFileNewAction(IGraphics graphics);
    void onFileOpenAction(IGraphics graphics);
    void onFileSaveAction(IGraphics graphics, String text);
    void onFileExitAction(IGraphics graphics);
}
