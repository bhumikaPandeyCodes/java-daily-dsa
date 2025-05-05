
// rotate the array k times 
public class q1 {
    public static void main(String args[]){
        int n = 5;
        int k = 2;
        int arr[] = {4,8,9,1,3};
        System.out.print("----first----");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
        reverse(arr,0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        System.out.print("----second----");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
    public static void reverse(int arr[], int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}


