/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import pogriban.lucrareindividuala.Raspuns;
import pogriban.lucrareindividuala.TotalIntrebari;

/**
 *
 * @author ThinkPad
 */
public class Milioner {
static TotalIntrebari total=new TotalIntrebari();
    static Random random = new Random();
    static Intrebari i1 = new Intrebari(1, "Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug\n", "A Molie ", "B Gindac de bucatarie ", "C Musca ", "D Gandac japonez", "A");//corect Molie
    static Intrebari i2 = new Intrebari(2, "Care dintre urmatorii oameni de stiinta nu are un element chimic care sa-i poarte numele?\n", "A Albert Einstein ", "B Niels Bohr ", "C Isaac Newton ", "D Enrico Fermi", "C");//corect Niels Bohr
    static Intrebari i3 = new Intrebari(3, "Care este capitala Republicii Moldova?'\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "A");//corect Chisinau
    static Intrebari i4 = new Intrebari(4, "Care dintre urmatoarele tari este complet inconjurata de o alta?\n", "A Burkina Faso ", "B Mongolia ", "C Lesotho ", "D Luxemburg", "C");//corect Lesotho
    static Intrebari i5 = new Intrebari(5, "Sub ce nume a ramas cunoscut eroul national al Spaniei, Rodrigo Díaz de Bivar?'\n", "A El Cano ", "B El Greco ", "C El Cid ", "D El Salvador", "C");//corect El Cid
    static Intrebari i6 = new Intrebari(6, "Daca ai fi Albert King, care ar fi profesia ta?'\n", "A Scriitor ", "B Jurnalist de televiziune ", "C Pilot de Formula 1 ", "D Muzician", "D");//corect Muzician
    static Intrebari i7 = new Intrebari(7, "In ce oras s-a nascut celebrul bluesman Alexis Korner?'\n", "A Londra ", "B New York ", "C Budapesta ", "D Paris", "D");//corect Paris
    static Intrebari i8 = new Intrebari(8, "Ce planetă mai este cunoscută ca fiind denumită „Planeta Roşie”? \n", "A Pamint ", "B Marte ", "C Neptun ", "D Saturn", "B");
    static Intrebari i9 = new Intrebari(9, "Cine este inventatorul rețelei de socializare Facebook?\n", "A Bill Gates ", "B Steve Jobs ", "C Mark Zuckerberg ", "D Ion Creanga", "C");
    static Intrebari i10 = new Intrebari(10, "Care este cel mai populat oraș din lume?\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "D");
    static Intrebari i11 = new Intrebari(11, "Ce țară este supranumită „Țara soarelui răsare”? \n", "A China ", "B Japonia ", "C Australia ", "D Molgolia", "B");
    static Intrebari i12 = new Intrebari(12, "Andorra se află la granița căror state? \n", "A Franta Italia ", "B Franta Elvetia ", "C Franta Germania ", "D Franța și Spania", "D");
    static Intrebari i13 = new Intrebari(13, "Câți ani a condus Nicolae Ceaușescu țara Romaneasca?  \n", "A 24 ", "B 18 ", "C 25 ", "D 30", "A");
    static Intrebari i14 = new Intrebari(13, "Care este cel mai lung fluviu din Europa? \n", "A Dunarea ", "B Volga ", "C Nistru ", "D Obi", "B");
    static Intrebari i15 = new Intrebari(13, "Cine este autorul operei „Flautul fermecat“? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "C");
    static Intrebari i16 = new Intrebari(13, "Care este capitala Luxemburgului? \n", "A Londra ", "B New York ", "C Budapesta ", "D Luxemburg", "D");
    static Intrebari i17 = new Intrebari(13, "Cine a scris „Traviata”? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison",  "B");
    static Intrebari i18 = new Intrebari(13, "De câte ori a fost căsătorită actrița Angelina Jolie?  \n", "A 1 ", "B 2 ", "C 3 ", "D 4",  "C");
    static Intrebari i19 = new Intrebari(13, "Care este moneda oficială a Bulgariei? \n", "A Leva ", "B Euro", "C USD ", "D Leu",  "A");
    
    public static Scanner sc = new Scanner(System.in);
TotalIntrebari m= new TotalIntrebari();
    
    public static void main(String args[]) {
        
        int y = random.nextInt(6);
        Intrebari p;
        System.out.println();
        ArrayList<Intrebari> arL = new ArrayList<Intrebari>();
        arL.add(i1);
        arL.add(i2);
        arL.add(i3);
        arL.add(i4);
        arL.add(i5);
        arL.add(i6);
        arL.add(i7);
        arL.add(i8);
        arL.add(i9);
        arL.add(i10);
        arL.add(i11);
        arL.add(i12);
        arL.add(i13);
        arL.add(i14);
        arL.add(i15);
        arL.add(i16);
        arL.add(i17);
        arL.add(i18);
        arL.add(i19);
        //arL.add();
        int count = 0;
        
        System.out.print("Introduceti numele: ");
        String name = sc.nextLine();
        System.out.println();
        for (;;) {
            p = randIntr(arL, random.nextInt(19), random.nextInt(19));
            //afisIntrebare(p);
            int nrIntr=0;
            
            System.out.println("Doriti sa mai incecati: Y/N ("+nrIntr+")");
            
            char yesOrNot = sc.next().charAt(0);
            if (yesOrNot == 'Y' || yesOrNot == 'y') {
                if (afisIntrebare(p)) nrIntr++; else {
                    System.out.println("Imi pare rau aici punem punct cu " + count);
                    break;
                }
                count += 5;
                System.out.println(" aveti " + count + " $");

            }
            if (yesOrNot == 'N' || yesOrNot == 'n') {
                break;
            }

        }
        {
            System.out.println("La revedere ");
        }

    }

       public static boolean afisIntrebare(Intrebari a) {
        boolean m;
           
        System.out.println(a.getId() + " " + a.getIntrebare() + a.getRasCorect() + a.getRaspuns2() + a.getRaspuns3() + a.getRaspuns4());
        char intrCorec = sc.next().charAt(0);
        if (intrCorec == a.getCorect().toLowerCase().charAt(0) || intrCorec == a.getCorect().toUpperCase().charAt(0)) {
            System.out.println("Corect ");
            m = true;
        } else {
            m = false;
        }
        return m;
    }

    public static Intrebari randIntr(ArrayList<Intrebari> arL, int rand1, int rand2) {
        for (Intrebari elem : arL) {
            if (elem.getId() == (rand1+rand2)/2) {
System.out.println("rand= "+(rand1+rand2)/2);
                return elem;
            }

        }
        
        return i1;
    }

    public static void a50_50(Intrebari a) {

        //System.out.println(a.getId() + " "  + (a.getRasCorect()) + a.getRaspuns2() + a.getRaspuns3() + a.getRaspuns4());
        //char intrCorec = sc.next().charAt(0);
        if (a.getCorect().charAt(0) == a.getRasCorect().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRasCorect() + a.getRaspuns3());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns2().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns2() + a.getRaspuns4());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRasCorect() + a.getRaspuns3());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRasCorect() + a.getRaspuns4());
        }

    }

    public static void help(Intrebari a) {

        int f = 100 - random.nextInt(45);
        int f1 = f - random.nextInt(34);
        int f2 = f1 - random.nextInt(21);
        int f3 = f2 - random.nextInt(11);
        //System.out.println(a.getId() + " "  + (a.getRasCorect()) + a.getRaspuns2() + a.getRaspuns3() + a.getRaspuns4());
        //char intrCorec = sc.next().charAt(0);
        if (a.getCorect().charAt(0) == a.getRasCorect().charAt(0)) {
            System.out.println(" " + a.getRasCorect() + (Math.random() * 95) + a.getRaspuns2() + (random.nextInt(78)) + a.getRaspuns3() + (Math.random() * 77) + a.getRaspuns4() + (Math.random() * 23));
        }
        if (a.getCorect().charAt(0) == a.getRaspuns2().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns2() + a.getRaspuns4());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns3() + a.getRasCorect());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns3() + a.getRaspuns4());
        }

    }
    public static void phoneFriend(Intrebari a) {

        
        if (a.getCorect().charAt(0) == a.getRasCorect().charAt(0)) {
            System.out.println(" " + a.getRasCorect());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns2().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns2() );
        }
        if (a.getCorect().charAt(0) == a.getRaspuns3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns3());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns3() );
        }

    }
}
