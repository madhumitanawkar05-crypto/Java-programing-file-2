public class DivisibleBy2Or5 {
    public static void main(String[] args) {
        int num = 20;

        if (num % 2 == 0 || num % 5 == 0) {
            System.out.println("Number is divisible by 2 or 5");
        } else {
            System.out.println("Number is not divisible by 2 or 5");
        }
    }
}
