class Solution {
    public boolean divisorGame(int n) {
        // n이 1이 되는 순간 게임 끝
        // n이 짝수인 경우 x를 1로 선택하여 홀수를 넘기기 때문에 Alice 승리
        return n%2==0;
    }
}