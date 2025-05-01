class Solution {
public:
    int maxRepeating(string sequence, string word) {
      int cnt = 0;
        string repeatedWord = word;
            while (sequence.find(repeatedWord) != string::npos) {
                cnt++;
                repeatedWord = repeatedWord + word;
            }
        return cnt;  
    }
};