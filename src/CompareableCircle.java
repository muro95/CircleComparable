
public class CompareableCircle extends Circle implements Comparable <CompareableCircle>{
    public CompareableCircle(){

    }

    public CompareableCircle(double radius){
        super(radius);
    }
    public CompareableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(CompareableCircle o){
        if (getPerimeter() > o.getPerimeter()){
            return 1;
        }else if(getPerimeter() < o.getPerimeter()){
            return -1;
        }else return 1;
    }
}
