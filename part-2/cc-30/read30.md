# Hashtables
Implementaion of Hash-Table , maps keys to value. 

## Challenge
Implement the hash-table with methods and write tests to check the implementation.

## Approach & Efficiency
I implemented this by creating nodes of 2 values , the key value is hashed using the .hashCode method.

Efficiency:

1. add: Space -> O(n) - Time -> O(n)

2. contains: Space -> O(n) - Time -> O(n)

3. hash: Space -> O(1) - Time -> O(1)

4. get: Space -> O(1) - Time -> O(n)

## API
1. add: To add key,value pairs to the hash table.

2. contains: check if the hash table contains the provided key or not by returning a boolean.

3. hash: get the index of a key.

4. get: get the value of the key.



* [Reference](https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/?ref=rp)