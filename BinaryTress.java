/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databinarytrees;

/**
 *
 * @author PC
 */
public class BinaryTress<T> {

    Node<T> root;

    public BinaryTress() {

    }

    void insert(T newData) {
        Node<T> newNode = new Node(newData);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> temp = root;
            while (temp != null) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return;
                } else if (temp.right == null) {
                    temp.right = newNode;
                    return;
                } else if (fullNode(temp.left) && !fullNode(temp.right)) {
                    temp = temp.right;
                } else {
                    temp = temp.left;
                }
            }
        }
    }

    boolean fullNode(Node<T> node) {
        return node.right != null && node.left != null;
    }

    void preOrder(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + "  ");
            preOrder(node.left);
            preOrder(node.right);

        }
    }

    void postOrder(Node<T> node) {
        if (node != null) {

            preOrder(node.left);
            preOrder(node.right);
            System.out.print(node.data + "  ");
        }
    }

    void InOrder(Node<T> node) {
        if (node != null) {
            InOrder(node.left);
            System.out.print(node.data + "  ");
            InOrder(node.right);

        }
    }

}
