var test;
console.log(typeof test);

test = 1;
console.log(typeof test);

test = 'javaScript';
console.log(typeof test);

test = true
console.log(typeof test);

test = Symbol();
console.log(typeof test);

test = {};  // JSON Object
console.log(typeof test);

test = [];  // JSON Array
console.log(typeof test);

test = function() {};   // 함수 리터럴
console.log(typeof test);