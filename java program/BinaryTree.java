import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class binary{
        static int idx=-1;
        public Node builderTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=builderTree(nodes);
            newNode.right=builderTree(nodes);

            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    public static void lvlOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int SumNode(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=SumNode(root.left);
        int rightSum=SumNode(root.right);

        return  leftSum+rightSum+root.data;
    }
    public static int heightOfNode(Node root){
        if(root==null)
        {
            return 0;
        }
        int leftHeight=heightOfNode(root.left);
        int rightHeight=heightOfNode(root.right);
        int myHeight=Math.max(leftHeight,rightHeight)+1;
        return myHeight;

    }
    public static int diameter1(Node root){
        if(root==null)
        {
            return 0;
        }
        int dia1=diameter1(root.left);
        int dia2=diameter1(root.right);
        int dia3=heightOfNode(root.left)+heightOfNode(root.right)+1;
        return Math.max((dia3),Math.max(dia1,dia2));
    }
    public static class treeInfo{
        int ht;
        int diameter;
        treeInfo(int ht,int diameter){
            this.ht=ht;
            this.diameter=diameter;
        }
    }

    public static treeInfo diameter2(Node root){
        if(root==null){
            return new treeInfo(0, 0);
        }

        treeInfo left=diameter2(root.left);
        treeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diameter;
        int diam2=right.diameter;
        int diam3=left.ht+right.ht+1;

        int mydiam=Math.max(Math.max(diam1,diam2), diam3);
        treeInfo myInfo=new treeInfo(myHeight, mydiam);
        return myInfo;
    }
    
    public static void main(String args[]){
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary tree=new binary();
        Node root=tree.builderTree(node);

        System.out.println(diameter2(root).diameter);

    }
}