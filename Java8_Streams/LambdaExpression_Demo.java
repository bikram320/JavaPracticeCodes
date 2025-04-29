package Java8_Streams;

// creating interface
@FunctionalInterface
interface Sorting{
    public int sortData(int x , int y , int z );
}

public class LambdaExpression_Demo {
    public static void main(String[] args) {
        /*
        lambda expression in java were introduced in java 8, and it is used to make
        simple and short program which is used to provide implementation of functional interface (interface
        which have only one method)
         */

        Sorting sortdata = (x,y,z)->{
            if(x>y){
                if(x>z){
                    return x;
                }else{
                    return z;
                }
            }else{
                return y;
            }
        };
        System.out.println("Greatest Value : "+sortdata.sortData(44,67,12));

    }
}
