import java.util.*;

public class solution {
    public List<List<Integer>> fourSum(int[] nums,int target)
    {
        //Brute force approach
        // Set<List<Integer>> set=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             for(int l=k+1;l<nums.length;l++){
        //                 long sum=(long) nums[i]+nums[j]+nums[k]+nums[l];
        //                 if(sum==target)
        //                 {
        //                   List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
        //                   Collections.sort(temp);
        //                   set.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);

        //Better approach
        // Set<List<Integer>> set=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         Set<Integer> tempSet=new HashSet<>();
        //         for(int k=j+1;k<nums.length;k++){
        //             long required=(long) target-nums[i]-nums[j]-nums[k];

        //             if(tempSet.contains((int)required)){
        //                 List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],(int)required);
        //                 Collections.sort(temp);
        //                 set.add(temp);
        //             }
        //             tempSet.add(nums[k]);

        //         }
        //     }
        // }
        // return new ArrayList<>(set);

        //optimal solution
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                
                int k=j+1,l=nums.length-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if( sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;

                        while(k<l && nums[k]==nums[k-1])k++;
                        while(k<l && nums[l]==nums[l+1])l--;
                    }
                    else if(sum<target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
          int[] arr = {1, 0, -1, 0, -2, 2};
          int target = 0;

        solution obj = new solution();
        List<List<Integer>> ans = obj.fourSum(arr, target);

        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
}
