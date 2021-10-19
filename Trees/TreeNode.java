package Trees;

public class TreeNode {
    TreeNode left,right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value){
        if(value <= data){
            if(left == null){
                left = new TreeNode(value);
            }
            else{
                left.insert(value);
            }
        }
        else{
            if(right == null){
                right  = new TreeNode(value);
            }
            else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value){
        if(value == data) return true;
        if(value < data){
            if(left == null) return false;
            return left.contains(value);
        }
        if (right == null) return false;
        return right.contains(value);
    }

    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.print(data + " ");
        if(right != null){
            right.printInOrder();
        }
    }

    public void printPreOrder(){
        System.out.print(data + " ");
        if(left != null){
            left.printPreOrder();
        }
        if(right != null){
            right.printPreOrder();
        }
    }

    public void printPostOrder(){
        if(left != null){
            left.printPostOrder();
        }
        if(right != null){
            right.printPostOrder();
        }
        System.out.print(data + " ");
    }


    public static void main(String[] args) {
//        int arr[] = {9,8,11,12};
        TreeNode t = new TreeNode(10);
        t.insert(9);
        t.insert(5);
        t.insert(11);
        t.insert(17);

        System.out.println(t.contains(6));
        System.out.println(t.contains(5));

        t.printInOrder();
        System.out.println();
        t.printPreOrder();
        System.out.println();
        t.printPostOrder();

    }
}


