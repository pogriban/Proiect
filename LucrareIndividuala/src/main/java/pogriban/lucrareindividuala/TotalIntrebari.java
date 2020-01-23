/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.lucrareindividuala;

//import Intrebari;

//import Intrebari;
import java.util.ArrayList;


/**
 *
 * @author ThinkPad
 */
public class TotalIntrebari {
   public static Intrebari i1 = new Intrebari(1, "Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug\n", "A Molie ", "B Gindac de bucatarie ", "C Musca ", "D Gandac japonez", "A");//corect Molie
    public static Intrebari i2 = new Intrebari(2, "Care dintre urmatorii oameni de stiinta nu are un element chimic care sa-i poarte numele?\n", "A Albert Einstein ", "B Niels Bohr ", "C Isaac Newton ", "D Enrico Fermi", "C");//corect Niels Bohr
    public static Intrebari i3 = new Intrebari(3, "Care este capitala Republicii Moldova?'\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "A");//corect Chisinau
    public static Intrebari i4 = new Intrebari(4, "Care dintre urmatoarele tari este complet inconjurata de o alta?\n", "A Burkina Faso ", "B Mongolia ", "C Lesotho ", "D Luxemburg", "C");//corect Lesotho
    public static Intrebari i5 = new Intrebari(5, "Sub ce nume a ramas cunoscut eroul national al Spaniei, Rodrigo Díaz de Bivar?'\n", "A El Cano ", "B El Greco ", "C El Cid ", "D El Salvador", "C");//corect El Cid
    public static Intrebari i6 = new Intrebari(6, "Daca ai fi Albert King, care ar fi profesia ta?'\n", "A Scriitor ", "B Jurnalist de televiziune ", "C Pilot de Formula 1 ", "D Muzician", "D");//corect Muzician
    public static Intrebari i7 = new Intrebari(7, "In ce oras s-a nascut celebrul bluesman Alexis Korner?'\n", "A Londra ", "B New York ", "C Budapesta ", "D Paris", "D");//corect Paris
    static void addEll(){
        ArrayList<Intrebari> arL = new ArrayList<Intrebari>();
    
    arL.add(i1);
arL.add(i2);
        arL.add(i3);
        arL.add(i4);
        arL.add(i5);
        arL.add(i6);
        arL.add(i7);
}
}