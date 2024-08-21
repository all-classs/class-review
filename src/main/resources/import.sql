insert into User (userNumber, password, userName, department, nickname) values (20191434, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "김강민", "소프트웨어학과", "amazon");

insert into User (userNumber, password, userName, department, nickname) values (20191585, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "정규환", "소프트웨어학과", "겐지연습용계정겐지");

insert into User (userNumber, password, userName, department, nickname) values (20191501, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "박진우", "소프트웨어학과", "진우0105");

insert into User (userNumber, password, userName, department, nickname) values (20191576, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "장우영", "소프트웨어학과", "우리집은리포브카");

insert into User (userNumber, password, userName, department, nickname) values (20191244, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "나한희", "건축학과", "한희의 일기교실");

insert into User (userNumber, password, userName, department, nickname) values (20234330, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "김철수", "건축학과", "짱구는 못말리나");

insert into User (userNumber, password, userName, department, nickname) values (20246343, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "김하나", "건축학과", "하나님만세");

insert into User (userNumber, password, userName, department, nickname) values (20203910, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "정본기", "건축학과", "철수는 안몬말려");

insert into User (userNumber, password, userName, department, nickname) values (20021234, "$2a$10$Ojc4pOiw7FGjVmPIM6nNg.LjpOwpDDN/kH9mWEeBb/LqbTQnXslyK", "문미경", "소프트웨어학과", "mkmoon123");


insert into authority (authority) values ("STUDENT");
insert into authority (authority) values ("PROFESSOR");
insert into userAuthority (userNumber, authority) values (20191434, "STUDENT");
insert into userAuthority (userNumber, authority) values (20191585, "STUDENT");
insert into userAuthority (userNumber, authority) values (20191501, "STUDENT");
insert into userAuthority (userNumber, authority) values (20191576, "STUDENT");
insert into userAuthority (userNumber, authority) values (20191244, "STUDENT");
insert into userAuthority (userNumber, authority) values (20234330, "STUDENT");
insert into userAuthority (userNumber, authority) values (20246343, "STUDENT");
insert into userAuthority (userNumber, authority) values (20203910, "STUDENT");
insert into userAuthority (userNumber, authority) values (20021234, "PROFESSOR");

insert into ImageUrl (imageName, imageUrl) values ("익명", "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/professor.png");

insert into ImageUrl (imageName, imageUrl) values ("main-banner", "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/main-banner.png");

insert into ImageUrl (imageName, imageUrl) values ("main-banner", "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/main-banner2.png");

insert into ImageUrl (imageName, imageUrl) values ("main-banner", "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/main-banner3.png");

insert into ImageUrl (imageName, imageUrl) values ("banner", "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/banner.png");

insert into ImageUrl (imageName, imageUrl) values ("banner", "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/banner2.png");

insert into ImageUrl (imageName, imageUrl) values ("banner", "https://raw.githubusercontent.com/UbSE-lab/class-review-site-page/image/banner3.png");


-- insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values ();

-- 1
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (5, 0, 0, "소프트웨어학과", "소프트웨어공학", "동서대학교", "전공선택");
-- 2
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (5, 0, 0, "소프트웨어학과", "데이터베이스 개론", "동서대학교", "전공선택");
-- 3
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (5, 0, 0, "소프트웨어학과", "운영체제", "동서대학교", "전공선택");
-- 4
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "오픈소프트웨어 실습", "동서대학교", "전공선택");
-- 5
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (5, 0, 0, "소프트웨어학과", "대한민국 SW 융합 해커톤 대회", "동서대학교", "전공선택");
-- 6
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "네트워크 개론", "동서대학교", "전공선택");
-- 7
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (3, 0, 0, "소프트웨어학과", "고급프로그래밍", "동서대학교", "전공선택");
-- 8
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "이산수학", "동서대학교", "전공선택");
-- 9
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "선형대수", "동서대학교", "전공선택");
-- 10
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "자료구조및알고리즘", "동서대학교", "전공선택");
-- 11
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "컴퓨터구조", "동서대학교", "전공선택");
-- 12
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "사용자인터페이스기획및설계", "동서대학교", "전공선택");
-- 13
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (3, 0, 0, "건축학과", "건축학", "동서대학교", "전공선택");
-- 14
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "경찰행정학과", "경찰행정학", "동서대학교", "전공선택");

-- 15
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "소프트웨어실무영어", "동서대학교", "전공선택");

# --16
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "전기컴퓨터공학과", "컴파일러", "부산대학교", "전공선택");

