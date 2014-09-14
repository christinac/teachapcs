function getRain(){
	return Math.floor(Math.random() + .5) === 1;
}

function getTemp(){
	return Math.floor(Math.random() * 100 + 1);
}

var temperature = getTemp();
var willRain = getRain();

console.log("Temperature: " + temperature);
console.log("Will it rain?: " + willRain);

if(willRain){
	console.log("Bring your umbrella!");
}else{
	console.log("Leave your umbrella at home!");
}

if(temperature < 50){
	console.log("Bring a jacket too!");
}