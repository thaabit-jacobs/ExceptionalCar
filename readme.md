# Exceptional Car exercise

Learning to create and throw Exceptions.

Try this:

* Create a `CarNotStartedException` Exception that is thrown by the `Car` class when the `Car` is driven without being started.
* Create a `CarOutOfFuelException` Exception that is thrown by the `Car` class when it runs out of fuel.
* Create a `CarException` Exception and make it the super class of both `CarNotStartedException` and `CarOutOfFuelException`.
    * Change your `drive` method to throw a `CarException`.
    * How does that effect your code?

**Note:** you will need to handle the exceptions in the main method of the `DriveTheCarClass`.

Make sure that the same messages are still printed to the console as before.


