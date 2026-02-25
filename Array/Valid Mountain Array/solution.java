class Solution {
    public static  boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int i=0;
         
        //Strictly increasing
        while(i<arr.length-1 && arr[i]<arr[i+1] ){
            i++;
        }

        //if the array didn't increase or is only strictly increasing but not decreasing
        if(i==0 || i==arr.length-1){
            return false;
        }

       //strictly decreasing
        while(i<arr.length-1  && arr[i]>arr[i+1] ){
            i++;
        }

        return i==arr.length-1;
    }
    public static void main(String[] args){
    int[] arr={0,2,4,5,6,4,2,1};
    boolean valid=validMountainArray( arr);
      if(valid){
        System.out.println("It is an valid mountain array");
      }
      else{
        System.out.println("Not an valid mountain array");
      }
}
