# StringTokenizer 기본 및 사용법

StringTokenizer 클래스는 문자열을 구분자를 이용하여 쪼갤 때 사용 할 수 있다. (쪼갠다. = 파싱한다.) 예를 들어 "Hi I'm yeonwoo!" 라는 문자열을 ""(공백)을 구분자로 "Hi", "I'm", "yeonwoo!" 이렇게 3개로 쪼개는 것이 가능하다.

Token을 구분자에 의해 쪼개진 단어라고 생각하면 된다.

> ## StringTokenizer 생성
>
> - StringTokenizer(String str) : 파싱 할 문자열을 인자로 받는다. 구분자를 지정하지 않았으므로 스페이스, 탭, 줄바꿈, 캐리지 리턴 등 기본 구분자가 적용된다.
>
> - StringTokenizer(String str, String delim) : 파싱할 문자열과 구분자를 인자로 받는다.
>
> - StringTokenizer(String str, String delim, boolean flag) : flag는 구분자 자체도 토큰으로 인식하게 할지 여부를 정한다. 예를 들어 true 라면 "Hi I'm yeonwoo!!"는 공백을 포함하여 "Hi", "", "I'm", "", "yeonwoo!!" 이렇게 5개 토큰으로 파싱된다.
>
>   

----

