public class StringCount {
    public static void main(String[] args) {
        String name = "Amirrrrrrrr";
        int count = 0;
        char target = 'r';

        for(int i = 0; i <= name.length() - 1; i++){
            if(name.charAt(i) == target){
                count++;
            }
        }

        System.out.println("The character '" + target + "' appears " + count + " times in the string.");

    }
}
