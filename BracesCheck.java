import java.util.*;

public class BracesCheck {
	static Stack<Character> inputStack = new Stack<Character>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			boolean valid = false;
			String input = sc.next();
			if (input.length() % 2 != 0) {
				System.out.println(false);
				valid = false;
				continue;
			}
			inputStack.clear();
			IFVALID: for (int i = 0; i < input.length(); i++) {
				char current = input.charAt(i);
				switch (current) {

				case '{':
				case '(':
				case '[':
					inputStack.push(current);
					valid = false;
					break;
				case '}':
					if (!inputStack.isEmpty() && inputStack.peek() == '{') {
						valid = true;
						inputStack.pop();
					} else {
						valid = false;
						break IFVALID;
					}
					break;

				case ')':
					if (!inputStack.isEmpty() && inputStack.peek() == '(') {
						valid = true;
						inputStack.pop();
					} else {
						valid = false;
						break IFVALID;
					}
					break;

				case ']':
					if (!inputStack.isEmpty() && inputStack.peek() == '[') {
						valid = true;
						inputStack.pop();
					} else {
						valid = false;
						break IFVALID;
					}
					break;

				default:
					valid = false;

					break;
				}

			}

			if (inputStack.isEmpty()) {
				System.out.println(valid);
			} else {
				valid = false;
				System.out.println(false);
			}

		}
	}
}
