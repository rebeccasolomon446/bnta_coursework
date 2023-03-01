const numbers = [1,2,3,4,5,6,7,8,9,10]

//callback
const printElement = (itemFromArray) => {
    console.log(itemFromArray);
}

const printDoubleAmount = (itemFromArray) => {
    console.log(itemFromArray *2);
}

// for(let i = 0; i < numbers.length; i++) {
//     printElement(numbers[i])
// }

// enumerators are higher order functions
numbers.forEach(printElement);
numbers.forEach(printDoubleAmount);

//call function for each number  // what is happening on line 17
numbers.forEach((number) => {
    console.log(number);
})
// above function can also be written as: numbers.forEach(number => console.log(number))

// MAPPING - enumeration method does operation against each element in given array, without changing originonal array
const doubledNumbers = numbers.map((number) => {
    return number * 2;
});
// can also be written as: const doubledNumbers = numbers.map(number => number * 2)

console.log(doubledNumbers);

// FILTERING
const evenNumbers = numbers.filter((number) => {
    return number % 2 === 0;
})

console.log(evenNumbers);

//REDUCE
const total = numbers.reduce((accumulator, number) => {
    return accumulator + number;
}) // output: 55

students = [
    {name: "Zsolt", scroe: 4},
    {name: "Anna", score: 8}
]

const totalScore = students.reduce((accumulator, student) => {
    return accumulator + students.score;
}, 0)

console.log(total);

