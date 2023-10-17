import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2_1();
        task2_2();
        task3();
        task4();
    }




    private static void task1() {
        System.out.println("Домашняя работа №2.7");
        System.out.println(" ");
        System.out.println("Задание №1");
        System.out.println(" ");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i)) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println(" ");
        System.out.println("**************");
    }

    private static void task2_1() {
        System.out.println(" ");
        System.out.println("Задание №2");
        System.out.println(" ");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int i = 0; i < nums2.size() - 1; i++) {
            if (nums2.get(i) != null) {
                for (int j = i + 1; j < nums2.size(); j++) {
                    if (nums2.get(i) != null && nums2.get(i).equals(nums2.get(j))) {
                        nums2.set(j, 0);
                    }
                }
            }
        }

        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) == 0 || nums2.get(i) % 2 == 0) {
                nums2.remove(i);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) != 0 && nums2.get(i) % 2 == 0) {
                System.out.print(nums2.get(i) + " ");
            }


        }
        System.out.println(" ");
        System.out.println("**************");
    }

    private static void task2_2() {
        System.out.println(" ");
        System.out.println("Задание №2");
        System.out.println(" ");
        List<Integer> nums3 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums3);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums3) {
            if(num % 2==0&&num!=prevNum){
                System.out.print(num + " ");
                prevNum=num;
            }

        }


        System.out.println(" ");
        System.out.println("**************");
    }




    private static void task3() {
        System.out.println(" ");
        System.out.println("Задание №3");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
        System.out.println(" ");
        System.out.println("**************");
    }

    private static void task4() {
        System.out.println(" ");
        System.out.println("Задание №4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(strings.size()-uniqueWords.size());
        System.out.println(" ");
        System.out.println("**************");
    }


}



