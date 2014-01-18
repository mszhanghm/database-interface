package com.bioyinyang.database;


public class Database{
 private BinaryTree base; // database with binary search tree structure
  

  /** Constructer  Database() initialize as any empty tree (Leaf)
    * @param  */

  public Database()
    { base = new Leaf();}
       
   public void insert(Record rec)
   {  
    base = insertNode(rec, base); //helper function below
   }
   

       /** insert  inserts a recored its proper position in an ordered tree
           *param v - the Record to be inserted
           *param t - the existing tree
           *return (the address of) a tree that looks just like 
           *      except it holds v as well */
        private static  BinaryTree insertNode(Record v, BinaryTree t)
            {  
               BinaryTree answer;
              
              if (t instanceof Leaf)
                 answer = new Node(v,new Leaf(), new Leaf());
              else {
                 if ( (v.getKey()).biggerthan( ( (Record) t.value()).getKey()) )
                    { BinaryTree new_left = insertNode(v, t.left());
                    ((Node)t).setLeft(new_left); }
                 else
                    { BinaryTree new_right = insertNode(v, t.right());
                      ((Node) t).setRight(new_right); }
                    answer = t;
                    }
                 return answer;
            }


   public Node find(Key k)
    { 
      return find(k, base);
    }



         /** find  searches for an object in an ordered tree
           * @param k - the key of the object to be found
           * @return  the address of the Node within t where k is found; 
           *      if k is not found in t, return null */
        
         private static  Node find(Key k, BinaryTree t)
          {  
             Node found;  // holds the address of the Node where k is found in t
             if ( t instanceof Leaf )
               { found = null; }
             else // t is Node, worth trying
               { if ( ((Record) t.value()).getKey().equals(k))
                    {found = (Node)t; }
                 else if ( ( (Record) t.value()).getKey().biggerthan(k) )
                    { found = find(k, t.left()); }
                 else
                    { found = find(k, t.right()); }
                }
             return found;
           }
 }   
          
