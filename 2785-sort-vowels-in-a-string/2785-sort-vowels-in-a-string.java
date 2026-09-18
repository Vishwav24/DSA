class Solution {
    public Boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
            if(isVowel(arr[i])) sb.append(arr[i]);
        char[] sort = sb.toString().toCharArray();
        Arrays.sort(sort);
        int k = 0;
        for(int i = 0; i < arr.length; i++)
            if(isVowel(arr[i])) arr[i] = sort[k++];
        return new String(arr);
    }
}