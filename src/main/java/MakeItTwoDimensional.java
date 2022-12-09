public class MakeItTwoDimensional {
    public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];
            int num = 0;
            for (int i = 0; i < num_list.length; i++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] = num_list[num];
                    num++;
                }
            }
        return answer;
    }
}


//import java.util.Arrays;
//
//    public int[][] solution(int[] num_list, int n) {
//        int[][] answer = {};
//        for (int i = 0; i < num_list.length; i += n) {
//            System.out.println(Arrays.toString(Arrays.copyOfRange(num_list, i, Math.min(num_list.length, i + n))));
//        }
//        return answer;
//    }


