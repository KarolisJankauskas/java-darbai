package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};
//        System.out.println("First element:"+getFirstElement(arr));
//        System.out.println("Last element:"+getLastElement(arr));
//        System.out.println("Min mark:"+getMin(arr));
//        System.out.println("Max mark:"+ getMax(arr));
//        System.out.println("Sum:"+ getSum(arr));
//        System.out.println("Average:"+ getAverage(arr));
//        System.out.println("Count greater than 3:"+ countElements(arr, 3));
//        System.out.println("Contains 4:"+ contains(arr, 4));
//        System.out.println("Last index of 4:"+ lastIndexOf(arr, 4));

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        //TODO
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO
        return arr[arr.length - 1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        //TODO
        return (double)getSum(arr) / arr.length;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        int count = 0;
        for (int num : arr) {
            if (num > n) {
                count++;
            }
        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        for (int num : arr) {
            if (num == n) {
                return true;
            }
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}






