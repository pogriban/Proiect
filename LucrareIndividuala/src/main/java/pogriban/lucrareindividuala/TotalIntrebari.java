package pogriban.lucrareindividuala;

public class TotalIntrebari {
    protected int id;
    private String questoin;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String corect;
    public TotalIntrebari(int id, String questoin, String answer1, String answer2, String answer3, String answer4, String correct){
    this.id=id;
    this.questoin=questoin;
    this.answer1=answer1;
    this.answer2=answer2;
    this.answer3=answer3;
    this.answer4=answer4;
    this.corect=corect;
    }

     public static TotalIntrebari t1 = new TotalIntrebari(1, "Ce insecta a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug\n", "A Molie ", "B Gindac de bucatarie ", "C Musca ", "D Gandac japonez", "A");//corect Molie
     public static TotalIntrebari t2 = new TotalIntrebari(2, "Care dintre urmatorii oameni de stiinta nu are un element chimic care sa-i poarte numele?\n", "A Albert Einstein ", "B Niels Bohr ", "C Isaac Newton ", "D Enrico Fermi", "C");//corect Niels Bohr
     public static TotalIntrebari t3 = new TotalIntrebari(3, "Care este capitala Republicii Moldova?'\n", "A Chisinau ", "B Balti ", "C Paris ", "D Tokyo", "A");//corect Chisinau

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

    public String getCorect() {
        return corect;
    }

    public void setCorect(String corect) {
        this.corect = corect;
    }

    

    
 
}