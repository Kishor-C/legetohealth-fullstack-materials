let app = require("express")(); //IIFE
let bodyParser = require('body-parser');
let port = 9090;
// handles HTTP GET
// to extract json & text from the body of the request
app.use([bodyParser.text(), bodyParser.json()]);
app.get('/employee/:id', (request, response) => {
    console.log(request.params.id);
    let employee = {id: 100, name : "Raj", salary : 35000};
    response.json(employee);
});
// handles HTTP POST
app.post('/employee', (request, response) => {
    console.log(request.body); // reads the request body
    let content = request.body;
    response.json(content);
});
// handles HTTP PUT
app.put('/', (request, response) => {
    let employee = {id: 100, name : "Raj", salary : 35000};
    response.json(employee);
});
// handles HTTP DELETE
app.delete('/', (request, response) => {
    let employee = {id: 100, name : "Raj", salary : 35000};
    response.json(employee);
});
app.listen(port, () => console.log(`listening to ${port}`));