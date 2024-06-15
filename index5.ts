// 스크립트의 비동기 => 동시 작업 기능
// 비동기를 사용하는 방법
// 함수형 비동기
// 시간의 흐름에 따라 비동기로 동작하게 만드는 기능
// setTimeout

// 3초마다 출력
// function Action(){
//     console.log("하고 싶은 동작");
//     setTimeout(Action, 3000);
// }
// setTimeout(Action, 3000);

// 5초뒤 출력
// setTimeout(()=>{
//     console.log("일정 시간이 흐른 후 동작할 내용");
// }, 5000);

// setTimeout처럼 일정시간뒤에 동작하는 비동기 함수가 필요한데 단순 비동기가 아닌 시간마다 반복 비동기
// setTimeout의 반복형 함수 => setInterval
// setInterval(()=>{
//     console.log("Interval의 동작 자체는 timeout 하고 동일, 작성법 마저도");
// }, 3000);
// 함수형 비동기 기능
// let i:number = 0;
// setInterval(()=>{
//     console.log(i);
// }, 300);
// setInterval(()=>{
//     i += 1;
// }, 250);

// 스크립트 비동기의 가장 큰 특징 => 안정성 검사가 거의 존재하지 않는다, 굳이 검사하여 사용할 환경이 아니기때문

// Worker 비동기
// 함수형 비동기가 시작이 일정 지나감에 따라 동작하는 비동기하면 Worker 비동기는 무엇인가?
// 필요할때 미리 만들어둔 비동기를 동작시키는 기능 => Worker 비동기
// Worker 비동기 => 메시지형 비동기
// 내가 상대방에게 메세지를 보내는 방식의 비동기
// 미리 메시지를 받으면 어떻게 동작할지를 구성해둬야 한다, 새로운 파일(worker.ts)에 만든다

// let worker:Worker = new Worker(new URL("./WEB-INF/ts/worker.ts", import.meta.url));   // worker의 파일 위치 지정
// worker.postMessage("메시지");
// worker.onmessage = (event:MessageEvent)=>{
//     console.log(event.data);    // 메시지를 받았을떄
// };
// 채팅 치는것처럼 내가 보내면 니가 하고 니가 보내면 내가 하는 동작의 비동기 기능 => 메시지형 비동기 Worker
// - Typescript에서는 현재 문제 생겨서 완성못했음 -

// Promise 비동기
// 비동기 작업 => 함수형 비동기나 Worker 비동기가 아닌 Promise 기반 비동기를 비동기라고 많이 부른다
// 비동기가 필요할때 필요한 만큼 작성해서 이용하는 방식 => Promise 비동기
// Promise 비동기의 가장 큰 특징 => 만들자마자 실행된다

// 함수형 비동기의 경우 일정시간 후 동작하고 끝날 예정 =>  결과가 없는 경우가 대다수
// Worker 비동기의 경우 메세지를 받지 않으면 동작을 안할 예정 => 결과가 필요할때 받는 방식(메세지로)이 정해져 있다

// Promise는 다른 비동기와 다르게 결과를 자유롭게 이용하기 위해서 결과 기반의 비동기 기능으로 변화


// new Promise((resolve, reject)=>{
//     // 일반적으로 비동기의 대부분은 인터넷과의 연동
//     // 연결이 안된다거나 잘못된 결과를 받아오는 경우
//     // 해당 결과에 따라서 자유롭게 동작을 제어할 수 있도록 Promise는 결과 기반의 동작 연동을 지원
//     for(let i = 0; i < 10; i += 1) console.log(i);
//     // Promise 기반의 비동기는 resolve 또는 reject 함수를 이용해서 연계하는 기능
//     // resolve(true);  // 비동기 기능이 성공했어
//     reject(false);   // 비동기 기능이 실패했어
// }).then((resolveData)=>{
//     console.log(resolveData);
//     return 1;
// }).then((resolveData)=>{
//     console.log(resolveData);
// })
// .catch((rejectData)=>{
//     console.log(rejectData);
// });

// let max:number = 80;
// // Promise를 비동기 체이닝 기법
// new Promise((resolve, reject)=>{
//     let sum:number = 0;
//     for(let i = 0; i <= max; i += 1) sum += i;    // 총합 구하기
//     if(sum < 2500) resolve("2500 미만");
//     else reject("2500 이상");
// }).then((msg)=>{
//     console.log(msg);
// }).catch((msg)=>{
//     console.log(msg);
//     return "실패했을때 추가";   // 실패했을때 밑에 then으로
// }).then((msg)=>{
//     console.log(msg);
// });
// Promise의 함수들의 반환값은 '무조건' 새로운 Promise다

