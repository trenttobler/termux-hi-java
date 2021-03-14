import java.util.Scanner;

class HelloWorld {
	static void Hello(String name) {
		hi.Greeter greeter = new hi.Greeter();
		String greeting = greeter.greet(name);
		System.out.println(greeting);
	}

	static void Goodbye(String name) {
		bye.Greeter greeter = new bye.Greeter();
		String greeting = greeter.greet(name);
		System.out.println(greeting);
	}

	public static void main(String[] args) {
		System.out.print("What is your name? ");
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextLine())
		{
			String name = scanner.nextLine();
			Hello(name);
			Goodbye(name);
		}
		else
		{
			System.out.println("I don't know your name then.");
		}
		scanner.close();
	}
}
