class Solution {

void quickSort(vector<int> &nums) {

}

public:
    void sortColors(vector<int>& nums) {
        int zero = 0;
        int one = 0;
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) zero++;
            if (nums[i] == 1) one++;
        }
        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
        for (int i = zero; i < zero + one; i++) {
            nums[i] = 1;
        }
        for (int i = zero + one; i < size; i++) {
            nums[i] = 2;
        }
    }
};