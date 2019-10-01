import java.util.Arrays;

public class ComparableSqTest {
    public static void main(String[] args){
        ComparableSq[] comparableSqs = new ComparableSq[3];
        comparableSqs[0] = new ComparableSq(5);
        comparableSqs[1] = new ComparableSq();
        comparableSqs[2] = new ComparableSq(10, "Yellow", true);

        System.out.println("Pre-sorted: ");
        for (ComparableSq comparableSq : comparableSqs){
            System.out.println(comparableSq);
        }
        Arrays.sort(comparableSqs);

        System.out.println("After-sorted: ");
        for (ComparableSq comparableSq : comparableSqs){
            System.out.println(comparableSq);
        }
    }
}
