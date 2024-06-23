// alert("경고창");
// 어차피 스크립트 언어가 브라우저를 제어하기 위해 만들어진 언어이기 때문에
// 추가적으로 브라우저를 손쉽게 제어하기위한 코드를 추가한다 하여도 문제는 없을것이다

// 브라우저를 손쉽게 제어하기위해 변수와 함수 클래스등 여러가지 데이터를 미리 만들어둔 프로토타입
// Browser Object Model => BOM

// BOM은 새로운 기능이 포함되고 새로운 문법이 있고 하는것이 아니라
// 스크립트 언어에 원래 존재하는 기능과 자료형 문법만을 이용하지만
// 브라우저를 손쉽게 제어하기위해서 미리 만들어둔 자료형 함수 변수들이 포함된 정보의 집합

// window; => BOM 데이터
// var로 만들어진 모든 변수는 window 변수 하위에 저장된다
// window.valueName => 이런식으로 window라는 BOM 모델 하위에 대상을 선택하는 구조
// 모든것이 window 하위에 있을 예정이다 => 굳이 window를 적을 필요가 없다
// BOM 모델의 특수성

// window 변수 안에 들어있는 BOM 모델의 핵심 정보
// console.log(innerWidth, innerHeight);
// console.log(outerWidth, outerHeight);
// 크기 = 너비, 높이 => 가로, 세로
// inner => 실제 보여지는 부분, outer => 전체 창
// outer - inner => 전체 창 - 실제 보여지는 부분 => 외부 뼈대

// console.log(scrollX, scrollY);
// X => 왼쪽에서 얼만큼 움직였는가
// Y => 위에서 얼만큼 움직였는가

// console.log(isSecureContext);    // 보안 유무
// console.log(parent, top, opener);    // 바로 위, 최상위, 유입 경로

// 단순 변수가 아닌 핵심 프로토타입 변수
// 조금 더 복잡한 형태의 변수가 존재
// 객체형 변수 => Location, Navigator, Document, ...

// location
// console.log(window.location.host);  // domain
// console.log(window.location.href);  // full-path
// console.log(window.location.origin);    // site
// console.log(window.location.pathname);  // sub-path
// console.log(window.location.protocol);  // protocol
// console.log(window.location.port);  // port
// console.log(window.location.search);    // query string

// window.location.reload();    // 페이지 새로고침
// window.location.replace("http://www.naver.com"); // 다른 페이지로 이동
// location.reload();

// navigator -> 장치
// console.log(navigator.userAgent);    // 장치 정보 표시
// if(navigator.userAgent.includes("Mobile")) console.log("모바일");
// else console.log("PC");

// console.log(navigator.hardwareConcurrency);  // 하드웨어(CPU)를 몇개 활성화 했는지

// history => 웹사이트 이동 기록
// console.log(history.length);
// console.log(history.state);

// history.back(); // 현재 페이지에서 이전 페이지로 이동
// history.forward();  // 현재 페이지에서 다음 페이지로 이동
// history.go(0);  // 지정한 인덱스 페이지로 이동
// history.pushState({key:"아무값"}, "제목", "경로");
// history.replaceState({key:"아무값"}, "제목", "경로");

// SPA => Single Page Application => 속도가 빠르다
// MPA => Multi Page Application => 가볍다
// SPA & MPA

// screen
// console.log(screen.orientation);    // 현재 디스플레이 방향(가로, 세로)

// 웹사이트의 저장과 관련된것
// Storage -> LocalStorage, SessionStorage

// HDD에 저장하여 영구적, 상대적으로 보안이 좋지않음
// localStorage.setItem("키값", "내용");   // 데이터 추가 및 수정 
// localStorage.getItem("키값");   // 데이터 검색
// localStorage.removeItem("키값");    // 데이터 삭제
// localStorage.clear();   // 전체 삭제
// localStorage.key(0);    // n 번째 데이터 키값 확인
// localStorage.length;    // 데이터 개수

// 영구적이지 않음, 브라우저를 끄며 사라진다
// sessionStorage.setItem("키값", "내용");

// 한개의 페이지에서만 동작하지 않고 여러 페이지에서 호환성있게 정보를 교환하기위한 기능 => Storage
// 광고 하루동안 보지않기

