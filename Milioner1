/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Milioner {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Introduceti numele: ");
        String name = sc.nextLine();
        System.out.println();
        for(;;){
            
        main1();
        
        System.out.println("Doriti sa mai incecati: Y/N ");
        
        while(sc.nextLine().toLowerCase().charAt(0) == 'Y' || sc.nextLine().charAt(0) == 'y') {
            main1();
        }  //char exit = sc.next().charAt(0);
        
            if((sc.nextLine().toLowerCase().charAt(0) == 'N' || sc.nextLine().charAt(0) == 'n'))break;{
            System.out.println("La revedere ");
        }}////
    }

    public static void main1() {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        Intrebari i1 = new Intrebari(1, "Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug\n", "A Molie ", "B Gindac de bucatarie ", "C Musca ", "D Gandac japonez");//corect Molie
        Intrebari i2 = new Intrebari(2, "Care dintre urmatorii oameni de stiinta nu are un element chimic care sa-i poarte numele?\n", "A Albert Einstein ", "B Niels Bohr ", "C Isaac Newton ", "D Enrico Fermi");//corect Niels Bohr
        Intrebari i3 = new Intrebari(3, "Care este capitala Republicii Moldova?'\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo");//corect Chisinau
        Intrebari i4 = new Intrebari(4, "Care dintre urmatoarele tari este complet inconjurata de o alta?\n", "A Burkina Faso ", "B Mongolia ", "C Lesotho ", "D Luxemburg");//corect Lesotho
        Intrebari i5 = new Intrebari(5, "Sub ce nume a ramas cunoscut eroul national al Spaniei, Rodrigo Díaz de Bivar?'\n", "A El Cano ", "B El Greco ", "C El Cid ", "D El Salvador");//corect El Cid
        Intrebari i6 = new Intrebari(6, "Daca ai fi Albert King, care ar fi profesia ta?'\n", "A Scriitor ", "B Jurnalist de televiziune ", "C Pilot de Formula 1 ", "D Muzician");//corect Muzician
        Intrebari i7 = new Intrebari(7, "In ce oras s-a nascut celebrul bluesman Alexis Korner?'\n", "A Londra ", "B New York ", "C Budapesta ", "D Paris");//corect Paris

        for (int i = 0; i < 7; i++) {
            afisIntrebare1(i1);
            System.out.println("Astept raspuns: ");
            char in = sc.next().charAt(0);
            if (in == i1.getRaspuns1().toLowerCase().charAt(0) || in == i1.getRaspuns1().toUpperCase().charAt(0)) {
                System.out.println("Corect ");
                count += 5;
            } else {
                System.out.println("Imi pare rau aici punem punct cu " + count + " $");
                break;
            }
            afisIntrebare1(i2);
            char in1 = sc.next().charAt(0);
            if (in1 == i1.getRaspuns3().toLowerCase().charAt(0)) {
                System.out.println("Corect ");
                count += 5;
            } else {
                System.out.println("Imi pare rau aici punem punct cu " + count + " $");
                break;
            }
            afisIntrebare1(i3);
            char in3 = sc.next().charAt(0);
            if (in3 == i1.getRaspuns1().toLowerCase().charAt(0)) {
                System.out.println("Corect ");
                count += 5;
            } else {
                System.out.println("Imi pare rau aici punem punct cu " + count + " $");
                break;
            }
            afisIntrebare1(i4);
            char in4 = sc.next().charAt(0);
            if (in4 == i1.getRaspuns1().toLowerCase().charAt(0)) {
                System.out.println("Corect ");
                count += 5;
            } else {
                System.out.println("Imi pare rau aici punem punct cu " + count + " $");
                break;
            }
            afisIntrebare1(i5);
            char in5 = sc.next().charAt(0);
            if (in5 == i5.getRaspuns1().toLowerCase().charAt(0)) {
                System.out.println("Corect ");
                count += 5;
            } else {
                System.out.println("Imi pare rau aici punem punct cu " + count + " $");
                break;
            }
            afisIntrebare1(i6);
            char in6 = sc.next().charAt(0);
            if (in6 == i1.getRaspuns1().toLowerCase().charAt(0)) {
                System.out.println("Corect ");
                count += 5;
            } else {
                System.out.println("Imi pare rau aici punem punct cu " + count + " $");
                break;
            }
            afisIntrebare1(i7);
            char in7 = sc.next().charAt(0);
            if (in7 == i1.getRaspuns1().toLowerCase().charAt(0)) {
                System.out.println("Corect ");
                count += 5;
            } else {
                System.out.println("Imi pare rau aici punem punct cu " + count + " $");
                break;
            }
        }

    }

    //public static void afisIntrebare(ArrayList<Intrebari> list) {
    //for (Intrebari elem : list) {
    //     System.out.println(elem.getIntrebare() + elem.getRaspuns1() + elem.getRaspuns2() + elem.getRaspuns3() + elem.getRaspuns4());
    //}
    //}
    public static void afisIntrebare1(Intrebari i1) {
        System.out.println(i1.getIntrebare() + i1.getRaspuns1() + i1.getRaspuns2() + i1.getRaspuns3() + i1.getRaspuns4());

    }

    public static void afisDoarIntrebare(Intrebari i1) {

        System.out.println(i1.getIntrebare());

    }
}
