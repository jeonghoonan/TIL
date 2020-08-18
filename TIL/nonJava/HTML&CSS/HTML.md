20-08-18

# HTML (Hyper Text Markup Language)
## HTML의 탄생 
* 1993년, 최조 버전이 발표
* 1996년, 최신 버전이 발표
* W3C 가 XHTML1.0 을 구체화 하기 위해 XHTML2.0 작업을 진행 했으나 하위 호환상에 문제가 발생함 
* 2004년도에 WHATWG 가 W4C로 별개로 Web Application 1.0 과 Web Forms 2.0을 만들어 냄
    * 애플, 모질라 재단, 오페라 소프트웨어가 공동으로 설립한 공개 그룹
    * WHATWG (Web Hpyertext Application Technology Working Group)
* 2007년, W3C 가 공개적으로 XHTML 2.0 실패를 인정하고 새롭게 HTML을 개발하기로 하고
* WHATWG 의 표준안을 대부분 수용해 HTML5가 탄생하게 된다 

## HTML4.01, XHTML1.0 과 HTML5 의 차이 
* 콘텐츠 모델 (Content Models)
    * 명확한 정보 구조 설계/구성을 위해 각 요소별로 비슷한 성격을 가지고 있는 것끼리 그룹화한다
* 콘텐츠 모델의 카테고리
    * Sectioning Root
    * Script-supporting Elements
    (Contents)
        * Metadata
        * Flow
        * Sectioning
        * Heading
        * Phrasing
        * embedded
        * Interactive
        * Palpable
        * Transparent

## HTML5 Markup의 기초
* HTML 문서는 요소(element) / 태그(tag) / 콘텐츠(contents) 으로 구성
    * 요소
        * 시작 / 종료 태그 모두를 포함하여 요소 라고 한다
    * 태그
        * 시작 / 종료 태그로 나눌 수 있으며 "<" 와 ">"로 둘러싸여 있다
        * 시작 태그의 경우 <tag>의 형태를 가지며, 종료 태그의 경우 </tag> 형태이다
        * 일부 태그의 경우, 종류 태그를 가지지 않는 경우도 있다. 이를 empty element 라고 한다           
    * 속송
        * 시작 태그는 필요에 따라 정해진 속성을 가질수 있다. 
        * 사용할수있는 속성은 태그마다 다르다
        * 시작 태그 내에 여러 개의 속성을 선언할수있다
            * 속성과 속성은 공백으로 구분해 지정해야한다
        * 속성에는 값을 가지지 않는 논리 속성도 있고, 논리 속성의 경우 값을 생략할 수 없기 때문에 속성명을 값으로 지정해야 한다         

* 대소문자의 사용
    * 시작 / 종료 태그는 물론 속성에 대문자 또는 소문자를 사용할수있다
기존 html 과 지금의 html 차이를 알기 

## HTML5 요소
    * <html> : 문서의 루트 요소, HTML 요소는 루트 요소 내에 포함
    * <head> : 문서의 메타데이터 집합 요소,문서제목,스타일 파일 연결,자바스크립트 삽입을 위한 요소 포함
    * <body> : 문서의 본문 요소
    * <title> : 문서의 제목 
    * <meta> : 다양한 문서 정보 나타낼때 사용
    * <style> : CSS 문서 내에 직접 기술할때 사용
    * <link> : 외부 문서 연결할때 사용
    * <base> : 상대 경로에 대한 기본 URL 을 정의할때 
    * <script> : 자바스크립트 파일을 삽입, 코드를 기술할때 
    * <noscript> : 자바스크립트를 지원하지 않을 경우, 대신 제공할 폴백 콘텐츠 정의할때
    * <section> : 장, 절 등으로 구성할수 있는 콘텐츠 섹션을 정의할때
    * <nav> : 문서의 주요 내비게이션을 정의할때
    *************** 하다보니 너무 많다....