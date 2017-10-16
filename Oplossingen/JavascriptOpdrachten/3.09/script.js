function init(e) {
   //var dateNode = document.getElementById("date");
   var dateNode = $("date");
   
   var today = new Date();
   var hour = today.getHours();
   var greeting ="";
   var className ="";
   if(hour <= 11) {
      greeting = "Goede morgen!";
      className="morning";
   }
   else if(hour <= 16) {
      greeting = "Goede middag!";
      className="noon";
   }
   else {
      greeting = "Goede avond";
      className="evening";
   }
      
   var strongNode = document.createElement("strong");
   var greetingNode = document.createTextNode(greeting);   
   var textNode = document.createTextNode(today.toLocaleString());
   
   dateNode.appendChild(greetingNode);
   dateNode.appendChild(strongNode);
   strongNode.appendChild(textNode);
   
   var image = "sun.png";
   if(hour < 7 || hour > 20 ) {
      image = "moon.jpg";
   } 
   
   //var imageNode = document.getElementById("img");
   var imageNode = $("img");

   imageNode.setAttribute("src",image);
   imageNode.setAttribute("width",100);
   imageNode.setAttribute("height",100);

   //dateNode.setAttribute("class",className);
   $("date").setAttribute("class",className);
}

var $ = function(id) {
	return window.document.getElementById(id);
};

window.addEventListener("load", init);
