console.log(10 - '5');  //5
console.log(10 * '5');  //50
console.log(10 / '5');  //2
console.log(10 % 'JavaScript');     // NaN
console.log(10 > '5');  //true

console.log('양수로 바꿔서 number로 변환');
console.log(+'');   //0
console.log(+'1');  //1
console.log(+'JavaScript'); //NaN
console.log(+true); //1
console.log(+false);    //0
console.log(+null); //0
console.log(+undefined);    //NaN
// console.log(+Symbol());
console.log(+{});   //NaN
console.log(+[]);   //0
console.log(+function(){});    //NaN