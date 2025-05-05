import java.util.Scanner;
//which does not occur in pair
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int ans = 0;
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<5; i++){
            ans = ans^a[i];
        }
        System.out.println(ans);

    }
}
