# Graphs
Graphs are non-linear data structures, contains of vertices and edges, edges could be weighted.

## Challenge
Implement graph with the methods add vertex , add edge (weighted or not), get all nodes, get neighbours, get size of graph.
And implement tests for the graph implementation.

## Approach & Efficiency

I used hashmap, linkedlist List build in methods, to do my implementation.

Complexity

addVertex => Time = O(1) as there are no loops & Space = O(n) because we used a set.

addEdge and addEdgeWithWeight => Time = O(1) as there are no loops & Space = O(n) because we used a set.

getVertexCount => O(1) for both time and space , no loops and no objects or built in methods.

getNodes and getNeighbour => Time = O(n^2) as I used nested for loop & Space=  O(n) because I used the StringBuilder. 

## API
addVetrex is for adding a node to the graph.

addEgde, for adding edges between 2 nodes.

addEdgeWithWeight is for add weighted edges between 2 nodes.

getVertexCount for getting the size of the graph (how many nodes).

getNodes to get the graph listed.

getNeighbour to get the adjacent nodes.


[Reference For Graph Implementation](https://www.geeksforgeeks.org/implementing-generic-graph-in-java/)