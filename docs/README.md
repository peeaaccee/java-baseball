## 📜 기능 요구 사항

* 순서: 랜덤 값 생성 - 사용자 값 입력 - 값들 비교 - 재시작/ 종료

1. 랜덤 값 생성
   - 3자리 수
   - 서로 다른 수
   - 1~9로 이루어진 수

2. 사용자 값 입력
   - 3자리 수
   - 각 자리 수 모두 다름
   - 1~9로 이루어진 수
   - 조건이 맞지 않으면 'IllegalArgumentException' 발생 후 애플리케이션 종료

3. 값 비교
   - 같은 수 같은 자리: 스트라이크
   - 같은 수 다른 자리: 볼
   - 같은 수 없음: 낫싱
   - 세 숫자 모두 같음: "3개의 숫자를 모두 맞히셨습니다! 게임 종료"

4. 재시작/ 종료 묻기
   - 1이면 재시작, 2면 종료
   - 그 외엔 'IllegalArgumentException' 발생 후 애플리케이션 종료

* 게임 문구
   - 시작 문구: "숫자 야구 게임을 시작합니다."
   - 진행: "숫자를 입력해주세요 : "
   - 힌트: 숫자+단위 ex. 1볼 1스트라이크
   - 종료: "3스트라이크"
     "3개의 숫자를 모두 맞히셨습니다! 게임 종료"
     "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."
   - 재시작 시 "숫자 야구 게임을 시작합니다." 출력하지 않음.

## 📜 프로그래밍 요구 사항
    1. 라이브러리 camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용하여 구현
        - Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용
        - 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용
    2. indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록
    3. 3항 연산자를 쓰지 않음.
    4. 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게
    5. JUnit 5와 AssertJ를 이용하여 본인이 정리한 기능 목록이 정상 동작함을 테스트 코드로 확인


## 📜 과제 진행 요구 사항
    1. 기능 구현 전 docs/README.md에 구현할 기능 목록을 정리
    2. 커밋 메시지 컨벤션 가이드 참고해 커밋 메시지 작성 ex: feat($browser), fix($compile), docs(guide) etc