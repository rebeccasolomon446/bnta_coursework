// GUESS 1 ///////////////////
// let guess = {
//   hair_colour: "red",
//   eye_colour: "blue",
//   hat: false,
//   glasses: true,
//   firstName: "Joseph",
// };

// const guessWho = function () {
//   return `Guess who is ${guess.firstName}`;
// };

// const finalAnswer = guessWho();
// console.log(finalAnswer);

// prediction: should print 'Guess who is Joseph'because the guess object can be assessed in the function via dot notation

// GUESS 2 ///////////////////

// let firstName = "Donna";

// const guessWho = function () {
//   const glasses = false;
//   let firstName = "Liz";
//   return `Guess Who is ${firstName}.`;
// };

// const guess1 = guessWho();
// console.log("guess1: ", guess1);
// // prediction: should work and print "Guess Who is Liz"

// const guess2 = `Guess Who is ${firstName}`;
// console.log("guess2: ", guess2);
// // prediction: should print "Guess Who is Donna". Because guess2 is not referring to the guessWho() method
// // and we also have a global scope firstName which has a value of Donna.


// // GUESS 3 ///////////////////

// const guess = {
//   hair_colour: "black",
//   eye_colour: "brown",
//   hat: false,
//   glasses: false,
//   firstName: "Andy",
// };

// const changeHat = function () {
//   guess.hat = !guess.hat; //true?
// };

// const changeGuess = function (newName) {
//   guess.firstName = newName;
// };

// const guessWho = function () {
//   return `Guess Who is ${guess.firstName}`;
// };

// changeHat(); // method invoked, now guess.hat = true

// if (guess.hat) {
//   changeGuess("Chris");  // guess.firstName = "Chris"
// } // its true

// const finalAnswer = guessWho();
// console.log(finalAnswer);

// prediction: "Guess Who is Chris"

// // GUESS 4 ///////////////////

// let firstName = "Gail";

// if (firstName === "Gail") {
//   let firstName = "Ashley";
// }

// const guessWho = function () {
//   return `Guess Who is ${firstName}`;
// };

// const finalAnswer = guessWho();
// console.log(finalAnswer);

// prediction: "Guess Who is Ashley"
//its acc "Guess Who is Gail". I think this is because let firstName = "Ashely" is defined in the if statement
// making is a local scope variable. And firstName = "Gail" is defined globally.

// // GUESS 5 ///////////////////

const guess = {
  hair_colour: "blonde",
  eye_colour: "brown",
  hat: false,
  glasses: false,
  firstName: "Jennifer",
};

const changeGuess = function () {
  guess = {
    hair_colour: "blonde",
    eye_colour: "blue",
    hat: false,
    glasses: false,
    firstName: "Kyle",
  };
};

changeGuess();
console.log(`Guess Who is ${guess.firstName}`);

// prediction :  error, guess is declared constant, so can't reasign it.
// to fix, change const guess to let guess
