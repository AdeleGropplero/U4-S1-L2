import es1.Es1;
import es2.Es2;
import es3.Es3;
import es4.Es4;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una parola o frase qualsiasi per scoprire se è pari o dispari!");
        String insert = sc.nextLine();
        Es1 e1 = new Es1();
        e1.stringaPariDispari(insert);


        System.out.println("Inserisci un anno qualsiasi e vediamo se è bisestile:");
        int insertYear = sc.nextInt();
        e1.annoBisestile(insertYear);

        //----------------------------------

        Es2 e2 = new Es2();
        System.out.println("inserisci un numero da 0 a 3:");
        int insertnum = sc.nextInt();
        e2.numToLetters(insertnum);

        //----------------------------------

        Es3 e3 = new Es3();

        //----------------------------------

        Es4 e4 = new Es4();
        System.out.println("inserisci un numero per vedere il conto alla rovescia:");
        int insertnum2 = sc.nextInt();
        e4.countReverse(insertnum2);
    }
}