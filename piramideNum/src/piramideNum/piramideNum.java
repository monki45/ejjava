package piramideNum;

public class piramideNum {

	public static void main(String[] args) {

        for (int x = 0; x <= 9; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println( );
        }
    }
}