// 일정 기간동안 정보를 보관하는 저장공간 => Cookie
// Storage처럼 key, value의 형태로 정보를 저장하는 기능
// 단순히 저장할 뿐만이 아니라 여러가지 형태를 이용해서 정보에 추가적인 정보가 덧대어진 형태의 구성
// let cookie:any = {
//     name:"키값",
//     value:"데이터",
//     domain:"localhost", // 해당 쿠키가 존재하는 사이트 도메인
//     path:"/",   // 쿠키가 만들어진 서브 패스
//     expires:0/* new Date.getTime() + 3600 */,  // 만료기한 => UTC Time => 1970년 1월 1일 0시 0분 0초 를 기준으로 지금 얼마나 흘렀는가
//     // 현재 시간을 UTC Time값으로 구하고 추가 기한을 더한다
//     secure:true,    // https 환경에서만 사용이 가능한 쿠키인지 여부
//     sameSite:"strict"   // 어느 정도까지를 비슷한 사이트로 인정할지
//     // strict => 도메인까지를 모두 같아야지
//     // lax => top level까지만 동일하다면
//     // none => 동일하지 않아도 된다
// };

// cookieStore.set(cookie);
// cookieStore.get("키값");
// cookieStore.delete("키값");
// cookieStore.has("키값");

// 객체형 중 필수적인 것들을 모두 배웠다
// alert // 경고 창
// confirm("내용"); // 확인 창 => 확인(true), 취소(false)
// prompt("내용", "기본값"); // 입력 창

// open("https://www.naver.com", "_black"); // 팝업 광고

// -----------------------------------------------------------------------------------

// 팝업 광고를 띄우고 1시간동안 안보이게 하는 방법
// 자동 로그인시 3일간 로그인이 되도록 하는 방법

// @ts-ignore // 한줄만 오류를 만들지마
// @ts-nocheck  // 밑에 있는 내용의 오류를 찾지마

// cookieStore.get("popupAds01").
// then(d=>{
//     if(d == null){
//         if(confirm("광고 1번을 1시간동안 안띄우시겠습니까?")) popupAdsRemove(1,3600);
//         open("https://localhost:9941/popup01.html", "_blank");
//     }
// });
// function popupAdsRemove(index:number, time:number){
//     let cookie = {
//         name:`popupAds0${index}`,
//         value:"아무거나",
//         domain:"localhost",
//         path:"/",
//         expires:new Date().getTime() + time * 1000,
//         secure:true,
//         sameSite:"strict"
//     }
//     cookieStore.set(cookie);
// }

// function autoLogin(id:string, pw:string){
//     let cookie = {
//         name:`AutoLogin`,
//         value:`${id}%%$^$%%${pw}`,
//         domain:"localhost",
//         path:"/",
//         expires:new Date().getTime() + (86400 * 3) * 1000,
//         secure:true,
//         sameSite:"strict"
//     }
//     cookieStore.set(cookie);
// }

// cookieStore.get('autoLogin').then(d=>{
//     if(d != null){
//         console.log(d);
//     }
// });
// autoLogin("아이디", "비밀번호");
// @ts-check

// ----------------------------------------------------------------------------

// 사용자 광고, 기업 광고, 랜덤 광고 3개의 광고를 정의
// 세개의 광고를 각각 제거할 수 있도록 구성
// 단, 사용자 광고는 3일, 기업광고는 1시간, 랜덤광고는 1일
// 각 광고는 단순히 popup.html 등의 페이지를 open으로 띄우기
// 세개의 광고를 모두 띄우지 않으면 location.href의 경로를 네이버로 변경
// userpopup, companypopup, randompopup
// @ts-nocheck
// await cookieStore.get("userpopup").
// then(d=>{
//     if(d == null){
//         if(confirm("광고 1번을 1시간동안 안띄우시겠습니까?")) popupRemove("user",86400*3);
//         open("http://localhost:9941/userpopup.html", "_blank");
//     }
// });
// await cookieStore.get("companypopup").
// then(d=>{
//     if(d == null){
//         if(confirm("광고 1번을 1시간동안 안띄우시겠습니까?")) popupRemove("company",3600);
//         open("http://localhost:9941/companypopup.html", "_blank");
//     }
// });
// await cookieStore.get("randompopup").
// then(d=>{
//     if(d == null){
//         if(confirm("광고 1번을 1시간동안 안띄우시겠습니까?")) popupRemove("random",86400);
//         open("http://localhost:9941/randompopup.html", "_blank");
//     }
// });
// function popupRemove(index:string, time:number){
//     let cookie = {
//         name:`${index}popup`,
//         value:"아무거나",
//         domain:"localhost",
//         path:"/",
//         expires:new Date().getTime() + time * 1000,
//         secure:true,
//         sameSite:"strict"
//     }
//     cookieStore.set(cookie);
// }

