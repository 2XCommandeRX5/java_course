package L11.threads;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Matrix {

    static class Task implements Runnable {

        private int[][] a;
        private int[][] b;
        private int[][] c;
        private int row;
        private int col;

        public Task(int[][] a, int[][] b, int[][] c, int row, int col) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.row = row;
            this.col = col;
        }

        @Override
        public void run() {
            for (int i = 0; i < a.length; i++) {
                c[row][col] += a[row][i] * b[i][col];
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        int n = 500;
        int [][] a = new int[n][n];
        int [][] b = new int[n][n];
        int [][] c = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j]=rnd.nextInt();
                b[i][j]=rnd.nextInt();
            }
        }
        long start = System.currentTimeMillis();
        int poolSize=4;
        ThreadPoolExecutor pool = new ThreadPoolExecutor(poolSize,poolSize,1, TimeUnit.DAYS, new LinkedBlockingQueue<>());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pool.execute(new Task(a,b,c,i,j));
            }
        }
        pool.shutdown();
        pool.awaitTermination(1,TimeUnit.MINUTES);
        System.out.println(System.currentTimeMillis() - start);


    }
}
