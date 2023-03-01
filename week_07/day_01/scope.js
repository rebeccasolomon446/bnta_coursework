numbers = [1,2,3,4,5];

// const numberToPrtint = 0; 

// // number is a temp variable for the for loop
// // let number - block scope
// for( let number of numbers) {
//     numberToPrtint = number;
//     console.log("value of numberToPrint inside loop: ", numberToPrtint);
// }

// console.log("value of number outside loop: ", numberToPrtint); // will cause an error when we deifne number with let

const numbersSquared = [];

for(const number of numbers) {
    numbersSquared.push(number ** 2);
}