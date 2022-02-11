public class ArrayBig {
    public static void main(String[] args){
        int[] array = {232,42,53,13,542,634,23,5,354,25};
        int bigres = ArrayBig.arrayBig(array);
        System.out.println(bigres);
    }
    public static int arrayBig(int[] x){
        int res=0;
        for (int i=0;i<x.length;i++){
            if(x[i]>res){
                res=x[i];
            }
        }
        return res;
    }

}
