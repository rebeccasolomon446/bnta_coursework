// const sum = (number1, number2) => {
//     console.log(number1 + number2);
// }
// const substract = (number1, number2) => {
//     console.log(number1 - number2);
// }

// function to check which function we want to use
const doCalculation = (number1, number2, callback) => {
    callback(number1, number2)
}

doCalculation(3,6,sum);
doCalculation(3,6,substract);