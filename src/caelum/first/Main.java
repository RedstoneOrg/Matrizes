package caelum.first;


import java.util.*;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            SomaMatriz programa = new SomaMatriz();
            programa.executar();
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            System.exit(0);
        }
    }



}
