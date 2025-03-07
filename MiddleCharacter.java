class MiddleCharacter {
    // Method to get the middle character(s) of a string
    public static String getMiddleCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }

        int length = str.length();
        int middle = length / 2;

        // If the length is odd, return one character, else return two characters
        return (length % 2 == 0) ? str.substring(middle - 1, middle + 1) : str.substring(middle, middle + 1);
    }

    public static void main(String[] args) {
        String input = "Jenkins"; // Change this to test different inputs
        System.out.println("Middle character(s) of \"" + input + "\": " + getMiddleCharacter(input));
    }
}

