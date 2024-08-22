class Solution {
    public int maxRepeating(String sequence, String word) {
        String arr[] = sequence.split("");
        int count = 0;

        if (arr.length <= 1) {

            if (word.equals(sequence)) {
                count++;
            }

        } 
        else {
            for (int i = 0; i < arr.length; i++) {
                String sum = "";

                if (i + (word.length() - 1) >= arr.length) {
                    break;

                }

                for (int j = i; j < (word.length() - 1 + i); j++) {

                    sum = arr[j] + sum;
                }
                if (word.equals(sum)) {
                    count++;
                }

            }
        }
        return count;
    }

}

