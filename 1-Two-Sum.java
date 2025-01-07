class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>m1=new HashMap<>();
        int arr[]=new int[2];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=target-nums[i];
            if(m1.containsKey(ans)){
                //return new int[]{m1.get(ans), i};
                arr[0]=m1.get(ans);
                arr[1]=i;
            }
            m1.put(nums[i],i);
        }
        return arr;
    }
}