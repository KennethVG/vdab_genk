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
   
   dateNode.innerHTML = greeting +"<br /><strong>" +today.toLocaleString() +"</strong>";
   
//   var strongNode = document.createElement("strong");
//   var textNode = document.createTextNode(today.toLocaleString());
//   
//   dateNode.appendChild(strongNode);
//   strongNode.appendChild(textNode);
}

window.addEventListener("load", init);
