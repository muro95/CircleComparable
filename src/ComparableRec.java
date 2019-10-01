public class ComparableRec extends Rectangle implements Comparable <ComparableRec> {
    public ComparableRec(){

    }

    public ComparableRec(double width, double length){
        super(width, length);
    }

    public ComparableRec(double width, double length, String color, boolean filled){
        super(width, length, color, filled);

    }
    @Override
    public int compareTo(ComparableRec o){
        if (getPerimeter() > o.getPerimeter()){
            return 1;
        }else if(getPerimeter() < o.getPerimeter()){
            return -1;
        }else return 1;
    }
}
