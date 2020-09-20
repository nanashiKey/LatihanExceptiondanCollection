package latihanexception;

public class ExceptionSamples {
    public static void main(String[] args) {
//        hitungNilai(10 , 0);
//        contohString("sample");
//        contohArray();
//        try {
//            classSample();
//        } catch (ClassNotFoundException e) {
//            System.out.println(e);
//        }finally {
//            hitungNilai(10, 2);
//        }
        contohLagi(2,1);
    }

    public static void hitungNilai(int a, int b){
        //sample arithmeticException
        try{
            int c = a/b;
            System.out.println("nilai a/b adalah "+c);
        }catch (ArithmeticException arithmetic){
            System.out.println("Errornya adalah "+arithmetic.getMessage());
        }finally {
            System.out.println("Hasilnya akan tetap di print");
        }
    }

    public static void contohString(String contoh){
        try{
            System.out.println(contoh.substring(0, 10));
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("Errornya adalah "+ex.getMessage());
        }finally {
            System.out.println("Hasilnya akan tetap di print");
        }
    }

    public static void contohArray(){
        int contohArray[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(contohArray[5]);
        }catch (ArrayIndexOutOfBoundsException x){
            System.out.println(x);

        }finally {
            System.out.println("Hasilnya akan tetap di print");
        }
    }

    public static void classSample() throws ClassNotFoundException {
            Class.forName("latihanexception.contohClass");
    }

    public static void contohLagi(int x, int b){
        int contohArray[] = {1, 2, 3, 4, 5};
        try{
            System.out.println(x/b);
            Class.forName("latihanexception.contohClass");

        }catch (ArithmeticException | ClassNotFoundException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("data akan tetap di print ");
            System.out.println(contohArray[4]);
            hitungNilai(10, 2);
        }
    }
}
