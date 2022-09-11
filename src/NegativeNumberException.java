public class NegativeNumberException extends RuntimeException {
    private int number;

    public NegativeNumberException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "NegativeNumberException [number=" + number + "]";
    }
}

