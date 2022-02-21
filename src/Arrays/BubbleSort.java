package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {2,1,8,-3, 6, 4 , 12};

//        for (int i = 0; i <a.length; i++){
//            System.out.print(a[i] + "  ");
//        }
        for (int item:a) {
            System.out.print(item + "  ");
        }
        System.out.println();
        int n = a.length;

        for(int i= 0; i<n-1 ; i++){
            Boolean isSorted = false;

            for (int j = 0; j<n-1-i; j++){
                if(a[j+1] < a[j]){
                    isSorted = true;
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
            if(!isSorted) break;;
        }
        for (int item: a) {
            System.out.print( item + "  ");
        }
    }
}
