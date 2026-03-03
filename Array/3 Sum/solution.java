import java.util.*;

public class solution {
    public List<List<Integer>> threeSum(int[] nums)
    {
    //Brute force approach
    //    Set<List<Integer>> set=new HashSet<>();
    //    for(int i=0;i<nums.length;i++)
    //    {
    //     for(int j=i+1;j<nums.length;j++)
    //     {
    //         for(int k=j+1;k<nums.length;k++){
    //             if(nums[i]+nums[j]+nums[k]==0)
    //             {
    //                 List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
    //                 Collections.sort(temp);
    //                 set.add(temp);  
    //              }
    //           }
    //     }
    //    }
    //     return new ArrayList<>(set);

    //better approach
    // Set<List<Integer>> hashSet=new HashSet<>();
    // for(int i=0;i<nums.length-1;i++)
    // {
    //      Set<Integer> tempSet=new HashSet<>();
    //     for(int j=i+1;j<nums.length;j++)
    //     {
    //         int thirdElement=-(nums[i]+nums[j]);
    //         if(tempSet.contains(thirdElement) ){
    //            List<Integer> temp=Arrays.asList(nums[i],nums[j],thirdElement);
    //            Collections.sort(temp);
    //            hashSet.add(temp);
    //         }
    //       tempSet.add(nums[j]);
    //     }
    // }
    // return new ArrayList<>(hashSet);

    //optimal approach
    List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length-3;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;

        int j=i+1,k=nums.length-1;
        while(j<k)
        {
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0)
            {
                ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
                while (j<k && nums[j]==nums[j-1]) j++;
                while(j<k && nums[k]==nums[k+1]) k--;
            }

            else if(sum<0) j++;
            else 
                k--;
        }
    }
    return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        solution obj = new solution();
        List<List<Integer>> res = obj.threeSum(arr);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}
