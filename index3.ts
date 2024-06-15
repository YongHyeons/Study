// 타입 스크립트 제어문 부터
// let a:number = 0;
// // 유일하게 달랐던 1개 기능이 TS에선 먹통
// if(a < 4 && a > 10){
//     console.log(`맞아`);
//     // 자바에 있는 제어문 분기문과 다를바 없는 기능
// }
// else if(){}
// switch문이 자바와 다르게 문자열을 허용한다 => ==의 의미론적 데이터 비교 때문
// switch("3"){
//     // 자바에서는 switch의 case문에 실수 입력이 안된다 
//     // 실수는 오차값이 있기 때문에 안된다
//     case "3": console.log(3, "이야"); break;
// }
// let a:string = "Hello";
// a += "World";
// switch(a){
//     case "HelloWorld": console.log("되나요?"); break;
//     // if(case == a)
// }

// switch(3.1 / 3 * 3){ // 사용불가
//     case 3.1:console.log(`이건 될것이다`);
// }

// if, switch => 반복문(while, for, do~while)
// do{}}while(true);
// do ~ while 과 while의 가장 큰 차이점 => 최소 1번
// while(true){}   // while문은 무엇이 바뀌는가? -> 없음

// 제일 많이 바뀌는것 => for
// for(let i:number = 0; i <= 10; i += 1){
//     console.log(i);
// }

// let numbers:number[] = [1,2,3,4,5,6,7,8,9,10];
// 일반 for-each문처럼 키값이 아닌 밸류값을 가져오는 for-each가 따로 존재
// for(let numb in numbers){
//     console.log(numbers[numb]);
// }
// for(let numb of numbers){
//     console.log(numb);
// }

// for-each문 이용시 in 과 of가 각각 key, value를 순회한다는 차이점을 명확히 이해
// let a:any = {key:'이름', key2:'이름2'};
// for(let key in a){
//     console.log(key);   // 키값 가져오기
//     console.log(a[key]);    // 데이터 가져오기
// }

// 제어문 끝

// function A():void {} // 함수를 만드는 방법도 알고 있기 때문에
// 함수를 만드는 방법 외에 추가적으로 알아야하는것

// 3가지
// 1. 호이스팅 문제
// A();
// function A():void{
//     console.log(1);
// }

// a();
// var a:()=>void = ()=>{}; // 불가능

// 2. Wrapping Function
// this
// let a:{key:string, show:()=>void} = {
//     key:"Data",
//     show:function (){  // function을 적으면 일반 함수
//         // 람다
//         console.log(this.key);
//     }
// };
// a.show();

// ()=>{
//     // 람다 함수는 특정 대상에게 속할 필요가 없다
//     // this 불가능
// }

// function a(){
//     // 일반 함수의 경우에는 특정 대상에게 속해야만 한다
//     // 일반 함수에서는 특정 대상에게 속하는 대신에 대상을 가져올 수 있는 변수 this가 추가
// }

// 함수를 어떤 방식으로 제작되냐에 따라 this를 이용할 수 있다 없다가 판가름난다 => wrapping function

// type Unit = {
//     name:string,
//     show:()=>void,
//     createFunc:()=>()=>void     // 함수를 반환하는 함수
// };
// let a:Unit = {
//     name:"이름",
//     show:function (){
//         console.log(this.name);
//     },
//     createFunc:function (){
//         // return ()=>{
//         //     console.log(this.name);
//         // };

//         let my:Unit = this;
//         return function(){ 
//             console.log(my.name); 
//         };
//     }
// };
// a.show();
// let func:()=>void = a.createFunc();
// func();
// a.name = "변경";
// func();


// 3. 함수형 프로그래밍
// 함수단위로 프로그램을 작성하는 기법

// type Calculator = (x:number, y:number)=>number;
// type CalculatorLeft = (left:Calculator, x:number, y:number, z:number) => number;
// type CalculatorRight = (x:number, y:number, z:number, right:Calculator) => number;
// let plus:Calculator = (x:number, y:number) => { return x + y; };
// let minus:Calculator = (x:number, y:number) => { return x - y; };
// let multiply:Calculator = (x:number, y:number) => { return x * y; };
// let devide:Calculator = (x:number, y:number) => { return x / y; };

// let letfPlus:CalculatorLeft = (left:Calculator, x:number, y:number, z:number) => { return left(x,y) + z;};

// console.log(letfPlus(minus, 3,4,5));

// let a = (x, y) => { return x + y; }
// let b = (x, y, z) => { return a(x, y) + z; }

// 예외처리
// throws => 없음, 기본으로 throws가 되어있다
// try{
//     throw new Error("메시지");
// }catch(e){  // Error (Exception이 아닌)
//     console.log(e);
// }
// finally{}

// let a:number[] = [1,2,3,4];
// a = [...a, 1,2,3]; // spread 변수 흩뿌리기
// function A(a:number, b:number){}
// A(...[1,2]);    // int...args

// zip value -> 변수 집합
// function A(...a:number[]){
//     console.log(a);
// }
// A(1,2,3);

// function B(a:number[]){
//     console.log(a);
// }
// B([1,2,3]);

// Literal
// Numeric Separators
// let a:number = 10_0000_0000_0000;

// shorthand property => 짧은 속성
// let a:number = 0;
// {
//     a // a:a
// }

