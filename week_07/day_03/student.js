const Laptop = require('./laptop');  // import what laptop expoerted

// creating a constructor function
// purpose to start instantiating objects
// constructor will contain regular function and not arrow becasue arrow functions do not work when we create new 
// student objects.
const Student = function(name) {
// adding properties:
    this.name = name;
    this.laptop = null; // output: Alice Student { name: "Alice" }
    // don't really include functions in constructors:
    // forcing object to carry it everywhere it goes. not very performant, using uncessecary memory space.
    // resort to prototypes instead

    // below method no longer needed aftermaking a prototpye
    // this.greet = function(){
    //     console.log(`Hey, my name is ${name}`)
    // }
};

// Prototype
// shared common behaviour for all Student objects
Student.prototype.greet = function() {
    console.log(`Hey, my name is ${this.name}`)
}
// class (constructor function) interaction
Student.prototype.buyLaptop = function(newLaptop) {
    this.laptop = newLaptop;
    this.laptop.install("Zoom");
}

const macbook = new Laptop("Apple", "MacBook Pro", "OSX");

// so that the prototype recognises this.name
const alice = new Student("Alice");

// USING PROTOTYPES REMOVES THE ANAONYMOUS FUNCTION FROM EACH STUDENT'S OBJECT

// can make any function act like a constructor function by adding new before funciton call.
// this is what allows the const function to churn out Student objects
// const alice = new Student("Alice");

console.log("Alice", alice);

alice.greet();

console.log(macbook);

alice.buyLaptop(macbook);