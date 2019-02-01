package pseudo_pgms;

public class FirstNonRepeating {
    public static void main(String[] args) {
        System.out.println("result " + new FirstNonRepeating().findNum(new int[]{1,2,1,3,4,3,4,55,5,6,2,11,6,24,11,5,3,8}));
    }

    private int find(int[] ints){
        int result = -1;
        for (int index = 0; index < ints.length - 1; index++) {
            result = ints[index];
            boolean resultFound = false;
            for (int index2 = 0; index2 < ints.length; index2++) {
                if (ints[index] == ints[index2] && index != index2) {
                    resultFound = false;
                    break;
                } else {
                    resultFound = true;
                }
            }
            if (resultFound) {
                break;
            }
        }
        return result;
    }

    private int findNum(int[] ints){
        int result = -1;
        for (int index = 0; index < ints.length; index++) {
            int index2;
            for (index2 = 0; index2 < ints.length; index2++) {
                if (ints[index] == ints[index2] && index != index2)
                    break;
            }
            if(index2 == ints.length){
                return ints[index];
            }
        }
        return result;
    }
}
