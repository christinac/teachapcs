#General form of functions
The general form of any Java function looks like:

    <visibility> <returnType> <functionName> (<type parameterName>, <type parameterName> ...){
    }

Here's a a more concrete example:

    public int addTwo(int favNumber){
        return favNumber + 2;
    }

Which could be used like this:

    int myNum = 4;
    newNum = addTwo(myNum);         // Now, newNum = 6

Let's go through each piece of the general form:

##`<visibility>`
Tells us which objects can call, or use, this method. It can be one of the following keywords:

- <word data-key="public">public</word>: all objects can call this method
- <word data-key="protected">protected</word>: all objects in this class or its subclasses can access this method
- <word data-key="private">private</word>: only objects in this class can access the method 

Visibility is optional. If you don't specify it, Java defaults to [packaged private](http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html), meaning it's visible to all classes in the same <word data-key="package">package</word..

##`<returnType>`
Tells us what <word data-key="type">type</word> this method will give back. It can be:

+ <word data-key="void">void</word>
+ <word data-key="int">int</word>
+ <word data-key="double">double</word>
+ <word data-key="boolean">boolean</word>
+ <word data-key="string">String</word>
+ <word data-key="object">Object</word>
+ Or any custom object that you define


##`<functionName>`
What we're calling this function. You can use whatever you like, though it's convention (and helpful to people who might read your code) to choose a verb that describes what the method does.

##`<parameterList>`
A comma-separated list of the <word data-key="parameter">parameters</word> the method will use, e.g. `int favNum` or `boolean willRain`.
