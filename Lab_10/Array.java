package Lab_10;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

/* Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
 *  Реализовать метод, который возвращает любой элемент массива по индексу.
 * */

class Array <T>{
    public Array (T[] t){
        this.aL = new ArrayList<T>();
        for(T i: t) aL.add(i);
    }

    public T get(int index){
        return this.aL.get(index);
    }


    private ArrayList<T> aL;

    /* Написать метод для конвертации массива строк/чисел в список.
     * */
    public static <T> ArrayList<T> ConvertArrayToList(T[] a){
        ArrayList<T> temp = new ArrayList<T>();
        for(T t:a)
            temp.add(t);
        return temp;

    }

    /* Написать ф-ю, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.
     * */

    public static void Filelist(String path){
        Path dir = FileSystems.getDefault().getPath(path);
        DirectoryStream<Path> stream = null;
        try {
            stream = Files.newDirectoryStream( dir );
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Object> aL = new ArrayList<>();
        for (Path path_ : stream) {
            aL.add(path_.getFileName());
        }
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i ++) System.out.println(aL.get(i));
    }
}