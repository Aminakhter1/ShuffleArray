public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        suffleArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void suffleArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int ran = (int) Math.floor((Math.random() * arr.length));

            int x = arr[ran];
            arr[ran] = arr[i];
            arr[i] = x;

        }

    }

}