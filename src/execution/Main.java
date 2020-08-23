/* Created by IntelliJ IDEA.
 *  Author: Himanshu Gupta (191500345)
 *  Date: 8/23/2020
 *  Time: 3:43 PM
 */

package execution;


import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video himanshu = new Video("Robot", 4, false);
        System.out.println(
                himanshu.getVideoName() + ", " +
                        himanshu.getRating() + ", " +
                        himanshu.isCheckOut()
        );
        Video video = new Video("Robot");
        System.out.println(
                video.getVideoName() + ", " +
                        video.getRating() + ", " +
                        video.isCheckOut() + "."
        );
        Video video1 = new Video();//constructor
        //default constructor : it is created automatically by the compiler
        /*video.setVideoName("Bahubali: The Beginning");
        video.setRating(5);
        video.setCheckout(true);*/
        video1.setVideoName("Robot");
        System.out.println(
                video1.getVideoName() + ", " +
                        video1.getRating() + ", " +
                        video1.isCheckOut() + "."
        );
        Video video2 = new Video();
        System.out.println(
                video2.getVideoName() + ", " +
                        video2.getRating() + ", " +
                        video2.isCheckOut() + "."
        );
        Video video3 = new Video();
        System.out.println(
                video3.getVideoName() + ", " +
                        video3.getRating() + ", " +
                        video3.isCheckOut() + "."
        );
        Video video4 = new Video();
        System.out.println(
                video4.getVideoName() + ", " +
                        video4.getRating() + ", " +
                        video4.isCheckOut() + "."
        );
    }
}
