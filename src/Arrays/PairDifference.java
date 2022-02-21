package Arrays;

public class PairDifference {
    public static boolean findPair(int arr[],int n){
        int size= arr.length;
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                int diff =arr[i] - arr[j];
                if(diff == n || diff == -(n)){
                    System.out.println("pair found"+
                            "("+arr[i]+", "+arr[j]+")");
                    return true;
                }
            }
        }
        System.out.println("no pair found");
        return false;
    }

    public static void main(String[] args) {
        int arr[] ={1,8,30,40,100};
        int n =-60;
        findPair(arr,n);
    }
}

