public class Daily_17_04_24_SumOfSquare {
}

class SumOfSquare {
    public boolean judgeSquareSum(int c) {

        int maxCount = (int) Math.sqrt(c);
        int[] arrCheck = new int[c];
        for (int i = 0; i < c; i++) {
            arrCheck[i] = 0;
        }
        for (int i = 1; i <= maxCount; i++) {
            arrCheck[i * i] = 1;
        }
        for (int i = 1; i <= maxCount / 2; i++) {
            int temp = c - i * i;
            System.out.println(temp);
            if (arrCheck[temp] == 1) return true;
        }
        return false;
    }
}