# 17
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (4, 0, 0, "소프트웨어학과", "채플", "동서대학교", "교양필수");

# 18
insert into Lecture (averageStarLating, reviewCount, totalStarLating, department, lectureName, university, lectureType) values (2, 0, 0, "소프트웨어학과", "학문과신앙", "동서대학교", "교양선택");




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
-- 6
insert into Professor (professorName, department) values ("김철수", "전기컴퓨터공학과");
# 7
insert into Professor (professorName, department) values ("한민구", "소프트웨어학과");

-- 소프트웨어공학
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (325951, 1, 1, 1, "소프트웨어 공학(-工學, 영어: software engineering)은 소프트웨어의 개발, 운용, 유지보수 등의 생명 주기 전반을 체계적이고 서술적이며 정량적으로 다루는 학문이다. 즉, 공학을 소프트웨어에 적용하는 것이다.", true);

-- 데이터베이스
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (322690, 1, 2, 2, "① 데이터베이스 기초 이론 : 1장에서 데이터베이스를, 2장에서 DBMS를 소개합니다. 3장에서는 이들을 조합한 데이터베이스 시스템을 소개합니다.", true);

-- 운영체제
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (323208, 1, 3, 4, "운영체제 (Operating System)란? 운영 체제(OS)는 쉽게 이야기해서 하드웨어를 관리하는 프로그램입니다. 운영체제는 컴퓨터를 각종 하드웨어 자원과 소프트웨어 자원을 효율적으로 운영관리함으로써 사용자가 시스템을 이용하는데 편리함을 제공하는 소프트웨어입니다.", true);

-- 오픈소프트웨어실습
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (325129, 1, 4, 3, "준비중", true);

-- 네트워크 개론
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (322660, 1, 6, 5, "준비중", true);

-- 자료구조및알고리즘
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (310479, 1, 10, 3, "준비중", true);

-- 네트워크 개론
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (310477, 1, 7, 5, "준비중", true);

-- 소프트웨어실무영어
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (322661, 1, 15, 5, "준비중", false);

-- 컴파일러(부산대학교)
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (329991, 1, 16, 6, "컴파일러의 이론을 깨우치며 컴퓨터의 원리를 이해한다.", false);

# 채플
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (120001, 1, 17, 7, "기도합시다.", true);


# 학문과신앙
insert into ClassList (classNumber, imageNumber, lecId, professorId, classIntroduction, opened) values (140021, 1, 18, 7, "학문과신앙 내용", true);


-- User ClassList
insert into UserClassList (userNumber, CompletionType, CompletionYear, grade, semester, classNumber) values (20191434, "A+", "2023", "3", "1", 325951);

# insert into ClassReview (likes, userNumber, createDate, lecId, reviewId, starLating, postTitle, postContent) values (0, )


insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 1, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 1, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 1, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 1, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 1, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 1, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 1, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");


insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 2, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 2, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 2, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 2, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 2, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 2, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 2, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
#
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 3, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 3, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 3, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 3, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 3, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 3, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 3, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
#
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 4, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 4, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 4, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 4, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 4, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 4, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 4, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
#
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 5, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 5, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 5, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 5, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 5, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 5, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 5, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 6, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 6, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 6, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 6, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 6, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 6, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 6, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 7, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 7, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 7, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 7, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 7, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 7, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 7, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 8, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 8, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 8, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 8, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 8, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 8, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 8, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 9, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 9, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 9, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 9, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 9, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 9, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 9, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 10, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 10, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 10, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 10, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 10, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 10, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 10, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 11, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 11, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 11, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 11, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 11, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 11, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 11, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 12, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 12, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 12, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 12, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 12, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 12, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 12, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 13, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 13, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 13, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 13, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 13, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 13, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 13, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 14, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 14, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 14, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 14, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 14, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 14, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 14, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 15, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 15, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 15, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 15, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 15, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 15, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 15, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 16, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 16, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 16, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 16, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 16, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 16, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 16, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 17, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 17, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 17, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 17, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 17, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 17, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 17, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");

insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191434, 18, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191244, 18, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191501, 18, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20191576, 18, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20203910, 18, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20234330, 18, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
insert into ClassReview (likes, userNumber, lecId, starLating, postTitle, postContent) values (0, 20246343, 18, 0, "아주 훌륭한 강의입니다.", "얼마나 재밌으면 이렇게 즐겁게 느껴질까요 ㅎㅎ");
