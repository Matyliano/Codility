public class PermMissingElem {

    public static int solution( int[] A ) {

        if (A == null) {
            return Integer.parseInt( null );
        }

        int n = A.length + 1;
        int brakujacyElement = n * (n + 1) / 2;
        for (int i = 0; i < A.length; i++) {
            brakujacyElement -= A[i];
        }
        return brakujacyElement;


    }

    public static void main( String[] args ) {
        PermMissingElem missingElem = new PermMissingElem();
        System.out.println( solution( new int[]{9, 7, 5, 6, 4, 3, 2, 1} ) );
    }
}







