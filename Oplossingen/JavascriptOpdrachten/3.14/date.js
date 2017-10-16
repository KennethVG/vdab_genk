var months =[["januari",31],
             ["februari",28],
             ["maart",31],
             ["april",30],
             ["mei",31],
             ["juni",30],
             ["juli",31],
             ["augustus",31],
             ["september",30],
             ["oktober",31],
             ["november",30],
             ["december",31]];

function updateMonth(days) {
   var month = document.getElementById("month");
   var index = month.selectedIndex;
   month.options.length = 0;
   var j = 0;
   for(var i = 0; i < months.length; i++) {
      var opt = document.createElement("option");
      opt.text = months[i][0];
      opt.value = i;
      if(months[i][1] < days) opt.disabled="disabled";
      month.options[j++] = opt;
   }
   month.selectedIndex = index;
}

function updateDay(days) {
   var day = document.getElementById("day");
   var index = day.selectedIndex;
   day.options.length = 0;
   for(var i = 0; i < days; i++) {
      var opt = document.createElement("option");
      opt.text = i+1;
      opt.value = i+1;
      day.options[i] = opt;
   }
   day.selectedIndex = index;
}

function monthChanged() {
   var i = this.options[sel.selectedIndex].value;
   updateDay(months[i][1]);
}

function dayChanged() {
   updateMonth(this.selectedIndex+1);
}

function init() {
   var daySelect = document.getElementById("day");
   var monthSelect = document.getElementById("month");
   
   daySelect.addEventListener("change", dayChanged);
   monthSelect.addEventListener("change", monthChanged);
   
   updateMonth(28);
   updateDay(31);
}

window.addEventListener("load", init);
