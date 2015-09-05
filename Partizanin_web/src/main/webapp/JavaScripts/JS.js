/**
 * Created by Partizanin on 09.09.2014.
 */
$(document).ready(function () {                        // When the HTML DOM is ready loading, then execute the following function...
    $('#somebutton').click(function () {               // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
        $.get('someservlet', function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
            $('#somediv').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
        });
    });
});