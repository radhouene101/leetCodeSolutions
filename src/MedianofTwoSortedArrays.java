public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        int ij=0;
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                result[ij++]=nums1[i++];
            }else{
                result[ij++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            result[ij++]=nums1[i++];
        }
        while(j<nums2.length){
            result[ij++]=nums2[j++];
        }

        if(result.length%2==0){
            return (double)(result[(ij/2)-1]+result[(ij/2)])/2;
        }else {
            return result[ij/2];
        }
    }
}
