public class main {
    public static void main(String[] args) {
        checkAge(16);
    }

    public static void checkAge(int number) {
        if (number < 18) {
            throw new RuntimeException("You must be at least 18");
        } else {
            System.out.println("You are old enough");
        }
    }
}
