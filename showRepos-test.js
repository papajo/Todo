describe('jQuery', function() {
    it('should be included', function() {
        expect($).toBeDefined();
        expect(jQuery).toBeDefined();
    });
});
 
describe('input', function() {
    it('should exist', function() {
        expect($('input#username').length).toEqual(1);
    });
});
 
describe('unordered list', function() {
    var ul = $('ul#results');
    it('should exist', function() {
        expect(ul.length).toEqual(1);
    });
 
    it('should be initially empty', function() {
        expect(ul.children().length).toEqual(0);
    });
});
 
describe('button', function() {
    var button = $('button#get-repos');
    var ul = $('ul#results');
 
    it('should exist', function() {
        expect(button.length).toEqual(1);
    });
 
    it('should make a jQuery.get() request to GitHub', function() {
        spyOn($, 'get').and.returnValue($.Deferred());
        button.click();
        expect($.get).toHaveBeenCalled();
    });
 
    it('should populate the list with results', function() {
        var response = $.Deferred();
        spyOn($, 'get').and.returnValue(response);
        button.click();
        response.resolve([
            {name: 'First repo'},
            {name: 'Second repo'}
        ]);
        expect(ul.children().length).toEqual(2);
        expect(ul.children().eq(0).text().trim()).toEqual('First repo');
        expect(ul.children().eq(1).text().trim()).toEqual('Second repo');
    });
 
    it('should first clear the list before showing results from another query', function() {
        var response = $.Deferred();
        spyOn($, 'get').and.returnValue(response);
        button.click();
        response.resolve([
            {name: 'Repo 1'},
            {name: 'Repo 2'},
            {name: 'Repo 3'}
        ]);
        expect(ul.children().length).toEqual(3);
        expect(ul.children().eq(0).text().trim()).toEqual('Repo 1');
        expect(ul.children().eq(1).text().trim()).toEqual('Repo 2');
        expect(ul.children().eq(2).text().trim()).toEqual('Repo 3');
    });
 
    it('should call alert() in case of error', function(done) {
        spyOn(window, 'alert');
        var response = $.Deferred();
        spyOn($, 'get').and.returnValue(response);
        button.click();
        expect($.get).toHaveBeenCalled();
        response.reject();
        response.fail(function() {
            expect(window.alert).toHaveBeenCalled();
            done();
        });
    });
});