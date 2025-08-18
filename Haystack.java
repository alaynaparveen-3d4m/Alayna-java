public class Haystack {
    public static void main(String[] args) {
        String haystack = "This is the haystack string.";
        String needle = "haystack";

        int index = haystack.indexOf(needle);

        if (index != -1) {
            System.out.println("Needle found at position: " + index);
        } else {
            System.out.println("Needle not found in haystack.");
        }
    }
}
