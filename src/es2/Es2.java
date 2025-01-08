package es2;

public class Es2 {
    public static void numToLetters(int num){
        switch (num){
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            case 0:
                System.out.println("zero");
                break;
            default:
                System.out.println("non hai inserito un numero da 0 a 3");
        }
    }
}
