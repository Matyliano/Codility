public class FrogJmp {

//X - current position   Y - end position  D - jump

    public static int solution( int X, int Y, int D ) {

        int jumpCount;

        jumpCount = (int) Math.ceil( (double) (Y - X) / D );

        return jumpCount;
    }


    public static void main( String[] args ) {
        FrogJmp frogJmp = new FrogJmp();
        System.out.println( solution( 10, 85, 30 ) );
    }


}
