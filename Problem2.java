
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
            }
            if(sum>maxSum){
                maxSum = sum;
            }

            }
        }
        System.out.print("Max sum is: "+maxSum);
    }



    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // printSubarray(arr);
        subArraySum(arr);

    }  

}