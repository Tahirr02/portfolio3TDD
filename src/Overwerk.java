public class Overwerk {

   private static String DOORDEWEEKS = "doordeweeks";
    private static String WEEKEND = "weekend";
    private static String FEESTDAG = "feestdag";
    private static String FUNCTIE_KOK = "kok";
    private static String FUNCTIE_BEDIENING = "bediening";

    public static int getOverWerkPerecntage(String soortOverwerk, Boolean oproepKracht, Boolean avondDienst, String functie){
        int overwerkpercentage = 0;
        if(soortOverwerk == DOORDEWEEKS){
            overwerkpercentage += 20;
        }
        else if(soortOverwerk == WEEKEND){
            overwerkpercentage += 50;
        }
        else if(soortOverwerk == FEESTDAG){

            overwerkpercentage += 100;
        }

        if(oproepKracht == true){
            overwerkpercentage += 10;
        }

        if(avondDienst == true){
            overwerkpercentage += 20;
        }

        if(functie == FUNCTIE_KOK){
            overwerkpercentage += 30;
        }
        else if(functie == FUNCTIE_BEDIENING){
            overwerkpercentage += 15;
        }


        return overwerkpercentage;
    }
}
