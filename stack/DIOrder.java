/** 
 * Given a sequence of I and D
 * where I denotes increasing seq and D denotes decreasing seq 
 * decode the seq to make minimum number without repetition
 */
import java.util.*;
public class DIOrder{
    public static String order(String x){
        Stack<Integer> st=new Stack<Integer>();
        int n=x.length();
        String ans="";
        for(int i=0;i<=n;i++)
        {
            st.push(i+1);
            if( i==n || x.charAt(i)=='I'){
                while(!st.isEmpty()){
                    ans+=st.pop();
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String seq = "IDIDII";
        System.out.println("The minimum number is " + order(seq));
    }
}