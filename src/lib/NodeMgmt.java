package lib;
//tree
public class NodeMgmt {
    Node head = null;

    public boolean insertNode(int data) {

        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node findNode = this.head;
            while (true) {
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }

        return true;
    }

    public Node search(int data) {
        if (this.head == null) {
            return null;
        }else{
            Node findNode = this.head;
            while(findNode != null){
                if(findNode.value == data){
                    return findNode;
                }else{
                    if(data<findNode.value){
                        findNode = findNode.left;
                    }else if (data > findNode.value){
                        findNode = findNode.right;
                    }
                }
            }
        }
        return  null;
    }
}