# super

When implementing <word data-key="inheritance">inheritance</word>, it's sometimes useful for a child <word data-key="classes">class</word> to call its parent's methods. With the `super` keyword, we can do just that.

You can use `super` to do anything the parent could. You can use this in any method or function on a child class. 

## In Constructors

In Java, if a you extend a class without a zero-argument <word data-key="new">constructor</word>, you'll need to use one of the parent's constructors before making your object. For example:

    public class Person {
        // We'll let whoever makes a 'person' specify a name
        private String name;
        
        public Person (String name) {
            this.name = name;
        }
    }


    public class Student extends Person {
        // We don't need to specify a name.
        // Person defines it for us!
        private School school;
        
        public Student(String name, School school) {
            // Note how we don't need a matching constructor, we just have to make our parent class happy
            super(name);
            this.school = school;
        }
    }

## Overriding

`super` is especially useful when overriding methods to extend behavior. For example:

    public class Person {
        private String name;
        
        public Person (String name) {
            this.name = name;
        }
        
        public void morningRoutine() {
            // Wake up
            // Eat breakfast
        }
    }


    public class Student extends Person {
        private School school;
        
        public Student(String name, School school) {
            super(name);
            this.school = school;
        }
        
        // This next annotation reminds us that we're changing what our parent class does.
        @Override
        public void morningRoutine() {
            // hit snooze
            
            // If we left this out, we'd never wake up!
            super.morningRoutine();
            // make sure bag is packed
            // go to school
        }
    }
