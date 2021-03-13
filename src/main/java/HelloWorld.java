
class HelloWorld {
	static void Hello() {
		hi.Greeter greeter = new hi.Greeter();
		String greeting = greeter.greet("World");
		System.out.println(greeting);
	}

	static void Goodbye() {
		bye.Greeter greeter = new bye.Greeter();
		String greeting = greeter.greet("World");
		System.out.println(greeting);
	}

	public static void main(String[] args) {
		Hello();
		Goodbye();
	}
}
