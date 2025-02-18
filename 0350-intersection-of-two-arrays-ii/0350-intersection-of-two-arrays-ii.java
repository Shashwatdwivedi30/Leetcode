class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        int k = 0;
        int[] result = new int[Math.min(l1,l2)];
        while(i < l1 && j < l2){
            if(nums1[i] == nums2[j]){
                result[k++] = nums1[i];
                i++;
                j++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
        }
        return Arrays.copyOfRange(result,0,k);
    }
}