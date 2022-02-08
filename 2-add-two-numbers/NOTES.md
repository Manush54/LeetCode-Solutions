<h1> Input : </h1>
Two Linked Lists consisting of some "ListNode"s containing "val" and "next" where<br>
<li>val = Single Digit Number<br>
<li>next = Link to next node

<h1> Approach</h1>

<ol>
<li>Create a dummy ListNode and assign it as Head of a new Linked List (Resultant)
<li>Run a loop taking one element of both lists until all the elements of both the linked lists are traversed i.e != null
<li> Sum of two digits = Sum of both elements of the linked list + carry
<li> carry = Sum / 10 (e.g. 4/10 = 0, 10/10 = 1)
<li> sum without carry = Sum % 10 (eg. 4 % 10 = 4)
<li> Increment all the linkedlists
<li> Repeat
<li> Check if any carry is left after both the linked lists are traversed.. add the carry to resultant LL if any
<li> Return Resultant LL
<ol>
