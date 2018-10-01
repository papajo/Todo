/* FizzBuzz in JavaScript */

function fizzbuzz (n) {
  var out = [];
    for (var i = 1; i <= n; i++) {
    if (i % 15 === 0) {
      out.push('FizzBuzz');
        } else if (i % 5 === 0) {
      out.push('Buzz');
        } else if (i % 3 === 0) {
      out.push('Fizz');
        } else {
      out.push(i)
        }
  }
  return out;
}

//fizzbuzz(15);

describe('fizzbuzz()', function () {
  it('should return [1] for n = 1', function () {
    expect(fizzbuzz(1)).toEqual([1]);
  });

  it('should work for the example given', function () {
    expect(fizzbuzz(15)).toEqual([
      1, 2, "Fizz", 4, "Buzz",
      "Fizz", 7, 8, "Fizz", "Buzz",
      11, "Fizz", 13, 14, "FizzBuzz"
    ]);
  });
});