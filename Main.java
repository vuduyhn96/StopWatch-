public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        stopWatch.start();

        selectionSort(array);

        stopWatch.stop();

        System.out.println("Thời gian thực thi thuật toán sắp xếp chọn: " + stopWatch.getElapsedTime() + " milliseconds");
    }
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
