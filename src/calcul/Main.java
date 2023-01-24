package calcul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            Operation op = new Operation();
            System.out.println("Bienvenue dans ma Calculatrice");
            System.out.println("Que voulez vous faire comme operation");
            System.out.println("1-Addition");
            System.out.println("2-Soustraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.println("5-Quitter de l'application");
            Scanner scanner = new Scanner(System.in);
            int choix = scanner.nextInt();
            if (choix == 1) {
                System.out.println("Veuillez saisir un entier ");
                Scanner scanner1 = new Scanner(System.in);
                float add = scanner1.nextFloat();
                System.out.println("Veuillez saisir un deuxieme entier ");
                Scanner clavier = new Scanner(System.in);
                float add1 = clavier.nextFloat();
                System.out.println("l'addition de : " + add + " " + " + " + add1 + " " + " = " + op.addition(add, add1));

            } else if (choix == 2) {
                System.out.println("Veuillez saisir un entier ");
                Scanner scanner1 = new Scanner(System.in);
                float add = scanner1.nextFloat();
                System.out.println("Veuillez saisir un deuxieme entier ");
                Scanner clavier = new Scanner(System.in);
                float add1 = clavier.nextFloat();
                System.out.println("la soustraction de : " + add + " " + " - " + add1 + " " + " = " + op.soustraction(add, add1));
            } else if (choix == 3) {
                System.out.println("Veuillez saisir un entier ");
                Scanner scanner1 = new Scanner(System.in);
                float add = scanner1.nextFloat();
                System.out.println("Veuillez saisir un deuxieme entier ");
                Scanner clavier = new Scanner(System.in);
                float add1 = clavier.nextFloat();
                System.out.println("la multiplication de : " + add + " " + " * " + add1 + " " + " = " + op.multiplication(add, add1));
            } else if (choix == 4) {
                System.out.println("Veuillez saisir un entier ");
                Scanner scanner1 = new Scanner(System.in);
                float add = scanner1.nextFloat();
                System.out.println("Veuillez saisir un deuxieme entier ");
                Scanner clavier = new Scanner(System.in);
                float add1 = clavier.nextFloat();
                if (add % 2 == 0)
                    System.out.println("la division de : " + add + " " + " / " + add1 + " " + " = " + op.division(add, add1));
                else
                    System.out.println("error");
            } else if (choix == 5) {
                System.exit(0);
            }
        }
    }
}

