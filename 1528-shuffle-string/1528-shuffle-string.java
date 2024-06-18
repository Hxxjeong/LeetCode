class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        
        char[] c = s.toCharArray();
        char[] suffle = new char[s.length()];
        
        for(int i=0; i<indices.length; i++) {
            suffle[indices[i]] = c[i];
        }
        
        for(char ch: suffle) sb.append(ch);
        return sb.toString();
    }
}