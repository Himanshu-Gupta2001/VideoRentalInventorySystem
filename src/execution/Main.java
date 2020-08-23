/* Created by IntelliJ IDEA.
 *  Author: Himanshu Gupta (191500345)
 *  Date: 8/23/2020
 *  Time: 3:43 PM
 */

package execution;


import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setVideoName("Bahubali: The Beginning");
        video.setRating(5);
        video.setCheckout(true);
        System.out.println(video.getVideoName());
        System.out.println(video.getRating());
        System.out.println(video.isCheckout());
    }
}
