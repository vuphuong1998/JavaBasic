package Phuong.com.javabasic.LearnCollection;

import java.util.*;

public class KhaiBao_SuDung {
    public static void main(String[] args) {

        //ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Selenium");
        arrayList.add("hihi");
        arrayList.add("hoho");
        arrayList.add("Selenium");

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Set
        Set<String> StringList = new HashSet<String>();
        StringList.add("Selenium");
        StringList.add("HiHi");
        StringList.add("Selenium");

        for (String str : StringList) {
            System.out.println(str);
        }

        //Map
        Map<String, String> StringMap = new HashMap<>();
        StringMap.put("company", "CMC global");
        StringMap.put("address", "HaNoi");

        System.out.println(StringMap.get("company"));
    }
}
