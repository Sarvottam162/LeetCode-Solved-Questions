class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        helper(n, "", li, 0, 0);
        return li;
    }

    public void helper(int n, String ans, List<String> li, int left, int right) {

        // Base case
        if (left == n && right == n) {
            li.add(ans);
            return;
        }

        // Add '('
        if (left < n) {
            helper(n, ans + "(", li, left + 1, right);
        }

        // Add ')'
        if (right < left) {
            helper(n, ans + ")", li, left, right + 1);
        }
    }
}