// optional properties
// 해당 속성이 필수가 아니야 => 옵션 속성 설정 기능
// optional properties
// type user = {id:string, pw:string, 
//     location?:string    // 이 속성은 있을 수도 없을 수도 있어
// };
// let a:user = {id:"아이디", pw:"패스워드"};
// console.log(a.location);

// optional properties와 함께 이용하기위한 방법 => optional chaining
// type minmax = {low:number, high:number};
// type unit = {name:string, hp?:minmax};
// let a:unit = {name:"마린"};
// console.log(a?.hp?.low);    // 없을수도 있는 값에 ?를 붙인다

// optional property

// 자료형 확인 기법 => 2개
// 1. 아는거
// instanceof => 확장된 클래스 사이에 업캐스팅 또는 다운캐스팅이 가능한지 여부를 판별하는 연산자
// class A{}
// class B extends A{}
// console.log(new B() instanceof A);

// 2. 모르는거
// 정확하게 대상의 자료형을 확인하는 방법 => type guards
// console.log(typeof "Hello"); // typeof 정보 => 해당 정보의 자료형을 문자열로 돌려주는 연산자
// console.log(typeof 3);
// console.log(typeof function (){});
// typeof "정보" === "string";

// instanceof -> 변환가능한 자료형을 명시적으로 알 수 있다
// class A{}
// class B extends A{}
// let a:A = new B();
// if(a instanceof B){
//     ((B)a);
// }
// 검사 후 변환하지 않고 강제적으로 해당 자료형으로 변환시키는 기능
// type assertion
// (a as B);   // 변수 as 자료형 => 해당 변수를 다른 자료형으로 강제 변환

// 자료형을 조금더 획기적으로 이용하기위한 conditional types
// type check<T> = T extends string ? number : string;
// let a:check<number> = "문자열";
// let b:check<string> = 5;

// type FuncMerger<T> = T extends Function ? [Function, number] : [number, Function];  // 함수를 받아왔다면 [Function, number], 아니면 [number, Function]
// let a:FuncMerger<number> = [3, ()=>{}];
// let b:FuncMerger<Function> = [()=>{}, 3];

// 자바스크립트에서는 가능하지만 타입스크립트는 안되는것
// let a:number = 3;
// let b:number = 5;
// {b, a} = {a:a, b:b};

// type Read<T> = { readonly [K in keyof T]: T[K] };
// type Optional<T> = { [K in keyof T] ?: T[K]}

// Readonly => 읽기 전용
// Partial => 옵셔널
// Required => 옵셔널 제거

// 그래프 제작 프로그래밍
// type datas = number[];
// type names = string[];
// type product = {
//     name:string,
//     price:number,
//     count:number
// };
// function CreateGraph(dts:datas, nms:names){}
// let products:Partial<product>[] = [];
// function addProducts(name?:string, price?:number, count?:number){
//     let target:Partial<product> = { name, price, count };
//     products = [...products, target];
// }

// addProducts("사과", 5000, 10);
// addProducts("배", 4500, 15);
// addProducts("포도", 6500, 20);
// addProducts("딸기", 8000);
// addProducts("수박", 12500, 3);
// addProducts("망고", 3000, 50);

// function extractKeys(key:string){
//     let result:any[] = [];
//     for(let product of products){
//         let data:any = Object.values(product)[Object.keys(product).indexOf(key)];
//         result = [...result, data];
//     }
//     return result;
// }
// console.log(extractKeys("price"));
// console.log(extractKeys("name"));
// console.log(extractKeys("count"));
// CreateGraph(extractKeys("name"), extractKeys("price"));

// 원형 그래프를 만드는 프로그래밍 제작
// CreateCircleGraph(number[], string[]) 로 제작
// person 데이터에서 추출 후 그래프 제작하도록
// person => name, age, location?, regist?, gender
// person에서 age 추출 후 그래프
// person에서 gender 추출 후 그래프
// 단, 그래프 그릴 시 동일한 값의 빈도수를 그래프로
// age -> 19,19,20,22,23 => 19:2, 20:1, 22:1, 23:1 => 19,20,22,23, 2,1,1,1,

// 중복제거
// let a:number[] = [1,1,2,3,4];
// console.log(new Set(a));


// type datas = number[];
// type names = string[];
// type person = {
//     name:string,
//     age:number,
//     gender:string
//     location:string,
//     regist:string,
// };

// function CreateCircleGraph(dts:datas, nms:names){}

// let persons:Partial<person>[] = [];
// function addPerson(name:string, age:number, gender:string, location?:string, regist?:string){
//     let target:Partial<person> = { name, age, gender, location, regist };
//     persons = [...persons, target];
// }

// addPerson("이름1", 18, "남", "주민번호", "서울");
// addPerson("이름2", 28, "여", "주민번호", "서울");
// addPerson("이름3", 38, "남", "주민번호", "서울");
// addPerson("이름4", 28, "여", "주민번호", "서울");

// function extarctKeys(key:string){
//     let result:any[] = [];
//     for(let person of persons){
//         let data:any = Object.values(person)[Object.keys(person).indexOf(key)];
//         result = [...result, data];
//     }
//     return result;
// }

// // function personCount(key:string){
// //     let result:any[] = [];
// //     for(let person of persons){
// //         let data:any = Object.values(person)[Object.keys(person).indexOf(key)];
// //         result = [...result, data];
// //     }
// //     let agec:any[] = result;
// //     return result;
// // }


// console.log(extarctKeys("name"));
