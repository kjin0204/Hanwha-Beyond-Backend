let exampleProduct = {
    items: ['Coffee', 'Donut'],
    producer : '신사임당'
};

/* 1. 분해 할당을 활용 하지 않은 방식 */
function displayProduct(obj){
    let {items, producer} = obj;
    items.push('test');

    console.log('items:', items);       // items: [ 'Coffee', 'Donut' ]
    console.log('producer:', producer); // producer: 신사임당

    console.log('아이템 확인:', items === obj.items);
    console.log('생산자확인:', producer === obj.producer);
    producer = 'asd';
};
let {items:it, producer:a} = exampleProduct;
it.push('aaaa');
a = 'asdasdas';
console.log('-------------------------')
console.log(exampleProduct);
console.log('-------------------------')

/* 2. 객체를 자동 으로 객체 구조 분해 할당이 됨 */
function displayProduct2({producer, items, brnad = '엔코아'}){
    console.log('------------------------display2--------------------------')
    items.push('123');
    producer = 'Kang';
    console.log('items:', items);       // items: [ 'Coffee', 'Donut' ]
    console.log('producer:', producer); // producer: 신사임당
    console.log('brand:', brnad);       // brand: 엔코아
};

displayProduct(exampleProduct);
displayProduct2(exampleProduct);
console.log(exampleProduct);


