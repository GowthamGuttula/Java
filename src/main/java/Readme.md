The package-info.java file currently serves two purposes:

A place for package-level documentation
Home for package-level annotations


Try with resources
	Resource should implmenet autocloseble to get closed
	
	
If the superclass method does not declare an exception
	If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
If the superclass method declares an exception
	If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.