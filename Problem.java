public class Problem{

    public static void moveZerosToEnd(int arr[]){
        int ar2[] = new int[arr.length];
        int count = 0;

        for(int i = 0;i<arr.length; i++){
            if(arr[i]!=0){
                ar2[count++] = arr[i];
            }
        }
        for(int i=count+1; i<arr.length ; i++){
            ar2[i] =0;
        }

        for(int i: ar2){
            System.out.print(" "+i);
        }
    }


    public static void reverseArray(int[] arr){
        int start = 0; 
        int end = arr.length -1;

        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i : arr){
            System.out.print(" "+i);
        }
    }


    public static void main(String[] args) {
       
        // int arr[] = {2,0,4,0,6,0,8,0 ,10};

        // moveZerosToEnd(arr);

        // int arr[] = {12,13,14,15,16,17,18};
        // reverseArray(arr);

       
}

}