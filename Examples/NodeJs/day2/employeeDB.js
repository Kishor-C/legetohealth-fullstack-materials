let app = require("express")();
let MongoClient = require('mongodb').MongoClient;
let cors = require('cors');
let dbURL = "mongodb://localhost:27017";
let port = 9090;
app.listen(port, () => console.log(`Node server running in ${port}`));
// retriving all the records
app.use(cors({origin : '*'}));

app.get('/employee', (request, response) => {
    MongoClient.connect(dbURL, {useNewUrlParser : true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            let doc = myDB.collection("employee").find();
            let arrayOfRecords = [];
            let x = 0;
            doc.forEach((record) => {
                arrayOfRecords.push(record);
                x++;
            }, () => {
                if(x == 0) {
                    response.json({error: "No records found!"})
                } else {
                    response.json(arrayOfRecords);
                }
                client.close();
            });
        } // end of if
    }); // end of connect()
});


// retrieving a particular record using employee/:id
app.get('/employee/:id', (request, response) => {
    let id = parseInt(request.params.id); //client sends id in path it will be string
    //connect to the database MongoClient.connect(url, parser, callback);
    MongoClient.connect(dbURL, {useNewUrlParser: true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            //db.collectionName.find();
            let doc = myDB.collection("employee").find({_id: id});
            
            let x = 0;
            // doc.forEach(callbackIteration, callbackIterationEnds)
            doc.forEach((record) => {
                x++;
                response.json(record);
            }, () => {
                if(x == 0) {
                    response.json({error : `Sorry id ${id} is not found`});
                }
                client.close();
            }); // forEach() end
        } // if ends
    });// connect ends
});// get() ends