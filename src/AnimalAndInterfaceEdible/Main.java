package AnimalAndInterfaceEdible;

import AnimalAndInterfaceEdible.Animal.Animal;
import AnimalAndInterfaceEdible.Animal.Chicken;
import AnimalAndInterfaceEdible.Animal.Tiger;
import AnimalAndInterfaceEdible.Edible.Apple;
import AnimalAndInterfaceEdible.Edible.Edible;
import AnimalAndInterfaceEdible.Edible.Fruit;
import AnimalAndInterfaceEdible.Edible.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal element : animals) {
            System.out.println(element.makeSound());
            if (element instanceof Chicken) {
                Edible edibler = (Chicken) element;
                Edible edible1 = new Chicken();
                System.out.println(edible1.howToEat());
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
            if (fruit instanceof Apple){
                Edible edible = fruit;
                System.out.println(edible.howToEat());
            }
        }
    }
}