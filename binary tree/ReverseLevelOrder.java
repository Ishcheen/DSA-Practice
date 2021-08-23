import java.util.*;
class Node{
    Node left=null;
    Node right=null;
    int data;
    Node(int x)
    {
        data=x;
    }
}
public class ReverseLevelOrder{
    public static void reverse(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        Stack<Integer> st=new Stack<Integer>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.poll();            
            st.push(temp.data);
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
        }
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        reverse(root);
    }
}