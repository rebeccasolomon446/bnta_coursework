// named function
function greet(timeOfDay, name) {
    return `Good ${timeOfDay}, ${name}!`;
}

const greeting = greet("morning", "Iain");
// console.log(greeting);

// Anonymous functions
// anything we can do to objects can be done to functions - first order object
// functions always declared as const, you would never want to reassign it.
// does not have hoisting behaviour (calling a function before defining it)
const sum = function(number1, number2) {
    return number1 + number2;
}

const total = sum(1,2);
console.log(total);

// Arrow functions
// does not have hoisting behaviour (calling a function before defining it)
const multiply = (number1, number2) => {
    return number1 * number2;
}

const product = multiply(2,5);
console.log(product);