// @ts-check

// ---------------------------------------------------------------------------------
// 아무것도 뜨지 않는 환경에서 다시금 시작
// 20240619

// Browser Object Model => Browser의 정보를 Object Model의 형태로 만들어 쉽게 이용하는것
// Browser 자체가 아닌 Browser 안에 들어있는 태그들의 목록(Document)을 쉽게
// window.document; // 실제 HTML의 내부 내용을 구조화시킨 Object Model => DOM(Document Object Model)

// DOM에 대해서 
// window.document; // DOM 은 BOM 구조의 하위 구조
// console.log(document.title, document.characterSet, document.contentType, document.lastModified);
// console.log(document.URL, document.defaultView, document.referrer, document.cookie);
// defaultView => window.top
// referrer => Opener의 상위호환, 어느 페이지로부터 요청이 왔는지

// document의 변수는 => 해당 문서의 HTML정보를 알려준다
// document.forms; // <form></form> => 폼들이 모인 배열
// document.links; // <a></a> => 링크들이 모인 배열
// document.images;    // <img> => 이미지들이 모인 배열
// document.scripts;   // <script></script> => 스크립트들이 모인 배열
// console.log(document.links);

// 변수를 이용해서만 받아오는가?
// 태그들을 이용하기 쉽도록 함수로 제작하여 여러가지 종류의 함수들도 많이 존재한다

// console.log(document.querySelector("div:nth-child(5)"));  // CSS의 Selector를 이용한 태그 검색
// console.log(document.querySelectorAll("div:nth-child(2n)"));
// console.log(document.getElementById("persnal"));  // 해당 id값을 가진 가장 위에 있는 것을 검색
// console.log(document.getElementsByClassName("apple")); // 여러개를 검색하는 용도, class 속성에 "apple"이 들어간 것을 검색
// console.log(document.getElementsByName("key")); // input등을 검색하는 용도, 속성중 name의 해당하는 키값을 검색
// console.log(document.getElementsByTagName("div")); // 해당 태그를 모두 검색

// * 안될때 html의 script 태그 defer 확인

// let div:Element | null = document.querySelector("div:nth-child(1)");

// let input:HTMLInputElement | null = document.querySelector("input");
// input?.value = 5;

// HTMLElement => 태그

// <></> => 의미론적 구분을 위해 만든 빈 태그
// console.log(div?.tagName);
// console.log(div?.id);
// console.log(div?.className);
// console.log(div?.classList);
// div?.classList.add("fruit");
// console.log(div?.className);
// div?.classList.remove("fruit");
// console.log(div?.className);
// div?.classList.toggle("fruit");
// console.log(div?.className);
// div?.classList.toggle("fruit");
// console.log(div?.className);

// console.log(div?.textContent);  // 해당하는 태그안에 그냥 적혀있는 글자만 가져오는 기능
//                                 // 태그등은 제외
// console.log(div?.innerHTML);    // 해당하는 태그안에 모든 글자를 그대로 가져오는 기능
//                                 // HTML 태그 포함
// div?.innerHTML = "<div>내용 태그를 수정</div>";

// 속성값 중 대표적으로 많이 이용되는것들(class, id, name, value, ...)
// 태그에는 사용자 정의 속성을 획득하는 방법과 속성을 공통적으로 처리하는 방법
// console.log(div?.getAttribute("class"));
// console.log(div?.getAttribute("id"));
// // setAttribute

// console.log(div?.dataset.set);

// div?.children;  // 자식들 => 해당 태그 안에 들어있는 태그들
// div?.querySelector(""); // 자식들 중에 검색

// div?.style.backgroundColor = "red";
// 우리가 스크립트를 배우는 이유

// let tds:NodeListOf<HTMLElement> = document.querySelectorAll("body > table tr > td");
// console.log(tds);
// tds.forEach((el, key)=>{
//     if(key + 1 < 10) el.textContent = `0${key + 1}번`;
//     else el.textContent = `${key + 1}번`;
// });

// setTimeout(()=>{    // 20초 뒤 darktheme로 css값을 붙여준다
//     document.querySelectorAll("body > table tr > td").forEach(el=>{
//         el.classList.toggle("darktheme");
//     });
// }, 200);

