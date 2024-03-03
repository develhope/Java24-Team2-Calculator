import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inserisci il primo valore: ");
        Scanner scanner = new Scanner(System.in);
        float num1;
        num1 = scanner.nextFloat();
        System.out.println("Inserisci l'operatore: ");
        System.out.println("+ per addizione, - per sottrazione, * per moltiplicazione, / per divisione, ^ per potenza, p per pari o dispari");
        char operator = scanner.next().charAt(0);
        if(operator=='^'){
            System.out.println("Inserisci la base e successivamente l'esponente");
        }
        float num2;
        if(operator != 'p') {
            System.out.println("Inserisci il secondo valore: ");
            num2 = scanner.nextFloat();
            checkOperation(operator, num1, num2);
        } else {
            System.out.println(evenOdd(num1));
        }
    }

    public static void checkOperation(char operator, float num1, float num2) {
        switch (operator) {
            case '+':
                System.out.println("SOMMA");
                System.out.println(addition(num1, num2));
                break;
            case '-':
                System.out.println("DIFFERENZA");
                System.out.println(sub(num1, num2));
                break;
            case '*':
                System.out.println("MOLTIPLICAZIONE");
                System.out.println(multi(num1, num2));
                break;
            case '/':
                System.out.println("DIVISIONE");
                System.out.println(div(num1, num2));
                break;
            case '^':
                System.out.println("POTENZA");
                System.out.println(pow(num1, num2));
                break;
            case 'p':
                System.out.println(evenOdd(num1));
                break;
        }
    }

    public static float addition (float num1, float num2) {
        return num1 + num2;
    }

    public static float multi(float num1, float num2) {
        return num1 * num2;
    }
    public static double pow(float num1, float num2){
        return Math.pow(num1,num2);
    }

    public static float sub (float num1, float num2) {
        return num1 - num2;
    }
    public static String div(float num1, float num2) {
        float quoziente = num1 / num2;
        float resto = num1 % num2;
        return "Quoziente = " + quoziente + ", Resto = " + resto;
    }
    public static String evenOdd(float num1) {
        int typeNumber = (int) num1 % 2;

        if (typeNumber == 0) {
            return "Pari";
        }
        return "Dispari";
    }

}


