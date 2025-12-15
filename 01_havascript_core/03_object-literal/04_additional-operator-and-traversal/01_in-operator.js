var sym = Symbol('심볼');

var student={
    name: '유관순',
    age: 15,
    test: undefined,
    method: function(){
        console.log('method 테스트')
    }
};

student[sym] = '추가';
console.log(student);

/* "in"은 student 객체 안에 프로퍼티 키 값이 있는지 확인 */
console.log('name' in student);
console.log('age' in student);
console.log('test' in student);
console.log('method' in student);

/* Symbol 타입은 나오지 않음 */
for(var key in student){
    console.log(`key: ${key}`);
    console.log(`value: ${student[key]}`);
}