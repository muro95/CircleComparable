public class ComparableSq extends Square implements Comparable<ComparableSq>{
    public ComparableSq(){

    }
    public ComparableSq(double side){
        super(side);
    }

    public ComparableSq(double side, String color, boolean filled){
        super(side, color, filled);
    }

    @Override
    public int compareTo(ComparableSq o){
        if (getPerimeter() > o.getPerimeter()){
            return 1;
        }else if(getPerimeter() < o.getPerimeter()){
            return -1;
        }else return 0;
    }
}
