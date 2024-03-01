import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Inserisci il numero di valori su cui eseguire l'operazione: ");
        // creazione scanner per prendere in input
        Scanner scanner = new Scanner(System.in);
        // prendiamo il numero dei valori
        int dimensione = scanner.nextInt();

        // creazione array vuoto
        float[] arrayList;
        arrayList = new float[dimensione];
        // riempimento array con input dell'utente
        System.out.println("Inserisci i valori:");
        for (int i = 0; i < dimensione; i++) {
            arrayList[i] = scanner.nextFloat();
        }

        System.out.println("Inserisci l'operatore: ");

        System.out.println("+ per addizione, - per sottrazione, * per moltiplicazione, / per divisione, p per pari o dispari");

        char operator = scanner.next().charAt(0);

        checkOperation(operator, arrayList);

    }

    public static void checkOperation(char operator, float[] array) {
        switch (operator) {
            case '+':
                System.out.println("SOMMA");
                System.out.println(addition(array));
                break;
            case '-':
                System.out.println("DIFFERENZA");
                System.out.println(subtraction(array));
                break;
            case '*':
                System.out.println("MOLTIPLICAZIONE");
                System.out.println(multiplication(array));
                break;
            case '/':
                System.out.println("DIVISIONE");
                System.out.println(division(array));
                break;

            case 'p':
                evenOdd(array);
                break;
            default:
                System.out.println("Operatore inserito non valido");
        }

    }

    public static float addition(float[] array) {
        float sum = 0;
        for (float v : array) {
            sum += v;
        }
        return sum;

    }

    public static float subtraction(float[] array) {
        float sub = 0;
        for (float v : array) {
            sub -= v;
        }
        return sub;

    }

    public static float multiplication(float[] array) {
        float multi = 1;
        for (float v : array) {
            multi *= v;
        }
        return multi;
    }

    public static float division(float[] array) {
        float div = array[0];
        for (int i = 1; i < array.length; i++) {

            div /= array[i];
        }
        return div;
    }

    public static void evenOdd(float[] array) {
        for (float v : array) {
            if (v % 2 == 0) {
                System.out.println("Il numero " + v + " è pari");
            } else {
                System.out.println("Il numero " + v + " è dispari");
            }
        }
    }
}



