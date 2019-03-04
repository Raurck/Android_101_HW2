package com.example.homework_2

/*
* Class Song represent the song meta-data
* dedicated to be used in audio-libraries
*
*/

class Song {
    /*
    * name of the song
    */
    var name: String = "Two captains"

    /*
    * artist who perform the song
    */
    var artist: String? = "Agatha Christie"

    /*
    * Song genre
    */
    var genre: String? = "Rock"

    /*
    * Song was included in album
    */
    var album: String? = "The hurricane"

    /*
    * Year of Release
    */
    var yearRelease: Int? = 1997

    /*
    * Song duration
    */
    var duration: Float? = 3.141592654f

    /*
    * You rank this song {rating}
    */
    var letterRating: Char? = 'A'

    /*
    * You rank this song {rating} scores out of 10
    */
    var rating: Double? = 9.99

    /*
    * World rank this song {worldRating} score out of 10
    */
    var worldRating: Double? = 9.99

    /*
    * The song was listened in application
    */
    var isListened: Boolean = false

    /*
    * Path to containing file
    */
    var path: String = "C:/long path/goes/here"

    private val unspecified: String = "unspecified"
    //TODO Getters and setters goes here

    override fun toString(): String {
        return "The song " + name + "\n" +
                " by " + (artist ?: unspecified) + "\n" +
                " genre " + (genre ?: unspecified) + "\n" +
                " album " + (album ?: unspecified) + "\n" +
                " year " + (yearRelease?.toString() ?: unspecified) + "\n" +
                " duration " + (duration?.toString() ?: unspecified) + "\n" +
                " letter rating " + (letterRating?.toString() ?: unspecified) + "\n" +
                " your rating " + (rating?.toString() ?: unspecified) + "\n" +
                " world rating " + (worldRating?.toString() ?: unspecified) + "\n" +
                " was listened " + isListened.toString() + "\n" +
                " path to file " + path
    }

}