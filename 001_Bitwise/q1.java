import java.util.Scanner;
// NUMBER IS ODD OR EVEN
public class q1 {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
        
      if((n&1)==0){
        System.out.println("enven");
      }
      else{
        System.out.println("odd");
      }
    }

    }
  }