function updateTime() {
	var clock = document.getElementById("clock");
	var now = new Date();
	clock.innerHTML = now.toLocaleTimeString();
}

function init() {
	updateTime();
	setInterval(updateTime, 1000);
}

window.addEventListener("load", init);
