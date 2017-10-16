function validate(e) {
   var valid = true;
   var firstNameField = document.getElementById("firstName");
   var lastNameField = document.getElementById("lastName");

   if (firstNameField.value.length == 0) {
      valid = false;
      firstNameField.setAttribute("class","error");
   } else {
      firstNameField.removeAttribute("class");      
   }

   if (lastNameField.value.length == 0) {
      valid = false;
      lastNameField.setAttribute("class","error");
   }else {
      lastNameField.removeAttribute("class");      
   }

   if (!valid) {
      alert("Gelieve je voornaam en achternaam in te vullen!");
      e.preventDefault();
   }
}

function init() {
   var form = document.getElementById("myForm");
   form.addEventListener("submit", validate);
}

window.addEventListener("load", init);
