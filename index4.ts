// 오늘 배울것
// 스크립트에는 자료형 또는 함수 등의 기능들을 미리 만들어둔 내장 기능
// 내장 기능 중 먼저 배울것 => 내장 객체 => 내장 클래스

// Math => 숫자를 관리하는 함수들이 속해있는 클래스
// Math.~, new Math().~
// console.log(Math.abs(-500), Math.abs(500));

// abs => absolute => 절대값 => 음수를 양수로 변경
// console.log(Math.abs(-500), Math.abs(-200));
// // ceil, floor, round
// console.log(Math.ceil(123.456), Math.ceil(-123.456), Math.ceil(456.789))
// console.log(Math.floor(123.456), Math.floor(-123.456), Math.floor(456.789))
// console.log(Math.round(123.456), Math.round(-123.456), Math.round(456.789))

// const Ceil = (x:number, position:number = 0):number => {
//     return Math.ceil(x * (10 ** position)) / (10 ** position);
// };
// console.log(Ceil(123.456), Ceil(-123.456), Ceil(456.789));
// console.log(Ceil(123.456, 1), Ceil(-123.456, 1), Ceil(456.789, 1));
// console.log(Ceil(123.456, -1), Ceil(-123.456, -1), Ceil(456.789, -1));

// min, max => 최소 최대
// console.log(Math.min(1,2,3,4,5,6,7), Math.max(1,2,3,4,5,6,7));

// pow -> 제곱
// sqrt => 제곱근
// A ** 2 = B => A 가 B의 제곱근
// console.log(Math.sqrt(2));
// console.log(Math.sqrt(4));
// console.log(Math.sqrt(6));
// console.log(Math.sqrt(8));

// console.log(Math.random());
// const Random = (min:number, max:number, isDecimal:boolean = true):number => {
//     let l:number = Math.min(min, max), h:number = Math.max(min, max);
//     // max 값은 비포함 => excluded
//     let result:number = Math.random() * (h - l) + l;
//     return isDecimal ? Math.floor(result) : result;
// }
// for(let i = 0; i < 100; i += 1) console.log(Random(0, 10));

// 수학적인 기능이 포함된 내장 클래스 Math
// Date 날짜 내장 클래스
// momentjs => 날짜를 사용할 수 있는 외부 패키지

// 만들고 이용하는 객체
// Date.~,  new Date().~
// let now:Date = new Date();
// // Unix Time => 1970년 1월 1일 0시
// // UTC Time, ...
// // console.log(now.toUTCString());
// // Date는 아무런 매개변수 없이 생성시 => 현재(컴퓨터의 시간)
// console.log(now.getFullYear());
// console.log(now.getDay());
// console.log(now.getDate());
// console.log(now.getMonth());

// JSON => JavaScript Object Notation
// { key : value }
// JSON => 스크립트 언어에서 유연하게 이용하기위한 프로토타입 정보 관리 구성
// JSON.parse(); // string => prototype
// JSON.stringify(); // prototype => string
// let data:any = {
//     name:"이름",
//     age:50,
//     location:"주소",
//     pw:"비밀번호"
// };
// let str:string = JSON.stringify(data,(key,value)=>{
//     if(key == "pw") return undefined;
//     if(key == "age"){
//         if(value > 20) return "성인";
//         else return "미성년자";
//     }
//     return value;
// });
// console.log(str);
// console.log(JSON.parse(str, (key, value)=>{
//     if(key == "age"){
//         if(value == "성인") return "18+";
//         else return "18-";
//     }
//     return value;
// }));

// 프로토 타입 안에 들어있는 프로토 타입
// let test:any = {
//     datas:[1,2,3,4],
//     name:"문자열",
//     age:50,
//     target:{
//         name:"추가적으로",
//         datas:[1,2,3,4],
//         age:40
//     }
// };
// // JSON의 replacer를 이용할 때 모든 값을 순회하기 때문에 성능 저하와 함께 예상치 못한 동작이 일어날 수 있다
// // value 뿐만이 아니라 key값도 이용해서 검사를 해야한다
// console.log(JSON.stringify(test, (key, value)=>{
//     // console.log(key);
//     if(value < 45) return 30;
//     // if(key == "age") console.log(`age : ${value}`);
//     return value;
// }));
// console.log(JSON.parse(JSON.stringify(test)));

// Map, Set
// 스크립트의 기능을 편리하게 사용하는 방식 => 고차함수
// 함수 => 1차 => 2차함수 => 고차함수
// function A(){
//     return function (){
//         console.log(3);
//     }
// }
// A()();

