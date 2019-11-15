import java.util.Arrays;

public class dummyData {
    public static void main(String[] args) {
        double[][] dummy = {
                {0.747833, 0.846373},
                {0.437426, 0.084428},
                {0.658364, 0.645384},
                {0.454394, 0.984634},
                {0.290679, 0.239476}};

        System.out.println(Arrays.deepToString(dummy).replace("], ", "]\n"));
        System.out.println("\n");

        double sum;
        double[][] distance = new double[5][5];


        for (int i = 0; i < dummy.length; i++) {
            for (int j = 0; j < dummy.length; j++) {
                sum = Math.pow((dummy[i][0] - dummy[j][0]), 2) + Math.pow((dummy[i][1] - dummy[j][1]), 2);
                distance[i][j] = Math.sqrt(sum);
            }
        }
        System.out.println(Arrays.deepToString(distance).replace("], ", "]\n"));

        findMin(distance);
    }

    public static void findMin(double[][] distance) {
        double minNum = distance[0][0];
        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance[i].length; j++) {
                if (minNum > distance[i][j]) {
                    minNum = distance[i][j];
                }
            }
        }
        System.out.println(" Smallest number: " + minNum);

    }
}

