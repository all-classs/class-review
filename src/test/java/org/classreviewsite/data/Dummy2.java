package org.classreviewsite.data;

import org.classreviewsite.lecture.service.LectureService;
import org.classreviewsite.review.dto.Request.ClassReviewRequest;
import org.classreviewsite.review.dto.Request.DeleteReviewRequest;
import org.classreviewsite.review.service.ReviewService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class Dummy2 {

    @Autowired
    ReviewService reviewService;


//    @Transactional
    @Test
    void 대한민국해커톤(){
//        private String lectureName;
//        private Long userNumber;
//        private Long starLating;
//        private String postTitle;
//        private String postContent;


//        reviewService.addReviewPost(
//                ClassReviewRequest.of("열심히만들으면 에이플받을수잇고 기말때 역전을 노리기보다는 중간을 최대한 잘보는것이 중요함\n", "수업스타일은 교수님이 굉장히 기본적인내용을 충실히 가르쳐주셔서 한학기동안 잘공부하면 전전기회로에 좋은성취도를 얻을수잇음 그날그날 배운내용 복습을 철저히합니다. 과제는 나오면 바로바로 합니다.", 20240001L, 4L, "대한민국 SW 융합 해커톤 대회", 5L, 3L, 1L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("시험이 어렵지만 수업 열심히 들으면 그래도 배울게 많은 수업입니다!!\n", "수업은 아주 잘 가르치시고 시간은 거의 다 채워서 하시는 편입니다. 물리를 모르는 학생들도 알기 쉽게 가르쳐 주십니다. 시험문제는 중간 기말 4문제씩 출제하시고 수업시간에 다룬 내용을 출제하시지만 난이도가 꽤 높은편입니다\n", 20240002L, 4L, "대한민국 SW 융합 해커톤 대회", 4L, 4L, 1L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("교수님 시험은 수업 잘 듣고 이해하면 잘 볼 수 있어요!", "모든 내용을 판서로 하시고 가끔 책에 나온 예제문제 풀어주십니다. 필기 열심히하고 풀어주시는 예제 풀면 좋은 학점 받을 수 있을것같아요\n", 20240003L, 4L, "대한민국 SW 융합 해커톤 대회", 5L, 3L, 3L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("정말 외울것과 공부할 내용이 많은 과목입니다 힘드시겠지만 필수니 열심히 들어두세요", "피피티를 통해 설명을 하시는 스타일이며 중간기말 외에도 추가 임시시험이 존재하며 반영비울은 똑같습니다. 족보와 문제가 똑같이 나오니 족보를 4개년은 풀고 들어가시는게 좋습니다", 20240004L, 4L, "대한민국 SW 융합 해커톤 대회", 4L, 4L, 4L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("꼭 프린트물을 다 채워서 pass하시길!!! 화이팅!!\n", "학교 여러곳을 다니며 4년간 학교생활에 도움이 될 정보도 알아가고, 수업시간에도 여러 조언을 해주시는 수업이에요. 과제로 대체합니다. 유인물을 평소에 잘 채워두면 나중에 고생하지 않습니다.\n", 20240005L, 4L, "대한민국 SW 융합 해커톤 대회", 3L, 1L, 2L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("수업 잘 듣고 족보 푸세요. 수업 빠지지 마세요.졸지도 마시고요. 족보없으시면 책에 있는 문제 푸세요.\n", "개념설명하시고 문제 풀 시간을 주시거나 이해할 시간을 주십니다.족보 풀어보시거나,개념을 정확히 아세요. 시험에서는 개념 물어봅니다. 족보 풀어보시거나,개념을 정확히 아세요. 시험에서는 개념 물어봅니다.", 20240006L, 4L, "대한민국 SW 융합 해커톤 대회", 4L, 3L, 1L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("수업시간에 졸지 마세요ㅠㅠ 그래도 문제풀려면 개념이 있어야하니깐요ㅠㅠ\n", "개념 가르쳐주시고 문제푸는 시간이나 이해하는 시간을 줍니다. 작년 족보문제만 다 푸셔도 어느정도 성적나옵니다. 중간중간 중요하지 않는 부분은 넘어가기 때문에 수업 빠지거나 졸지 마세요~", 20240007L, 4L, "대한민국 SW 융합 해커톤 대회", 4L, 2L, 3L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("이 과목은 외울게많다 정보에대한 교육적내용을 다 외워야하기때문에 암기력이 딸리는 학생들은 비추한다.\n", "강의식이시고 팀플을 좀 좋아하시는편이다 팀플이랑 발표를 되게 좋아하셔서 그런거 잘준비해가면 좋은 점수를 받을수있다강의식이시고 팀플을 좀 좋아하시는편이다 팀플이랑 발표를 되게 좋아하셔서 그런거 잘준비해가면 좋은 점수를 받을수 있다. 강의식이시고 팀플을 좀 좋아하시는편이다 팀플이랑 발표를 되게 좋아하셔서 그런거 잘준비해가면 좋은 점수를 받을수있다\n", 20240008L, 4L, "대한민국 SW 융합 해커톤 대회", 4L, 4L ,4L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("어려운 과목이지만 수업은 쉽게쉽게진행하시니 걱정말고 하세요", "어려운 문제들은 다루지않고 기본예제들 중심으로 수업하시고 조금 지루하긴 하지만 나름 거부감없이 할수있는 수업이에요. 예제들중심으로 공부하시고 수업시간에만 충실해도 어느정도 성적은 나옵니다", 20240009L, 4L, "대한민국 SW 융합 해커톤 대회", 3L, 4L, 5L)
//        );
//
//        reviewService.addReviewPost(
//                ClassReviewRequest.of("수업시간에 집중적으로 들으며 매일 복습하면 시험기간에 힘들지 않습니다.", "이 과목은 임용에 맞춰있는 과목이고 한 학과의 임용에 맞춰 있기에 교수님이 그 방향으로 수업을 해주시고 논술형에 적합하게 맞춤형으로 수업을 해주십니다. 수업 중 중요부분을 말씀해 주시기에 그 부분을 이해하며 암기하면 충분히 문제를 풀 수 있습니다.", 20240010L, 4L, "대한민국 SW 융합 해커톤 대회", 4L, 4L , 5L)
//        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("첫 해커톤", "처음 참여한 해커톤 대회라서 미흡한 점도 많았지만 그만큼 배운점도 많았다.", 20240001L, 4L, "대한민국 해커톤", 1L, 1L , 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("해커톤.^^", "함께 밤새니까 힘이나고 정말 즐겁다", 20240002L, 3L, "대한민국 해커톤", 1L, 1L , 0L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("해커톤", "친구들과 함께 프로젝트를완성해 나가는 과정이 유익했다.", 20240003L, 4L, "대한민국 해커톤", 1L, 1L , 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("열정", "열정이 중요하다", 20240004L, 5L, "대한민국 해커톤", 1L, 1L , 0L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("무박3일", "피곤하다. 시간이 의외로 넉넉하다. 다들 대단하신것 같다.", 20240005L, 4L, "대한민국 해커톤", 1L, 1L , 0L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("해커톤 리뷰", "먹을것이 풍족한 것에 비해 네트워크(와이파이)가 너무 준비가 미흡한것 같다.", 20240006L, 4L, "대한민국 해커톤", 1L, 1L , 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("감옥...?", "밥 시간이 정해진대로 잘 나와서 좋았지만 메뉴는 아쉬움ㅠ", 20240007L, 4L, "대한민국 해커톤", 0L, 1L , 0L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("좋은 경험", "흔치않은 좋은기회에 참여해 잊지못할 추억을 만들었다.", 20240008L, 4L, "대한민국 해커톤", 0L, 1L , 1L)
        );



    }

    @Test
    void plus(){
        reviewService.addReviewPost(
                ClassReviewRequest.of("수업시간에 집중적으로 들으며 매일 복습하면 시험기간에 힘들지 않습니다.", "이 과목은 임용에 맞춰있는 과목이고 한 학과의 임용에 맞춰 있기에 교수님이 그 방향으로 수업을 해주시고 논술형에 적합하게 맞춤형으로 수업을 해주십니다. 수업 중 중요부분을 말씀해 주시기에 그 부분을 이해하며 암기하면 충분히 문제를 풀 수 있습니다.", 20240010L, 4L, "대한민국 해커톤", 1L, 0L , 1L)
        );
    }

    @Test
    void minus(){
        reviewService.deleteReviewPost(
                DeleteReviewRequest.of(26L, 20240010)
        );
    }

