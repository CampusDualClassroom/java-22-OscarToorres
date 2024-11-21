package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {

        List<String> stringList = new ArrayList<>();

        stringList.add("GKFFD");
        stringList.add("TNANA");
        stringList.add("MPMSL");
        stringList.add("PSWME");
        stringList.add("LZMLF");
        stringList.add("JYEBV");
        stringList.add("YELNT");
        stringList.add("JSNKR");
        stringList.add("JFESF");
        stringList.add("TMJLL");

        return stringList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String str : customList){
            System.out.println(str);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {

        boolean comprobacion = false;
        try {
            customList.add(element);
            comprobacion = true;
        } catch (Exception e){
        }

        return comprobacion;

    }

    public static void main(String[] args) {

    }


}
