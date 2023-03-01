// METHODS V FUNCTIONS
// methods are called on an object. functions are called on their own.
//"hello".upperCase() method called on string thus a METHOD
// functions are often custom made.
// typeof("string") - stand alone functionality

// Uppercase C because we are making a constructor function
// added a function add inside that we can call later
const Calculator = function() {
    this.add = function(number1, number2) {
        return number1 + number2;
    }

}

module.exports = {Calculator} 

// First 
// const add = function(number1, number2) {
//     return number1 + number2;
// }

// // exporting module file
// module.exports = {add} // only things that are exported can be imported


