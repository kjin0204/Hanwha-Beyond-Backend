/* 생성자 함수는 자바의 클래스와 생성자를 혼용한 느낌이다. */
function Student(name, age) {
    this.name = name;
    this.age = age;
    this.getInfo = function() {
        return `${this.name}{은}는 ${this.age}세입니다.`;
    }    
    console.log(this.getInfo());
}

/* new 키워드와 함께 함수를 호출하면 객체가 생성됨 */
const student1 = new Student('장보고', 30);
const student2 = Student('신사임당', 40);

console.log('student1:',student1);      // student1: Student { name: '장보고', age: 30, getInfo: [Function (anonymous)] }
console.log('student2:',student2);      // student2: undefined
// student2 라인에서 함수로 호출 해서 전역 변수로 할당과 동시에 값을 초기 화 함
console.log(name);                      // 신사임당

/* 리터럴 객체를 활용한 객체 생성 */
const student3 = {
    name: '장보고',
    age: 30,
    getInfo: function() {
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
};


const student4 = {
    name: '신사임당',
    age: 40,
    getInfo: function() {
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
};
console.log('student3:',student3);
console.log('student4:',student4);