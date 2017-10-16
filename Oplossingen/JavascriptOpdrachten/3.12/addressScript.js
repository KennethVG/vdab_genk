function validate(e) {
   clearErrors();
   var firstName = document.getElementById("firstNameField");
   var firstNameError = document.getElementById("firstNameErrorField");
   var lastName = document.getElementById("lastNameField");
   var lastNameError = document.getElementById("lastNameErrorField");
   var email = document.getElementById("emailField");
   var emailError = document.getElementById("emailErrorField");
   var birthday = document.getElementById("birthdayField");
   var birthdayError = document.getElementById("birthdayErrorField");

   var valid = true;
   if (lastName.value.length == 0) {
      lastName.setAttribute("class", "error");
      lastNameError.innerHTML = "Gelieve je achternaam in te vullen";
      valid = false;
   }

   if (firstName.value.length == 0) {
      firstName.setAttribute("class", "error");
      firstNameError.innerHTML = "Gelieve je voornaam in te vullen";
      valid = false;
   }

   if (!email.value
         .match(/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/)) {
      email.setAttribute("class", "error");
      emailError.innerHTML = "Gelieve een geldig e-mail adres in te vullen";
      valid = false;
   }

   if (!birthday.value.match(/^[0-3]?[0-9][\/][01]?[0-9][\/][0-9]{4}$/)) {
      birthday.setAttribute("class", "error");
      birthdayError.innerHTML = "Gelieve een geldige geboortedatum in te vullen";
      valid = false;
   }

   if (!valid) {
      e.preventDefault();
   }
}

function clearErrors() {
   var firstName = document.getElementById("firstNameField");
   var firstNameError = document.getElementById("firstNameErrorField");
   firstName.removeAttribute("class");
   firstNameError.innerHTML = "&nbsp;";

   var lastName = document.getElementById("lastNameField");
   var lastNameError = document.getElementById("lastNameErrorField");
   lastName.removeAttribute("class");
   lastNameError.innerHTML = "&nbsp;";

   var email = document.getElementById("emailField");
   var emailError = document.getElementById("emailErrorField");
   email.removeAttribute("class");
   emailError.innerHTML = "&nbsp;";

   var birthday = document.getElementById("birthdayField");
   var birthdayError = document.getElementById("birthdayErrorField");
   birthday.removeAttribute("class");
   birthdayError.innerHTML = "&nbsp;";
}

function reset() {
   clearErrors();
}

function init() {
   var form = document.getElementById("addressForm");
   form.addEventListener("submit", validate);
   form.addEventListener("reset", reset);
}

window.addEventListener("load", init);
