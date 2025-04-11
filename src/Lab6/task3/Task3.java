package Lab6.task3;

public class Task3 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Альберт";
        cat.sound = "Маяу)!";

        Animal papyga = new Animal();
        papyga.name = "Даніель";
        papyga.sound = "чірик...";

        Animal chiken = new Animal();
        chiken.name = "Ряба";
        chiken.sound = "ко-ко-ко-ко";

        Animal[] animals = {cat , papyga , chiken};

        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}