function init(e) {
   var dateNode = document.getElementById("date");
   var today = new Date();
   var hour = today.getHours();
   var greeting ="";
   if(hour <= 11) {
      greeting = "Goede morgen!";
   }
   else if(hour <= 16) {
      greeting = "Goede middag!";
   }
   else {
      greeting = "Goede avond";
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
   
   var imageNode = document.getElementById("img");
   imageNode.setAttribute("src",image);
   imageNode.setAttribute("width",100);
   imageNode.setAttribute("height",100);
   
}

window.addEventListener("load", init);
