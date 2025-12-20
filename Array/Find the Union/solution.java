import java.util.*;

public class solution {
    public static int[] findUnion(int[] nums1,int[] nums2)
    {
       nums2= Arrays.stream(nums2).sorted().toArray();
        int i=0,j=0;
        List<Integer> union=new ArrayList<>();
       while(i<nums1.length && j<nums2.length)
       {
        if(nums1[i]<=nums2[j])
        {
            if(union.size()==0 ||  union.get(union.size()-1) != nums1[i])
            {
                union.add(nums1[i]);
            }
                i++;
        }
            else{
                if(union.get(union.size()-1) != nums2[j])
                {
                    union.add(nums2[j]);
                }
                    j++;
            }
       }
       while(i<nums1.length)
       {
        if(union.get(union.size()-1) != nums1[i])
        {
            union.add(nums1[i]);
        }
            i++;
       }
       while(j<nums2.length)
       {
        if(union.get(union.size()-1) != nums2[j])
        {
            union.add(nums2[j]);
        }
            j++;
       }
       return union.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,5};
        int[] nums2={1,2,3,8,6,7};
        System.out.println(Arrays.toString(findUnion(nums1, nums2)));
    }
}
