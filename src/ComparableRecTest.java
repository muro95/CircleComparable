import java.util.Arrays;

public class ComparableRecTest {
    public static void main(String[] args){
        ComparableRec[] comparableRecs = new ComparableRec[3];
        comparableRecs[0] = new ComparableRec(5, 10);
        comparableRecs[1] = new ComparableRec();
        comparableRecs[2] = new ComparableRec(5, 10, "blue" , true);

        System.out.println("Pre-sorted: ");
        for (ComparableRec comparableRec : comparableRecs){
            System.out.println(comparableRec);
        }
        Arrays.sort(comparableRecs);

        System.out.println("After-sorted: ");
        for (ComparableRec comparableRec : comparableRecs){
            System.out.println(comparableRec);
        }

    }
}
