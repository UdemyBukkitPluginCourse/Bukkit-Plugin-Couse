/*
 * Copyright (c) 2021. This code is the property of Stephen King of the Udemy Bukkit Plugin Course.
 * Unauthorized redistribution of this code outside of an educational context is prohibted.  The following code
 * is provided "as-is" without any expresses warranties or guarentees of any kind.
 *
 * Use and viewing of this code is only granted to paying members of the Udemy Bukkit Plugin Course
 * Link -> https://www.udemy.com/course/develop-minecraft-plugins-java-programming/
 * Discord -> https://discord.gg/hZSzvzY
 */

package src.sections.Section2.JavaBasics2;

public class Main {

	/**
	 * The following code is more or less written as Stephen showed it in the video.
	 * Some parts that were too similar to each other were ommited.
	 */
	public static void main(String[] args) {
		sendMessage("The code is now running!", 25);

		String myString = null;
		System.out.println(myString.substring(3));

		SecondClass second = new SecondClass();
		second.sayHello();
	}

	public static void sendMessage(String message, int number) {
		System.out.println(message + " " + number);
		System.out.println(message + " " + number);
		System.out.println(message + " " + number);
		System.out.println(message + " " + number);
		System.out.println(message + " " + number);
	}
}
