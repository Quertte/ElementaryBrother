package ru.job4j.excersizes;

public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

     /*
         метод делает сдвиг с шагом 1
     */
    private static void shift(int[] nums) {
        int last = nums[nums.length - 1];
        System.arraycopy(nums, 0, nums, 1, nums.length - 1);
        nums[0] = last;
    }
}
