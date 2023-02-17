public class Balde {
        
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return result;
        
    }
        
    public static void main(String[] args) {
        Balde sumOfArrays = new Balde();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = sumOfArrays.twoSum(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}