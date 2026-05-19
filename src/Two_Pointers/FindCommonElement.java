// File Name: FindCommonElement.java
// Program: Find the first common element in two sorted arrays using Two Pointers approach

package Two_Pointers;

public class FindCommonElement {
    public int getCommon(int[] nums1, int[] nums2) {

        int l = 0;
        int r = 0;

        while (l < nums1.length && r < nums2.length) {

            if (nums1[l] == nums2[r]) {
                return nums1[l];
            }
            else if (nums1[l] > nums2[r]) {
                r++;
            }
            else {
                l++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindCommonElement solution = new FindCommonElement();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7};
        System.out.println("Common element: " + solution.getCommon(nums1, nums2));
    }
}