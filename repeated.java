public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.println("Enter any sentence or word combination: ");
    String myString = k.nextLine();
    String result = "";
    int count = 0;

    String[] words = myString.split("\\s+");
    for(int i = 0; i < words.length; i++) {
        for(int j = 0; j < words[i].length(); j++) {
            for(int l = 1; l < words[i].length(); l++) {
                char temp = words[i].charAt(l);
                if(temp == words[i].charAt(l-1)) {
                    count++;
                }

            }

        }
    }
}
