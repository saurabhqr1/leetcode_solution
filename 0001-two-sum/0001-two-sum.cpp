class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp;  // value -> index

        for (int i = 0; i < nums.size(); i++) {
            int current = nums[i];
            int needed = target - current;

            // check if required number already exists
            if (mp.find(needed) != mp.end()) {
                return { mp[needed], i };
            }

            // store current number with its index
            mp[current] = i;
        }

        return {}; // never reached (problem guarantees one solution)
    }
};