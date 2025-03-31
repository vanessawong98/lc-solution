import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Playground for running solutions.
 */
public class Main {
    public static void main(String[] args) {

        /**
         * LRU Caching
         */
//        LRUCache lRUCache = new LRUCache(2);
//        lRUCache.put(1, 1); // cache is {1=1}
//        lRUCache.put(2, 2); // cache is {1=1, 2=2}
//        System.out.println(lRUCache.get(1)); ;    // return 1
//        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        System.out.println(lRUCache.get(2));    // returns -1 (not found)
//        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        System.out.println(lRUCache.get(1));    // return -1 (not found)
//        System.out.println(lRUCache.get(3));    // return 3
//        System.out.println(lRUCache.get(4));    // return 4

        /**
         * Merge String
         */
//        MergeString mergeString = new MergeString();
//        System.out.println(mergeString.mergeAlternately("abjsjdrew", "qwer"));

        /**
         * Three sum == 0
         */
//        ThreeSum solution = new ThreeSum();
//        int[] arr = {-1,0,1,2,-1,-4};
//        System.out.println(solution.threeSum(arr));

        /**
         * Return right side of binary tree
         * Not working
         */
//        BinaryTreeSideView bt = new BinaryTreeSideView();

        /**
         * Remove duplicates
         */
//        int[] nums = {-3,-1,0,0,0,3,3}; // Input array
//        int[] expectedNums = {-3,-1,0,3}; // The expected answer with correct length
//
//        int k = RemoveDuplicate.removeDuplicates(nums); // Calls your implementation
//
//        assert k == expectedNums.length;
//        for (int i = 0; i < k; i++) {
//            System.out.println( nums[i]);
//        }

        /**
         * Best Time to buy stocks (1)
         */
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(BestTimeToBuyStocks.maxProfit(prices));

        /**
         * Two sum
         * Not yet working
         */
//        int[] numbers = {2,7,11,15};
//        int target = 9;
//        System.out.println(TwoSum.twoSum(numbers, target)[0]);

        /**
         * Reverse String
         */
//        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
//        ReverseString.reverseString(s);

        /**
         * Sorted Squares
         */
//        int[] nums = {-1, 2, 2};
//        Arrays.stream(SortedSquare.sortedSquares(nums)).forEach(System.out::println);

        /**
         * Max Average Subarray
         */
//        int k = 4;
//        int[] nums = {1,12,-5,-6,50,3};
//
//        System.out.println(MaxAvgSubarray.findMaxAverage(nums, k));

        /**
         * Max Consecutive Ones
         */
//        int k = 2;
//        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
//
//        System.out.println(MaxConsOnes.longestOnes(nums, k));

        /**
         * Sum of 1D Array
         */
//        int[] nums = {1,2,3,4};
//        Arrays.stream(SumArray.runningSum(nums)).forEach(num -> System.out.print(num+ " "));

        /**
         * Min Positive Sum
         */
//        int[] nums = {2,3,5,-5,-1};
//        System.out.println(MinPositiveSum.minStartValue(nums));

        /**
         * K Radius Sub Averages
         */
//        int[] nums = {40527,53696,10730,66491,62141,83909,78635,18560};
//        int k = 2;
//        Arrays.stream(KRadSubarrAvg.getAverages(nums, k)).forEach(i -> System.out.print(i+ " "));

        /**
         * Reverse a string part 3
         */
//        String s = "Let's take LeetCode contest";
//        System.out.println(ReverseStringIII.reverseWords(s));

        /**
         * Reverse only letters
         */
//        String s = "Test1ng-Leet=code-Q!";
//        String expected = "Qedo1ct-eeLg=ntse-T!";
//        System.out.println(ReverseOnlyLetters.reverseOnlyLetters(s));
//        System.out.println(expected);

        /**
         * Pangram
         */
//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        System.out.println(Pangram.checkIfPangram(sentence));

        /**
         * Missing Number
         */
//        int[] nums = {0,1};
//        System.out.println(MissingNumber.missingNumber(nums));

        /**
         * Counting Elements
         */
//        int[] nums = {1,3,2,3,5,0};
//        System.out.println(CountElements.countElements(nums));

        /**
         * Find Players With Zero or One Losses
         */
//        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
//
//        int[][] testCase22 = {{26651,85186},{19790,34845},{20238,59388},{12788,40994},{46703,28184},{49936,83960},{76158,33038},{96005,2100},{86989,72152},{73342,82931},{90852,54532},{61649,18655},{9506,73692},{56189,5503},{34939,78765},{98315,19818},{57974,42491},{5906,8266},{97215,95437},{48266,87323},{86578,82992},{29919,70323},{38749,98079},{10259,27750},{977,39147},{43625,38229},{56044,32634},{53509,13100},{59446,68045},{38379,7712},{87511,62110},{35456,508},{76381,89490},{73270,55169},{82004,20887},{11239,24195},{56561,57161},{96112,81582},{20403,76188},{77876,61782},{99546,39653},{68650,57489},{27952,11410},{10595,73394},{98154,49624},{10866,3758},{70902,97205},{43360,93218},{59119,82709},{7379,47660},{76950,1884},{20120,87138},{23010,5729},{96553,12208},{70423,36052},{98588,30989},{87447,24694},{90748,39031},{17455,13250},{49557,4501},{99624,72185},{24791,99744},{80458,57635},{16175,29359},{53170,83581},{95936,39348},{5634,95357},{58517,73348},{54861,34521},{86692,23939},{11623,85398},{7562,4748},{13217,29610},{52705,67263},{95277,68332},{50498,96263},{18070,33256},{1901,4237},{11894,97936},{22135,34362},{7698,64698},{22893,62847},{2294,14712},{69996,48778},{340,93723},{42138,33976},{53231,33755},{29512,501},{81773,58971},{19189,20321},{30220,37726},{78678,17938},{79172,26444},{67695,39219},{23206,40923},{5651,8928},{49333,29553},{98589,75052},{99636,94502},{38455,66022},{3654,56685},{42118,65465},{83831,62461},{81301,90996},{35209,23863},{99223,69931},{5206,42971},{2143,97501},{91454,60002},{6307,70975},{48194,6557},{60125,70237},{60551,85062},{58731,86177},{98064,94854},{63923,51970},{87687,36064},{37926,97759},{87685,22212},{62051,7149},{1430,13255},{55928,48428},{8319,99922},{58503,69220},{45821,70178},{56815,31101},{77963,7364},{28828,65658},{92037,99306},{97928,41984},{47086,73658},{35491,79727},{24688,42610},{32304,18289},{52770,31966},{96613,96122},{73643,49573},{27623,89143},{62163,93629},{41018,53285},{59655,4055},{80777,17295},{9744,38601}};
//        System.out.println(MinLossPlayer.findWinners(testCase22));

        /**
         * Contiguous Array
         */
        int[] array = {0,1,1,1,1,1,0,0,0};
        //expected result = 6;
        System.out.println(ContiguousArray.findMaxLength(array));
    }
}