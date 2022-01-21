// this acts like a server
let app = require('express')();
// load the http module and connect to express with server property
let http = require('http').Server(app)
// load the socket.io module & connect with http using IIFE syntax
let io = require("socket.io")(http)

//load the client html page that can connect to this server
app.get('/', (request, response) => {
    response.sendFile(__dirname+"/client.html");
})
http.listen(9090, () => console.log('server running in 9090'));

// handle the messages coming from the client & also send the message to the client
io.on('connection', (socket) => {
    console.log('client is connected to the server: '+socket.connected);
    //socket wants to send data to client
    socket.on("clientMessage", (msg) => {
        socket.emit("messageKey", 'Your messages: '+msg);
    });
});