package lesson.lesson9_19122018.p3;

//anonymous class override

public class DemoCountry {

    public static void main(String[] args) {

        Country slot = new Country("Germany", "France", "Ukraine", "Russia");

        slot.printList();
        System.out.println();

        Country slot1 = new Country("Germany", "France", "Ukraine", "Russia") {
            @Override
            public void printList() {
                for (int i = 0; i < getArray().length; i++) {
                    if(!getArray()[i].equals("Russia")) System.out.println(getArray()[i]);
                }
            }
        };

        slot1.printList();
    }

}
