package day0319.list2;

import java.util.*;

public class ListArrayList {
    public static void main(String[] args) {
        ArrayList <String> listSon = new ArrayList<String>();

        listSon.add("농구");
        listSon.add("축구");
        listSon.add("야구");

        listSon.set(1,"공부");
        listSon.add(1,"코딩");
        System.out.println("배열의 크기 : " + listSon.size());
        System.out.println("배열의 내용 : " + listSon);
        System.out.println("배열의 0번값 : " + listSon.get(0));

        listSon.remove("코딩");

        for(int i = 1;i <3;i++) {
            System.out.println("index 1~2 의 내용 : " + listSon.get(i));
        }
    }
}