class Solution {
    public String decodeMessage(String key, String message) {
        // key 26자를 알파벳 순서로 치환
        StringBuilder sb = new StringBuilder();
        
        key = key.replace(" ", "");
        
        List<Character> alphabet = new ArrayList<>(26);
        
        // key로 알파벳 순서 치환
        for(int i=0; i<key.length(); i++) {
            char value = key.charAt(i);
            if(!alphabet.contains(value)) alphabet.add(value);
        }
        
        // message 해독
        for(int i=0; i<message.length(); i++) {
            char value = message.charAt(i);
            if(message.charAt(i) == ' ') sb.append(value);
            else sb.append((char) (alphabet.indexOf(value) + 'a'));
        }
        return sb.toString();
    }
}