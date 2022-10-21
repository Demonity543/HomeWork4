package Task4;

public class Test {
    public static void main(String[] args) {
        Suma sum = (num) -> {
            int sum2 = 0;
            for (int i = 0; i < num.length; i++) {
                sum2 += num[i];
            }
            return sum2;
        };
        int[] arr = { 1, 2, 3, 5 };

        Comparativc com = (num1, num2) -> {
            return num1 != num2 ? false : true;
        };
        Print(com, getNumber(sum, arr), 11);

        Comparativc2 com2 = (num1) -> {
            return 0 < num1 && num1 < 100 ? true : false;
        };
        Print2(com2, getNumber(sum, arr));

        Positiv pos = (num) -> {
            return num > 0 ? true : false;
        };
        System.out.println("\n Is postiv: " + pos.check(getNumber(sum, arr)));

        Negativ neg = (num) -> {
            return num < 0 ? true : false;
        };
        System.out.println("\nIs negativ: " + neg.check(getNumber(sum, arr)));

    }

    public static int getNumber(Suma com, int... num1) {
        int rez = com.suma(num1);
        return rez;
    }

    public static void Print(Comparativc com, int num1, int num2) {
        System.out.println("\nRez: " + com.compara(num1, num2));
    }

    public static void Print2(Comparativc2 com, int num1) {
        System.out.println("\nRez: " + com.compara(num1));
    }
}
