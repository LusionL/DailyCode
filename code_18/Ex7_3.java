package code_18;
import java.io.*;
public class Ex7_3 {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for(int i = 1; i<=100; i++){
            sum += i;
        }
        System.out.println("计算结果1："+sum);

        FileWriter fout = new FileWriter("f1.txt");
        fout.write("计算结果2："+sum);
        fout.close();
    }
}
