/*
    Name : Tran Trung Duc
    Group : P3202
    ITMO
    Variant : 18
 */
import java.io.File;
import java.io.IOException;
import java.lang.*;



public class Lab3 {
    public double arr[][] = new double[2][10] ;
    private int n;


    public void input() throws IOException{
        String fileName = "D:\\Russia\\thirdsemester\\math\\lab3\\input.txt";
        readFile inp = new readFile(fileName);
        String tmp;
        int i =0;
        while ((tmp = inp.readLine())!= null ){
            String[] _tmp = tmp.split("\\s+");
            this.n = _tmp.length;
            for(int j=0;j<_tmp.length;j++) arr[i][j] = Double.parseDouble(_tmp[j]);
            i++;
        }
    }

    public void process(){
        double x1 =0.610;
        linear tmp = new linear(arr,x1,n);
        System.out.println(tmp.solve());

        Quadratic _tmp = new Quadratic(arr,x1,n);
        System.out.println(_tmp.solve());

        Lagrange tmp_ = new Lagrange(arr,x1,n);
        System.out.println(tmp_.solve());
    }

    public static void main(String[] args) throws IOException{
        Lab3 duc = new Lab3();
        duc.input();
        duc.process();

    }
}
