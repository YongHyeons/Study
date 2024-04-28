package project.main.classes;

// Web Cookie
public class Cookie {
	public String name;
	public String value;
	public String domain;
	public String path;
	public int expire;
	public int size;
	public boolean http;
	public boolean secure;
	public boolean sameOrigin;
	
	// 생성자를 연결하는 -> 생성자 체이닝 또는 위임 생성자
	
	public Cookie(
			String name, String value, String domain, 
			String path, int expire, int size, boolean http,
			boolean secure, boolean smaeOrigin
	) {
//		Setting(name, value, domain, path, expire, size, http, secure, sameOrigin);
		this.name = name; this.value = value; this.domain = domain;
		this.path = path; this.expire = expire; 
		this.http = http; this.secure = secure; this.sameOrigin = sameOrigin;
		// 앞에 있는 정보의 크기들의 합
		this.size = size;	// 쿠키 크기
	}
	public Cookie(
			String name, String value, String domain
			) {
		// this 메서드 호출
		this(name, value, domain, "/", 0, 0, true, false, false);
	}
//	
//	public void Setting(String name, String value, String domain, 
//			String path, int expire, int size, boolean http,
//			boolean secure, boolean smaeOrigin) {
//		this.name = name; this.value = value; this.domain = domain;
//		this.path = path; this.expire = expire; this.size = size;
//		this.http = http; this.secure = secure; this.sameOrigin = sameOrigin;
//	}
	
}
