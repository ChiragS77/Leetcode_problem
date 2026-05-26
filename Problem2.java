
public class Problem2{


    static void findPairs(int arr[]){
         for(int i =0; i<arr.length-1;i++){
            for(int j= i+1; j<arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    

    public static void printSubarray(int arr[]){

        for(int i = 0; i<arr.length ;i++){
            int start = i;
            for(int j =i; j<arr.length;j++){
                int end = j;
                for(int k = start ; k<= end ; k++){
                    System.out.print(" "+arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void subArraySum(int arr[]){
        int sum = -1;
        int maxSum  = -1;

        for(int i=0 ; i<arr.length; i++){
            int start = i;
            for(int j = start ; j<arr.length; j++){
                int end = j;
                sum = 0;

            for(int k = start; k<=end; k++){
                sum+=arr[k];
                System.out.println(" "+sum);
            }
            if(sum>maxSum){
                maxSum = sum;
            }

            }
        }
        System.out.print("Max sum is: "+maxSum);
    }

    



    public static void findPrefixSum(int arr[]){

        int sum = arr[0];
        for(int i=1; i<arr.length; i++){
            sum+= arr[i];
            arr[i] = sum;
        }

        for(int i : arr){
            System.out.print(" "+i);
        }
    }

        //maximum subarray sum using prefix sum method

        public static void maxPrefixSum(int arr[]){
            int prefix[] = new int[arr.length];
            prefix[0] = arr[0];
            for(int i =1; i<arr.length ; i++){
                prefix[i] = prefix[i-1] + arr[i];

            }
            int maxSum = Integer.MIN_VALUE;

            int currSum = 0;
            for(int i =0; i<arr.length; i++){
                int start = i; 
                for(int j = 0; j<arr.length; j++){
                    currSum = 0;
                    int end = j;
                    currSum = start ==0 ? prefix[end]:prefix[end] - prefix[start-1];
                    System.out.print(" "+currSum);

                    if(currSum > maxSum){
                        maxSum = currSum;
                    }
                    System.out.println();
                }
            }
            System.out.println("Maximum sum is: "+maxSum);

        }
//what if all number are negative
public static boolean  checkNegative(int arr[]){
    for(int i = 0 ; i<arr.length;i++){
        if(arr[i]>0){
            return true;
        }
    }
    return false;
}
        public static void kadans(int arr[]){
           boolean x =  checkNegative(arr);
           int max = Integer.MIN_VALUE;
           if(!x){
            for(int i =0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
           }


            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            for(int i =0; i<arr.length ; i++){
                currSum += arr[i];

                if(currSum<0){
                    currSum = 0;
                }
                maxSum = Math.max(currSum, maxSum);
            }
            System.out.println("MAX sum is: "+maxSum);
        }


    
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        // printSubarray(arr);
        // subArraySum(arr);
        int arr[] = {-1,-2,-6,-1,-3};
        // findPrefixSum(arr);
        // maxPrefixSum(arr);
        kadans(arr);


    }  

}