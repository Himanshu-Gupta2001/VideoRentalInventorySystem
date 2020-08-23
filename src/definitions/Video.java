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

    //Some special methods in java

    //1. The getter method : used to read the value of a private field.
    // Observer methods / Accessor Methods

    //formula
    //public <am:sameAsTheField> <right:sameAsTheField> get<NameOfTheField>() {}

    public String getVideoName() {
        return videoName;
    }

    //2. The setter method : used to write the value of a private field.
    // Transformer methods / Mutator Methods

    //formula
    //public <am:sameAsTheField> void set<NameOfTheField>(<p:sameAsTheField>() {}

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //exception for booleans: the name starts with 'is' instead of 'get'

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

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
