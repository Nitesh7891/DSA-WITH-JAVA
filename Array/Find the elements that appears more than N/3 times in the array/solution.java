import java.util.*;

public class solution {
    public List<Integer> majorityElementTwo(int[] nums)
    {
        //Brute force approach
    //   List<Integer> ans=new ArrayList<>();
    //     for(int i=0;i<nums.length;i++)
    //     {    int count=0;
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[i]==nums[j]) count++;
    //         }
    //        if(count>nums.length/3 ){
    //         if(!ans.contains(nums[i]))
    //             ans.add(nums[i]);
    //        }
    //        if(ans.size()==2) break;
    //     }
    //     return ans;

    //better approach
    // List<Integer> ans=new ArrayList<>();
    // Map<Integer,Integer> map= new HashMap<>();
    // for(int num:nums)
    // {
    //     map.put(num,map.getOrDefault(num, 0)+1);
    //     if(map.get(num)>nums.length/3 && !ans.contains(num)){
    //         ans.add(num);
    //     }

    //     if(ans.size()==2) break;
    // }
    // return ans;

    int cnt1=0,cnt2=0,el1=0,el2=0;
    for(int i=0;i<nums.length;i++){
        if(cnt1==0 && el2!=nums[i]){
            cnt1=1;
            el1=nums[i];
        }
        else if(cnt2==0 && el1!=nums[i]){
            cnt2=1;
            el2=nums[i];
        }
        else if(el1==nums[i]){
            cnt1++;
        }
        else if(el2==nums[i]){
            cnt2++;
        }
        else{
            cnt1--;
            cnt2--;
        }
    }

    cnt1=0;
    cnt2=0;
    List<Integer> result=new ArrayList<>();
    for(int num:nums)
    {
     if(num==el1) cnt1++;
     else if(num==el2) cnt2++;

     if(cnt1>nums.length/3 && !result.contains(el1)){
        result.add(el1);
     }

     if(cnt2>nums.length/3 && !result.contains(el2)){
        result.add(el2);
    }
}

    
    return result;
    }
    public static void main(String[] args) {
        int[] arr = {11, 11, 11, 11, 11, 33,33,33,33};

        solution sol = new solution();
        List<Integer> ans = sol.majorityElementTwo(arr);

        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