// 홀수에 빨간색 넣는 두가지 방법
// // - 1 - 
// document.querySelectorAll("body > table tr:nth-child(odd) > td:nth-child(odd) > table tr:nth-child(even) > td:nth-child(even)").forEach((el)=>{
//     el?.style.backgroundColor = "red"
// });
// // - 2 -
// document.querySelectorAll("body > table tr > td").forEach((el, key)=>{
//     if(key % 2 == 0) el?.style.backgroundColor = "red"
// });

// navigator => 장치
// if(window.navigator.userAsent.indexOf("Mobile") > -1) {
//     document.querySelectorAll("ready2mobile").forEach(el=>{
//         el.classList.toggle("mobile");
//     });
// }

// let menu:HTMLElement | null = document.querySelector("nav div:nth-child(3)");
// for(let i = 0; i < 500; i += 1){
//     setTimeout(()=>{
//         menu?.style.top = `${i}px`;
//         menu?.style.position = "relative;"
//     },500 * (i + 1));
// }

// window.location.search.slice(1).split("&").forEach(v=>{
//     let [key, value] = v.split("=");
//     console.log(key, value);
// });

// --------------------------------------------------------------------------------
// 바둑판 6x6 제작
// 각 바둑판에 1 ~ 36 숫자 대입
// 바둑판의 기본 크기는 50px x 50px
// query string으로 theme 에 light, dark, red, blue 네가지의 테마 지정
// 각 테마별로 바둑판의 교차색이 달라지도록 구성
// light => 흰,검
// dark => 검,흰
// red => 빨,파
// blue => 파,빨

// 모바일의 경우 바둑판의 기본 크기를 1/2로 줄이고 폰트 크기도 70%로 줄이기
// 이미지를 바둑판 아래에 한장 출력하고 모바일일 경우 다른 이미지가 출력되도록 수정

// document.querySelectorAll("div").forEach((el, key)=>{
//     el.textContent = `${key + 1}`;
//     document.location.search.slice(1).split("&").forEach(v=>{
//         let [key, value] = v.split("=");
//         if(key == 'theme') el.classList.toggle(value);
//     });
// });

// if(window.navigator.userAgent.indexOf("Mobile") > -1) {
//     document.body.classList.toggle("mobile");
// }


// ---------------------------------------------------------------------------------------
// 20240620

// 스크립트에서 가장 중요하며 가장 핵심적인 기능 => 절대 다른것으로 대체시킬 수 없는 기능 => 반응
// 콜백 이벤트 => 사용자의 반응에 대응해서 동작하는 기능

// 버튼 클릭 혹은 그외의 사용자의 동작에 따라 반응해서 실행되는 코드
// 콜백 함수 => 사용자의 반응에 대응해서 동작할때 실행될 함수

// 콜백 함수의 종류와 콜백 함수를 어떻게 등록하는가?
// 콜백 함수를 등록하기 위해서는 등록할 대상(태그 or 엘리먼트)이 필요하다

// let div:HTMLElement | null = document.querySelector("div:nth-child(2)");
// 콜백 함수 등록 방식 2가지
// 1. 대입 방식
    // on[event] => event 에 해당할때
// div?.onclick = ()=>{
//     console.log("테스트");
// };

// 2. 리스너 방식
// div?.addEventListener("click", (e)=>{
//     console.log("테스트2");
//     // divEvent?.currentTarget?.textContent = "22";

//     // 처음에 먼저 배울건 divEvent에 등록되어있는 값에는 어떤것들이 존재하는가?
//     console.log(e.type);    // 이벤트의 종류
//     console.log(e.target);  // 실제 이벤트가 발생한 태그
//     console.log(e.currentTarget);   // 이벤트 콜백 함수가 등록된 태그

// });

// document.body.addEventListener("click", e=>{
//     console.log(e.target);  // 실제로 누른 대상 => div
//     console.log(e.currentTarget);   // 이벤트가 동작하는 대상 => body
// });

// document.querySelectorAll("div").forEach(v=>{
//     // click => 마우스 왼쪽 클릭
//     // mousedown => 마우스 왼,좌,휠,옵션 클릭 확인하기 위한 값

//     // click, dbclick => 마우스 왼쪽 클릭(dbclick => 더블클릭)
//     // mousedown, mouseup, mouseover, mouseout, mousemove
//     // down => 눌렀을때, up => 뗄때, over => 마우스가 올라갔을때, out => 나갔을때, move => 움직일때
//     // contextmenu => 마우스 오른쪽 클릭
//     // touchstart, touched, touchmove, touchcancel
//     // start => 손가락이 닿았을때, end => 떨어진 순간, move => 손가락이 움직일때 
//     // cancel => 손가락이 떨어지지 않은 상태로 화면을 나갔을때

