package org.example;

import java.util.Scanner;

// Klavyeden rastgele büyüklükte harfle girilen kelimenin harflerinin tersini alarak ( büyükse küçük, küçükse büyük yaparak) yeniden
// yazdıran program.
// Örn.
public class Main {
    public static void main(String[] args) {
        int i;
        String k;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");
        k = scanner.nextLine();

        for (i=0; i<k.length(); i++){
           if ((k.charAt(i)>65) && (k.charAt(i)<=90))
            System.out.print((char)(k.charAt(i)+32));
            else System.out.print((char)(k.charAt(i)-32));
        }
    }
}