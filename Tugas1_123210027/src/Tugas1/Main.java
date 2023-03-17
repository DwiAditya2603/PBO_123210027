/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main{
    public static void main(String[] args) {
        int pilih;
        int ulang;
        int panjang,lebar,tinggi, jari;
        
        do{
        System.out.println("123210027");
        System.out.println("Menu");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("3. Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        pilih=input.nextInt();
        
        switch(pilih){
            case 1 -> {
               System.out.print("Masukkan panjang : "); 
               panjang=input.nextInt();
               System.out.print("Masukkan lebar   : "); 
               lebar=input.nextInt();
               System.out.print("Masukkan tinggi  : "); 
               tinggi=input.nextInt();
               Balok balok = new Balok (panjang, lebar, tinggi);
               balok.setTinggiBalok(tinggi);
               
                System.out.println("Luas persegi panjang     : " + balok.hitungLuas());
                System.out.println("Keliling persegi panjang : " + balok.hitungKeliling());
                System.out.println("Luas permukaan balok     : " + balok.hitungLuasPermukaan());
                System.out.println("Volume balok             : " + balok.hitungVolume());
            }
            case 2 -> {
          
               System.out.print("Masukkan jari-jari : "); 
               jari=input.nextInt();
               System.out.print("Masukkan tinggi    : "); 
               tinggi=input.nextInt();
               Tabung tabung = new Tabung (jari, tinggi);
               tabung.tinggiTabung(tinggi);
                System.out.println("Luas Lingkaran        : " + tabung.hitungLuas());
                System.out.println("Keliling Lingkaran    : " + tabung.hitungKeliling());
                System.out.println("Luas Permukaan Tabung : " + tabung.hitungLuasPermukaan());
                System.out.println("Volume Tabung         : " + tabung.hitungVolume());                
            }
            case 3 ->{
               System.exit(0);
            }
            default ->{
                System.out.println("Input yang anda massukan salah");
            }
        
            }
        
            System.out.print("Apakah ingin mengulang kembali ? (Yes = 1 | No = 0) : ");
            Scanner input2 = new Scanner(System.in);
            ulang=input2.nextInt();
            if(ulang==0){
            System.exit(0);
            }
        }while(ulang==1);
        }
      }

