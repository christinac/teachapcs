String str = "Hello world!";

str.indexOf("World");	//-1
str.indexOf("world");	//7
str.indexOf("world", 10)	//-1
str.indexOf("hi");	//-1
str.indexOf("Hello world!");	//0
str.indexOf("!", 10)	//12