# DesignPatternLearning

## Behavioral patterns
### Visitor
Represent an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
It is one way to follow the open/closed principle.
Example: items in a shop, with defined fields. New visitor could be created when there is a need to create a discount for some items. Calculation of the discount is done in visitor keeping original item unchanged.
### Strategy
Also known as policy pattern. Enables an algorithm's behavior to be selected at runtime. 
Core example: java.util.Comparator#compare
Example: solving some algorithm. Interface declares solve() method, but each of it's implementators defines it. Client invokes solve() method and implementation is selected according to object type of used implementator.
