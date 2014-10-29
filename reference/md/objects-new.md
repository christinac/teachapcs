# Creating objects
A <word data-key="class">class</word> is a way to describe a concept. A class can define both fields (nouns) and methods (verbs). Think of it like a blueprint in a factory:

* The Class is the design or the blueprint. It's the description of what something is and what it can do.
* Using <word data-key="new">new</word> tells the computer (the factory in this example) to make a new object or instance based on your design.

Take this `Car` class, for example:

    public class Car {
        private String make;
        private String model;
        
        /** The Constructor, instructions on how to make a car */
        public Car() {
            // Instructions
        }
        
        /** A public method. Now anyone can tell a car object to .drive() */  
        public void drive() {
            // TODO figure out how to drive a car
        }
    }
