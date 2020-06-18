# Exceptional Car exercise

Learning to create and throw Exceptions.

* Run the `main` method in the `DriveTheCar` class.
* Look at the output on the terminal
* Familiarize yourself with the `Car` and `DriveTheCar` class.

## Now try this

Try this:

* Create a `CarNotStartedException` Exception that is thrown by the `Car` class when the `Car` is driven without being started.
    * Change your `drive` method to throw a `CarNotStartedException`.
    
* Create a `CarOutOfFuelException` Exception that is thrown by the `Car` class when it runs out of fuel.
    * Change your `drive` method to throw a `CarOutOfFuelException`.
    
* Create a `CarException` Exception and make it the super class of both `CarNotStartedException` and `CarOutOfFuelException`.
    * Change your `drive` method to throw a `CarException`.
    * How does that effect your code?

**Note:** you will need to handle the exceptions in the main method of the `DriveTheCarClass`.

Make sure that the same messages are still printed to the console as before.


