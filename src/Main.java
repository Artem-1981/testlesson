public class Main {
    private  static  boolean isNegative (int n) {
        return n==0;
    }
    private  static  void printArray (int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    };

    public static void main(String[] args) {
	// write your code here

        //int e = new int[4][8].length;
        //System.out.println(e);
        for (int i = 10; i>=11; i++) {
            System.out.println(i);
        }
        System.out.println(isNegative(8));
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        int p= 8;
        System.out.println(p);
    }
}
