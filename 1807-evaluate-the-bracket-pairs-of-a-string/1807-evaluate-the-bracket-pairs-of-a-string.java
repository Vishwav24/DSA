class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap <String, String> map = new HashMap<>();
        for(int i = 0; i < knowledge.size(); i++){
            ArrayList <String> temp = new ArrayList<>(knowledge.get(i));
            map.put(temp.get(0), temp.get(1));
        }

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                i++;
                StringBuilder sb = new StringBuilder();
                while(s.charAt(i) != ')'){
                    sb.append(s.charAt(i));
                    i++;
                }
                String ss = sb.toString();
                if(map.containsKey(ss)) ans.append(map.get(ss));
                else ans.append('?');
            }
            if(s.charAt(i) != ')')
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}