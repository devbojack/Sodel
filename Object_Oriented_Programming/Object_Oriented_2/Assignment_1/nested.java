public class PatternOutput {
    public static void main(String[] args) {

        int size = 6;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    System.out.print("& ");
                }
                else if (i == j) {
                    System.out.print("& ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
