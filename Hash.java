public class Hash {
    public static void main(String[] args) {
        String text = "keshav";

        int[] arr = new int[26];
        for (int i : text.toCharArray()) {
            arr[i - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if (arr[i] > 0) {
                System.out.println((char)(i + 'a') + ": " + arr[i]);                
            }
        }

        // for (int i : arr) {
        //     System.out.println((char)(i + 'a') + ": " + arr[i]);
        // }
    }
}
