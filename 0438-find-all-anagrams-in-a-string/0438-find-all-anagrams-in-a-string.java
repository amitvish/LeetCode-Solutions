class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        int sCount[] = new int[26];
        int pCount[] = new int[26];

        //populate the array;
        for (int i = 0; i < p.length(); i++) {
            char pChar = p.charAt(i);
            char sChar = s.charAt(i);
            pCount[pChar - 'a']++;
            sCount[sChar - 'a']++;
        }

        //check the inital
        if (areCountEqual(sCount, pCount)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            //add new char;
            char ch = s.charAt(i);
            sCount[ch - 'a']++;
            //remove the inital char
            char initial = s.charAt(i - p.length());
            sCount[initial - 'a']--;
            if (areCountEqual(sCount, pCount)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }

    private boolean areCountEqual(int[] sCount, int[] pCount) {
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != pCount[i]) {
                return false;
            }
        }
        return true;
    }
}
