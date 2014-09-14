#External Resources
Java is open-ended, and you can include code written by others in your program. You might want to do this if someone else has written a better or easier way of accomplishing something your project should do, like picking out a random number for a dice game.

If you use an external resource, you'll have to understand its API, or Application Programming Interface. APIs tell you which methods can be accessed, how to access them, and what you'll get back. They don't tell you *how* the developer implemented the methods though.

Java has APIs, which you use every time you use one of its classes, like Double, Integer, String, or Boolean. Java imports those classes into your project automatically. You'll need to import nearly all other APIs to your project directly.

For example, you can import the <word data-key="random">Random</word> class – which helps calculate random numbers - by putting this at the top of your program:

    import java.util.Random;

Or more generally:

    import java.<packageName>.<subpackageName>.<className>;

Packages are groups of related classes "packaged" together. Packages serve the same purpose as folders on your computer or phone: they make specific classes easier to find.