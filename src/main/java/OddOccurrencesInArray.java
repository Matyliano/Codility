public class OddOccurrencesInArray {

    public int solution(int[] A){
        int hopsa =0;
        int licznik=0;
        for(int i =0; i < A.length; i++){
        for(int j = 0; j < A.length; j++){
             if(A[i] == A[j]){
                 licznik++;
             }
        }
        if(licznik % 2 != 0){
            hopsa=A[i];
            break;
        }
        }
        return hopsa;
    }

    public static void main( String[] args ) {
        OddOccurrencesInArray odd = new OddOccurrencesInArray();
        System.out.println(odd.solution( new int[]{9, 3, 9, 3, 9, 7, 9} ));

    }
}
