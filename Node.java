package com.bioyinyang.database;

/** Node  models a nonempty tree node, holding a value and two subtrees */
 public class Node extends BinaryTree
 { private Object value;
   private BinaryTree left;
   private BinaryTree right;

   public Node(Object v, BinaryTree l, BinaryTree r)
    { value = v;
      left = l;
      right = r;
    }

   public Object value()
   { return  value; }

   public BinaryTree left()
   { return   left; }
   
   public BinaryTree  right()
   { return  right; }

   public void setLeft(BinaryTree new_left)
   { left = new_left; }
  
   public void setRight(BinaryTree new_right)
   { right = new_right; }
}
