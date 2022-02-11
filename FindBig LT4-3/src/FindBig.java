public class FindBig {
    public static void main(String[] args){
        int res = FindBig.bignum(10,4);
        System.out.println(res);
    }

    public static int bignum(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
}
