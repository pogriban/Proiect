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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nString nextQuestion=sc.nextLine();
        Intrebari i1 = new Intrebari("1 Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug'\n", "A Molie", "B Gândac de bucătărie", "C Muscă", "D Gândac japonez");//corect Molie
        Intrebari i2 = new Intrebari("2 Care dintre următorii oameni de știință nu are un element chimic care să-i poarte numele?'\n", "A Albert Einstein", "B Niels Bohr", "C Isaac Newton", "D Enrico Fermi");//corect Niels Bohr
        Intrebari i3 = new Intrebari("3 Care este capitala Republicii Moldova?'\n", "A Chisinau", "B Balti", "C Paris", "D Tokyo");//corect Chisinau
        Intrebari i4 = new Intrebari("4 Care dintre următoarele țări este complet înconjurată de o alta?'\n", "A Burkina Faso", "B Mongolia", "C Lesotho", "D Luxemburg");//corect Lesotho
        Intrebari i5 = new Intrebari("5 Sub ce nume a rămas cunoscut eroul național al Spaniei, Rodrigo Díaz de Bivar?'\n", "A El Cano", "B El Greco", "C El Cid", "D El Salvador");//corect El Cid
        Intrebari i6 = new Intrebari("6 Dacă ai fi Albert King, care ar fi profesia ta?'\n", "A Scriitor", "B Jurnalist de televiziune", "C Pilot de Formula 1", "D Muzician");//corect Muzician
        Intrebari i7 = new Intrebari("7 În ce oraș s-a născut celebrul bluesman Alexis Korner?'\n", "A Londra", "B New York", "C Budapesta", "D Paris");//corect Paris
        ArrayList<Intrebari> list = new ArrayList<>();
        list.addAll(Arrays.asList(i1, i2, i3, i4, i5, i6, i7));
        // System.out.println(list);
        //for (Intrebari elem : list) {
        //  System.out.println(elem.getIntrebare()+elem.getRaspuns1()+elem.getRaspuns2()+elem.getRaspuns3()+elem.getRaspuns4());

        //afisIntrebare(list);
        for (int i=0; i <7;i++){
            String nextQuestion=sc.nextLine();
            if("n"==nextQuestion){
        afisIntrebare1(i1);
        afisIntrebare1(i2);
        afisIntrebare1(i3);
        afisIntrebare1(i4);
        afisIntrebare1(i5);
        afisIntrebare1(i6);
        afisIntrebare1(i7);}
        }
        afisDoarIntrebare(i1);
        
        
    }

    
    public static void afisIntrebare(ArrayList<Intrebari> list) {
        for (Intrebari elem : list) {
            System.out.println(elem.getIntrebare() + elem.getRaspuns1() + elem.getRaspuns2() + elem.getRaspuns3() + elem.getRaspuns4());
        }
    }

    public static void afisIntrebare1(Intrebari i1) {
        System.out.println(i1.getIntrebare() + i1.getRaspuns1() + i1.getRaspuns2() + i1.getRaspuns3() + i1.getRaspuns4());

    }
    public static void afisDoarIntrebare(Intrebari i1) {
        System.out.println(i1.getIntrebare());

    }
   
}
