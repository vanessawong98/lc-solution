import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

/**
 * Find players with zero or one losses
 * <p>
 *     You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.
 *
 *      Return a list answer of size 2 where:
 *
 *      answer[0] is a list of all players that have not lost any matches.
 *      answer[1] is a list of all players that have lost exactly one match.
 *      The values in the two lists should be returned in increasing order.
 *
 *      Note:
 *
 *      You should only consider the players that have played at least one match.
 *      The testcases will be generated such that no two matches will have the same outcome.
 * </p>
 * <a href="https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/">Click here</a>
 */
public class MinLossPlayer {
    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> winnerMap = new HashMap<>();
        Map<Integer, Integer> loserMap = new HashMap<>();

        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < matches.length; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];

            winnerMap.put(winner, winnerMap.getOrDefault(winner, 0)+1);
            loserMap.put(loser, loserMap.getOrDefault(loser, 0)+1);
        }

        List<Integer> zeroLossWinner = winnerMap.keySet().stream()
                .sorted()
                .filter(
                player -> !loserMap.containsKey(player)
        ).toList();
        List<Integer> oneLossLoser = loserMap.keySet().stream()
                .sorted()
                .filter(
                player -> loserMap.get(player) == 1
        ).toList();

        answer.add(zeroLossWinner);
        answer.add(oneLossLoser);

        return answer;
    }
}
