//importing the http module
let http = require('http');
let url = require('url');
let port = 9090;
let Server = http.createServer((request, response) => {
    //callback is executed when you get a request on 9090
    //setting the response content so that it must be html
    if(request.url != '/favicon.ico') {
        let urlObject = url.parse(request.url, true);
        console.log(urlObject.query.username, urlObject.query.age);
        response.writeHead(200, {'content-type': 'text/html'});
        response.write(`<h2>Welcome to node web</h2>`);
        response.end(); // to end the response creation & send it to client
    }
});
Server.listen(port, () => console.log(`Server started in ${port}`))