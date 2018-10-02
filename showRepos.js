var githubBaseUrl = 'https://api.github.com';
 
function getRepos() {
    var username = $('input#username').val().trim();
    var url = githubBaseUrl + '/users/' + username + '/repos';
    $.get(url).done(showRepos).fail(showError);
}
 
function showRepos(repos) {
    $('ul#results').empty();
    repos.forEach(function(repo) {
        var li = $('<li>' + repo.name + '</li>');
        $('ul#results').append(li);
    });
}
 
function showError(response) {
    alert((response || {}).responseText);
}
 
$('button#get-repos').click(getRepos);