var name = window.prompt("Geef uw naam: ", "");
var answer = window.confirm("Is je naam correct? " + name);
if (answer) {
	window.alert("Hallo " + name);
} else {
	window.alert("No name");
}

