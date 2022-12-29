public class Main {
    public static void main(String[] args) {

        int j = checkDigit(new int[]{8, 0, 7, 1, 1, 2, 9, 9, 4});
        System.out.println(j);
    }

    private static int checkDigit(int[] originalDigit){
        int i, j, k;
        j = 0;

        for(i=0; i <= originalDigit.length - 1; i++){
            j = j + originalDigit[i];
        }
        while (j > 9){
            k = j / 10; /* 10進数9桁の数の場合、j が２桁を超えることはない */
            j = k + (j - 10 * k);
        }
        return j;
    }
}