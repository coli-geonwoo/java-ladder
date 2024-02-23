# java-laddergame

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)



## 기능 구현 목록

### 참여자 입력
- [x] 입력 안내 메시지 출력
- [x] 참여할 사람 이름을 입력한다
  - [x] 이름은 최대 5글자까지 부여할 수 있다
  - [x] 사람 이름은 알파벳과 숫자로만 구성된다
  - [x] 참여자의 수는 1이상 100이하로 제한한다
  - [x] 사람 이름은 쉼표(,)를 기준으로 구분한다

### 사다리 높이 입력
- [x] 입력 안내 메시지 출력
- [x] 사다리 높이를 입력한다
  - [x] 사다리 높이는 1이상 100이하의 자연수이다

### 사다리 생성
- [x] 사다리의 높이는 사용자가 입력한 높이이다
- [x] 각 행마다 랜덤으로 사다리 연결을 형성한다
  - [x] 같은 행의 사다리 가로선은 연속되지 않게 한다

### 사다리 출력
- [x] 결과 안내 메시지 출력
- [x] 참여자 이름을 입력 순서대로 출력한다
  - [x] 참여자들의 이름은 공백으로 구분한다 
  - [x] 참여자 이름은 5글자를 기준으로 출력한다
  - ex) 글자 : 0 / 공백 : V
    ```
    1글자 : V V 0 V V
    2글자 : V V 0 0 V
    3글자 : V 0 0 0 V
    4글자 : 0 0 0 0 V
    5글자 : 0 0 0 0 0
    ```
- [x] 사다리를 출력한다.
  - [x] 사다리 세로선은 사용자 이름의 맨 오른쪽에 정렬한다
  - [x] 각 세로선이 연결되어 있다면, `|-----|` 로 가로선을 출력한다

```
    pobi  honux crong   jk 
        |-----|     |-----|
        |     |-----|     |
        |-----|     |     |
        |     |-----|     |
        |-----|     |-----|
```
