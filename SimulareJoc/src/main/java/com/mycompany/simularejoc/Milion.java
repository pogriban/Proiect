/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simularejoc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */

public class Milion extends AllQuestion{
    public Milion(int id, String questoin, String answer1, String answer2, String answer3, String answer4, String correct) {
        super(id, questoin, answer1, answer2, answer3, answer4, correct);
    }
static int r1, r2, r3, r4, max1=0;
static AllQuestion allQ;
    static int count = 0;
    static int nrIntr = 1;
    static Random random = new Random();
//    static Question i1 = new Question(1, "Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug\n", "A Molie ", "B Gindac de bucatarie ", "C Musca ", "D Gandac japonez", "A");//corect Molie
//    static Question i2 = new Question(2, "Care dintre urmatorii oameni de stiinta nu are un element chimic care sa-i poarte numele?\n", "A Albert Einstein ", "B Niels Bohr ", "C Isaac Newton ", "D Enrico Fermi", "C");//corect Niels Bohr
//    static Question i3 = new Question(3, "Care este capitala Republicii Moldova?'\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "A");//corect Chisinau
//    static Question i4 = new Question(4, "Care dintre urmatoarele tari este complet inconjurata de o alta?\n", "A Burkina Faso ", "B Mongolia ", "C Lesotho ", "D Luxemburg", "C");//corect Lesotho
//    static Question i5 = new Question(5, "Sub ce nume a ramas cunoscut eroul national al Spaniei, Rodrigo Díaz de Bivar?'\n", "A El Cano ", "B El Greco ", "C El Cid ", "D El Salvador", "C");//corect El Cid
//    static Question i6 = new Question(6, "Daca ai fi Albert King, care ar fi profesia ta?'\n", "A Scriitor ", "B Jurnalist de televiziune ", "C Pilot de Formula 1 ", "D Muzician", "D");//corect Muzician
//    static Question i7 = new Question(7, "In ce oras s-a nascut celebrul bluesman Alexis Korner?'\n", "A Londra ", "B New York ", "C Budapesta ", "D Paris", "D");//corect Paris
//    static Question i8 = new Question(8, "Ce planetă mai este cunoscută ca fiind denumită „Planeta Roşie”? \n", "A Pamint ", "B Marte ", "C Neptun ", "D Saturn", "B");
//    static Question i9 = new Question(9, "Cine este inventatorul rețelei de socializare Facebook?\n", "A Bill Gates ", "B Steve Jobs ", "C Mark Zuckerberg ", "D Ion Creanga", "C");
//    static Question i10 = new Question(10, "Care este cel mai populat oras din lume?\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "D");
//    static Question i11 = new Question(11, "Ce tara este supranumita „Tara soarelui rasare”? \n", "A China ", "B Japonia ", "C Australia ", "D Molgolia", "B");
//    static Question i12 = new Question(12, "Andorra se afla la granita caror state? \n", "A Franta Italia ", "B Franta Elvetia ", "C Franta Germania ", "D Franța și Spania", "D");
//    static Question i13 = new Question(13, "Cati ani a condus Nicolae Ceausescu tara Romaneasca?  \n", "A 24 ", "B 18 ", "C 25 ", "D 30", "A");
//    static Question i14 = new Question(14, "Care este cel mai lung fluviu din Europa? \n", "A Dunarea ", "B Volga ", "C Nistru ", "D Obi", "B");
//    static Question i15 = new Question(15, "Cine este autorul operei „Flautul fermecat“? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "C");
//    static Question i16 = new Question(16, "Care este capitala Luxemburgului? \n", "A Londra ", "B New York ", "C Budapesta ", "D Luxemburg", "D");
//    static Question i17 = new Question(17, "Cine a scris „Traviata”? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "B");
//    static Question i18 = new Question(18, "De cite ori a fost casatorita actrita Angelina Jolie?  \n", "A 1 ", "B 2 ", "C 3 ", "D 4", "C");
//    static Question i19 = new Question(19, "Care este moneda oficiala a Bulgariei? \n", "A Leva ", "B Euro", "C USD ", "D Leu", "A");
//    static Question i20 = new Question(20, "Ce tara din America de Sud are cea mai mare suprafata? \n", "A Rusia ", "B Brazilia", "C USA ", "D Franta", "B");
//    static Question i21 = new Question(21, "Care este cea mai mare pasare care traieste pe Pamant? \n", "A Papagalul ", "B Corbul", "C Strutul ", "D Cocostircul", "C");
//    static Question i22 = new Question(22, "Cine a inventat becul? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "D");
//    static Question i23 = new Question(23, "Cite strofe are poezia „Luceafarul”, semnata de Mihai Eminescu? \n", "A 97 ", "B 98 ", "C 99 ", "D 96", "B");
//    static Question i24 = new Question(24, "Cite continente exista pe Pamant? \n", "A 5 ", "B 6", "C 7", "D 8", "c");
//    static Question i25 = new Question(25, "Cine este actrita cu cele mai multe premii Oscar? \n", "A Katharine Hepburn ", "B Kiele Sanchez ", "C Milla Jovovich ", "D Salma Hayek", "A");
//    static Question i26 = new Question(26, "In ce an s-a scufundat Titanicul? \n", "A 1923 ", "B 1912 ", "C 1920 ", "D 1914", "B");
//    static Question i27 = new Question(27, "Cati copii are Traian Basescu, fostul președinte al României?  \n", "A 1 ", "B 2 ", "C 3 ", "D 4", "B");
//    static Question i28 = new Question(28, "In ce an s-a proclamat independenta de stat a Romaniei? \n", "A 1897 ", "B 1998 ", "C 1899 ", "D 1877", "D");
//    static Question i29 = new Question(29, "Cine a scris romanul „Ion”?  \n", "A Mihai Eminescu ", "B Ion Creanga", "C Liviu Rebreanu ", "D Ion Druta", "C");
//    static Question i30 = new Question(30, "Care este capitala Islandei? \n", "A Reykjavík ", "B Dubllin ", "C Londra ", "D Paris", "A");
//    static Question i31 = new Question(31, "In ce an s-a nascut Regele Mihai I? \n", "A 1923 ", "B 1912 ", "C 1921 ", "D 1914", "C");
//    static Question i32 = new Question(32, "Pe drapelul carei tari sta scris motto-ul “Ordine şi progres”? \n", "A Brazilia ", "B Argentina ", " Peru", "D Mexic", "A");
//    static Question i33 = new Question(33, "Cine a exclamat „Evrika”? Arhimede \n", "A Socrate ", "B Arhimede ", "C Newton ", "D Pascal", "B");
//    static Question i34 = new Question(34, "Din ce tara izvoraste Dunarea?  \n", "A Austria", "B Ungaria ", "C Germania ", "D Romania", "C");
//    static Question i35 = new Question(35, "Cite state are Statele Unite ale Americii?  \n", "A 52 ", "B 51 ", "C 49 ", "D 50", "D");
//    static Question i36 = new Question(36, "Care este orasul în care a murit sculptorul Constantin Brincusi? \n", "A Paris ", "B Bucuresti ", "C Viena ", "D Iasi", "A");
//    static Question i37 = new Question(37, "In ce an a murit Printesa Diana?  \n", "A 1998 ", "B 1997 ", "C 1996 ", "D 1999", "B");
//    static Question i38 = new Question(38, "In ce tara s-a nascut Adolf Hitler?  \n", "A Germania ", "B Ungaria ", "C Austria ", "D Cehia", "C");
//    static Question i39 = new Question(39, "Care este cea mai mare tara din Europa?  \n", "A Ukraina ", "B Romania ", "C Germania ", "D Rusia", "D");

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println();
        //TotalQuestion tot;
        System.out.println(t1.getAnswer1());
        int y = random.nextInt(6);
        AllQuestion p;
        System.out.println();
        ArrayList<AllQuestion> allQ = new ArrayList<>();
       allQ.add(t1);
        allQ.add(t2);
        allQ.add(t3);
        allQ.add(t4);
        allQ.add(t5);
        allQ.add(t6);
        allQ.add(t7);
        allQ.add(t8);
        allQ.add(t9);
        allQ.add(t10);
        allQ.add(t11);
        allQ.add(t12);
        allQ.add(t13);
        allQ.add(t14);
        allQ.add(t15);
        allQ.add(t16);
        allQ.add(t17);
        allQ.add(t18);
        allQ.add(t19);
        allQ.add(t20);
        allQ.add(t21);
        allQ.add(t22);
        allQ.add(t23);
        allQ.add(t24);
        allQ.add(t25);
        allQ.add(t26);
        allQ.add(t27);
        allQ.add(t28);
        allQ.add(t29);
        allQ.add(t30);
        allQ.add(t31);
        allQ.add(t32);
        allQ.add(t33);
        allQ.add(t34);
        allQ.add(t35);
        allQ.add(t36);
        allQ.add(t37);
        allQ.add(t38);
        allQ.add(t39);
        System.out.print("Introduceti numele: ");
        String name = sc.nextLine();
        System.out.println();
        afisIntrebare(t38);
        for (int i=0; i<9;i++) {
            p = randIntr(allQ, random.nextInt(37), random.nextInt(35));
            System.out.println(name+" doriti sa continuam cu intrebarea nr (" + (i + 2) + "): Y/N");;
            char yesOrNot = sc.next().charAt(0);
            if (yesOrNot == 'Y' || yesOrNot == 'y') {
                if (afisIntrebare(p)) ;
                else {
                    System.out.println("Imi pare rau! "+name+ " aici punem punct cu " + count+" $");
                    break;
                }
                
            }
            if (yesOrNot == 'N' || yesOrNot == 'n') {
                break;
            }
        }
        {
            System.out.println("La revedere ");
        }

    }
    

    public static boolean afisIntrebare(AllQuestion a) {
        boolean m;

        System.out.println(a.getId() + " " + a.getQuestoin() + a.getAnswer1() + a.getAnswer2() + a.getAnswer3() + a.getAnswer4());
//        char toChoose =sc.nextLine().charAt(0);
//        switch (toChoose){
//            case ('1'):  a50_50(i1);
//            break; 
//            
//        }

        char intrCorec1 = sc.next().charAt(0);
        if (intrCorec1 == a.getCorrect().toLowerCase().charAt(0) || intrCorec1 == a.getCorrect().toUpperCase().charAt(0)) {
            count += 5;
            System.out.println("Corect aveti " + count + " $");
            //System.out.println("Corect ");

            m = true;
        } else {
            m = false;
        }
        return m;
    }

    public static AllQuestion randIntr(ArrayList<AllQuestion> arL, int rand1, int rand2) {
        for (AllQuestion elem : arL) {
            if (elem.getId() == (rand1 + rand2) / 2) {
                
                return elem;
            }

        }

        return t39;
    }

    public static void a50_50(AllQuestion a) {
        do{
  
   r1=((int)( Math.random()*100) );
  r2=((int)(Math.random()*100)) ;
  r3=((int)(Math.random()*100)) ;
r4=(int)(Math.random()*10) ;
}
   while(  (r1+r2+r3+r4)!=100) ;
   if (r1>r2) max1=r1;
   else max1=r2;
   if(max1>r3) max1=max1;
   else max1=r3;
   if(max1>r4) max1=max1;
   else max1 =r4;


        //System.out.println(a.getId() + " "  + (a.getRasCorect()) + a.getRaspuns2() + a.getRaspuns3() + a.getRaspuns4());
        //char intrCorec = sc.next().charAt(0);
        if (a.getCorrect().charAt(0) == a.getAnswer1().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer1() + a.getAnswer3());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer2().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer2() + a.getAnswer4());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer1() + a.getAnswer3());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer1() + a.getAnswer4());
        }

    }

    public static void help(AllQuestion a) {
        
        
        //System.out.println(a.getId() + " "  + (a.getRasCorect()) + a.getRaspuns2() + a.getRaspuns3() + a.getRaspuns4());
        //char intrCorec = sc.next().charAt(0);
        if (a.getCorrect().charAt(0) == a.getAnswer1().charAt(0)) {
            System.out.println(" " + a.getAnswer1() + (Math.random() * 95) + a.getAnswer2() + (random.nextInt(78)) + a.getAnswer3() + (Math.random() * 77) + a.getAnswer4() + (Math.random() * 23));
        }
        if (a.getCorrect().charAt(0) == a.getAnswer2().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer2() + a.getAnswer4());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer3() + a.getAnswer1());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer3() + a.getAnswer4());
        }

    }

    public static void phoneFriend(AllQuestion a) {

        if (a.getCorrect().charAt(0) == a.getAnswer1().charAt(0)) {
            System.out.println(" " + a.getAnswer1());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer2().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer2());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer3());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer4());
        }

    }

    
}

    
