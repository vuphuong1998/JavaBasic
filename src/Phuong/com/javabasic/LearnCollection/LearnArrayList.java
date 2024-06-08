package Phuong.com.javabasic.LearnCollection;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        //Thêm phần tử vào ArayList
        arrayList.add("aloha");
        arrayList.add("vớ vânr");
        arrayList.add("aloha");
        arrayList.add("alohi");

        //Duyệt ArrayList = dùng for cơ bản
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("aloha");
        arrayList2.add("alohi");

        //Add all ArrayList2 vào ArrayList1
        arrayList.addAll(arrayList2);
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
