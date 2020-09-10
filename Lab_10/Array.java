package Lab_10;

import java.io.File;
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
        File f = new File(path);
        String[] fArray = null;
        if (f.exists()||f.isDirectory()) fArray = f.list(null);
        else System.out.print("Папка не найдена");
        ArrayList<String> list = new ArrayList(Arrays.asList(fArray));

        for (int i =0; i<list.size();i++) {
            if(i<5) System.out.println(list.get(i));
        }
    }
}