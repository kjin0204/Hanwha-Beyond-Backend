var dog = {
    name: '뽀삐'
};

dog.name = '두부';
console.log(dog);   // 수정

dog.age = 3;
console.log(dog);   // 추가

delete dog.age;
console.log(dog);   // 삭제