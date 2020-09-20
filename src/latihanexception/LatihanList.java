package latihanexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LatihanList {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        list.add("Honda");
//        list.add("Toyota");
//        list.add("Mitsubishi");
//        list.add("Jeep");
//        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
//            String dataString = iterator.next();
//            System.out.println(dataString);
//        }
//        Iterator<String> iterator2 = list.iterator();
//        while (iterator2.hasNext()){
//            String dataString = iterator2.next();
//            System.out.println(dataString);
//        }
        /**
         * membuat list dengan object manusia
         */
        Manusia manusia1 = new Manusia();
        manusia1.nama = "Bambang";
        manusia1.berat = 70;
        manusia1.usia = 30;

        Manusia manusia2 = new Manusia();
        manusia2.nama = "Solihun";
        manusia2.usia = 25;
        manusia2.berat = 56;

        Manusia manusia3 = new Manusia();
        manusia3.nama = "Wahyudi";
        manusia3.berat = 60;
        manusia3.usia = 29;

        List<Manusia> manusiaList = new ArrayList<Manusia>();
        manusiaList.add(manusia1);
        manusiaList.add(manusia2);
        manusiaList.add(manusia3);

        for(int x = 0; x < manusiaList.size(); x++){
            Manusia manusia = manusiaList.get(x);
            System.out.println("Nama = "+manusia.nama
                    +"\nUsia = "+manusia.usia
                    +"\nBerat = "+manusia.berat+"kg");
        }
        System.out.println("manusia list memiliki panjang = "+manusiaList.size());
        manusiaList.remove(manusia2);
        System.out.println("manusia list memiliki panjang = "+manusiaList.size());
        for(int x = 0; x < manusiaList.size(); x++){
            Manusia manusia = manusiaList.get(x);
            System.out.println("Nama = "+manusia.nama
                    +"\nUsia = "+manusia.usia
                    +"\nBerat = "+manusia.berat+"kg");
        }
        manusiaList.clear();
    }
}
