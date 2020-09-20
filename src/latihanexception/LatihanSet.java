package latihanexception;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LatihanSet {
    public static void main(String[] args) {
        Set<String> setdata = new HashSet<>();
        setdata.add("Kucing");
        setdata.add("Kuda");
        setdata.add("jerapah");
        setdata.add("gajah");
        setdata.add("kucing");

        Iterator<String> iterator = setdata.iterator();
        while (iterator.hasNext()){
            String dataString = iterator.next();
            System.out.println(dataString);
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

        Set<Manusia> manusiaSet = new HashSet<>();
        manusiaSet.add(manusia1);
        manusiaSet.add(manusia2);
        manusiaSet.add(manusia3);

        Iterator<Manusia> iterator2 = manusiaSet.iterator();
        while (iterator2.hasNext()){
            Manusia manusia = iterator2.next();
            System.out.println(manusia.nama);
        }
        System.out.println("panjang iterator2 adalah = "+manusiaSet.size());
        manusiaSet.remove(manusia2);
        System.out.println("panjang iterator2 adalah = "+manusiaSet.size());
        Iterator<Manusia> iterator3 = manusiaSet.iterator();
        while (iterator3.hasNext()){
            Manusia manusia = iterator3.next();
            System.out.println(manusia.nama);
        }
        manusiaSet.clear();
    }
}
