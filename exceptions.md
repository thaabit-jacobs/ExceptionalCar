# Exceptions

## What are Exceptions?

Check and handle errors in Java.

Exceptions are used when things are an exception to normal...

When an error occurs

The benefit of using Exceptions

*  Are an elegant way of handling errors in Java.
*  Always for an easy way to detect errors without Checking return values.
*  It separates exception handling from Exception creation code.
*  Use the same code to deal with a range of Exceptions.

## Handling Exceptions

* try/catch
* try/catch/catch
* try/catch/finally
* try/catch/catch/finally
* try/finally

*  try - can't do it on it's own - compilation error.

# How are Exceptions created?

* Thrown by Java built-in classes...
* Created/thrown manually from your code...

## Propagating Exceptions

* The call stack. Methods calling each other.
* Divide by 0 example.
* ArrayIndexOutOfBounds exception.

## Exceptions class hierarchy

Look at figure in OCA book on page 307

* `Object -> Throwable -> Error`
* `Object -> Throwable -> Exception`
* `Object -> Throwable -> Exception -> RuntimeException` 

# Check vs UnChecked Exception

* Checked Exceptions needs to be handled.
* Unchecked Exceptions don't have to be handled. 

# How to trigger/throw an Exception?

* Two steps:
	* Create an instance of an Exception,
	* use the `throw` keyword to trigger the Exception.

# How to handle Exceptions?

	* throws
	* catch

	* Order of catching  is important

# Exceptions and overriding (inheritance)

	* Needs to be the type / sub-type of the Exception thrown,
	* Or no exception thrown on the overridden method.













