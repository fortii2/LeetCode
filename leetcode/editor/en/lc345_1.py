# 拍大腿用stack结果看答案怎么兄弟们都是双指针，再写一版

class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = []
        sample = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"}
        for i in range(len(s)):
            if s[i] in sample:
                vowels.append(s[i])

        result = []
        for i in range(len(s)):
            if s[i] not in sample:
                result.append(s[i])
            else:
                result.append(vowels.pop())

        return "".join(result)
