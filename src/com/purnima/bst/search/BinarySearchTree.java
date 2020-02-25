package com.purnima.bst.search;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insertNode(int key){
        root = insertNode(root, key);
    }

    public Node insertNode(Node node, int value){
        if(node == null){
            node = new Node(value);
        }
        if(value<node.key){
            node.left=insertNode(node.left, value);
        }
        else if(value>node.key){
            node.right=insertNode(node.right, value);
        }

        return node;
    }

    public void search(int data){

        root =  searchKey(root, data);
        if(root != null){
        System.out.println(root.key);}
        else {
            System.out.println(root);
        }

    }

    private Node searchKey(Node root, int data) {

        if(root == null || root.key == data){
            return root;
        }
        else if(root.key > data){
            return searchKey(root.left, data);
        }
        else if(root.key<data){
            return searchKey(root.right, data);
        }


        return root;
    }
}
