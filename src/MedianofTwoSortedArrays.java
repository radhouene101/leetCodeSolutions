public class MedianofTwoSortedArrays { //dificulty hard https://leetcode.com/problems/median-of-two-sorted-arrays/
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];//initializing the size of the array we will be merging
        int ij=0;//counter for both arrays
        int i=0;// nums1 counter
        int j=0;// nums2 counter

        while(i<nums1.length && j<nums2.length){//fillling the merged array while nums1 and nums2 indexes did not reach the end
            if(nums1[i]<nums2[j]){
                result[ij++]=nums1[i++];
            }else{
                result[ij++]=nums2[j++];
            }
        }
        while(i<nums1.length){// i made this loop in case nums2 has ran out
            result[ij++]=nums1[i++];
        }
        while(j<nums2.length){ // same goes the this loop in case nums1 ran out
            result[ij++]=nums2[j++];
        }

        if(result.length%2==0){
            return (double)(result[(ij/2)-1]+result[(ij/2)])/2;
        }else {
            return result[ij/2];
        }
    }
}
