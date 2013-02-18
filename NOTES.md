Notes/Changes from original:

-Abandoning jQuery template cause it's a bad idea to wait to
generate on the client what we know before the user arrives.

-The original table that the cards are in was enforcing layout by generating a
<tr> every 4th card.  This is better implemented in CSS using floats.

-Turns out a dynamic layout with no hard return is visually better and
 easier to implement.
