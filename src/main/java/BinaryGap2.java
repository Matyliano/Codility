import java.util.Arrays;

public class BinaryGap2 {

    private static int binary( Integer N) {

        String bNumber = Integer.toBinaryString( N );
        System.out.println( "the binary number of " + N + " is: " + bNumber );

        char[] zeros = bNumber.toCharArray();
        System.out.println("when we cut of 1's : " +  Arrays.toString( zeros) );

        int zerosmax = 0;
        int zeros2 = 0;
        for(int i = 0; i <  bNumber.length(); i++){
          if(zeros[i] == '0'){
              zeros2++;
          }
          if(zeros[i] == '1' && zeros2 > 0){
              if (zeros2 > zerosmax){
                  zerosmax = zeros2;
              }
              zeros2 = 0;
          }
        }

        return zerosmax;
    }
    public static void main( String[] args ) {
        System.out.println(binary( 256 ));
    }
    }

