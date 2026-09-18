class Solution {
    public String reverseVowels(String s) {
        ArrayList <Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int left = 0, right = s.length() - 1;
        char[] arr = s.toCharArray();
        while(left <= right){
            if(vowels.contains(arr[left])){
                while(!vowels.contains(arr[right])) right--;
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
            left++;
        }
        return new String(arr);
    }
}