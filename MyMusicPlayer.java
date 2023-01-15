//Ar_Lazy_Dev
//Java beginner's course - Bro Code (Youtube)

//making a music player in java

import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class MyMusicPlayer{
    
    public static void main(String[] args) throws UnsupportedAudioFileException,IOException,LineUnavailableException{

        System.out.println("Welcome to Console screen Music Player v1.0.0");
        System.out.println("This only plays one music from SAO :)");
        System.out.println("Instructions:\npress-->\nP = Play\nQ = Quit\nS = Stop\nR = Reset\n");
        
        Scanner scanner = new Scanner(System.in);

        
        File music = new File("At Nightfall - Yuki Kajiura - _SAO_ Soundtrack.wav");



        AudioInputStream audio_stream = AudioSystem.getAudioInputStream(music);
        Clip sound_clip = AudioSystem.getClip();
        sound_clip.open(audio_stream);



        String response = "";

        while(!response.equals("Q")){
            System.out.print("Enter your response:");
            response = scanner.nextLine();
            response=response.toUpperCase();

            switch(response){
                case "P" : sound_clip.start();
                break;
                case "S" : sound_clip.stop();
                break;
                case "R" : sound_clip.setMicrosecondPosition(0);
                break;
                case "Q" : break;
                default : System.out.println("Not a valid Response :(");
            }
        }
        scanner.close();
        System.out.println("Thanks for using this dope Music player :)");
    }

}