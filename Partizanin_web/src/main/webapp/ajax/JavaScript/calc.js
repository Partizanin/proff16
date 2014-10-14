/**
 * Created by Partizanin on 16.09.2014.
 */


$(document).ready(function () {                                 // When the HTML DOM is ready loading, then execute the following function...
    $('#somebutton').click(function () {
        // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
        function makeRequest() {
            if (window.XMLHttpRequest) { // Mozilla, Safari, ...
                httpRequest = new XMLHttpRequest();
            } else if (window.ActiveXObject) { // IE
                try {
                    httpRequest = new ActiveXObject("Msxml2.XMLHTTP");
                }
                catch (e) {
                    try {
                        httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
                    }
                    catch (e) {
                    }
                }
            }

            if (!httpRequest) {
                alert('Giving up :( Cannot create an XMLHTTP instance');
                return false;
            }

            document.getElementById("ajaxButton").onclick = function () {
                var userName = document.getElementById("ajaxTextbox").value;
                makeRequest('AjaxServletCalculator.java', userName);
            };

            httpRequest.onreadystatechange = alertContents;
            httpRequest.open('GET', Main);
            httpRequest.send();
        }
    });
});
