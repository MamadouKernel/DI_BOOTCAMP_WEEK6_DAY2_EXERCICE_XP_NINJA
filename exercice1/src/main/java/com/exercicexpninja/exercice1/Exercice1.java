/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpninja.exercice1;

import java.util.Scanner;

/**
 *
 * @author kernel-mk
 */
public class Exercice1 {
    
    public void WorkEfficiency(){
        
       // Initialisation du Scanner pour lire les entrées clavier
       
       Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the Time Taken by Worker: ");
        
        // Récupération du temps pris par le travailleur
        
        double timeTaken = input.nextDouble();

        // Vérification de l'efficacité du travailleur en fonction du temps qu'il a pris pour effectuer un travail
        if (timeTaken >= 2 && timeTaken <= 3) {
            
            System.out.println("Le travailleur est très efficace");
            
        } else if (timeTaken > 3 && timeTaken <= 4) {
            
            System.out.println("Le travailleur doit améliorer sa vitesse");
            
        } else if (timeTaken > 4 && timeTaken <= 5) {
            
            System.out.println("Le travailleur recevra une formation pour améliorer sa vitesse");
            
        } else if (timeTaken > 5) {
            
            System.out.println("Le travailleur doit quitter l’entreprise");
            
        } else {
            
            System.out.println("Entrée invalide");
        }
    }

    public static void main(String[] args) {
        Exercice1 work = new Exercice1();
        
        work.WorkEfficiency();
    }
}
