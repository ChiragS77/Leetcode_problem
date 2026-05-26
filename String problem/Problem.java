public class Problem{

    public static boolean checkPalindrome(String str){
        int start = 0; 
        int end = str.length()-1;
        
        while(start<=end){
            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
        }
        return true;
    }

    public static float findShortestPath(String path){
        int x =0; int y =0;

        for(int i =0; i<path.length(); i++){
            char dir =  path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float)Math.sqrt(X2 + Y2);
    }

    public static String printSubstring(String s , int start, int end){
        if(start<0 || end > s.length()){
            return "";
        }
        String subString = "";
        for(int i = start; i<end; i++){
            subString+= s.charAt(i);
        }
        return subString;
    }


    public static void main(String[] main){

        String str = "racecar";
        boolean check = checkPalindrome(str);
        // System.out.println(check);

        String path = "WNEENESENNN";
        // System.out.println(findShortestPath(path));

        String s = "HelloWorld";
        System.out.println(printSubstring(s,0,5));

        System.out.println(s.substring(0,5));
    }
}