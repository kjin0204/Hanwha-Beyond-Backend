/* 생성자 함수 기반 상속 또는 의사 클래스 상속 */

/* 부모 생성자 함수(속성 정의) */
function Parent(name){
    this.name = name;
}
console.log(Parent.prototype);

/* 부모 프로토타입(기능 정의) */
Parent.prototype.sayHello = function () {
    console.log(`Hello, I'm ${this.name}`);
}

/* 자식 생성자 함수 */
function Child(name, age) {
    Parent.call(this, name);    // 자바의 super() 개념
    this.age = age;
}

//부모의 프로토 타입을 복사( 프로토 타입을 복사하면 생성자 함수가 같이 생성 됨)
/* 부모 생성자의 prototype을 복사(복사된 prototype의 새로운 constructor도 탄생) */
Child.prototype = Object.create(Parent.prototype);  //프로토타입만 생성

// let age = 123;
// Child.prototype.sayAge = () => console.log(`I'm ${this.age} years old`);
Child.prototype.sayAge = function() { console.log(`I'm ${this.age} years old`)};

/* 새로운 constructor 대신 child로 다시 교체 */
Child.prototype.constructor = Child;

const child = new Child('홍길동', 20);
child.sayHello();
child.sayAge();

/* ------- 추가로 js의 class 문법 맛보기 ------*/
class Parent2 {
    constructor(name){
        this.name = name;
    }

    sayHello() {
        console.log(`Hello, I'm ${this.name}`);
    }
}

class Child2 extends Parent2 {
    constructor(name,age){
        super(name);
        this.age = age;
    }

    sayAge() {
        console.log(`I'm ${this.age} years old`);
    }
}

const child2 = new Child2('유관순', 15);
child2.sayHello();
child2.sayAge();