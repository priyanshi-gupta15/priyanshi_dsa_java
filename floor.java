public class floor {
    public static void main(String[] args) {
        int[] letters ={2,3,4,6,7,8,9,12,14,15,23,24,45,56};
        int target=13;
        nextGreatestLetter(letters,target);
        
    }
     static int nextGreatestLetter(int[] letters,int target) {
        if (target >= letters[letters.length - 1]) {
            return letters[letters.length-1];
        }
        int start = 0, end = letters.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid;
            } else {
                start = mid + 1;

            }

           }
            return letters[start-1];
        
    }
}
    

