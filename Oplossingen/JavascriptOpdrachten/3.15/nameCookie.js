var name = getCookie("name");
if(name == null || name=="null") {
   name = window.prompt("Geef je naam :","");
   setCookie("name",name,0,0,5);
}
window.alert("Hallo " + name);
