import java.util.List;
import java.util.stream.IntStream;

public class Task1 {
    public static boolean isPrime(int number) {
        if (number < 1) {
            throw new NegativeNumberException(number);
        }
        return number != 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch((n) -> number % n == 0);
    }

    public static int task1(List<Integer> list) {
        return (int) list.stream().filter((n) -> isPrime(n)).count();
    }

    public static void main(String[] args) {
        // должно быть 25
        System.out.println(task1(IntStream.rangeClosed(1, 100).boxed().toList()));
    }
}