//     // touch나 mouse를 쓰면 해당 환경에서만 동작하고 다른 환경에서는 동작을 안하거나 미흡해 질 수 있다
//     // touch 또는 mouse 모든 상황을 대비하는 이벤트
//     // pointerdown, pointerup, pointermove

//     // drag, dragstart, dragend, dragmove => 드래그를 하는 상황

//     // wheel => 스크롤 할때 불리는 이벤트
//     v.addEventListener("wheel", e=>{

//         // console.log(e?.deltaX, e?.deltaY, e?.deltaZ);
//         // console.log(e.deltaMode);   // 휠 단위
//         // 0 = px, 1 => line, 2 => page

//         // 현재 드래그중인 대상(파일 등)
//         // dataTransfer => 마우스에 드래그중인 대상
//         // console.log(e?.dataTransfer);

//         // console.log(e.pointerId);
//         // console.log(e.pointerType);

//         // console.log(e.clientX, e.clientY, e.screenX, e.screenY);
//         // 클릭 이벤트가 발생한 위치
//         // client => 브라우저 상 좌표
//         // screen => 모니터 화면 상 좌표

//         // console.log(e.ctrlKey, e.shiftKey, e.altKey);
//         // 조합키 활성화 여부
//         // 해당키를 누른상태로 이벤트가 발생했는지 => true, false

//         // console.log(e.button);
//         // 마우스 클릭 상태 확인

//         // e?.currentTarget?.textContent = "변경";
//         // e.preventDefault(); // 기본 활동을 막다

//         // console.log(e.touches); // 터치된 손가락들 정보 => 모든 손가락
//         // console.log(e.targetTouches);   // 터치된 손가락들 정보 => 해당 태그에 적용된 손가락
//         // console.log(e.changedTouches);  // 터치된 손가락들 정보 => 이전 손가락에서 변경된 손가락
//         // 터치 정보는 일반적으로 계속 변화한다
        
//         // touches를 통해 갇는 값
//         // e.touches[0].identifier;
//         // e.touches[0].target;
//         // e.touches[0].clientX, e.touches[0].clientY;
//         // e.touches[0].screenX, e.touches[0].screenY;

//     });
// });

// 키보드에 관련된 이벤트
// keydown, keyup => 키보드
// focus, blur => 입력한 대상을 선택했을때와 잃었을때
// submit
// change => 값이 바뀔때
// storage => localStorage, sessionStorage 가 변경될때
// popstate => 페이지 이동시
// error => 에러가 감지될때
// resize => 크기가 바뀔때
// document.querySelector("input")?.addEventListener("change", e=>{
//     // e.currentTarget.value = "hello";

//     // e.preventDefault(); // submit에 사용

//     // console.log(e.key);
//     // console.log(e.code)
//     // console.log("블러")
//     // console.log(e.relatedTarget);   // 연관된 태그
//     // focus => relatedTarget => 이전에 blur 된 태그
//     // blur => relatedTarget => 이전에 focus 된 태그

// });


// window.addEventListener("load", e=>{
//     console.log("페이지 로딩");
// });
// window.addEventListener("unload", e=>{
//     console.log("페이지 언로딩");
// });
// window.addEventListener("beforeunload", e=>{
//     console.log("페이지 언로딩 전");
// });
// window.addEventListener("DOMContentLoaded", e=>{
//     console.log("돔 구조 로딩");
// });

// 이제 이벤트를 통해 대상을 마음대로 조작할 수 있다

// 이벤트 삭제
// document.onclick = ()=>{};

// 리스너의 경우 이벤트 삭제
// let ac = new AbortController();
// document.addEventListener("click", e=>{}, {signal:ac.signal})length

// ac.abort();

// -----------------------------------------------------------------------------------
// @ts-nocheck
document.querySelector(".lb")?.addEventListener("click",e=>{
    let index:number = parseInt(document.querySelector(".swiper .container").dataset['focus']);
    index -= 1;
    if(index < 0) index = 0;
    document.querySelector(".swiper .container").dataset['focus'] = index;
    document.querySelector(".swiper .container").style.left = `-${index * 100}vw`;

});
document.querySelector(".rb")?.addEventListener("click",e=>{
    let index:number = parseInt(document.querySelector(".swiper .container").dataset['focus']);
    index += 1;
    if(index > 2) index = 2;
    document.querySelector(".swiper .container").dataset['focus'] = index;
    document.querySelector(".swiper .container").style.left = `-${index * 100}vw`;

});
// @ts-check