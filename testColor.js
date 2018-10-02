//Here's how you might test the solution
//Change Paragraph Color Solution and Evaluation

describe('paragraph', function() {
   it('should exist', function() {
       expect(document.getElementsByTagName('p').length).not.toEqual(0);
   });
   
   it('should not be empty', function() {
       var p = document.getElementsByTagName('p')[0];
       expect(p.textContent.trim().length).not.toEqual(0);
   });
   
   it('should be blue', function() {
       var p = document.getElementsByTagName('p')[0];
       expect(getComputedStyle(p).color).toEqual('rgb(0, 0, 255)');
   });
});
 
describe('button', function() {
   it('should exist', function() {
       expect(document.getElementsByTagName('button').length).not.toEqual(0);
   });
   
   it('should change the paragraph color', function() {
       var p = document.getElementsByTagName('p')[0];
       var button = document.getElementsByTagName('button')[0];
       button.click();
       expect(getComputedStyle(p).color).toEqual('rgb(255, 0, 0)');
   });
});