function onmouseclick(e) {
   var popup = document.getElementById("popup");
   if (e.button == 0) {
     popup.style.visibility = "visible";
     popup.style.left = e.clientX +"px";
     popup.style.top = e.clientY +"px";
   }
}

function init() {
   var area = document.getElementById("area");
   area.addEventListener("click", onmouseclick);
}

window.addEventListener("load", init);
