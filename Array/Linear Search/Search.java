public class Search{

    public static int linearSearch(int[] arr,int x)
    {  
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            index=i;
        }
        return index;
    }
    public static void main(String[] args) {
        int [] arr={23,43,12,34,56};
        int x=344;
        if(linearSearch(arr,x)==-1)
        System.out.print("Element does not exist in the array");
        else
        System.out.print("The searched element is at index: "+linearSearch(arr,x));
    }
}