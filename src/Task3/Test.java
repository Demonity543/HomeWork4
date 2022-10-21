package Task3;

public class Test {

    public static void main(String[] args) {
        Min4 min = (numbers) -> {
            if (numbers.length == 0)
                throw new IllegalArgumentException("Нет чисел!");
            for (int i = 0; i < numbers.length; i++)
                for (int j = i + 1; j < numbers.length; j++)
                    if (numbers[i] > numbers[j]) {
                        int tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
            return numbers[0];
        };
        System.out.println("\nMin: " + min.min4(1, 2, 3, 4));

        Max4 max = (numbers) -> {
            if (numbers.length == 0)
                throw new IllegalArgumentException("Нет чисел!");
            for (int i = 0; i < numbers.length; i++)
                for (int j = i + 1; j < numbers.length; j++)
                    if (numbers[i] < numbers[j]) {
                        int tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
            return numbers[0];
        };
        System.out.println("\nMax: " + max.max4(1, 2, 3, 4));
    }

}
