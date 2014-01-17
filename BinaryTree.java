package com.bioyinyang.database;

/** BinaryTree  defines  the data type of binary trees:
    * (i) a leaf, or
    * (ii) a node that holds a value/object, a left subtree, and a right subtree.
    * Methods listed below should be overridden as needed by subclasses. */
public abstract class BinaryTree
 {  /** value returns the value held with a tree node
      * @return the value  */
    public Object value()
    { throw new RuntimeException("BinaryTree error: no value"); }
 
    /** left  returns the left subtree of this tree
      * @return  the left subtree  */
    public BinaryTree left()
     { throw new RuntimeException("BinaryTree error: no left subtree"); }
    
    /** right  returns the right subtree of this tree
         * @return  the right subtree  */
       public BinaryTree right()
        { throw new RuntimeException("BinaryTree error: no right subtree"); }
  }

 
