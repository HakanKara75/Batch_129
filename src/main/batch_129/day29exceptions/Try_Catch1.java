package main.batch_129.day29exceptions;

public class Try_Catch1 { public static void main(String[] args) {


    try {
        int a[] = {7, 8, 9};
        for (int i = 1; i <= 3; i++) {
            System.out.println(a[i]);
        }
    } catch (Exception e) {
        System.out.println("Out of index");
    } finally {
        System.out.println("Done!");
    }
}//main
}//class