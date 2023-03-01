// doing all this so we can use code that someone else has written
// in this file i will use a lib i have down;paded found in node modules. Library to use is 'five'
// need to specify which lib since would often have more than one.
// assign the package to const five.
const five = require('five');

console.log(five.upHigh());  // output: smaller five higher up on line

// when you createvyour nmp file, need to do npm init to add the package.json file to it
// without this, will not be able to download libraries
// then once in the file, open terminal and input the librar to download. eg if it were 'five' : npm install five