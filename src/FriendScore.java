// 여러분은 소셜 네트워크 서비스에서 가장 인기있는 사람을 찾으려고 합니다. 이를 위해 "친구의 수"를 셉니다.
// 일단 그들이 서로 친구라면 친구입니다. 또한 C사림이 A사람과 B사람의 공통 친구라면 A사람과 B사람도 친구입니다.
// 가장 인기 있는 사람은 친구의 수가 가장 많은 사람입니다.(가장 많은 "친구의 수"를 가진 사람은 여러 명 있을수도 있습니다.)
// 문자열 자료형의 배열 String[] friends가 주어집니다. 만약 i번째 사람과 j번째 사람이 친구라면 i번째 요소릐 j번째 글자가 'Y'입니다.
// 반면 친구가 아니라면 'N'입니다. 소셜 네트워크 서비스에서 가장 인기 있는 사람의 친구 수를 리턴해주세요.

// friends
// 1~50 length를 가지는 배열
// 모든 i, j에 대해 friends[i][j] == friends[j][i]
// 모든 i friends[i][i]는 'N' -> 자기 자신과는 친구가 아니다.
public class FriendScore {
    // friends[] = {"NNN", "NNN", NNN"} , 0
    // friends[] = {"NYY", "YNY", "YYN"} , 2
    // friends[] = {"NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN"}, 4
    // friends[] = {"NNNNYNNNNN", "NNNNYNYYNN", "NNNYYYNNNN", "NNYNNNNNNN", "YYYNNNNNNY", "NNYNNNNNYN", "NYNNNNNYNN", "NYNNNNYNNN", "NNNNNYNNNN", "NNNNYNNNNN"} , 8
    public static void main(String[] args) {

    }

    public static int highestScore(String[] friends) {
        int answer = 0;



        return answer;
    }
}
