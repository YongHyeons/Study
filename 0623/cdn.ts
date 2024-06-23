// https://sweetalert2.github.io/#examples

// @ts-nocheck

// console.log(CryptoJS.SHA3("메시지").toString());
// CryptoJS.PBKDF2 => Hasing 방식의 암호화를 조금더 확립시킨 기능
// function hasing(message:string):[string, string, number] {
//     let salt:string = CryptoJS.lib.WordArray.random(128/8).toString();
//     let iterations:number = parseInt(Math.random() * 12458) + 12345;
//     let data = CryptoJS.PBKDF2(message, salt, {keySize:512/32, iterations:iterations}).toString();
//     return [data, salt, iterations];
// }
// console.log(hasing("메세지는 이것이야"));

// 값을 넣는 2가지 방법
// Mixin, Direct

document.querySelector("button")?.addEventListener("click",e=>{
    // let mixin = Swal.Mixin({});
    // mixin.fire();
    Swal.fire({ // fire시 Promise 타입 반환
        titleText:"제목은 이거야",  // pure text
        // title:"이것도 <p>제목</p>"  // html text , 태그가 동작하는 제목
        // text:"내용", // pure text
        html:"<b>태그도 이용 가능</b>", // html text
        // icon:"warning", // warning, error, success, info, question  => 내장된 아이콘 사용
        // iconHtml:"<svg><circle cx=50 cy=50 r=50></svg>"
        // iconColor:"red",
        // imageUrl:"/img/22.jpg",
        // imageWidth:"500px",
        // imageHeight:"500px",
        // imageAlt:"이미지 로딩이 안될때 쓰이는 글자",
        // vaildationMessage:"활성화 메세지",
        // footer:"바닥글",
        // backdrop:true, // true, false, 문자열로 클래스명(.abc or abc)   => 창이 떴을때 창 외의 배경을 어둡게
        // background:"red",
        // showConfirmButton:true, // ok 버튼
        // showCancelButton:true,   // cancel 버튼
        // showDenyButton:true,    // no 버튼
        // showCloseButton:true,   // X 버튼
        // closeButtonHtml:"<svg><circle cx=50 cy=50 r=50></svg>"
        // confirmButtonText:"확인",
        // cancelButtonText:"취소",
        // denyButtonText:"거부",
        // confirmButtonColor:"white",
        // reverseButtons:true,    // 뒤집기 여부
        // returnFocus:true, // 창이 닫힐때 포커싱이 이전 위치로 돌아갈거냐

        // ----- 3개중 하나만 써야한다 -----
        // focusConfirm:true, // 처음 창이 열렸을떼 어느 버튼에 포커싱이 갈거냐
        // focusCancel:true,
        // focusDeny:true,

        // preConfirem:(resolve, reject)=>{}, // ok 눌렀을때 이 함수를 사용하겠다 => reject(); 호출시 창이 안닫히게 할수 있다
        // preDeny:(resolve, reject)={},   // deny 눌렀을때

        // toast:true, // 간편한 창 여부
        // position:"top-end", // 창 위치, top(상), center, bottom(하), start(좌), end(우)
        // timer:5700,  // 수명
        // timerProgressBar:true,

        // target:"div" // 해당 querySelector로 검색된 대상 위에 창이 띄워져라

        // willOpen:()={}, //  열기 전에
        // willClose:()={},
        // didOpen:()={},  // 연 후에
        // didClose:()={},
        // didDestroy:()=>{}, // 창이 모두 파괴된 후에, 완전 마지막에

        // input:"text",
        // inputLabel:"라벨",
        // inputPlaceholder:"힌트",
        // inputAttributes:{   // 추가 업션
        //     maxlength:50
        // },
        // inputValue:"기본값",

        // allowEscapekey:false,   // esc 키 허용 여부
        // allowEnterkey:false,    // enter 키 허용 여부

        // animation:false,    // 창이 뜰때 애니메이션, 끄고 직접 만들수 있다
        // showClass:"클래스명",
        // hideClass:"클래스명",
        // customClass:{
        //     popup:"클래스명",
        //     backdrop:"클래스명",
        // },
    });
});

// @ts-check


// 바나나에 대한 사이트 제작
// 제목
// 소제목
// 항목
// 소제목 -> 바나나의 유래, 바나나의 생산지, 바나나로인한 사건사고 등
// 유래 중 지역명을 누르면 해당 지역의 이미지와 간단한 설명을 창으로 띄우도록
// 바나나의 생산지는 표 형식으로 만들고 해당 생산지를 마우스로 클릭시 생산지 이미지만 뜨도록
// 사건사고에서 해당 날짜를 클릭시 해당 날짜가 구글에 검색된 상태로 창이 뜨도록