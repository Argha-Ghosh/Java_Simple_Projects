import java.util.Random;
import java.util.Scanner;

//Ar_Lazy_Dev
//Mad Libs game

public class MadLibs{

    //variables
    String story;
    String name;
    String noun1;
    String noun2;
    String noun3;
    String adjective1;
    String adjective2;
    String adverb;
    String randomNums;
    
    //scanner for input
    Scanner scanner = new Scanner(System.in); 

    //getters (Nothing but user-defined funtion which returns the variable vaule)
    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    //setters (Nothing but a user-defined function which sets/assigns a new value to a variable)
    public void setStory(String newStory) {
        this.story = newStory;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }

    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }

    public void setAdjective1(String newAdjective1) {
        this.adjective1 = newAdjective1;
    }

    public void setAdjective2(String newAdjective2) {
        this.adjective2 = newAdjective2;
    }

    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }

    public void setRandomNums() {
        int num;
        int index = 0;
        Random rand = new Random();
        num = Math.abs(rand.nextInt()) % 51;
        int numArr [] = new int[3];
        while(index < numArr.length) {
            numArr[index] = num + index;
            index++;
        }
        randomNums = "Not " + numArr[0] + ", even " + numArr[1] + ", but " + numArr[2];
    }

    //functions to get the input
    public void enterName() {
        System.out.println("Please Enter a name: ");
        setName(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Now, give me a noun: ");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Ummm...I need another noun: ");
        setNoun2(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("I think I need an adjective: ");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("I've got an idea! Give me another adjective: ");
        setAdjective2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Don't get angry, I know I'm asking too much but can I please have one last noun: ");
        setNoun3(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Phew! This is the last I promise, give me an adverb: ");
        setAdverb(scanner.nextLine());
    }

    //function to put together the story
    public void putTogetherTheStory() {
        String story = "Alice along with her childhood friend Eugeo and " + getName() + " went to the nearby mountain to collect some " + getNoun1() + 
        ".There they found a cave and went inside to explore. After a while after they went inside the cave they had a weird feeling and when they looked upside they saw "+ getNoun2()+
        " hanging from the ceeling. They got scared and ran deep into the cave and found an open space. They never imagined that they'll find a "+getAdjective1()+" "+ getNoun3()+
        " over there instead of "+ getNoun1()+". This sudden encounter scared them and they immediately ran towards the exit and " +getRandomNums()+" "+getNoun3()+" started to chase them."+
        "The ran "+ getAdverb() +" and finally made it out of the cave. "+"This gave them an important lesson about how "+getAdjective2()+" can life be.";
        setStory(story);
    }

    //function to print the instructions of the game to the user
    public void printInstructions() {
        System.out.println();
        System.out.println("Mad Libs Version 1.0");
        System.out.println();
        System.out.println();
        System.out.println("Copyright 2022 Ar_Lazy_Dev | All Rights Reserved");
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Hi! Welcome to the MAb Libs game...Let's have some fun!");
        System.out.println("In this game you'll give me some words and I'll give you a funny story. Hope you laugh hard :)");
        System.out.println();
    }

    //function to play the game
    public void play() {
        enterName();
        enterNoun1();
        enterNoun2();
        enterAdjective1();
        enterAdjective2();
        enterNoun3();
        enterAdverb();
        setRandomNums();
        putTogetherTheStory();
        System.out.println();
        System.out.println();
        System.out.println("The Story:");
        System.out.println();
        System.out.println(getStory());
        System.out.println();
    }

    public static void main(String[] args){
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
        System.out.println();
        System.out.println("Thanks for playing, Hope you enjoyed it!");
    }
}
