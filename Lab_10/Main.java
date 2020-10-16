package Lab_10;


import java.util.ArrayList;

public class Main <T>{
    public static void main(String args[]){
        int[] k = {1,2,3,4,5,6,7} ;

        Integer[] i = {1,2,3,4,5,6,7} ;
        String[] s = {"abc","def","c","d","e"};

        ArrayList aL1 = Array.ConvertArrayToList(i);
        for(int j = 0; j<aL1.size(); j++)
            System.out.print(aL1.get(j));

        ArrayList aL2 = Array.ConvertArrayToList(s);
        for(int j = 0; j<aL2.size(); j++)
            System.out.print(aL2.get(j));

        Array<Integer> iA2 = new Array(i);
        System.out.println("\n"+iA2.get(2));

        Array.Filelist("/home/user/IdeaProjects/Labs/src/");

        Integer[] keys = {1,2,3,4};
        String[] values = {"1","2","3","4"};
        System.out.println(Solution.<Integer,String>newHashMap(keys,values));

    }
}