// // - 예시 -
// new Promise((resolve, reject)=>{
//     // 네트워크 관련 기능 ~~~~
//     if(true) // 관련 기능 조건
//         resolve(undefined); // 관련 결과
//     else reject(undefined); // 실패시 관련 결과
// });

// Ajax 라고 비동기 기반 웹사이트 검색 기능 => Promise 비동기를 기반으로 동작

// 비동기를 대기시켜야 하는 경우가 생긴다
// Promise가 많이 이용되는 경우 => 내 사이트와 별개로 다른 사이트의 정보를 가져올때
// 언제나 성공한다는 보장도 없고 언제 끝난다는 보장도 없다
// Promise에는 해당 비동기가 끝날때까지 대기시키는 Join 기능이 포함되어 있다
// 자바에서의 스레드는 각각의 스레드가 각자 join을 부르는 형태
// let promise = new Promise(()=>{});
// Promise.all([promise]); // 여러개의 Promise 기반의 비동기를 담아서 특정 조건이 만족될때까지 무한히 대기시키는

// Promise.any => 여러개의 Promise중 가장 먼저 끝난 Promise와 동기화 시키겠어
// Promise.all => 모든 Promise가 끝날때까지 동기화 시키겠어
// Promise.race => 모든 Promise중 첫번쨰로 끝난 Promise가 성공이던 실패이던 대상을 동기화

// Promise.race([new Promise(()=>{})]); // 성공(true) 또는 실패(catch)의 함수 결과도 가져오는 기능

// Promise를 이용하지 않을 수는 없다 => 가장 최근에 나온 제일 깔끔한 비동기 기능
// 더 쉽게라도 이용하자 => Promise를 클래스 기반이 아닌 키워드 기반으로 이용할 수 있도록 만드는 기능
// await async

// async function A(){ // new Promise 방식이 아닌 async 키워드로 비동기를 만들고 이용한다
//     console.log("이건 비동기 Promise를 이용하는거야");
//     return "리턴값";
// }
// let promise = A();
// console.log("실행");

// async로 만든 Promise 기반의 비동기의 결과값을 손쉽게 가져오기 위한 기능 => await

// Promise 기반의 비동기 함수가 된다
// let result = await A(); // 결과값을 result에 넣을 수 있다
// A(); A(); // 비동기로 2개가 따로따로 동작 A() == 1초 => 1초
// await A(); await A(); // 비동기가 동기화되어서 2개가 동작 A() == 1초 => 2초

// - await가 빨간줄 뜨는 이유 -
// let func:Function = async () =>{};
// async ()=>{
//     await func();
// }
// 비동기 내부에서만 이용할 용도로 처음에는 만들어 졌다, async안에서만 await

// async => 함수에 적는다면 어디서든지 적을 수 있다
// await => async 함수 내부(비동기) 에서만 사용이 가능하다 => 비동기 내부가 아니라면 최상위에서만 이용이 가능하다
// 아무런 함수에도 포함되어있지 않다면 await를 쓸 수 있다

// async function A(){}
// await A(); // 최상위 await가 안되서 => 버전이 낮아서
// async ()=>{};

// async function Calculator(x:number) {
//     let sum:number = 0;
//     for(let i = 0; i < x; i += 1) sum += i + 1;
//     return sum;
// }

// async function Summary(){
//     // 1 ~ 10 까지의 총합을 모두 출력
//     for(let i = 1; i <= 10; i += 1){
//         let result:number = await Calculator(i);    // 해당 비동기가 끝날때 까지 대기했다가 값을 가져와
//         console.log(result);
//     }
// }
// Summary();

// ------------------------------------------------------------------------------------------------------

// 원형 그래프를 만드는 프로그래밍 제작
// CreateCircleGraph(number[], string[]) 로 제작
// person 데이터에서 추출 후 그래프 제작하도록
// person => name, age, location?, regist?, gender
// person에서 age 추출 후 그래프
// person에서 gender 추출 후 그래프
// 단, 그래프 그릴 시 동일한 값의 빈도수를 그래프로
// age -> 19,19,20,22,23 => 19:2, 20:1, 22:1, 23:1 => 19,20,22,23, 2,1,1,1,
// age 또는 gender 등을 추출하는 함수를 비동기로
// 빈도수를 구하는 함수를 비동기로
// age, gender를 동시에 그래프로 그리도록 CreateCircleGraph를 비동기로

type person = { 
    name:string,
    age:number,
    location?:string,
    regist?:string,
    gender: "남성" | "여성"
};

function CreateCircleGraph(data:number[], name:string[]){}

