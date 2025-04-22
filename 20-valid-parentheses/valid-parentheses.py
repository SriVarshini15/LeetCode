class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        result = True
        stack = []
        if len(s) % 2 != 0:
            result = False
        else:
            for i in range(len(s)):
                if s[i] in '({[':
                    stack.append(s[i])
                else:
                    if not stack:
                        result = False
                        break
                    temp = stack.pop()
                    if not self.comparison(temp, s[i]):
                        result = False
                        break

            if len(stack) > 0:
                result = False
            else:
                result = True if result else False
        return result
    
    def comparison(self, str1, str2):
        if str1 == '(' and str2 == ')':
            return True
        if str1 == '{' and str2 == '}':
            return True
        if str1 == '[' and str2 == ']':
            return True
        return False