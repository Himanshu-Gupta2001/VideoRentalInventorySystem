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
        Video video5 = new Video("Robot");

        //we would like to check if both the objects are equal.

        /*
         1.If both the objects are same ,i.e the reference variable are referring to the same object,or have the same hashcode.
         */
        /*if (video.hashCode() == video5.hashCode()) {
            System.out.println("Equal");
        }
        if (video.getClass() != video5.getClass()) {
            System.out.println("Not Equal");
        } else {
            if (
                    video.getRating() == video5.getRating() &&
                            video.isCheckOut() == video5.isCheckOut() &&
                            video.getVideoName() == video5.getVideoName()
            ) {
                System.out.println("Equal");
            }
        }*/

        //2.If both the objects are from the same class AND all the fields of the objects have same values.
        System.out.println(video.getClass().getName());
        System.out.println(video5.getClass().getName());
        System.out.println(video);
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
