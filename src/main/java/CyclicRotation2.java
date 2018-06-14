import java.util.Arrays;

public class CyclicRotation2 {

    public int[] solution(int[] array, int k) {
        int aLength = array.length;

        if (array == null) {
            return null;
        }


        int[] tab = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tab[(i + k) % aLength] = array[i];
        }

        return tab;
    }

    public static void main( String[] args ) {
         CyclicRotation2 cyc = new CyclicRotation2();

        System.out.println(Arrays.toString(cyc.solution( new int[]{1,2,3,4,5},4 )));

    }



}
