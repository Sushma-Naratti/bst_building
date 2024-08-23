public class bst_building {
      static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                  this.data = data;
            }
      }

      public static Node insert(Node root, int val) {
            if (root == null) {
                  root = new Node(val);
                  return root;
            }
            if (root.data > val) {
                  // left tree
                  root.left = insert(root.left, val);

            } else {
                  root.right = insert(root.right, val);
            }
            return root;
      }

      public static void inorder(Node root) {
            if (root == null) {
                  return;
            }
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
      }

      public static boolean searchKey(Node root, int key) {
            if (root == null) {
                  return false;
            }
            if (root.data > key) {
                  return searchKey(root.left, key);
            } else if (root.data == key) {
                  return true;
            } else {
                  return searchKey(root.left, key);
            }
      }

      public static void main(String[] args) {
            int values[] = { 5, 1, 3, 4, 2, 7 };
            Node root = null;
            for (int i = 0; i < values.length; i++) {
                  root = insert(root, values[i]);
            }
            bst_building bst = new bst_building();
            bst.inorder(root);

            // search in bst
            System.out.println("key found..: " + bst.searchKey(root, 10));

            // delete node

      }
}