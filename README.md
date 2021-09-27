# TicTacToe
### TicTacToe이란?
- Tic-tac-toe  is a paper-and-pencil. game for two players, who take turns marking the spaces in a 3x3 grid. The player who succeeds in placing three of their
marks in a horizontal, vertical, or diagonal row wins the game.
- 틱택토(tic-tac-toe)게임입니다. Player와 Computer가 번갈아가며 O와 X를 3×3 판에 써는 게임입니다. 같은 글자를 가로, 세로, 혹은 대각선 상에 놓으면 이기는 게임을 구현했습니다
- 진행 기간: 2018. 04. - 2018. 06.

### Role of class in the game
1. saveLoad 
   - 게임 시작할 때 전에 한 게임 파일이 있다면 load할 수 있는 기능이 있고 게임하는 도중에 저장하고 싶으면 저장할 수 있는 기능이 있습니다.
2. main
    - 게임이 끝날 때까지 전체 게임을 진행하는 기능을 합니다. 
3. print
    - User나 컴퓨터가 입력할 때마다 3x3판을 출력하는 기능이 있습니다.
4. logicCheck
    - User가 컴퓨터에게 이겼는지 비겼는지 졌는지 확인하는 기능을 합니다.
5. userInput
    - User가 3x3판에 입력하는 기능입니다.
6. computerInputEasy
    - user가 쉽게 이길 수 있도록 컴퓨터가 입력하는 기능이 있습니다.
7. computerInputMiddle
    - user가 보통 난이도로 이길 수 있도록 컴퓨터가 입력하는 기능이 있습니다.
8. computerInputHard
    - user가 어려운 난이도로 이길 수 있도록 컴퓨터가 입력하는 기능이 있습니다.

### Design of Class
1. saveLoad
    - FileI/O를 사용하여 save와 load기능을 구현합니다.
2. main
    - 전체 클래스의 흐름을 잡는 class입니다. 가장 먼저 실행하는 class입니다. 
4. print
    - 반복문을 사용해 배열에 저장된 입력기록들을 System.out.println();으로 출력하는 기능을 수행합니다.
5. logicCheck
    - User나 computer중 대각선에 같은 표시를 냈는지 세로줄에 같은 표시를 냈는지 가로줄에 같은 표시를 내면 그 표시를 낸 자가 이긴 걸로 check 합니다.
    - 표시를 아직 내지 못한자는 진 걸로 check 합니다.
    - 양쪽 다 표시를 내지 못하고 3x3판을 완성시키면 종료합니다.
5. userInput
    - Scanner을 사용해 사용자가 입력받아 저장할 수 있도록 합니다. 그리고 반복문을 사용하여 중복체크를 함으로써 user가 올바르게 입력할 수 있게 합니다.
6. computerInputEasy
    - 컴퓨터가 중복되지 않고 랜덤으로 입력하게 합니다.
7. computerInputMiddle
    - 컴퓨터가 중복되지 않고 랜덤으로 입력하게 했다가 효율적으로 입력하게 했다가를 반복하며 입력을 수행합니다.
    - 효율적으로 입력할 때, Computer(middle)은 recursively 하게 경우의 수를 다 계산하여서 가중치를 둡니다. 가장 효율적인 곳을 찾아 위치를 결정합니다.
8. computerInputHard
    - 효율적으로 입력하게 합니다.Computer(hard)는 Computer가 주어진 상황에서 어떤 경우의 수가 있는지 다 검토하여 efficiency를 계산합니다.
    - 효율적으로 computer가 입력처리하기 위한 알고리즘
        - 1) 주어진 상황에서 둘 수 있는 경우를 모두 생각합니다.
        - 2) 둘 수 있는 경우가 가져오는 효용(Efficiency)를 계산합니다
        - 3) 효용이 가장 높은 수를 채택해서 둡니다.
            - 1순위 효용 100 다음 수를 두어서 경기를 끝낼 수 있는 경우
            - 2순위 효용 50 지금 막지 않으면 상대방이 경기를 끝나게 되어 지는 경우
            - 3순위 효용 10 별로 의미 없는 수 ex. 먼저 가장 중간 그 다음으로 꼭짓점 그다음으로 랜덤
            - 4순위 기본적으로 가장 중간이 제일 효율적이고 꼭지점이 그 다음, 모서리가 그 다음으로 효율적인 수가 됩니다.

### Flow Chart of Main Class
![img](https://github.com/0sunzero0/TicTacToe/blob/master/img/Flow%20Chart.png)

### 배운점
1. 이번 팀 프로젝트를 통해서 Github를 사용해서 팀원들과 소스를 공유하고 합칠 수 있는 방법을 배웠습니다. 
   - Github를 사용함으로써 Source가 충돌하고 날아가는 경우의 수가 없어졌고 효율적으로 팀원들과 팀프로젝트를 할 수 있었습니다.
3. 팀원들의 source code를 분석하는 방법을 배웠습니다.
    - Main Class를 수정할 때 함께한 팀원들의 코드를 분석하면서 해야만 Main Class Source를 수정이 가능했습니다. 각 Class마다 변수와 함수를 정리했습니다. 먼저 변수의 이름, 타입, 의미, 용도가 무엇인지 연구해보고 팀원들에게 물어보고 작성하면서 변수를 정리했습니다. 그 다음 함수의 이름, 파라미터, 리턴값, 수행내용이 무엇인지 연구해보고 팀원들에게 물어보고 작성하면서 함수를 정리했습니다. 변수와 함수를 어떤 의도로 작성 했는지 팀원들에게 물어보고 직접 정리해 봄으로써 팀원들의 코드를 분석하는 방법을 배우게 되었습니다.
4. Java OOP 활용
    - 처음에는 막연히 TicTacToe을 OOP를 활용하지 않고 구현했습니다. 교수님의 피드백을 통해 TicTacToe 게임에 OOP 기능을 구현함으로써 Inheritance, Polymorphism, Encapsulation을 어떻게 활용할지에 대해 더 실제적을 와 닿았습니다.


### 업무 분담
- 0sunzero0(Developer): 
  - Computer Class 구현
    - Main class를 짧게 간결하게 수정
    - Computer Class 알고리즘 설계 및 구현
- 외 5명 : 
  - 1. saveLoad 
  - 2. main 
  - 3. print 
  - 4. logicCheck 
  - 5. userInput
