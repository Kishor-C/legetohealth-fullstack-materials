let x = 20;
let y = 30;
let z = x + y;
console.log(`z = ${z}`);
setTimeout(() => {
    console.log('this is inside the callback');
}, 1000);
console.log('last line!');

