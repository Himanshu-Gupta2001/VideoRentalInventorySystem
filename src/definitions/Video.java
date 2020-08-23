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
    private boolean checkOut;
    private int rating;

    //Some special methods in java

    //3. Constructor Methods : used to initialise the values (fields) of an object.

    // formula
    // public <non-static> <no return-type> <name:sameAsTheClass> () {}

    // 1. Non-Parameterized constructor : it has no parameters.
    public Video() {
        videoName = "Sport";
        rating = 5;
        checkOut = true;
    }

    // 2. Parameterized constructor : it has some parameters.
    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    public Video(String videoName) {
        this.videoName = videoName;
    }

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

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    //  4.The toString() method
    public String toString() {
        return String.format(
                "Video Name: %s, Video Rating: %d, Is Video Available: %b",
                getVideoName(), getRating(), isCheckOut()
        );
    }

    //                 extra

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
