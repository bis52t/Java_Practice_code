import java.util.Arrays;
public class Array{
public static void main( String[] argus){
    int physics = 88;
    int chemistry = 86;
    int maths = 90;

    int[] marks = new int[3];
    marks[0] = 88;
    marks[1] = 86;
    marks[2] = 96;
    System.out.println(marks[0]);
    Arrays.sort(marks);
    System.out.println(marks[0]);

    }

}