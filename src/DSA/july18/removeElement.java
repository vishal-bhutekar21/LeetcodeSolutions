package DSA.july18;

public class removeElement {
    static int RemoveElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp[count] = nums[i];
                count++;
            }
        }

        if (count >= 0) System.arraycopy(temp, 0, nums, 0, count);

        return count;
    }


    public static void main(String[] args) {

    }
}

