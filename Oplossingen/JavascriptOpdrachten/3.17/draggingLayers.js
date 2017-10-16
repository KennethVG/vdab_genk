var dragging = false;
var x0=0,y0=0,x=100,y=100;
var layer;

function init(){   
   layer = document.getElementById("layer");
   layer.addEventListener("mouseover",mouseOver);
   layer.addEventListener("mouseout",mouseOut);
   layer.addEventListener("mousedown",mouseDown);
   document.addEventListener("mousemove",mouseMove);
   document.addEventListener("mouseup",mouseUp);
   
   layer.style.visibility="visible";
   layer.style.top = y+"px";
   layer.style.left = x+"px";   
}

function mouseMove(e) {
   if(!dragging) return;
   var difX = e.clientX - x0;
   var difY = e.clientY - y0;
   x0 = e.clientX;
   y0 = e.clientY;
   x += difX;
   y += difY;
   layer.style.top = y+"px";
   layer.style.left = x+"px";
}

function mouseOver(e) {
   layer.style.cursor="move";
}

function mouseOut(e) {
   layer.style.cursor="auto";
}

function mouseDown(e) {
   dragging = true;
   x0 = e.clientX;
   y0 = e.clientY;
   e.preventDefault();
} 

function mouseUp(e) {
   dragging =false;
} 

window.addEventListener("load", init);
