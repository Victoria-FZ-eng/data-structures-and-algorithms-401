# Trees

Trees are data structures there are binary trees and k-arr trees , and each have its own structure. 
We use them to make dealing with data easier.

## Challenge

Create the traversals' method for a binary tree (post order, pre order, in order).
And Implement a Binary-Search tree with the methods(Add and Contains).

## Approach & Efficiency

I used the pseudo code from the reading. 

for Binary-Search methods(add and contains)

Big(O) time = O(1)

Big(O) space = O(n)

for traversals methods(add and contains)

Big(O) time = O(h)

Big(O) space = O(1)

## API

preOrder: view the tree in the order => root >> left >> right

inOrder: view the tree in the order => left >> root >> right

postOrder: view the tree in the order => left >> right >> root

addBinarySearchTree: adding nodes in the right positions (left if vlaue is smaller than root and right if it's larger than the root )

contains: returns true when the value exists in the tree , and false when not.