let fs = require('fs');
let text = "This is a simple text\n";
// flag enables appending
fs.writeFileSync('msg.txt', text, {flag : 'a+'});
console.log("DONE!");