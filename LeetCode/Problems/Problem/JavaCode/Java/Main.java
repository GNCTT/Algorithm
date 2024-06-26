import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("He");
        Scanner scan = new Scanner(System.in);
        int N, M;
        N = scan.nextInt();
        M = scan.nextInt();
        int[] arrSub = new int[N];
        for (int i = 0; i < N; i++) {
            arrSub[i] = scan.nextInt();
        }
        int[] arrRes = new int[M];
        for (int i = 0; i < M; i++) {
            arrRes[i] = scan.nextInt();
        }

        int[][] arrUsed = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrUsed[i][j] = scan.nextInt();
            }
        }

        // process
        int[] arrRess = new int[N];
        for (int i = 0; i < N; i++) {
            int profits = arrSub[i];
            int sum = 0;
            for (int j = 0; j < M; j++) {
                if (arrUsed[i][j] == 1) {
                    sum += arrRes[j];
                }
            }
            arrRess[i] = profits - sum;
            //System.out.println("Res: " + arrRess[i] + " " + sum);
        }

        int res = 0;
        boolean[] arrResUsed = new boolean[M];
        boolean[] arrSubOk = new boolean[N];
        for (int i = 0; i < N; i++) {
            arrSubOk[i] = false;
        }

        for (int i = 0; i < M; i++) {
            arrResUsed[i] = false;
        }

        int usedRes = 0;
        int subOkIndex = 0;

        for (int i = 0; i < N; i++) {
            if (arrRess[i] > 0) {
                res += arrRess[i];
                arrSubOk[i] = true;
                subOkIndex = 1;
                for (int j = 0; j < M; j++) {
                    if (arrUsed[i][j] == 1) {
                        if (arrResUsed[j]) {
                            res += arrRes[j];
                        } else {
                            arrResUsed[j] = true;
                        }
                        usedRes = 1;
                    }
                }
            }
        }

        System.out.println(res);
        if (subOkIndex != 0) {
            for (int i = 0; i < N; i++) {
                if (arrSubOk[i]) {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println(0);
        }

        if (usedRes != 0) {
            for (int i = 0; i < M; i++) {
                if (arrResUsed[i]) {
                    System.out.print((i + 1) + " ");
                }
            }
        } else {
            System.out.println(0);
        }
    }
}

public class Solution {
    public static void Main() {
        int n = nums.size();
        int flips = 0;

        for (int i = 0; i <= n - 3; ++i) {
            if (nums[i] == 0) {
                flips++;
                nums[i] = 1 - nums[i];
                nums[i+1] = 1 - nums[i+1];
                nums[i+2] = 1 - nums[i+2];
            }
        }

        for (int i = n - 2; i < n; ++i) {
            if (i >= 0 && nums[i] == 0) {
                return false;
            }
        }

        return true;
    }
}

