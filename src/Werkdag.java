
public class Werkdag {
    private int uren = 0;
    private int minuten = 0;



    public void setUren(int uren){
        if(uren > 8){
            uren = 8;
        }

        this.uren = uren;
    }

    public double getUren(){
        return this.uren;
    }
    public void setMinuten(int minuten){

        if(minuten < 30 ){
            minuten = 0;
        }
        else if(minuten > 30 && minuten <= 59 ){
            minuten = 30;
        }




        this.minuten = minuten;
    }

    public int getMinuten(){

        return this.minuten;
    }


}
