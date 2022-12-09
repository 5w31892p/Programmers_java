public class CharacterCoordinates {

    // 머쓱이 게임중
    // up, down, left, right 각 방향키 누르면 한칸씩 이동
    // [0,0] => up -> [0, 1], down -> [0, -1], left -> [-1, 0], right -> [1, 0]
    // 입력한 방향키의 배열 keyinput, 맵의 크기 board
    // [0,0]에서 시작 키 입력 끝난 후 캐릭터의 좌표 [x, y]를 return
    // [0, 0]은 board 정중앙, 가로 크기가 9 -> 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int x = (board[0] / 2);
        int y = (board[1] / 2);
        for (String s : keyinput) {
            switch (s) {
                case "left":
                    if (answer[0] <= -x) {
                        continue;
                    }
                    answer[0] -= 1;
                    continue;
                case "right":
                    if (answer[0] >= x) {
                        continue;
                    }
                    answer[0] += 1;
                    continue;
                case "up":
                    if (answer[1] >= y) {
                        continue;
                    }
                    answer[1] += 1;
                    continue;
                default:
                    if (answer[1] <= -y) {
                        continue;
                    }
                    answer[1] -= 1;
                    break;
            }
        }
        return answer;
    }
}
