package homework.homework13;

public class DemoDimaCollection {

    private static String[] name = {"Amelia", "Olivia", "Emily", "Ava", "Isla", "Jessica", "Poppy", "Isabella", "Sophie", "Mia", "Ruby", "Lily", "Grace", "Evie", "Sophia", "Ella", "Scarlett", "Chloe", "Isabelle", "Freya", "Charlotte", "Sienna", "Daisy", "Phoebe", "Millie", "Eva", "Alice", "Lucy", "Florence", "Sofia", "Layla", "Lola", "Holly", "Imogen", "Molly", "Matilda", "Lilly", "Rosie", "Elizabeth", "Erin", "Maisie", "Lexi", "Ellie", "Hannah", "Evelyn", "Abigail", "Elsie", "Summer", "Megan", "Jasmine", "Maya", "Amelie", "Lacey", "Willow", "Emma"};
    private static int[] age = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private static String[] color = {"red", "orange", "yellow", "green", "blue", "purple", "pink", "white", "grey", "brown", "black"};

    private static int loops = 10;


    public static void main(String[] args) {

        DimaCollectionArrayList dArrayList = new DimaCollectionArrayList();

        for (int i = 0; i < loops; i++){
            dArrayList.add(makeDog(name[(int) (Math.random()*name.length)], age[(int)(Math.random()*age.length)], color[(int)(Math.random()*color.length)]));
        }


        for(int i = 0; i < loops; i++){
            System.out.println(dArrayList.get(i).toString());
        }


    }




    private static DogClass makeDog(String name, int age, String color){
        return new DogClass(name, age, color);
    }





}
