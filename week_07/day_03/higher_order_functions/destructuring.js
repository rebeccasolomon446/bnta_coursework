const numbers = [10,20,30,40,50];

const [ten, twenty, ...rest] = numbers;


console.log(rest); // output: [30,40,50]

const [...clonedNumbers] = numbers;
clonedNumbers[0] = 1;
console.log(clonedNumbers);

// OBJECT DESTRUCTURING

const person = {
    name: "Zolt",
    age:66
}

//const name = person.name;
// const age = person.age;

const {name,age} = person;
console.log(name);
console.log(age);

const props = [
    {id:1, name:"Fizz"},
    {id: 2, name: "Buzz"},
    {id: 3, name: "FizzBuzz"}
]

const [, , {id}] = props;

console.log(id)