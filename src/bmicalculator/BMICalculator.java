/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author riofe
 */
public class BMICalculator {
    public static void main(String[] args) {
        // Input berat dan tinggi dari pengguna (dalam kilogram dan meter)
        double berat = 80;
        double tinggi = 1.68;

        // Menghitung BMI
        double bmi = berat / (tinggi * tinggi);

        // Menampilkan hasil menggunakan ekspresi kondisional
        String status = (bmi < 18.5) ? "Berat Rendah" :
                        (bmi < 24.9) ? "Berat Ideal" :
                        (bmi < 29.9) ? "Berat Belebih" : "Obesitas";
        
        System.out.println("\tBMI Calculator");
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + status);
    }
}
