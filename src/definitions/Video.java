/* Created by IntelliJ IDEA.
 *  Author: Himanshu Gupta (191500345)
 *  Date: 8/23/2020
 *  Time: 2:50 PM
 */

package definitions;

public class Video {

    /*
     * Creating Definition Classes: (Rules)
     * 1. Always set the visibility modifier of a field to private unless otherwise specified.
     * 2. Always set the access modifier of a field to non-static unless otherwise specified.
     */

    // member variables => fields / variables
    private String videoName;
    private boolean checkout;
    private int rating;

    //member functions => methods / functions

    /**
     * This method returns the name of the video.
     *
     * @return The name of the video.
     */
    public String getName() {
        return "";
    }

    /**
     * This method sets the checkout value of a video to true or false.
     * If the value is set to true , that means that a customer has rented the video.
     */
    public void checkout() {

    }
}
