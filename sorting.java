import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr ={1,3,2,0,5,4,6};
     insertion(arr);
     System.out.println(Arrays.toString(arr));
        // cyclic(arr);
        // System.out.println(Arrays.toString(arr));


        // selection(arr);
        // System.out.println(Arrays.toString(arr));

        // bubble(arr);
        // System.out.println(Arrays.toString(arr));
        
    }

    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the  remaing aray and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
            
        }

    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[] arr ,int start,int end){
        int max= start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i])
            {
                max=i;
            }
            
        }
        return max;


    }


    static void insertion(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }

            
        }

    }
    static void cyclic(int[] arr)
{

    //no duplicate value allow;
    // no negative value allow;
    int i=0;
    while (i<arr.length) {
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct])
        {
            swap(arr, i, correct);
        }
        else{
            i++;
        }
        
    }
}


    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;

            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;

                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
