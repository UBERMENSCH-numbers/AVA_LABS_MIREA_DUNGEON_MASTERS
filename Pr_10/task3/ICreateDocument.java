package Pr_10.task3;

public interface ICreateDocument {
    IDocument createNew(String name);
    IDocument createOpen(String path);
}
