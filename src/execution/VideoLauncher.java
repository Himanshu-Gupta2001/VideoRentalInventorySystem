/* Created by IntelliJ IDEA.
 *  Author: Himanshu Gupta (191500345)
 *  Date: 8/25/2020
 *  Time: 3:24 PM
 */

package execution;

import definitions.VideoStore;

import java.util.Scanner;

public class VideoLauncher {
    private static final int ADD_VIDEO = 1;
    private static final int CHECK_OUT_VIDEO = 2;
    private static final int RETURN_VIDEO = 3;
    private static final int RECEIVE_RATING = 4;
    private static final int LIST_INVENTORY = 5;
    private static final int EXIT = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        VideoStore myVideoStore = new VideoStore();
        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Video: ");
            System.out.println("2. Check out video: ");
            System.out.println("3. Return video: ");
            System.out.println("4. Receive rating: ");
            System.out.println("5. List inventory: ");
            System.out.println("6. Exit: ");
            System.out.println("Enter you choice (1..6): ");
            clientInput = scanner.nextInt();
            String videoName;
            int rating;
            switch (clientInput) {
                case ADD_VIDEO:
                    System.out.println("Enter the name of the video that you want to add: ");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    myVideoStore.addVideo(videoName);
                    break;
                case CHECK_OUT_VIDEO:
                    System.out.println("Enter the name of the video you wan to rent: ");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    myVideoStore.doCheckout(videoName);
                    break;
                case RETURN_VIDEO:
                    System.out.println("Enter the name of the video you want to return: ");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    myVideoStore.doReturn(videoName);
                    break;
                case RECEIVE_RATING:
                    System.out.println("Enter the name of the video whose rating you want to set:  ");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    System.out.println("Enter the rating of \"" + videoName + "\": ");
                    rating = scanner.nextInt();
                    myVideoStore.receiveRating(videoName, rating);
                    break;
                case LIST_INVENTORY:
                    myVideoStore.listInventory();
                    break;
                default:
            }
        } while (clientInput != EXIT);
        scanner.close();
    }
}

