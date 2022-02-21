package Strings;

public class StringIntro {
    public static void main(String[] args) {
//        String name = "Ashu";
//        name = "Kumar";
//        String name1 = "Ashu";
//        String name2 = new String("Ashu");
//        System.out.println(name== name2);
//        System.out.println(name==name1);

//        String name = "Ashu Kumar";
//        String name2= new String("  Ashu Kumar");
//        System.out.println(name.charAt(0));
//        System.out.println(name.length());
//        System.out.println(name.substring(6));
//        System.out.println(name.substring(0,10));
//        System.out.println(name.contains("Ashu"));
//        System.out.println(name.equals(name2));
//        System.out.println(name==name2);
//        System.out.println(name.isEmpty());
//        System.out.println(name.concat(name2));

        String cars = "Audi, BMW, Swift , " +
                      "mercedes, ferrari, Lamborgini";
        String allcars[] = cars.split("a");

//        for (String myCar: allcars) {
//            System.out.println(myCar);
//        }

        System.out.println(cars.indexOf('M'));
        System.out.println(cars.toLowerCase());

        String name= "    Ashu      ";
        System.out.println(name.trim());
    }
}
