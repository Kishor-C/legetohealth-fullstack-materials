let fs = require('fs');
fs.writeFile('msg.txt', 'writing content \n', {flag:'a+'}, (err) => {
    if(err)
        console.log(err);
    else
        console.log('file is written');
})