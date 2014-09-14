#equals(Object)
Each <word data-key="object">object</word>, include those you create, has an `equals(Object)` method that's <word data-key="inherit">inherited</word> from the `Object` superclass. 

The default `equals(Object)` methods checks whether the two objects have the same address in memory. It doesn't care about any of the values the objects have, because the `Object` <word data-key="superclass">superclass</word> can't see those values.

Here's an example, using a `Chatterbot` <word data-key="object">object</word> that (assume) we've defined elsewhere.

    Chatterbot president = new Chatterbot("Barack");
    Chatterbot barack = president;

    president.equals(barack);
    true

    barack = new Chatterbot("Barack");

    president.equals(barack);
    false;

If we wanted two chatterbots to be the same if they had the same name, we'd have to override the `equals(Object)` <word data-key="method">method</word> in our `Chatterbot` <word data-key="class">class</word>:

    public class Chatterbot{
        // implementation of the Chatterbot
         
        public boolean equals(Object obj){
          Chatterbot second = (Chatterbot) obj;
          return this.name == second.name;
        }
    }

A few things worth pointing out:

1. The method's signature is `equals(Object)`, not `equals(Chatterbot)` so we can override the `equals(Object)` method from the Object superclass. If we change the method signature to `equals(Chatterbot)`, we'll be <word data-key="overload">overloading</word>, not <word data-key="override">overriding</word>, the method.
2. We're stuck with a parameter of type `Object`, but we know it'll always be a `Chatterbot` – so we <word data-key="cast">cast</word> `Object obj` to `Chatterbot`.