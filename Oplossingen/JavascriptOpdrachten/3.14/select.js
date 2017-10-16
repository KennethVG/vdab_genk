function select(e) {
   var form  = document.getElementById("myForm");
   var selection = document.getElementById("selection");
   var option = selection.options[selection.selectedIndex];
   alert("U heeft gekozen voor: " + option.value);
   form.submit();
}

function init() {
   var selection = document.getElementById("selection");
   
   selection.addEventListener("change", select);
}


window.addEventListener("load", init);
