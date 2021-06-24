# TicTacToe
### TicTacToe이란?
- Tic-tac-toe  is a paper-and-pencil. game for two players, who take turns marking the spaces in a 3x3 grid. The player who succeeds in placing three of their
marks in a horizontal, vertical, or diagonal row wins the game.
- 진행 기간: 2018. 04. - 2018. 06.


### 

### 개선점
- 다양한 보안 취약점 존재.
    - 본 문제를 분석하기 위해서 18년 2학기 컴퓨터보안 파이널 프로젝트로 **모의사이트 취약점 분석을 통한 시큐어 코딩의 효과성 연구**를 진행하였습니다. 본 프로젝트에서 네모 웹 애플리케이션의 보안을 위해서 행안부에서 발간한 'SW 개발보안 가이드'에서 제시하는 47가지 시큐어코딩을 적용하면서 어떻게 보안성을 높일 수 있는지 보였습니다.  
- 디자인적으로 불편한 요소 존재.
    * KTX 방 개설하는 부분에서 페이지를 동적으로 변환해서 하나의 페이지에서 방이 개설되게 해야하나 해당 부분 구현에 어려움을 느끼어 페이지를 세 번 이동해야 방을 개설이 되는 UX적인 문제가 있습니다. 
- 디자인패턴을 지키지 못함.
    * MVC모델을 잘 살려야 했으나, JSP를 이용한 첫 개발로 인하여 개발 시 다양한 문점을 해결하기 위해서 MVC 패턴을 깨며 개발한 부분이 있습니다. 


### 배운점
- 개발 단계에서 보안 취약점이 발생할 수 있기에 설계 단계에서 이 점을 고려해야 한다는 점.
- 프레임워크 선정의 중요성.
- UX도 개발 만큼 중요하다는 점.
- 


### 업무 분담
- 0sunzero0(개발자): Computer Class 구현
  - Main class를 짧게 간결하게 수정
  - Computer Class 알고리즘 설계 및 구현
- 외 5명 : 
  - 1. saveLoad 
  - 2. main 
  - 3. print 
  - 4. logicCheck 
  - 5. userInput
