
const {Calculator} = require('./Calculator');

// test 1
// Arrange
// Act - call function we are actually testing
// Assert - check value against our expectation

let calculator;

beforeEach(() => {
    // block scoped. So cannot be accessed outside. line 9 is the solution 
    calculator = new Calculator();
})
// descrtibing what group of tests do
describe('testing addition', () => {
    test('can add two positive numbers', () => {
        const expected = 5;
        const actual = calculator.add(2,3);
        expect(actual).toBe(expected);
    })

    test("can add a negative and positive number", () => {
        const expected = -2;
        const actual = calculator.add(-5,3);
        expect(actual).toBe(expected);
    })
})
