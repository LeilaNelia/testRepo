public class practice {
    public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.breed = "Maltese ";
        maltese.size = "Small";
        maltese.age = 2;
        maltese.color = "white";

        System.out.println(maltese.getInfo());


        System.out.println(maltese.sleep());
        maltese.eat();

        Dog neapolitan_mastiff = new Dog();
        neapolitan_mastiff.breed = "Neapolitan_Mastiff";
        neapolitan_mastiff.size = "Large";
        neapolitan_mastiff.age = 5;
        neapolitan_mastiff.color = "Black";

        System.out.println(neapolitan_mastiff.getInfo());



        Dog chow_chow = new Dog();
        chow_chow.breed = "Chow_Chow";
        chow_chow.size = "Medium";
        chow_chow.age = 3;
        chow_chow.color = "Brown";


        System.out.println(chow_chow.getInfo());
        System.out.println("chow_chow is playing");
    }
}