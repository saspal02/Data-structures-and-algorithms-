public class Pattern08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < 6-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
}
