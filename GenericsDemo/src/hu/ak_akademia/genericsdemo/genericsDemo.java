package hu.ak_akademia.genericsdemo;

public class genericsDemo {

	public static void main(String[] args) {
		Box<Integer> myNumberBox = new Box<>();
		System.out.println(myNumberBox);
		myNumberBox.putIn(76);
	//	myNumberBox.putIn("alma"); <---- fordítási idejű hibát ad
		System.out.println(myNumberBox);
		Integer theThingFromTheBox = myNumberBox.takeOut();
		System.out.println(myNumberBox);	
		
		 Box<String> myFavouriteFourtuneCookieQuoteBox = new Box<>();
		 myFavouriteFourtuneCookieQuoteBox.putIn("Lucky one.");
		 System.out.println(myFavouriteFourtuneCookieQuoteBox);
		 
	}

}
