<word>Inheritence</word> allows us to reuse code without rewriting it. In this case, we'd create a <code>MomBot</code> class that <word>extends</word> <code>Chatterbot</code>. In addition to doing all the things <code>Chatterbots</code> do, <code>MomBots</code> should:

1. Have a variable indicating whether or not they worry.
2. Say hello like a standard chatterbot.
3. Say goodbye in at least two different ways, depending on whether they're a worrier.
4. Have their own <code>void asksQuestion()</code> method.

If you talked to your <code>MomBot</code> for awhile, you might get something like this (but remember: you can make your MomBot sound however you like!):
<pre><code>Hi honey!<br/><span style=\"color:blue\";>Hi!</span><br/>Have you cleaned your room yet?<br/><span style=\"color:blue\";>No</span><br/>Why not?<br/><span style=\"color:blue\";>Goodbye</span><br/>Be safe out there!</code></pre>