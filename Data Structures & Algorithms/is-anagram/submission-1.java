class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> countS = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            if(countS.containsKey(s.charAt(i))){
                countS.put(s.charAt(i), countS.get(s.charAt(i))+1);
            }else{
                countS.put(s.charAt(i), 1);
            }
        }

        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i=0;i<t.length();i++){
             if(countT.containsKey(t.charAt(i))){
                countT.put(t.charAt(i), countT.get(t.charAt(i))+1);
            }else{
                countT.put(t.charAt(i), 1);
            }
        }

        if(countS.size() != countT.size())
            return false;

        for (Character ch : countS.keySet()) {
           if(!countS.get(ch).equals(countT.get(ch))){
                return false;
           } 
        } 
        return true;

    }
}
