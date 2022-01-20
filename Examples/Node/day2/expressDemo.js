let app = require("express")(); //IIFE
let port = 9090;
// handles HTTP GET
app.get('/', (request, response) => {
    response.send('Get Request from /');
});
// handles HTTP POST
app.post('/', (request, response) => {
    response.send('Post Request from /')
});
// handles HTTP PUT
app.put('/', (request, response) => {
    response.send('Put Request from /');
});
// handles HTTP DELETE
app.delete('/', (request, response) => {
    response.send('Delete Request from /')
});

app.listen(port, () => console.log(`listening to ${port}`));