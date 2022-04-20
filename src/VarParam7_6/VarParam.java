package VarParam7_6;

public class VarParam {
    public static void main(String[] args){
        changeParam var =  new changeParam();
        int [] test = {4,5,6};
        System.out.println(var.test(test));

    }
}

class changeParam{
    public int test(int...arr){
        int sum = 0 ;
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        return sum;
    }
}
