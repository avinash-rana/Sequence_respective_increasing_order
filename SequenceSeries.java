import java.util.Scanner;

public class SequenceSeries{
    public static void main(String[] args) {
        int x,count=0,num=1;
        Scanner sc = new  Scanner(System.in);
        x = sc.nextInt();
        System.out.print("1 ");
        while(x>1){
            count += 1;
            for(int j = 1;j<=count;j++){
                num += 1;
            }
            num = num +1;
            System.out.print(num +" ");
            x--;
        }
    }
}
// input : 5
//output will be
// 1 _ 3 _ _ 6 _ _ _ 10 _ _ _ _ _ 15
// " _ " it indicate the skiped sequence at every consicutive interval