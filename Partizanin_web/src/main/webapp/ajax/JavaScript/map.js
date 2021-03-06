/**
 * Created by Partizanin on 17.09.2014.
 */
$(document).ready(function () {                                        // When the HTML DOM is ready loading, then execute the following function...
    $('#somebutton').click(function () {                               // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
        $.get('mapServlet', function (responseJson) {                 // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response JSON...
            var $select = $('#someselect');                           // Locate HTML DOM element with ID "someselect".
            $select.find('option').remove();                          // Find all child elements with tag name "option" and remove them (just to prevent duplicate options when button is pressed again).
            $.each(responseJson, function (key, value) {               // Iterate over the JSON object.
                $('<option>').val(key).text(value).appendTo($select); // Create HTML <option> element, set its value with currently iterated key and its text content with currently iterated item and finally append it to the <select>.
            });
        });
    });
});