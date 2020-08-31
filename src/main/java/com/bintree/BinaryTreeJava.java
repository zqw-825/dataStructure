package com.bintree;


/**
 * @author zqw
 * @create 2020-08-29 18:49
 */
public class BinaryTreeJava {

    public static void main(String[] args) {


        BinaryTree tree = new BinaryTree();
        HNode root = new HNode(1, "Q");
        HNode N2 = new HNode(2, "W");
        HNode N3 = new HNode(3, "E");
        HNode N4 = new HNode(4, "R");
        HNode N5 = new HNode(5, "T");

        root.setLeft(N2);
        root.setRight(N3);
        N3.setRight(N4);
        N3.setLeft(N5);
        System.out.println("前序遍历");
        root.preOrder();
        System.out.println("中序遍历");
        root.midOrder();
        System.out.println("后序遍历");
        root.endOrder();



    }
}
 class BinaryTree {
        private HNode root;

        public void setRoot(HNode root) {
            this.root = root;
        }

        public void preOrder() {
            if (this.root != null) {
                this.root.preOrder();
            }
        }

        public void midOrder() {
            if (this.root != null) {
                this.root.midOrder();
            }
        }

        public void endOrder() {
            if (this.root != null) {
                this.root.endOrder();
            }
        }

    }


    class HNode {
        private HNode left;
        private HNode right;

        private String name;
        private int no;

        public HNode( int no,String name) {
            this.name = name;
            this.no = no;
        }

        public HNode getLeft() {
            return left;
        }

        public void setLeft(HNode left) {
            this.left = left;
        }

        public HNode getRight() {
            return right;
        }

        public void setRight(HNode right) {
            this.right = right;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        @Override
        public String toString() {
            return "HNode{" +
                    "name='" + name + '\'' +
                    ", no=" + no +
                    '}';
        }


        // 前
        public void preOrder() {
            System.out.println(this);
            if (this.left != null) {
                this.left.preOrder();
            }
            if (this.right != null) {
                this.right.preOrder();
            }

        }

        // 中
        public void midOrder() {

            if (this.left != null) {
                this.left.midOrder();
            }
            System.out.println(this);
            if (this.right != null) {
                this.right.midOrder();
            }

        }

        // 后
        public void endOrder() {
            if (this.left != null) {
                this.left.endOrder();
            }
            if (this.right != null) {
                this.right.endOrder();
            }
            System.out.println(this);
        }


    }



