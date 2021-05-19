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
public class BınaryTest {

    public static void main(String[] args) {
        BinaryTress<Integer> tree = new BinaryTress<>();

        tree.insert(20);
        tree.insert(8);
        tree.insert(11);
        tree.insert(78);
        tree.insert(109);

        tree.insert(51);
        tree.insert(82);
        tree.insert(38);
        tree.insert(64);

        System.out.println(" Pre Order Design");
        tree.preOrder(tree.root);
        System.out.println("\n Post Order Design ");
        tree.postOrder(tree.root);
        System.out.println("\n  In Order Design ");
        tree.InOrder(tree.root);

    }
    
}
