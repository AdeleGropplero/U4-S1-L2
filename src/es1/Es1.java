package es1;

public class Es1 {

    public static boolean stringaPariDispari(String param){
        if (param.length() % 2 == 0){
             System.out.println("La stringa ha una lunghezza pari, è lunga " + param.length() + " lettere");
             return true;
        } else {
            System.out.println("La stringa ha una lunghezza dispari, è lunga " + param.length() + " lettere");
            return false;
        }
        }
        
        public static boolean annoBisestile(int year){

        if (year % 400 == 0 ) {
            System.out.println("Questo è un anno bisestile!");
            return true;

        } else  if(year % 100 == 0  ){
            System.out.println("Niet! Non è un anno bisestile!");
            return false;

        } else  if(year % 4 == 0  ){
            System.out.println("Questo è un anno bisestile!");
            return true;

        }else {
            System.out.println("Niet! Non è un anno bisestile!");
            return false;
        }
        }
    }


