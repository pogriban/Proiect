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

/**
 *
 * @author ThinkPad
 */
public class Milioner {

    static int count = 0;
    static int nrIntr = 1;
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
    static Intrebari i10 = new Intrebari(10, "Care este cel mai populat oras din lume?\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "D");
    static Intrebari i11 = new Intrebari(11, "Ce tara este supranumita „Tara soarelui rasare”? \n", "A China ", "B Japonia ", "C Australia ", "D Molgolia", "B");
    static Intrebari i12 = new Intrebari(12, "Andorra se afla la granita caror state? \n", "A Franta Italia ", "B Franta Elvetia ", "C Franta Germania ", "D Franța și Spania", "D");
    static Intrebari i13 = new Intrebari(13, "Cati ani a condus Nicolae Ceausescu tara Romaneasca?  \n", "A 24 ", "B 18 ", "C 25 ", "D 30", "A");
    static Intrebari i14 = new Intrebari(14, "Care este cel mai lung fluviu din Europa? \n", "A Dunarea ", "B Volga ", "C Nistru ", "D Obi", "B");
    static Intrebari i15 = new Intrebari(15, "Cine este autorul operei „Flautul fermecat“? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "C");
    static Intrebari i16 = new Intrebari(16, "Care este capitala Luxemburgului? \n", "A Londra ", "B New York ", "C Budapesta ", "D Luxemburg", "D");
    static Intrebari i17 = new Intrebari(17, "Cine a scris „Traviata”? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "B");
    static Intrebari i18 = new Intrebari(18, "De cite ori a fost casatorita actrita Angelina Jolie?  \n", "A 1 ", "B 2 ", "C 3 ", "D 4", "C");
    static Intrebari i19 = new Intrebari(19, "Care este moneda oficiala a Bulgariei? \n", "A Leva ", "B Euro", "C USD ", "D Leu", "A");
    static Intrebari i20 = new Intrebari(20, "Ce tara din America de Sud are cea mai mare suprafata? \n", "A Rusia ", "B Brazilia", "C USA ", "D Franta", "B");
    static Intrebari i21 = new Intrebari(21, "Care este cea mai mare pasare care traieste pe Pamant? \n", "A Papagalul ", "B Corbul", "C Strutul ", "D Cocostircul", "C");
    static Intrebari i22 = new Intrebari(22, "Cine a inventat becul? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "D");
    static Intrebari i23 = new Intrebari(23, "Cite strofe are poezia „Luceafarul”, semnata de Mihai Eminescu? \n", "A 97 ", "B 98 ", "C 99 ", "D 96", "B");
    static Intrebari i24 = new Intrebari(24, "Cite continente exista pe Pamant? \n", "A 5 ", "B 6", "C 7", "D 8", "c");
    static Intrebari i25 = new Intrebari(25, "Cine este actrita cu cele mai multe premii Oscar? \n", "A Katharine Hepburn ", "B Kiele Sanchez ", "C Milla Jovovich ", "D Salma Hayek", "A");
    static Intrebari i26 = new Intrebari(26, "In ce an s-a scufundat Titanicul? \n", "A 1923 ", "B 1912 ", "C 1920 ", "D 1914", "B");
    static Intrebari i27 = new Intrebari(27, "Cati copii are Traian Basescu, fostul președinte al României?  \n", "A 1 ", "B 2 ", "C 3 ", "D 4", "B");
    static Intrebari i28 = new Intrebari(28, "In ce an s-a proclamat independenta de stat a Romaniei? \n", "A 1897 ", "B 1998 ", "C 1899 ", "D 1877", "D");
    static Intrebari i29 = new Intrebari(29, "Cine a scris romanul „Ion”?  \n", "A Mihai Eminescu ", "B Ion Creanga", "C Liviu Rebreanu ", "D Ion Druta", "C");
    static Intrebari i30 = new Intrebari(30, "Care este capitala Islandei? \n", "A Reykjavík ", "B Dubllin ", "C Londra ", "D Paris", "A");
    static Intrebari i31 = new Intrebari(31, "In ce an s-a nascut Regele Mihai I? \n", "A 1923 ", "B 1912 ", "C 1921 ", "D 1914", "C");
    static Intrebari i32 = new Intrebari(32, "Pe drapelul carei tari sta scris motto-ul “Ordine şi progres”? \n", "A Brazilia ", "B Argentina ", " Peru", "D Mexic", "A");
    static Intrebari i33 = new Intrebari(33, "Cine a exclamat „Evrika”? Arhimede \n", "A Socrate ", "B Arhimede ", "C Newton ", "D Pascal", "B");
    static Intrebari i34 = new Intrebari(34, "Din ce tara izvoraste Dunarea?  \n", "A Austria", "B Ungaria ", "C Germania ", "D Romania", "C");
    static Intrebari i35 = new Intrebari(35, "Cite state are Statele Unite ale Americii?  \n", "A 52 ", "B 51 ", "C 49 ", "D 50", "D");
    static Intrebari i36 = new Intrebari(36, "Care este orasul în care a murit sculptorul Constantin Brincusi? \n", "A Paris ", "B Bucuresti ", "C Viena ", "D Iasi", "A");
    static Intrebari i37 = new Intrebari(37, "In ce an a murit Printesa Diana?  \n", "A 1998 ", "B 1997 ", "C 1996 ", "D 1999", "B");
    static Intrebari i38 = new Intrebari(38, "In ce tara s-a nascut Adolf Hitler?  \n", "A Germania ", "B Ungaria ", "C Austria ", "D Cehia", "C");
    static Intrebari i39 = new Intrebari(39, "Care este cea mai mare tara din Europa?  \n", "A Ukraina ", "B Romania ", "C Germania ", "D Rusia", "D");

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int y = random.nextInt(6);
        Intrebari p;
        System.out.println();
        ArrayList<Intrebari> arL = new ArrayList<>();
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
        arL.add(i20);
        arL.add(i21);
        arL.add(i22);
        arL.add(i23);
        arL.add(i24);
        arL.add(i25);
        arL.add(i26);
        arL.add(i27);
        arL.add(i28);
        arL.add(i29);
        arL.add(i30);
        arL.add(i31);
        arL.add(i32);
        arL.add(i33);
        arL.add(i34);
        arL.add(i35);
        arL.add(i36);
        arL.add(i37);
        arL.add(i38);
        arL.add(i39);
        System.out.print("Introduceti numele: ");
        String name = sc.nextLine();
        System.out.println();
        afisIntrebare(i38);
        for (int i=0; i<9;i++) {
            p = randIntr(arL, random.nextInt(37), random.nextInt(35));
            System.out.println(name+" doriti sa mai incecati cu intrebarea nr (" + (i + 2) + "): Y/N");;
            char yesOrNot = sc.next().charAt(0);
            if (yesOrNot == 'Y' || yesOrNot == 'y') {
                if (afisIntrebare(p)) ;
                System.out.println("Pentru ajuor alegeti: \n"
        + "1 - 50/50 \n"
        + "2 - ajutorul spectatorilor \n"
        + "3 - Suna un prieten \n");
        char intrCorec = sc.next().charAt(0);
        if (intrCorec=='1') a50_50(p);
        if (intrCorec=='2') help(p);
        if (intrCorec=='3') a50_50(p);else {
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
    

    public static boolean afisIntrebare(Intrebari a) {
        boolean m;

        System.out.println(a.getId() + " " + a.getIntrebare() + a.getRasCorect() + a.getRaspuns2() + a.getRaspuns3() + a.getRaspuns4());
//        char toChoose =sc.nextLine().charAt(0);
//        switch (toChoose){
//            case ('1'):  a50_50(i1);
//            break; 
//            
//        }

        char intrCorec1 = sc.next().charAt(0);
        if (intrCorec1 == a.getCorect().toLowerCase().charAt(0) || intrCorec1 == a.getCorect().toUpperCase().charAt(0)) {
            count += 5;
            System.out.println("Corect aveti " + count + " $");
            //System.out.println("Corect ");

            m = true;
        } else {
            m = false;
        }
        return m;
    }

    public static Intrebari randIntr(ArrayList<Intrebari> arL, int rand1, int rand2) {
        for (Intrebari elem : arL) {
            if (elem.getId() == (rand1 + rand2) / 2) {
                System.out.println("rand= " + (rand1 + rand2) / 2);
                return elem;
            }

        }

        return i39;
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
            System.out.println(a.getId() + " " + a.getRaspuns2());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns3());
        }
        if (a.getCorect().charAt(0) == a.getRaspuns4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getRaspuns3());
        }

    }
}