// function plus(x:number, y:number):number {
//     return x + y;
// }
// // x가 고정되면 좋겠는데?
// function GeneratePlus(x:number):Function {
//     return function (y:number):number {
//         return plus(x, y);
//     };
// };
// let Bind3:Function = GeneratePlus(3);
// console.log(Bind3(5));
// console.log(Bind3(6));

// 함수의 일부분을 다른 함수에서 미리 완성하고 완성된 부분을 이용해서 함수를 작성하는 방식 => 고차함수
// 함수 안에서 함수를 만드는것 => 고차함수

// function PrefixWrap(prefix:Function):Function {
//     return function (afterfix:Function){
//         prefix();
//         afterfix();
//     }
// }
// let target:Function = PrefixWrap(()=>{
//     console.log("1번");
// });
// target = PrefixWrap(()=>{
//     console.log("2번");
// });
// target(()=>{
//     console.log("Afterfix");
// });

// function AfterAction(action:Function, after:Function = (v:any)=>{return v;}):Function {
//     return function (...args:any[]):any {
//         return after(action(...args));
//     }
// }
// // let Big:Function = AfterAction((...args:number[])=>{
// //     return Math.max(...args);
// // }, (max:number)=>{
// //     console.log(`Big Number is ${max}`);
// // });
// // let Big2:Function = AfterAction((...args:number[])=>{
// //     return Math.max(...args);
// // });

// // Big(1,2,3,4);
// // console.log(Big2(5,6,7,8,9));

// // let Small:Function = AfterAction((...args:number[])=>{
// //     return Math.min(...args);
// // }, (min:number)=>{
// //     for(let i = 0; i < min; i += 1){
// //         console.log(i);
// //     }
// // });
// // Small(15,6,9,10);

//--------------------------------------------------------------------------------------
// // 암호화와 복호화
// let Encoding:Function = AfterAction((...args:any)=>{
//     return JSON.stringify({data:[...args]});
// },
// (data:any)=>{
//     return btoa(data);
// });

// console.log(Encoding(1,2,3,4));

// let Decoding:Function = AfterAction((...args:any)=>{
//     return atob(args[0]);
// }, (data:any)=>{
//     return JSON.parse(data).data;
// })
// console.log(Decoding(Encoding(1,2,3,4)));

//-----------------------------------------------------------------------------------------------
// function Predicate(func:Function):Function {
//     return function (data:any):boolean {
//         return func(data);
//     }
// }
// let CheckOdd:Function = Predicate((x:number)=>{return x % 2 == 1;});
// let CheckFive:Function = Predicate((x:number)=>{return x % 5 == 0;});
// function AndPredicate(func:Function, func2:Function):Function {
//     return function (data:any):boolean {
//         return func(data) && func2(data);
//     }
// }
// let CheckOF:Function = AndPredicate(CheckOdd, CheckFive);
// for(let i = 0; i < 100; i += 1){
//     if(CheckOF(i)){
//         console.log(i);
//     }
// }

//-----------------------------------------------------------------------------------------
// function CreateCircleGraph(data:number[], name:string[]){}
// type person = {
//     name:string,
//     age:number,
//     location?:string,
//     regist?:string,
//     gender: "남성" | "여성"
// };
// function ListInEqualCount(datas:any[], target:any){
//     let count = 0;
//     for(let data of datas) { if(data == target) count += 1; }
//     return count;
// }
// function ListEqualCount(datas:any[]) {
//     let counts:any = {};
//     for(let data of datas) {
//         if(counts[data]) continue;
//         counts[`${data}`] = ListInEqualCount(datas, data);
//     }
//     return counts;
// }
// function PrototypeListToList(datas:any[], target:string):any[] {
//     let result:any[] = [];
//     for(let type of datas){
//         result = [...result, type[target]];
//     }
//     return result;
// }
// // 신암행어사
// let persons:person[] = [
//     { name:"홍길동", age:30, gender:"남성" },
//     { name:"임꺽정", age:28, gender:"남성" },
//     { name:"홍련화", age:25, gender:"여성" },
//     { name:"카리나", age:36, gender:"여성" },
//     { name:"콩쥐", age:15, gender:"여성" },
//     { name:"이몽룡", age:28, gender:"남성" },
// ];

// function PrototypeToK(datas:any):any[] {
//     return Object.keys(datas);
// }
// function PrototypeToV(datas:any):any[] {
//     return Object.values(datas);
// }

// CreateCircleGraph(
//     PrototypeToV(ListEqualCount(PrototypeListToList(persons, "age"))),
//     PrototypeToK(ListEqualCount(PrototypeListToList(persons, "age")))
// );
// CreateCircleGraph(
//     PrototypeToV(ListEqualCount(PrototypeListToList(persons, "gender"))),
//     PrototypeToK(ListEqualCount(PrototypeListToList(persons, "gender")))
// );