package dayOne;

public class PivotNum {
    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length;i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) leftSum += nums[i - 1];
            if (sum - leftSum - nums[i] == leftSum) {
                return i;
            }
        }
        return -1;
    }
}
