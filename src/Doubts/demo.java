package Doubts;

//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class QueueExample {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Queue<Integer> queue = new LinkedList<>();
//        while (true) {
//            System.out.println("\nChoose an operation:");
//            System.out.println("1.Enqueue \t 2.Dequeue \t 3.Display \t 4.Exit");
//            int choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter a value to enqueue:");
//                    int valueToEnqueue = scanner.nextInt();
//                    enqueue(queue, valueToEnqueue);
//                    break;
//                case 2:
//                    dequeue(queue);
//                    break;
//                case 3:
//                    display(queue);
//                    break;
//                case 4:
//                    System.out.println("Exiting the program.");
//                    scanner.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please choose again.");
//            }
//        }
//    }
//
//    private static void enqueue(Queue<Integer> queue, int value) {
//        queue.offer(value);
//        System.out.println(value + " enqueued to the queue.");
//    }
//
//    private static void dequeue(Queue<Integer> queue) {
//        if (!queue.isEmpty()) {
//            int removedValue = queue.poll();
//            System.out.println(removedValue + " dequeued from the queue.");
//        } else {
//            System.out.println("Queue is empty. Cannot dequeue.");
//        }
//    }
//
//    private static void display(Queue<Integer> queue) {
//        if (!queue.isEmpty()) {
//            System.out.print("Queue: ");
//            for (int value : queue) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        } else {
//            System.out.println("Queue is empty.");
//        }
//    }
//}