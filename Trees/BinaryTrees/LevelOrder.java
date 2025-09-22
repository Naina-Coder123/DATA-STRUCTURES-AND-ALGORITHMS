import java.util.*;

// TreeNode class definition
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Main class with level order traversal
public class LevelOrder {

    // Level order traversal function
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                levelList.add(node.val);

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }

            result.add(levelList);
        }

        return result;
    }

    // Main method to test the traversal
    public static void main(String[] args) {
        LevelOrder lo = new LevelOrder();

        // Creating a sample tree:
        // 1
        // / \
        // 2 3
        // / \ \
        // 4 5 6
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(6)));

        List<List<Integer>> levels = lo.levelOrder(root);

        // Print the result
        for (List<Integer> level : levels) {
            System.out.println(level);
        }
    }
}
