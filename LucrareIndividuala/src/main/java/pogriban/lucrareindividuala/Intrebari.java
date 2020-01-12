/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPad
 */
public class Intrebari {
    private String intrebare;
    private String raspuns1;
    private String raspuns2;
    private String raspuns3;
    private String raspuns4;
    public Intrebari(String intrebare, String raspuns1, String raspuns2, String raspuns3, String raspuns4){
    this.intrebare=intrebare;
    this.raspuns1=raspuns1;
    this.raspuns2=raspuns2;
    this.raspuns3=raspuns3;
    this.raspuns4=raspuns4;
    }

   
    //public String printIntrebari() { 
      // return String.format(intrebare + " " + raspuns1+ " " + raspuns2 + " " + raspuns3 + " "+raspuns4 );
    
//}

    public String getIntrebare() {
        return intrebare;
    }

    public void setIntrebare(String intrebare) {
        this.intrebare = intrebare;
    }

    public String getRaspuns1() {
        return raspuns1;
    }

    public void setRaspuns1(String raspuns1) {
        this.raspuns1 = raspuns1;
    }

    public String getRaspuns2() {
        return raspuns2;
    }

    public void setRaspuns2(String raspuns2) {
        this.raspuns2 = raspuns2;
    }

    public String getRaspuns3() {
        return raspuns3;
    }

    public void setRaspuns3(String raspuns3) {
        this.raspuns3 = raspuns3;
    }

    public String getRaspuns4() {
        return raspuns4;
    }

    public void setRaspuns4(String raspuns4) {
        this.raspuns4 = raspuns4;
    }
}