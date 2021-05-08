import java.time.LocalDate;

public class Maandsalaris {
    private  int jaartal;
    private  int maand;
    LocalDate date = LocalDate.now();

    public Maandsalaris(){

    }

    private boolean isJaartalCorrect(int jaartal){
        if(jaartal > 1900 && jaartal < 9999){
            return true;

        }
        else{
            return false;
        }
    }

    private boolean isMaandCorrect(int maand){
        if(maand >= 1 && maand < 13){
            return true;

        }
        else {
            return false;
        }
    }


    public boolean isDatumCorrect(){

        if (isJaartalCorrect(this.jaartal) == false){
            return false;
        }
        else if(isMaandCorrect(this.maand) == false){
            return false;
        }

        else if(isDatumInVerleden() == false){
            return false;
        }
        else {
            return true;
        }



    }
    private boolean isDatumInVerleden(){
        if(this.jaartal < date.getYear()){
            return true;
        }
        else if(jaartal == date.getYear() && maand < date.getMonthValue()){
            return true;
        }
        else{
            return false;
        }
    }

    public void setJaartal(int jaartal){
        this.jaartal = jaartal;
    }

    public void setMaand(int maand){
        this.maand = maand;

    }
}
