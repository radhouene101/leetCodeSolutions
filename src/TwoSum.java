public class TwoSum {//leetcode difficulty easy https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        if ( nums.length<=0) {
            return res;
        }
        int i=0;
        int targ=0;
        while (targ!=target || i<nums.length){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target ){
                    res[0]=i;
                    res[1]=j;
                    targ=nums[i]+nums[j];
                }
            }
            i++;
        }
        return res;
    }
}
