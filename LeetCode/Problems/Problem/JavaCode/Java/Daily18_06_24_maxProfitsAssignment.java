public class Daily18_06_24_maxProfitsAssignment {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int size = difficulty.length;
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (max < difficulty[i]) {
                max = difficulty[i];
            }
        }
        int[] arrCheck = new int[max + 1];
        for (int i = 0; i < max + 1; i++) {
            arrCheck[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            int temp = difficulty[i];
            if (arrCheck[temp] < profit[i]) {
                arrCheck[temp] = profit[i];
            }
        }

        int currentProfit = 0;
        // for (int i = max; i >= 0; i--) {
        //     if (arrCheck[i] != currentProfit) {
        //         if (arrCheck[i] > currentProfit) {
        //           currentProfit = arrCheck[i];
        //         } else {
        //             arrCheck[i] = currentProfit;
        //         }
        //     } else {

        //         arrCheck[i] = currentProfit;
        //     }

        // }


        for (int i = 0; i <= max; i++) {
            if (currentProfit < arrCheck[i]) {
                currentProfit = arrCheck[i];
            } else {
                arrCheck[i] = currentProfit;
            }
        }

        // for (int i = 0; i <= max; i++) {
        //     System.out.print(arrCheck[i] + " ");
        // }
        int sum = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] > max) {
                sum += arrCheck[max];
            } else {
                sum += arrCheck[worker[i]];
            }
        }

        return sum;
    }
}
