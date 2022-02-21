package Map_Interface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeAndEquals {
    public static void main(String[] args) {

       Pen P1 = new Pen(10,"blue");
        Pen P2 = new Pen(10,"blue");

        System.out.println(P1);
        System.out.println(P2);

//        System.out.println(P1==P2);
//        System.out.println(P1.equals(P2));

        Set<Pen> Pens = new HashSet<>();
        Pens.add(P1);
        Pens.add(P2);

        System.out.println(Pens);
    }

}
class Pen{
    int price;
    String color;
    public  Pen(int price, String color){
        this.price = price;
        this.color = color;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Pen that = (Pen) obj;
//        boolean isEqual = this.price == that.price &&
//                this.color.equals(that.color);
//        return isEqual;
//    }
//
//    @Override
//    public int hashCode() {
//
//        return price + color.hashCode();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price &&
                Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }
}
