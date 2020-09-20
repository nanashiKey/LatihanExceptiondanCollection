package latihanexception;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LatihanMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(0, "Mobil");
        map.put(1, "Motor");
        map.put(4, "Motor");
        map.put(5, "Pesawat");
        map.put(3, "Sepeda");

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

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

        Map<Integer, Manusia> manusiaMap = new HashMap<>();
        manusiaMap.put(10, manusia1);
        manusiaMap.put(11, manusia2);
        manusiaMap.put(12, manusia3);

        for(Map.Entry entry :manusiaMap.entrySet()){
            Manusia manusia = (Manusia) entry.getValue();
            System.out.println(entry.getKey() +" , memiliki nama : "+manusia.nama);
        }
        System.out.println("manusiamap memiliki panjang : "+manusiaMap.size());
        manusiaMap.remove(10);
        manusiaMap.clear();
        System.out.println("manusiamap memiliki panjang : "+manusiaMap.size());
//        for(Map.Entry entry :manusiaMap.entrySet()){
//            Manusia manusia = (Manusia) entry.getValue();
//            System.out.println(entry.getKey() +" , memiliki nama : "+manusia.nama);
//        }
    }
}
