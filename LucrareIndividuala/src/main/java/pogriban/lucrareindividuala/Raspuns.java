/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.lucrareindividuala;

/**
 *
 * @author ThinkPad
 */
public class Raspuns {
    private int id;
    private String corect;
    public Raspuns(int id, String corect){
        this.id=id;
        this.corect=corect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorect() {
        return corect;
    }

    public void setCorect(String corect) {
        this.corect = corect;
    }
    
}
