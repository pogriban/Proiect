public class TotalIntrebari {
    protected int id;
    private String intrebare;
    private String raspuns1;
    private String raspuns2;
    private String raspuns3;
    private String raspuns4;
    private String corect;
    public TotalIntrebari(int id, String intrebare, String raspuns1, String raspuns2, String raspuns3, String raspuns4, String corect){
    this.id=id;
    this.intrebare=intrebare;
    this.raspuns1=raspuns1;
    this.raspuns2=raspuns2;
    this.raspuns3=raspuns3;
    this.raspuns4=raspuns4;
    this.corect=corect;
    }

    static TotalIntrebari t1 = new TotalIntrebari(1, "Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug\n", "A Molie ", "B Gindac de bucatarie ", "C Musca ", "D Gandac japonez", "A");//corect Molie
    static TotalIntrebari t2 = new TotalIntrebari(2, "Care dintre urmatorii oameni de stiinta nu are un element chimic care sa-i poarte numele?\n", "A Albert Einstein ", "B Niels Bohr ", "C Isaac Newton ", "D Enrico Fermi", "C");//corect Niels Bohr
    static TotalIntrebari t3 = new TotalIntrebari(3, "Care este capitala Republicii Moldova?'\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "A");//corect Chisinau
    
 
 
}