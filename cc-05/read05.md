# Singly Linked List
A list ,which contains of nodes that are connected to each other like this:
nodeHead->node1->node2->node3->....->NULL

## Challenge
Create a linkedList and Node classes (Implementation).
create methods in linkedList class to create the list , insert nodes , and check if a certain node is included, and one more method to return the whole list in an organized string.

## Approach & Efficiency

1- create the Node.java 

2- create LinkedList. java

3- create the methods

4- call them from the App.java 

5- test each method

Method getAsString -->Big(O) = O(n) for space and time

Method includes -->Big(O) = O(n) for space and 

Method insert -->Big(O) = O(1) for  and O(n) for space

## API
1- the insert method:
takes in an integer , if the list is empty then create list and the integer would be the head, if not , just add the integer at the first of the nodes.
2- the include method
takes in an integer , and test if the integer value exist as node data ;return true if not return false.
3- the sting method
takes in list ,loop over it and return a string that contain the whole list data.