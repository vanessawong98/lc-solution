import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Simplify Path
 * <p>
 *     You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.
 * </p>
 * <p>
 *     The rules of a Unix-style file system are as follows:
 * </p>
 * <p>
 *     A single period '.' represents the current directory.
 * A double period '..' represents the previous/parent directory.
 * Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
 * Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
 * The simplified canonical path should follow these rules:
 *
 * The path must start with a single slash '/'.
 * Directories within the path must be separated by exactly one slash '/'.
 * The path must not end with a slash '/', unless it is the root directory.
 * The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
 * Return the simplified canonical path.
 * </p>
 * <a href="https://leetcode.com/problems/simplify-path/description/">Click here</a>
 */
public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] fileNames = path.split("/");
        for (String filename : fileNames) {
            if ("..".equals(filename) && !stack.isEmpty()) {
                stack.pop();
                continue;
            } else if (filename.isBlank() || "..".equals(filename) || ".".equals(filename)){
                continue;
            }
            stack.push(filename);
        }

        String answer = "";
        answer = answer.concat("/").concat(String.join("/", stack));

        return answer;
    }
}
