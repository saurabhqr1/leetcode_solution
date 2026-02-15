class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        
  const int size = s.size();
        if (size < 2) {
            return s.size();
        }
        
        size_t max = 1;
        int index = 0;
        std::unordered_map<char, int> unique_characters;
        while (index + max < size) {
            // Iterate until the first duplicate.
            while (index < size) {
                auto inserted_index = unique_characters.insert({s[index], index});
                if (!inserted_index.second) {
                    // Jump back to the last non unique 
                    index = inserted_index.first->second + 1;
                    break;
                }
                ++index;
            }

            // Update the maximum.
            max = std::max(max, unique_characters.size());

            // Reset for next substring.
            unique_characters.clear();
        }

        return max;
    }
};