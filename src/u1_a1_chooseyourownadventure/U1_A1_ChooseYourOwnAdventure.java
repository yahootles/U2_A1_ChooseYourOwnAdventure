/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u1_a1_chooseyourownadventure;

/**
 *
 * @author antho6229
 */

import java.util.Scanner;

public class U1_A1_ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        String answer;
        Scanner inputS = new Scanner(System.in);
        
        System.out.println("They're after you. You're halfway up, on floor 26. Do you wish to go up or down? Type a to go up, or b to go down.");
        answer = inputS.nextLine();
        switch(answer){
            case "a": case "A":
                System.out.println("You sprint up the stairs, and make it to the roof. Is it raining? Type a if it is raining or b if it is sunny.");
                answer = inputS.nextLine();
                switch(answer){
                    case "a": case "A":
                        System.out.println("As you run to jump to the next building, you slip. They've caught up. You take your last view of the world, and all goes black.");
                        break;
                    case "b": case "B":
                        System.out.println("You make the jump to the next buildng succefuly, but now you must make it down to the street.\nDo you wish to go down through the building or take the fire escape? Type a to go through the building or b to take the fire escape.");
                        answer = inputS.nextLine();
                        if(answer.equalsIgnoreCase("a")){
                            System.out.println("They're waiting for you at the bottom. It's over for you. Everyhing goes black.");
                        }else if(answer.equalsIgnoreCase("b")){
                            System.out.println("You escape to live another day in freedom.");
                        }else{
                            System.out.println("That is not a valid answer");
                        }
                        break;
                }
                break;
            case "b": case "B":
                System.out.println("Would you like to take the elevator or the stairs? Type a for the elevator or b for the stairs.");
                answer = inputS.nextLine();
                switch(answer){
                    case "a": case "A":
                        System.out.println("They're waiting at the doors of the elevator. You hear an electric zap, and all goes black."); 
                        break;
                    case "b": case "B":
                        System.out.println("You don't see anybody. You can feel how close you are to escaping. Do you wish to go out the front door or back door. Type a for the front or b for the back.");
                        answer = inputS.nextLine();
                        if(answer.equalsIgnoreCase("a")){
                            System.out.println("You turn the corner to the lobby and hear a shout. A sound rings out through the hall. You feel sharp pain in our chest before all goes black.");
                        }else if(answer.equalsIgnoreCase("b")){
                            System.out.println("You open the door. Nobody is there. You walk away, relieved that you were never caught.");
                        }else{
                            System.out.println("Invalid answer");
                        }
                        break;
                }
                break;
            default:
                System.out.println("Invalid answer.");
                break;
        }
    }
    
}
