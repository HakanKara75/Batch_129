package main.batch_129.day18ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
//INTERWIEW

//Verilen bir Listteki elemanlari tekrasiz olarak yazdirma
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        List<Integer> yeniList = new ArrayList<>();//TEKRARSIZ liste icin yeni liste olustururuz.
        for (Integer w:a){
            if (!yeniList.contains(w)){
                yeniList.add(w);
            }
        }
        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 9, 11, 35] ==> 12, 11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(9);
        nums.add(11);

        Collections.sort(nums);

        int minDiff = nums.get(1) - nums.get(0);

        for(int i=1; i<nums.size(); i++){
            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);

        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }
        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
        //gosteren kodu yaziniz.
        //Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input= new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        System.out.println("c = " + c);//c = [A, K, R, S]
        String urun ="";

        do {
            System.out.println("Lutfen istediginiz urunun harfini giriniz");
            urun= input.next().substring(0,1);

            if(c.contains(urun)){
                c.set(c.indexOf(urun),"Ayrildi");

            }else if(!urun.equals("Q")){
                c.add(urun);
            }
            System.out.println(c);

        }while (!urun.equals("Q"));




    }
}