// 빈도수 구하기 위한
let people:person[] = [
    { name:"홍길동", age:30, gender:"남성" },
    { name:"임꺽정", age:28, gender:"남성" },
    { name:"홍련화", age:39, gender:"여성" },
    { name:"카리나", age:25, gender:"여성" },
    { name:"장원영", age:15, gender:"여성" },
    { name:"스티브", age:45, gender:"남성" },
];

// 특정값 받아오기
async function ObjNameToList(datas:any[], key:string):Promise<any[]>{   // 반환타입 지정 주의
    let target:any[] = [];
    for(let data of datas){
        if(data[key]) target.push(data[key]);
    }
    return target;
}
// console.log(await ObjNameToList(people, "age")); // 안됨

// 빈도수
async function Counting(datas:any[], token:any):Promise<number> {
    let count:number = 0;
    for(let data of datas){if(data == token) count += 1;}
    return count;
}

async function ListToCount(datas:any[]):Promise<any[]>{
    let target:any = {};

    for(let data of datas){
        if(target[`${data}`]) continue;
        target[`${data}`] = await Counting(datas, data);
    }
    return target;
}

async function ObjToKey(datas:any):Promise<any[]>{
    return Object.keys(datas);
}
async function ObjToValues(datas:any):Promise<any[]>{
    return Object.values(datas);
}

let action = async ()=>{
    let data:any = await ListToCount(await ObjNameToList(people, "age"));
    CreateCircleGraph(await ObjToValues(data), await ObjToKey(data));
    console.log(await ListToCount(await ObjNameToList(people, "age")));
};
action();

// ---------------------------------------------------------------------------
// 오히려 비동기를 쓰면 느려질 수 있다

// function ObjToKey(datas:any):any[]{
//     return Object.keys(datas);
// }
// function ObjToValues(datas:any):any[]{
//     return Object.values(datas);
// }
// async function ListToCount(datas:any[]):Promise<any[]>{
//     let target:any = {};

//     for(let data of datas){
//         if(target[`${data}`]) continue;
//         Counting(datas, data).then(count=>{
//              target[`${data}`] = count;
//         });
//     }
//     return target;
// }

// ---------------------------------------------------------------------------

// function CreateCircleGraph(data:number[], name:string[]){}

// type person = { // person 타입 지정
//     name:string,
//     age:number,
//     location?:string,
//     regist?:string,
//     gender: "남성" | "여성"
// };

// // 비동기
// async function ListInEqualCount(datas:any[], target:any){ // age 빈도수 세기
//     let count = 0;
//     for(let data of datas) { if(data == target) count += 1; }
//     return count;
// }

// // ListInEqualCount에서 가져오는 값을 대기 시켰다가 가져온다
// async function ListEqualCount(datas:any[]) {  // 값과 빈도수 배열 리턴
//     let counts:any = {};
//     for(let data of datas) {
//         if(counts[data]) continue;
//         counts[`${data}`] = await ListInEqualCount(datas, data);
//     }
//     return counts;
// }

// // 비동기
// function PrototypeListToList(datas:any[], target:string):any[] {    // 값 가져오기
//     let result:any[] = [];
//     for(let type of datas){
//         result = [...result, type[target]];
//     }
//     return result;
// }

// let persons:person[] = [    // person 정보 입력
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

// // 값 추출
// console.log(PrototypeListToList(persons, "age"));
// // 빈도수
// console.log(ListEqualCount(PrototypeListToList(persons, "age")));

// // 비동기
// CreateCircleGraph(
//     PrototypeToV(ListEqualCount(PrototypeListToList(persons, "age"))),
//     PrototypeToK(ListEqualCount(PrototypeListToList(persons, "age")))
// );

// CreateCircleGraph(
//     PrototypeToV(ListEqualCount(PrototypeListToList(persons, "gender"))),
//     PrototypeToK(ListEqualCount(PrototypeListToList(persons, "gender")))
// );





// 유저 관리 프로그램
// 유저는 아이디, 비밀번호, 주소, 생년월일, 주민번호, 이메일이 존재
// 유저 데이터 20개를 미리 입력 후 다음 제작

// 유저의 정보를 모두(20명) 암호화하여 출력하는 비동기 함수 제작
    // 단, 비밀번호는 암호화할 때 제외
// 암호화한 유저의 정보를 복호화하여 출력하는 비동기 함수 제작
// 유저 중 특정 조건의 유저(특정 생일 월 등)를 검색하는 비동기 함수 제작
// 유저 중 특정 조건의 유저를 검색 한 후 해당 유저들의 수를 출력하는 비동기 함수 제작
// 위 모든 동작을 5초에 한번 동작하도록 프로그램 구성
