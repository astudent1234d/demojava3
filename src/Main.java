public class Main {
    public static void main(String[] args) {
        int low = 200;
        int up = 300;
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (low <= i * i && i * i <= up) {
                amount++;
                System.out.println(amount);
            }

        }
    }
}