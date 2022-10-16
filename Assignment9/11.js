// Write a JavaScript program to validate an email ID. 

function validateEmail(email) {
    var re = /\S+@\S+\.\S+/; // regex for email validation. here \S means non-whitespace character and + means one or more.
    return re.test(email);
}

console.log(validateEmail("dcadfadf@fafaef.com"));
console.log(validateEmail("dcadfadf"));


//Output:
//true
//false
