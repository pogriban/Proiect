public class Intrebari {
    protected int id;
    private String intrebare;
    private String raspuns1;
    private String raspuns2;
    private String raspuns3;
    private String raspuns4;
    private String corect;
    public Intrebari(int id, String intrebare, String raspuns1, String raspuns2, String raspuns3, String raspuns4, String corect){
    this.id=id;
    this.intrebare=intrebare;
    this.raspuns1=raspuns1;
    this.raspuns2=raspuns2;
    this.raspuns3=raspuns3;
    this.raspuns4=raspuns4;
    this.corect=corect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getIntrebare() {
        return intrebare;
    }

    public void setIntrebare(String intrebare) {
        this.intrebare = intrebare;
    }

    public String getRasCorect() {
        return raspuns1;
    }

    public void setRasCorect(String raspuns1) {
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

    public String getCorect() {
        return corect;
    }

    public void setCorect(String corect) {
        this.corect = corect;
    }
 
 
}