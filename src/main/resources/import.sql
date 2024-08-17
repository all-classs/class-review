insert into User (userNumber, password, userName, department, nickname) values (20191434, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "김강민", "소프트웨어학과", "amazon");

insert into User (userNumber, password, userName, department, nickname) values (20191585, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "정규환", "소프트웨어학과", "겐지연습용계정겐지");

insert into User (userNumber, password, userName, department, nickname) values (20191501, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "박진우", "소프트웨어학과", "진우0105");

insert into User (userNumber, password, userName, department, nickname) values (20191576, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "장우영", "소프트웨어학과", "우리집은리포브카");

insert into User (userNumber, password, userName, department, nickname) values (20191244, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "나한희", "건축학과", "한희의 일기교실");

insert into User (userNumber, password, userName, department, nickname) values (20234330, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "김철수", "건축학과", "짱구는 못말리나");

insert into User (userNumber, password, userName, department, nickname) values (20246343, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "김하나", "건축학과", "하나님만세");

insert into User (userNumber, password, userName, department, nickname) values (20203910, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "정본기", "건축학과", "철수는 안몬말려");

insert into User (userNumber, password, userName, department, nickname) values (20021234, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "문미경", "소프트웨어학과", "mkmoon123");


insert into authority (authority) values ("USER");
insert into authority (authority) values ("PROFESSOR");
insert into userAuthority (userNumber, authority) values (20191434, "USER");
insert into userAuthority (userNumber, authority) values (20191585, "USER");
insert into userAuthority (userNumber, authority) values (20191501, "USER");
insert into userAuthority (userNumber, authority) values (20191576, "USER");
insert into userAuthority (userNumber, authority) values (20191244, "USER");
insert into userAuthority (userNumber, authority) values (20234330, "USER");
insert into userAuthority (userNumber, authority) values (20246343, "USER");
insert into userAuthority (userNumber, authority) values (20203910, "USER");
insert into userAuthority (userNumber, authority) values (20021234, "PROFESSOR");

insert into ImageUrl (imageName, imageUrl) values ("익명", "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/professor.png");

-- insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values ();

-- 1
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "소프트웨어공학", "동서대학교", "전공선택");
-- 2
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "데이터베이스 개론", "동서대학교", "전공선택");
-- 3
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "운영체제", "동서대학교", "전공선택");
-- 4
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "오픈소프트웨어 실습", "동서대학교", "전공선택");
-- 5
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "대한민국 SW 융합 해커톤 대회", "동서대학교", "전공선택");
-- 6
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "네트워크 개론", "동서대학교", "전공선택");
-- 7
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "고급프로그래밍", "동서대학교", "전공선택");
-- 8
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "이산수학", "동서대학교", "전공선택");
-- 9
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "선형대수", "동서대학교", "전공선택");
-- 10
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "자료구조및알고리즘", "동서대학교", "전공선택");
-- 11
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "컴퓨터구조", "동서대학교", "전공선택");
-- 12
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "소프트웨어학과", "사용자인터페이스기획및설계", "동서대학교", "전공선택");
-- 13
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "건축학과", "건축학", "동서대학교", "전공선택");
-- 14
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (0, 0, 0, "경찰행정학과", "경찰행정학", "동서대학교", "전공선택");

-- 1
insert into Professor (professorName, department) values ("문미경", "소프트웨어학과");
-- 2
insert into Professor (professorName, department) values ("조대수", "소프트웨어학과");
-- 3
insert into Professor (professorName, department) values ("김동현", "소프트웨어학과");
-- 4
insert into Professor (professorName, department) values ("박준석", "소프트웨어학과");
-- 5
insert into Professor (professorName, department) values ("박승민", "소프트웨어학과");

-- 소프트웨어공학
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction) values (325951, 1, 1, 1, "소프트웨어 공학(-工學, 영어: software engineering)은 소프트웨어의 개발, 운용, 유지보수 등의 생명 주기 전반을 체계적이고 서술적이며 정량적으로 다루는 학문이다. 즉, 공학을 소프트웨어에 적용하는 것이다.");

-- 데이터베이스
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction) values (322690, 1, 2, 2, "① 데이터베이스 기초 이론 : 1장에서 데이터베이스를, 2장에서 DBMS를 소개합니다. 3장에서는 이들을 조합한 데이터베이스 시스템을 소개합니다.");

-- 운영체제
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction) values (323208, 1, 3, 4, "운영체제 (Operating System)란? 운영 체제(OS)는 쉽게 이야기해서 하드웨어를 관리하는 프로그램입니다. 운영체제는 컴퓨터를 각종 하드웨어 자원과 소프트웨어 자원을 효율적으로 운영관리함으로써 사용자가 시스템을 이용하는데 편리함을 제공하는 소프트웨어입니다.");

-- 오픈소프트웨어실습
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction) values (325129, 1, 4, 3, "");

-- 네트워크 개론
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction) values (322660, 1, 6, 5, "");

-- 자료구조및알고리즘
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction) values (310479, 1, 10, 3, "");

-- 네트워크 개론
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction) values (310477, 1, 7, 5, "");




-- User ClassList
insert into UserClassList (userNumber, CompletionType, CompletionYear, grade, semester, classNumber) values (20191434, "A+", "2023", "3", "1", 325951);


