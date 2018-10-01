function matchesPage(query, pages) {
  /* TODO: Return the number of pages that match the search query. */
  var idx = 0;
  for (var i = 0; i < query.length; i++) {
      var word = query[i];
      var position = page.indexOf(word, idx);
      if (position === -1) {
          return false;
      } else {
        idx = position + word.length;
      }
  }  
  return true;
}

function search(query, pages) {
    return pages.reduce((prev, page) => {
        return prev + (matchesPage(query, page) ? 1: 0);
    }, 0);
}

var TESTS = [
    [
        ["word"],
        ["word"],
        1,
        "should match a page identical with the query"
    ],

    [
        ["slow"],
        ["slowly"],
        1,
        "should match words that are part of bigger words"
    ],

    [
        ["one", "two", "three"],
        ["one   two three "],
        1,
        "should match a page that has only the query words, separated by whitespace"
    ],

    [
        ["a", "b", "c"],
        ["x a y b z c t"],
        1,
        "should match a page that has the query words, separated by other words"
    ],

    [
        ["word"],
        [],
        0,
        "should return 0 if no pages are provided"
    ],

    [
        ["one", "two", "three"],
        ["one two"],
        0,
        "should not match a page that doesn't have all the query words"
    ],

    [
        ["a", "b", "c"],
        ["a b c", "x a y b z c t", "a b"],
        2,
        "should count the number of pages that match the query"
    ],

    [
        ["a", "b", "c"],
        ["A b c"],
        0,
        "should work with case-sensitive queries"
    ],

    [
        ["a", "b", "c"],
        ["a c b"],
        0,
        "should match words in the same order as in the query"
    ],

    [
        ["one", "new", "test"],
        ["onew test"],
        0,
        "should not allow the same characters in the page to belong to different words from the query"
    ]
];
describe("search()", function () {
    TESTS.forEach(function (test, idx) {
        var [query, pages, result, name] = test;
        var queryString = JSON.stringify(query, null, "  ");
        var pagesString = JSON.stringify(pages, null, "  ");
        var message = `Your code is expected to return ${result} ` +
            `for the following input:\n\n` +
            `query = ${queryString}\n\n` +
            `pages = ${pagesString}\n`;
        it(name, function () {
            expect(search(query, pages)).toEqual(result, message);
        });
    });
});
