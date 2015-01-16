# DesignPatternLearning

## Structural patterns
### Adapter
Helps to access existing interface from another interface (in another words: makes existing classes work with others) without modifying it's source code. Adapter contains an instance of original class.

How to compare this pattern with Decorator? Both are similar, but Decorator adds additional functionality to the original class. Sometimes both patters are called Wrapper.

Core example: java.util.Arrays#asList()

Example: In legacy code Line and Rectangle don't have common interface. Adapter for these classes can implement Shape interface (that contains draw() method).

## Behavioral patterns
### Visitor
Represents an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

It is one way to follow the open/closed principle.

Example: items in a shop, with defined fields. New visitor could be created when there is a need to create a discount for some items. Calculation of the discount is done in visitor keeping original item unchanged.
### Strategy
Also known as policy pattern. Enables an algorithm's behavior to be selected at runtime. 

Core example: java.util.Comparator#compare

Example: solving some algorithm. Interface declares solve() method, but each of it's implementators defines it. Client invokes solve() method and implementation is selected according to object type of used implementator.

### Memento
There are two patterns that could be called Memento:
- ability to restore an object to its previous state
- object that has methods which internally changes the state of the whole instance

Core example: java.util.Date (internally represented by long, thus setter methods change the whole instance)
