let fs = require('fs');
// fs.readFileSync(filename) reads the file synchrnously
let data = fs.readFileSync("simple.txt");
// since data read will be in bytestream you need to convert to character stream
let content = data.toString();
console.log(content);