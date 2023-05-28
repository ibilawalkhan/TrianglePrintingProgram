public class Main {
    public static void main(String[] args) {

        System.out.println("Triangle Pattern A");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Triangle Pattern B");
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Triangle Pattern C");
        for (int i = 0; i < 10; i++) {
            for (int k = 1; k < i + 1; k++) {
                System.out.print(" ");
            }

            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Triangle Pattern D");
        for (int i = 0; i < 10; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}