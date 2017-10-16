/* This file contains JavaScript functions to handle cookies */

/*
 * This function creates a cookie.
 * 
 * Arguments:
 * -----------
 * name:	   Name of the cookie. 
 * content: Content of the cookie.
 * days:	   Number of days from now before expiration.
 * hours:	Number of hours from now before expiration.
 * minutes: Number of minutes from before expiration.
 */
function setCookie(name, content, days, hours, minutes) {
   days = days || 0;
   hours = hours || 0;
   minutes = minutes || 0;
   var now = new Date();
   var exp = new Date(now.getTime()
         + (((((days * 24) + hours) * 60) + minutes) * 60000));
   document.cookie = encodeURIComponent(name) + "=" + encodeURIComponent(content) +
                     ";expires=" + exp.toUTCString();
}

/*
 * This function gets the content of a cookie.
 * 
 * Arguments: ---------- name: Name of the cookie.
 */
function getCookie(name) {
   var regex = new RegExp(name + "=([^;]+)");
   var result = regex.exec(document.cookie);
   if (result)
      return decodeURIComponent(result[1]);
   else
      return null;
}

/*
 * This function clears a cookie.
 * 
 * Arguments: ---------- name: Name of the cookie.
 */
function clearCookie(name) {
   setCookie(name, "", -1);
}

/* This array contains a list of text-types (including HTML5) */
var textTypes = ["text","color","date","datetime","datetime-local","email","month","number","range","search","tel","time","url","week"];

/*
 * This function fill a form with data from a cookie. Arguments: ----------
 * form: The form to fill.
 */
function loadForm(form) {
   with (form) {
      for ( var i = 0; i < elements.length; i++) {
         if (textTypes.indexOf(elements[i].type) >=0 ) {
            elements[i].value = getCookie(elements[i].name) || "";
         }
      }
   }
}

/*
 * This function write all text-content to a cookie. Arguments: ---------- form:
 * The form
 */
function saveForm(form) {
   with (form) {
      for ( var i = 0; i < elements.length; i++) {
         if (textTypes.indexOf(elements[i].type) >=0 ) {
            setCookie(elements[i].name, elements[i].value, 1, 0, 0);
         }
      }
   }
}
