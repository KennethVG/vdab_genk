function selectLanguage() {
   setCookie("language",this.name,1);
   forward(this.name);
}

function forward(value) {
   switch(value) {
      case "en": location.replace("English.html"); break;
      case "nl": location.replace("Dutch.html"); break;
      case "fr": location.replace("French.html"); break;
   }
}

function init() {
   var lang = getCookie("language");
   if(lang != null) {
      forward(lang);
      return;
   }
   var dutchButton = document.getElementById("dutch");
   var englishButton = document.getElementById("english");
   var frenchButton = document.getElementById("french");
   dutchButton.addEventListener("click",selectLanguage);
   englishButton.addEventListener("click",selectLanguage);
   frenchButton.addEventListener("click",selectLanguage);
}

window.addEventListener("load", init);

