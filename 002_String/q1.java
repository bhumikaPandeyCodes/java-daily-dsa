//toggle string lower to upper upper to lower

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String s = sc.nextLine();
        char[] ch = new char[size];
        for(int i=0;i<size;i++){
            ch[i] = s.charAt(i);
        }
        
       System.out.println(toggleString(ch, size)); 

    }
    public static char[] toggleString(char[] ch, int size){
        for(int i=0;i<size;i++){

            if(ch[i]>=65 && ch[i]<=90){
                ch[i] = (char)(ch[i]+32);
            }
            else{
                ch[i] = (char)(ch[i]-32);
            }
        }
        return ch;
    }
}
