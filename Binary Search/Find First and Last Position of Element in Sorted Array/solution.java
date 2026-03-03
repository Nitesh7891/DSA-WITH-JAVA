public class solution {
    public int[] searchRange(int[] nums, int target) {
        int a=first(nums,target,0,nums.length-1,-1);
        int b=last(nums,target,0,nums.length-1,-1);
        int arr[]=new int[2];
        arr[0]=a;
        arr[1]=b;
        return arr;
    }
    public int first(int nums[],int target,int low,int high,int res)
    {  
        if(low>high)  return res;
        int mid=low+(high-low)/2;
        if(nums[mid]==target)  
       {
         res=mid;
        return first(nums,target,low,mid-1,res) ;
       }
       else if(target>nums[mid])
       {
        return first(nums,target,mid+1,high,res);
       }
       else
       return first(nums,target,low,mid-1,res);
       
    }
     public int last(int nums[],int target,int low,int high,int res)
    {  
        if(low>high)  return res;
        int mid=low+(high-low)/2;
        if(nums[mid]==target)  
       {
         res=mid;
        return last(nums,target,mid+1,high,res) ;
       }
       else if(target>nums[mid])
       {
        return last(nums,target,mid+1,high,res);
       }
       else
       return last(nums,target,low,mid-1,res);
       
    }
}
