/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simularejoc;

import java.util.ArrayList;

/**
 *
 * @author ThinkPad
 */
public class AllQuestion {

    protected int id;
    private String questoin;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correct;

    public AllQuestion(int id, String questoin, String answer1, String answer2, String answer3, String answer4, String correct) {
        this.id = id;
        this.questoin = questoin;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correct = correct;
    }

//     public public static AllAllQuestion t1 = new AllAllQuestion(1, "Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug\n", "A Molie ", "B Gindac de bucatarie ", "C Musca ", "D Gandac japonez", "A");//corect Molie
//     public public static AllAllQuestion t2 = new AllAllQuestion(2, "Care dintre urmatorii oameni de stiinta nu are un element chimic care sa-i poarte numele?\n", "A Albert Einstein ", "B Niels Bohr ", "C Isaac Newton ", "D Enrico Fermi", "C");//corect Niels Bohr
//     public public static AllAllQuestion t3 = new AllAllQuestion(3, "Care este capitala Republicii Moldova?'\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "A");//corect Chisinau
    public static AllQuestion t1 = new AllQuestion(1, "Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug\n", "A Molie ", "B Gindac de bucatarie ", "C Musca ", "D Gandac japonez", "A");//corect Molie
    public static AllQuestion t2 = new AllQuestion(2, "Care dintre urmatorii oameni de stiinta nu are un element chimic care sa-i poarte numele?\n", "A Albert Einstein ", "B Niels Bohr ", "C Isaac Newton ", "D Enrico Fermi", "C");//corect Niels Bohr
    public static AllQuestion t3 = new AllQuestion(3, "Care este capitala Republicii Moldova?'\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "A");//corect Chisinau
    public static AllQuestion t4 = new AllQuestion(4, "Care dintre urmatoarele tari este complet inconjurata de o alta?\n", "A Burkina Faso ", "B Mongolia ", "C Lesotho ", "D Luxemburg", "C");//corect Lesotho
    public static AllQuestion t5 = new AllQuestion(5, "Sub ce nume a ramas cunoscut eroul national al Spaniei, Rodrigo Díaz de Bivar?'\n", "A El Cano ", "B El Greco ", "C El Cid ", "D El Salvador", "C");//corect El Cid
    public static AllQuestion t6 = new AllQuestion(6, "Daca ai fi Albert King, care ar fi profesia ta?'\n", "A Scriitor ", "B Jurnalist de televiziune ", "C Pilot de Formula 1 ", "D Muzician", "D");//corect Muzician
    public static AllQuestion t7 = new AllQuestion(7, "In ce oras s-a nascut celebrul bluesman Alexis Korner?'\n", "A Londra ", "B New York ", "C Budapesta ", "D Paris", "D");//corect Paris
    public static AllQuestion t8 = new AllQuestion(8, "Ce planetă mai este cunoscută ca fiind denumită „Planeta Roşie”? \n", "A Pamint ", "B Marte ", "C Neptun ", "D Saturn", "B");
    public static AllQuestion t9 = new AllQuestion(9, "Cine este inventatorul rețelei de socializare Facebook?\n", "A Bill Gates ", "B Steve Jobs ", "C Mark Zuckerberg ", "D Ion Creanga", "C");
    public static AllQuestion t10 = new AllQuestion(10, "Care este cel mai populat oras din lume?\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "D");
    public static AllQuestion t11 = new AllQuestion(11, "Ce tara este supranumita „Tara soarelui rasare”? \n", "A China ", "B Japonia ", "C Australia ", "D Molgolia", "B");
    public static AllQuestion t12 = new AllQuestion(12, "Andorra se afla la granita caror state? \n", "A Franta Italia ", "B Franta Elvetia ", "C Franta Germania ", "D Franța și Spania", "D");
    public static AllQuestion t13 = new AllQuestion(13, "Cati ani a condus Nicolae Ceausescu tara Romaneasca?  \n", "A 24 ", "B 18 ", "C 25 ", "D 30", "A");
    public static AllQuestion t14 = new AllQuestion(14, "Care este cel mai lung fluviu din Europa? \n", "A Dunarea ", "B Volga ", "C Nistru ", "D Obi", "B");
    public static AllQuestion t15 = new AllQuestion(15, "Cine este autorul operei „Flautul fermecat“? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "C");
    public static AllQuestion t16 = new AllQuestion(16, "Care este capitala Luxemburgului? \n", "A Londra ", "B New York ", "C Budapesta ", "D Luxemburg", "D");
    public static AllQuestion t17 = new AllQuestion(17, "Cine a scris „Traviata”? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "B");
    public static AllQuestion t18 = new AllQuestion(18, "De cite ori a fost casatorita actrita Angelina Jolie?  \n", "A 1 ", "B 2 ", "C 3 ", "D 4", "C");
    public static AllQuestion t19 = new AllQuestion(19, "Care este moneda oficiala a Bulgariei? \n", "A Leva ", "B Euro", "C USD ", "D Leu", "A");
    public static AllQuestion t20 = new AllQuestion(20, "Ce tara din America de Sud are cea mai mare suprafata? \n", "A Rusia ", "B Brazilia", "C USA ", "D Franta", "B");
    public static AllQuestion t21 = new AllQuestion(21, "Care este cea mai mare pasare care traieste pe Pamant? \n", "A Papagalul ", "B Corbul", "C Strutul ", "D Cocostircul", "C");
    public static AllQuestion t22 = new AllQuestion(22, "Cine a inventat becul? \n", "A Doga ", "B Verdi ", "C Mozart ", "D Edison", "D");
    public static AllQuestion t23 = new AllQuestion(23, "Cite strofe are poezia „Luceafarul”, semnata de Mihai Eminescu? \n", "A 97 ", "B 98 ", "C 99 ", "D 96", "B");
    public static AllQuestion t24 = new AllQuestion(24, "Cite continente exista pe Pamant? \n", "A 5 ", "B 6", "C 7", "D 8", "c");
    public static AllQuestion t25 = new AllQuestion(25, "Cine este actrita cu cele mai multe premii Oscar? \n", "A Katharine Hepburn ", "B Kiele Sanchez ", "C Milla Jovovich ", "D Salma Hayek", "A");
    public static AllQuestion t26 = new AllQuestion(26, "In ce an s-a scufundat Titanicul? \n", "A 1923 ", "B 1912 ", "C 1920 ", "D 1914", "B");
    public static AllQuestion t27 = new AllQuestion(27, "Cati copii are Traian Basescu, fostul președinte al României?  \n", "A 1 ", "B 2 ", "C 3 ", "D 4", "B");
    public static AllQuestion t28 = new AllQuestion(28, "In ce an s-a proclamat independenta de stat a Romaniei? \n", "A 1897 ", "B 1998 ", "C 1899 ", "D 1877", "D");
    public static AllQuestion t29 = new AllQuestion(29, "Cine a scris romanul „Ion”?  \n", "A Mihai Eminescu ", "B Ion Creanga", "C Liviu Rebreanu ", "D Ion Druta", "C");
    public static AllQuestion t30 = new AllQuestion(30, "Care este capitala Islandei? \n", "A Reykjavík ", "B Dubllin ", "C Londra ", "D Paris", "A");
    public static AllQuestion t31 = new AllQuestion(31, "In ce an s-a nascut Regele Mihai I? \n", "A 1923 ", "B 1912 ", "C 1921 ", "D 1914", "C");
    public static AllQuestion t32 = new AllQuestion(32, "Pe drapelul carei tari sta scris motto-ul “Ordine şi progres”? \n", "A Brazilia ", "B Argentina ", " Peru", "D Mexic", "A");
    public static AllQuestion t33 = new AllQuestion(33, "Cine a exclamat „Evrika”? Arhimede \n", "A Socrate ", "B Arhimede ", "C Newton ", "D Pascal", "B");
    public static AllQuestion t34 = new AllQuestion(34, "Din ce tara izvoraste Dunarea?  \n", "A Austria", "B Ungaria ", "C Germania ", "D Romania", "C");
    public static AllQuestion t35 = new AllQuestion(35, "Cite state are Statele Unite ale Americii?  \n", "A 52 ", "B 51 ", "C 49 ", "D 50", "D");
    public static AllQuestion t36 = new AllQuestion(36, "Care este orasul în care a murit sculptorul Constantin Brincusi? \n", "A Paris ", "B Bucuresti ", "C Viena ", "D Iasi", "A");
    public static AllQuestion t37 = new AllQuestion(37, "In ce an a murit Printesa Diana?  \n", "A 1998 ", "B 1997 ", "C 1996 ", "D 1999", "B");
    public static AllQuestion t38 = new AllQuestion(38, "In ce tara s-a nascut Adolf Hitler?  \n", "A Germania ", "B Ungaria ", "C Austria ", "D Cehia", "C");
    public static AllQuestion t39 = new AllQuestion(39, "Care este cea mai mare tara din Europa?  \n", "A Ukraina ", "B Romania ", "C Germania ", "D Rusia", "D");

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestoin() {
        return questoin;
    }

    public void setQuestoin(String questoin) {
        this.questoin = questoin;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorect(String corect) {
        this.correct = corect;
    }

    public ArrayList add(AllQuestion t) {
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
        return allQ;
    }

}
