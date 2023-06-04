package teksayibul;

import java.util.Scanner;

public class TekSayiBul {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double toplam = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tek Sayı Bulma Programına Hoş Geldiniz...");
        
        boolean kontrol = true;
        while(kontrol){
            
            System.out.print("Lütfen Bir Sayı Girin : ");
            int sayi = scanner.nextInt();
            
            
            if(sayi % 2 == 1){
                System.out.println("Tek Sayı Bulundu : " + sayi);   
                break;
            }
            
            if(sayi % 2 == 0 || sayi % 4 == 0){
                toplam += (double)sayi;
                System.out.println("Çift veya Dördün Katı Olan Sayılar : " + sayi);
                System.out.println("Toplamları : " + toplam);
            }
       
        } 
            
    }
    
}