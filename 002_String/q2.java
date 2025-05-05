
//reverse the array
public class q2 {
    
    public static char[] swap(int s, int e, char[] ch){
        char temp = ch[s];
        ch[s] = ch[e];
        ch[e] = temp;
        return ch;
    }
    public static void main(String args[]){
        char[] ch = {'f','a','o','v'};
        int size = ch.length;
        int s = 0;
        int e = size-1;
        while(s<e){
            swap(s, e, ch);
            s++; e--;
        }
        System.out.println(ch);
    }
   
}
