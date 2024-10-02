<div align = "center">
    
![로고](https://raw.githubusercontent.com/UbSE-lab/class-review-site-server/refs/heads/main/images/Logo_Blue2.png)

</div>

---

[사이트 보러가기](https://slr-phi.vercel.app/)

## Class Review Site Server
> 수업 리뷰 사이트는 대학생들이 직접 들은 수업을 바탕으로 리뷰를 작성하고 공유하는 시스템입니다.

### Skills
* Java 17
* Spring Boot 3.2.5
* JPA
* MySql

### Naming
* Lecture : 강의 고유 정보
* ClassList : 개설된 강의
* User : 사용자 (학생, 교수)
* Review : 수강후기
* Auth : 인증

### Features
* 학생, 교수 회원가입
* 학생, 교수 로그인
* 수강 후기 목록 전체 조회
* 수강 후기 작성 요청
* 수강 후기 삭제 요청
* 수강 후기 수정 요청
* 수강 후기 좋아요 요청
* 학생 수강후기 전체 조회
* 전체 강의 정보
* 나의 수강 정보
* 강의 무작위 추천 3개 조회
* 학과 전체조회

### Swagger

* localhost:8000/swagger-ui/index.html 접속 후 사용

### API 구조

![image](https://github.com/user-attachments/assets/ee5e16c7-d28f-4531-b729-94dbb8beceea)

### DataModel

![datamodel](https://raw.githubusercontent.com/UbSE-lab/class-review-site-server/refs/heads/main/images/datamodel.png)

### System Architecture

![architecture](https://github.com/user-attachments/assets/0e5ffb83-0046-41a0-9feb-7139200d9389)


### 구현 및 추가 설명

- API 서버 코드 작성 후 배포 및 리팩토링
    - spring security의 userpasswordtoken을 사용해 토큰 인증 방식 로그인 기능 작성
    - 해당 유저가 학생, 교수를 판단하기위해 userAuthority 테이블에 해당 계정을 명시
    - 예외처리를 위해서 ControllerAdvice 클래스를 작성
    - 개설된 강의(Class)와 순수 강의 정보(Lecture)을 분리하여 해당 강의를 가르치는 교수가 변경되어도 기존의 강의정보를 활용할 수 있도록 작성
    - 학생이 어떤 강의를 들었는지 이수구분 데이터를 저장하여 관리할 수 있도록 UserClassList 작성
    - 정적 팩토리 메서드 패턴을 활용하여 builder 패턴의 중복을 최소화
    - 요청에 대한 응답 form을 순수 제너릭 클래스 타입(T)로 명시하여 캡슐화

- 데이터베이스 모델 설계 및 제작
    - 수강 후기 데이터들을 모아놓기 위한 도메인 네이밍 및 관계를 구상
    - 후에 데이터베이스를 분산 처리를 진행해도 문제없도록 알맞는 정규화를 진행

### 리팩토링 과정 설명글

- [부산 ICT 해커톤 회고 링크](https://1nmybrain.tistory.com/54)
  
