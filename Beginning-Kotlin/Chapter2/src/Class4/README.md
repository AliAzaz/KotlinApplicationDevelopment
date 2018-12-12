###Practice Time
#Abstract and Interface
Let's go back to your spices. Make Spice an abstract class, and then create some subclasses that are actual spices.

It's easiest (organizationally) if you make a new package, Spices, with a file, Spice, that has a main() function.
Copy/paste your Spice class code into that new file.
Make Spice abstract.
Create a subclass, Curry. Curry can have varying levels of spiciness, so we don't want to use the default value, but rather pass in the spiciness value.
Spices are processed in different ways before they can be used. Add an abstract method prepareSpice to Spice, and implement it in Curry.
Curry is ground into a powder, so let's call a method grind(). However, grinding is something that's not unique to curry, or even to spices, and it's always done in a grinder. So we can create an Interface, Grinder, that implements the grind() method. Do that now.
Then add the Grinder interface to the Curry class.
Delegation
Using the provided code from the lesson for guidance, add a yellow color to Curry.

```sh
fun main (args: Array<String>) {
   delegate()
}

fun delegate() {
   val pleco = Plecostomus()
   println("Fish has has color ${pleco.color}")
   pleco.eat()
}

interface FishAction {
   fun eat()
}

interface FishColor {
   val color: String
}

object GoldColor : FishColor {
   override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
   override fun eat() {
       println(food)
   }
}

class Plecostomus (fishColor: FishColor = GoldColor):
       FishAction by PrintingFishAction("eat a lot of algae"),
       FishColor by fishColor

```

Create an interface, SpiceColor, that has a color property. You can use a String for the color.
Create a singleton subclass, YellowSpiceColor, using the object keyword, because all instances of Curry and other spices can use the same YellowSpiceColor instance.
Add a color property to Curry of type SpiceColor, and set the default value to YellowSpiceColor.
Add SpiceColor as an interface, and let it be by color.

Create an instance of Curry, and print its color. However, color is actually a property common to all spices, so you can move it to the parent class.
Change your code so that the SpiceColor interface is added to the Spice class and inherited by Curry.