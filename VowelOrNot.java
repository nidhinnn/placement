 class VowelOrNot {

	public static void main(String[] args) {
		Scanner scanner = new(System.in);

		System.out.print("Enter an alphabet: live session ");

		System.out.print("Enter an alphabet: change ");

        char ch = scanner.next().charAt(0);
       
        switch (Character.toLowerCase(ch)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(ch + " is a vowel.");
            break;
        default:
            System.out.println(ch + " is not a vowel.");
            break;
    }

    scanner.close();
}


	}
