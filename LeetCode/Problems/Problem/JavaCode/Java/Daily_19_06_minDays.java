public class Daily_19_06_minDays {
    public int minDays(int[] bloomDay, int m, int k) {
        int size = bloomDay.length;
        if (m *  k > size) return -1;
        int max = 0;
        int start = 0;
        for (int i = 0; i < size; i++) {
            if (i < k) {
                if (bloomDay[i] > max) {
                    max = bloomDay[i];
                }
            } else {
                
            }
        }
        return 1;
    }
}
