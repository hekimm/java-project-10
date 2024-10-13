/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
       
        System.out.println("Bu sayının basamak  sayisini giriniz: ");
        int basamakSayisi = scanner.nextInt();
        int toplam =0;
        int geciciSayi = sayi;
        
        do{
            int basamakDegeri = geciciSayi%10;
            geciciSayi /= 10;
            toplam += Math.pow(basamakDegeri, basamakSayisi);
            
            
        }while(geciciSayi > 0);
        
        if(toplam == sayi){
            System.out.println("Bu bir Armstrong sayısıdır");
        }
        else{
            System.out.println("Bu bir Armstrong sayısı değildir");
        }



    }
    
}
