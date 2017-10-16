function select(e) {   
   var selection = document.getElementById("selection");
   var body = document.getElementById("body");
   var option = selection.options[selection.selectedIndex];
   body.setAttribute("style","background-color:" + option.value);
}

function init() {
   var sel = document.getElementById("selection");   
   sel.addEventListener("change", select);
}

window.addEventListener("load", init);
