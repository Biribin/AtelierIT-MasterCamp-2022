public class Cycliste {
    
    String name;
    String lastname;
    int dossart;
    int datedebut;
    int datefin;   


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDossart() {
        return this.dossart;
    }

    public void setDossart(int dossart) {
        this.dossart = dossart;
    }

    public int getDatedebut() {
        return this.datedebut;
    }

    public void setDatedebut(int datedebut) {
        this.datedebut = datedebut;
    }

    public int getDatefin() {
        return this.datefin;
    }

    public void setDatefin(int datefin) {
        this.datefin = datefin;
    }

    
    
   
    void abandonner(){
        this.datefin= 0;
    }
    
    int gettemps(){
        return datefin-datedebut;        
    }
}

