package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

         /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz..");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenmi = (a + b > c && c > Math.abs(a - b)) &&  // a+b>c>|a-b|)
                          (a + c > b && b > Math.abs(a - c)) &&  // a+c>b>|a-c|
                          (b + c > a && a > Math.abs(b - c));    // b+c>a>|b-c|


        if (a<=0 || b<=0 || c<=0){
            System.out.println("gecerli kenar uzunlugu girin");
        }
       else if(ucgenmi){

            if (a==b && b==c ){
                System.out.println("eskanar ucgen");
            } else if (a==b || b==c || a==c) {
            }else {
                System.out.println("bu ikizkenar ucgen..");
            }//nested if
        }else {
            System.out.println("cesit kenar ucgen..");

        }

    }//main
}//class
