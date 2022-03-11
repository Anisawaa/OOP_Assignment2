/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pboassignment2;

import java.util.Scanner;

/**
 *
 * @author Nisa
 */
public class Main {
    public static void main(String[] args) {
        int loop = 0;
        int length, width, height, menu;
        float radius;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            
            if (menu == 1) {
                System.out.print("Input Panjang : ");
                length = input.nextInt();
                System.out.print("Input Lebar: ");
                width = input.nextInt();
                System.out.print("Input Tinggi: ");
                height = input.nextInt();
                
                Balok beam = new Balok(length, width, height);
                
                System.out.println("Luas Persegi Panjang = " + beam.area());
                System.out.println("Keliling Persegi Panjang = " + beam.perimeter());
                System.out.println("Volume Balok = " + beam.volume());
                System.out.println("Luas Permukaan Balok = " + beam.surface());
                System.out.print("Ulangi? (Ya : 1 || Tidak : 0)");
                loop = input.nextInt();
            }
            
            else if (menu == 2) {
                System.out.print("Input Tinggi : ");
                height = input.nextInt();
                System.out.print("Input Jari - Jari : ");
                radius = input.nextInt();
                
                Tabung tube = new Tabung(radius, height);
                
                System.out.println("Luas Lingkaran = " + tube.area());
                System.out.println("Keliling Lingkaran = " + tube.perimeter());
                System.out.println("Volume Tabung = " + tube.volume());
                System.out.println("Luas Permukaan Tabung = " + tube.surface());
                System.out.print("Ulangi? (Ya : 1 || Tidak : 0)");
                loop = input.nextInt();
            }
        }
        while (loop == 1 && menu != 0);
    }
}
