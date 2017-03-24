/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygmypuff;
    

public class PygmyPuff extends Animal implements Walking{

    
    public PygmyPuff()
    {
        super("Arnold", "Pygmy Puffs resemble little fluffy balls that roll around, squeak and come in various shades of pink and purple.");
    }
    
    public PygmyPuff(String n)
    {
        super(n, "Pygmy Puffs resemble little fluffy balls that roll around, squeak and come in various shades of pink and purple.");
    }

    @Override
    public String eat() {
        String[] food = {"bread crumbs", "Japanese Spider Crabs", "muffins", "cookies"};
        return super.getName() + " eats some " + food[(int) (Math.random() * food.length)];
    }

    @Override
    public String play() {
        return super.getName() + " rolls around on your hand";
    }

    @Override
    public String makeNoise() {
        return "squeak squeak squeak";
    }

    @Override
    public String walk() {
        return play();
    }
    
}