//    @Transactional
    @Test
    void 소프트웨어공학(){

        reviewService.addReviewPost(
                ClassReviewRequest.of("학점은 잘주나 얻어가는건 본인 하기나름", "시험이 쉽다, 수업 자료로 본인이 쓴 책을 쓰시는데 수업중 졸지만 않는다면 책에 있는 예제에서 시험 문제를 다 집어주기 때문에 시험 난이도가 한결 낮아지는 느낌이다 절평이라 본인이 아예 손을 놓은게 아니라면 학점도 후하게 주기 때문에 잘받아갈듯", 20240001L, 4L, "소프트웨어공학", 1L, 0L, 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("코딩 할줄 모르시면 성실히 수업들으시면 성적 잘 나옵니다. 코딩 할줄아시면 출첵만 하시면 됩니다", "절대평가고 교수님께서 성적을 잘 주시려 노력하십니다.", 20240002L, 3L, "소프트웨어공학", 1L, 1L, 0L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("열심히 하면 하는대로 돌아오는 수업입니다.과제 정말 중요해요 매주 과제해가는게 좀 힘들긴한데그거 잘하고 시험기간에 책한번 쫙 보시고 예제 손코딩 공부 좀 하시면 괜찮을거에요!과제 관리..잘하세요", "PPT로 강의식 수업하시고 4시간연강인데 2시간정도는 이론 나머지 시간은 실습시간입니다.실습시간에는 조교님께서 돌아다니시면서 질문받아주고 혼자 컴퓨터로 해보는 시간인데 보통 예제코드를 공부하거나 그때 과제를 합니다.거의 매주 과제가 나오는데 책에 있는 연습문제를 풀어가는 게 과제이고 후반부가면 가끔 PPT에 나오는 연습문제 2개정도가 과제로 나옵니다.", 20240003L, 5L, "소프트웨어공학", 1L, 1L, 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("정말 학점 잘주십니다! 꼭 들으셔용. 그리고 과제 꼭 내셔야합니다!!", "뭔가 도중도중에 장난도 쳐주시고 나름 재밌게 진행해주셔요.개념 많이 내시기 때문에 개념위주로 공부하시고 책에 있던 문제 그대로 나올때 많습니다.\n", 20240004L, 3L, "소프트웨어공학", 1L, 1L, 0L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("학점은 잘주나 얻어가는건 본인 하기나름", "시험이 쉽다, 수업 자료로 본인이 쓴 책을 쓰시는데 수업중 졸지만 않는다면 책에 있는 예제에서 시험 문제를 다 집어주기 때문에 시험 난이도가 한결 낮아지는 느낌이다 절평이라 본인이 아예 손을 놓은게 아니라면 학점도 후하게 주기 때문에 잘받아갈듯", 20240005L, 5L, "소프트웨어공학", 0L, 0L, 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("공부해보면 별로 어렵진않은데 문제로 만나면 까다롭습니다. A4반장 분량의 치팅페이퍼가 허용되니까 필요한 공식이나 풀이법등을 적어둬서 유용하게 사용하세요.", "복습을 20분이상해주셔서 좋았습니다. 교수님이 직접만든 교안을 이용해 수업을 진행하십니다. 수업에 나온 내용을 바탕으로 시험문제가 나오니까 잘 들어야하고 시험 전에 기출문제를 주지만 매번 새롭게 문제를 만들어 내시니 어떻게 문제를 만드는지만 보세요.\n", 20240006L, 2L, "소프트웨어공학", 1L, 1L, 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("C언어를 미리알고 수업듣는걸 추천합니다 아니면 수업시간에 잘못따라가실거에요", "수업을 열심히는 하십니다. 시험족보 즉 작년문제를 시험전에 나눠주시는데 비슷한유형의문제가  출제됩니다. 예습을안한생태로는 잘 따라가기 어려운수업입니다\n", 20240007L, 3L, "소프트웨어공학", 1L, 1L, 0L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("기초를 쌓은 뒤 듣는다면 더 유익할 수업입니다.", "기초를 쌓은 뒤 듣는다면 더 유익할 수업입니다. C에 대해 잘 모르는 상태에서 중간고사를 보게되서 좀 빡세게 공부를 했었습니다. 근데 하다보니 기초가 잡혀서 기말고사는 중간고사 보다는 쉽게 갈 수 있었습니다. 덕분에 학점도 괜찮게 나왔구요. 정말 아이러니한데...ㅋㅋㅋ 강의가 어려워서 더 노력하게 되어... 성격이 잘 나오는.. 이상하게도 만족도는 높게 주고 싶은 강의 입니다. 강의는 심화과정이라 버거운 편이긴 합니다.", 20240008L, 4L, "소프트웨어공학", 0L, 0L, 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("수업 필기 열심히하고 연습문제 많이 풀어보면 됩니다....", "잘 가르치십니다. 필기위주로 수업하시고 문제도 같이 풀어나가는 방식입니다연습문제만 많이 풀어도 될 것 같습니다. 수업만 잘 들어도 성적 잘나옵니다 연습문제만 많이 풀어도 될 것 같습니다. 수업만 잘 들어도 성적 잘나옵니다", 20240009L, 4L, "소프트웨어공학", 1L, 1L , 1L)
        );

        reviewService.addReviewPost(
                ClassReviewRequest.of("수업 꼭 열심히 듣고 따라가면서 이해해야 시험 잘볼수 있음", "다른교수님들은 마이웨이인 교수님들이 많은데 모두다 이해시키려고 노력하시는 스타일이라서 좋았음 교수님이 설명해주시는거 따라가면서 천천히 이해하면 성적 잘나옴\n", 20240010L, 4L, "소프트웨어공학", 1L, 0L, 1L)
        );

    }

}
