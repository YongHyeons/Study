// import { User } from "./type";

// function UserEncode(user:User) {
//     return new Proxy(user, {
//         get(target, p, receiver){
//             if(p == 'pw' || p == 'password' || p == 'pwd') return undefined;
//             if(p == 'json') return JSON.stringify(target, (k,v)=>{ // 문자열화 된 값을 가져오기
//                 if(k == 'pw' || k == 'password' || k == 'pwd') return undefined;
//                 return v;
//             });
//             if(p == 'jsonEncrypt') return btoa(JSON.stringify(target, (k,v)=>{ // 암호화 된 값을 가져오기
//                 if(k == 'pw' || k == 'password' || k == 'pwd') return undefined;
//                 return v;
//             }));
//             return Reflect.get(target, p);
//         },
//         set(target, p, newValue, receiver){
//             if(p == 'pw' || p == 'password' || p == 'pwd') return false;
//             Reflect.set(target, p, newValue);
//             return true;
//         },
//     });
// }

// export { UserEncode };

// -----------------------------------------------------------------------
import { Person } from "./type";

function PersonEncode(person:Person){
    return new Proxy(person, {
        get(target, prop, receiver){
            if(prop == 'location') return undefined;
            else if(prop == '#persnalpalcedataget') 
                return target['location'];
            return Reflect.get(target, prop);
            if(prop == 'encrypt') return btoa(JSON.stringify(target, (k,v)=>{
                if(prop == 'location') return undefined;
                return v;
            }));
        },
        set(target, prop, newValue, receiver){
            if(prop == 'location') return false;
            Reflect.set(target, prop, newValue);
            return true;
        },
    })
}

function PrototypeListToList(datas:any[], target:string):any[] {
    let result:any[] = [];
    for(let type of datas){
        result = [...result, type[target]];
    }
    return result;
}
function EnableList(prototypes:any[], target:string, pred:Function):any[] {
    let result:any[] = [];
    let targets:any[] = PrototypeListToList(prototypes, target);
    for(let i = 0; i < targets.length; i += 1) { 
        if(pred(targets[i])) result.push(prototypes[i]);
    }
    return result;
}

export { PersonEncode, PrototypeListToList, EnableList};