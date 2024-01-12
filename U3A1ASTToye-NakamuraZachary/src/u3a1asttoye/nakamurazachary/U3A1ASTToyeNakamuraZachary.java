/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3a1asttoye.nakamurazachary;
import java.util.Scanner;
/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 8, 2023
 * A text-based choose your own adventure game, where the user can answer yes/no decisions to progress through it.
 * I'm really not great at story telling, so it's not very good, sorry. I tried my best. . .
 * 
 * Ahhh I forgot to type a - on the quiz sad ;-;
 * I don't really like the fact that this 500+ line program can be done in so many less lines by just using an array, using a binary tree of strings is stored in an array then, this can probably be written in >20 lines
 */
public class U3A1ASTToyeNakamuraZachary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare a variable to store what yes is for the program
        final String STRYES = "Y";
        
        // Declaring the Scanner for input
        Scanner input = new Scanner(System.in);
        // Declaring the variable where the input is stored
        String strUserResponse;
        // Prompt the user, with a little explaination about the "game" and the first question
        System.out.println("Welcome to the text-adventure, answer questions to progress the story, please type " + STRYES + " for yes and N for no (Anything other than Y will default to no).\nYou are a detective trying to solve a case. Bob has been murdered, and you have a line up of 3 suspects to question, but only enough time to question 1 of them, \nand once you chose not to question a suspect they leave and can't be contacted. \nWould you like to question suspect 1, John the janitor who was cleaning when bob was murdered?");
        // Getting user input and storing it in my variable
        strUserResponse = input.next();
        
        // Check if the users reponse is "yes" (well what the program defines as yes).
        //  First layer if statement (if it's yes)
        // Y
        if (strUserResponse.equals(STRYES))
        {
            
            // Tell the next part of the story and then ask the user for more input.
            System.out.println("You ask John a few questions about the day Bob was murder. He tells you a few bits of information.\nFirst he works in a mostly abandoned warehouse, and Bob was last seen close to that warehouse. \nSecond, he didn't hear any noises expect the noise made by himself. \nThird, he may have seen a door open and close but he was very far away from the door (enough to not hear it). Lastly his boss is shady, and he saw people just standing around the warehouse sometimes starting a few weeks back.\nDo you go to the warehouse? (If not you interrogate John.)");
            // Getting user input and storing it in my variable
            strUserResponse = input.next();
            
            // Check if the users reponse is "yes" (well what the program defines as yes).
            // Y Second Layer if statement (if it's yes)
            // YY
            if (strUserResponse.equals(STRYES))
            {
                // Tell the next part of the story and then ask the user for more input.
                System.out.println("You decide to go to the warehouse, but you should probably bring some people with you since someone just died there. Do you want to bring the police with you? (If you don't bring the police with you, John will come with you.)");
                // Getting user input and storing it in my variable
                strUserResponse = input.next();
                
                // Check if the users reponse is "yes" (well what the program defines as yes).
                // YYY
                if (strUserResponse.equals(STRYES))
                {
                    // Tell the next part of the story and then ask the user for more input.
                    System.out.println("You go to the warehouse with the police, while there you don't see anyone nearby, nor do you hear anything. You see markings on the wall that reads RG9uIGRpZCBpdC4gVGhlIGpvYiBpcyBkb25lLg== what could this mean? \nAnyways do you want to inspect outside the building where Bob was supposedly murdered? (If not, you'll inspect the door that John said opened and closed)");
                    // Getting user input and storing it in my variable
                    strUserResponse = input.next();
                    
                    // Check if the users reponse is "yes" (well what the program defines as yes).
                    // YYYY
                    if (strUserResponse.equals(STRYES))
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You look around but can't find Bob's body anywhere, just signs of a struggle and a little blood, after testing the blood it is confirmed to be Bob's. Would you like to look around for Bob's body? (If not you'll report back to your office)."); 
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next(); 
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // YYYYY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You look around the surrounding area for bob's body, but there is nothing? \nStrange. . . bodies don't just disappear with so few traces left behind. You decide to check the near by river to try and find the body but come up empty handed. \nWith little else to try doing to head back to your office and watch cat videos (eventually getting dismissed for just watching cat videos).");
                        }
                        
                        // If the if statement is false, then the user answered no.
                        // YYYYN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You return back to your office with nothing gained expect some jumbled random looking text, only if you have more would it be possible to find out what it's being encoded with. The case is pass on to someone else to solve."); 

                        }                    
                    }
                    // If the if statement is false, then the user answered no.
                    // YYYN
                    else 
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You decide to inspect the door that John said may have opened and closed, Do you peek around the door to see if anything is different about it? (If not, you look at the weird scratches near the door)");
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next(); 
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // YYYNY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the next part of the story and then ask the user for more input.
                            System.out.println("As you open the door a grenade explodes, it was booby trapped!. The police take you to the hospital, but you are unable to continue the case. You survive. . ."); 
                        }
                        // If the if statement is false, then the user answered no.
                        // YYYNN
                        else 
                        {
                            // Tell the next part of the story and then ask the user for more input.
                            System.out.println("As you look closer the scratches turn out to be more weird text that is written on the wall, \nV2F0Y2ggdGhlIHBsYWNlIGZvciBhIGZldyBtb3JlIGRheXMsIHRoZW4gd2UgY2FuIGxlYXZlLiBHZXQgcmlkIG9mIGFueW9uZSB3aG8gaW52ZXN0aWdhdGVzLg==\n With this there is enough text for you to decipher it (this is left as an exercise to the reader (it's so basic it can't be consider a cipher)) and figure out who the killer is. You find and arrest the killer.");
                        }
                    }
                }
                // If the if statement is false, then the user answered no.
                // YYN
                else 
                {
                    // Tell the next part of the story and then ask the user for more input.
                    System.out.println("You decide to take John with you to go to the warehouse, on the way you ask him why he works in a mostly abandoned warehouse. He says that he gets paid a lot, which is weird. While there he seems to notice something for just a second but then turns away. Do you ask him about what he noticed?");
                    // Getting user input and storing it in my variable
                    strUserResponse = input.next(); 
                    // Check if the users reponse is "yes" (well what the program defines as yes).
                    // YYNY
                    if (strUserResponse.equals(STRYES))
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You ask John, what did you notice? Is there anything over there? He says that there is nothing over there and it's fine. Do you want to press him for answers and push past him to look?");  
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // YYNYY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You try to push past him and keep asking him what he saw. He grabs a nearby mop with you are trying to look at the spot he says \"Stop being so nosy\" and hits you on the back of the head with the mop. \nYou are not heard from or seen again.");
                        }
                        // If the if statement is false, then the user answered no.
                        // YYNYN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You don't press John for details and you just walk around the warehouse with John for while, learning about  his wife and kids, but you don't learn anything of value. \nYou return to your office and decide to work on the case at a later date.");
                        }
                    }
                    // If the if statement isn't true this runs.
                    // YYNN
                    else 
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You don't ask him about it, but would you like to go over and look at it while he is not looking?");
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next(); 
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // YYNNY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("When John is on the other side of the warehouse you go over to where he looked at (the door that he claimed he maybe saw open and close)\nV2F0Y2ggdGhlIHBsYWNlIGZvciBhIGZldyBtb3JlIGRheXMsIHRoZW4gd2UgY2FuIGxlYXZlLiBHZXQgcmlkIG9mIGFueW9uZSB3aG8gaW52ZXN0aWdhdGVzLg== \nWith this there is enough text for you to decipher it (this is left as an exercise to the reader (it's so basic it can't be consider a cipher)) and figure out who the killer is. You find and arrest the killer."); 
                        }
                        // YYNNN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You walk around the warehouse with John for while, learning about  his wife and kids, but you don't learn anything of value. \nYou return to your office and decide to work on the case at a later date.");
                        }                        
                    }
                }
            }
            // If the N if statement is false then run this
            // YN
            else 
            {
                // Tell the next part of the story and then ask the user for more input.
                System.out.println("You decide to not go to the warehouse and instead decide to interrogate John (using totally ethical techniques), he finally lets it slip that he's not totally not involved in the murder, of Bob. \nHe admits to be the lookout. Do you offer him a sum of money to convivence him to help you try and capture the killer's? (If not you'll hand him over to the police.)");
                // Getting user input and storing it in my variable
                strUserResponse = input.next();
                
                // Check if the users reponse is "yes" (well what the program defines as yes).
                // YN Third Layer if statement (if it's yes)
                // YNY
                if (strUserResponse.equals(STRYES))
                {
                    // Tell the next part of the story and then ask the user for more input.
                    System.out.println("You offer John some money to help you, and he agrees as long as you also change his identity after the killers are captured. Do you to have him try and meet up with his boss (possibly attached to the murder) so you can ambush them? (If not, you'll have him to give you the names and places).");
                    // Getting user input and storing it in my variable
                    strUserResponse = input.next();
                    // YNY Forth Layer if statement (if it's yes)
                    // YNYY
                    if (strUserResponse.equals(STRYES))
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("John agrees to meet his boss, and you go to the meeting place. As soon as John gives the signal to ambush them, a smoke bomb goes off and you hear the back door open and close. Do you give chase or is it too dangerous?");
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        // YNYY Fifth Layer if statement (if it's yes)
                        // YNYYY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You give chase and burst through the door, you notice 2 figures through the smoke but they disappear around a corner. After rounding the corner, you don't see them. After scanning the area you can't find them anywhere. You spend the rest of the day roaming the city looking for them but you never find them. You've lost your only lead and will have to attempt this case at a later date.");
                            // YNYYY End Layer if statement (if it's yes)
                        }
                        // If the YNYN if statement is false then run this
                        // YNYYN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You back off and go out through the front door. You call for backup, waiting for more people. You see 2 people running through the smoke of a nearby alleyway and give chase. After tackling them it turns out they aren't John or Mat, just two random drunk people. Later in the day they are identified and both are captured. Neither one gives up any more information on Bob's murder during a second interrogation. You'll have to find more information and continue the case at a later date.");
                            // YNYYN End Layer if statement (if it's yes)
                        }
                    }
                    // If the YNY if statement is false then run this
                    // YNYN
                    else 
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("John tells you his boss is Mat and he meets up with him at \"The Whiskey Bar\" to be paid. Do you wish to go to \"The Whiskey Bar\"?");
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        // YNNY Fifth Layer if statement (if it's yes)
                        // YNYNY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You go down the the Whiskey bar disguised as someone else and sit down at a table close to the person John calls Mat. You overhead him talking with another person. \"Is it done Don?\", \"Yes\". Then  Mat hands the person money and the other person leaves. You call for backup, and take Mat into custody. You send other people to look for the other person but they aren't found. The case closes with people assuming Mat is responsible for the murder of Bob.");
                            // YNNYY End Layer if statement (if it's yes)
                        }
                        // If the YNNY if statement is false then run this
                        // YNYNN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You give the names and locations to a different department. They go in and raid the place, arrest 4 people. The case closes, but who knows who the killer was, as none of the people arrested gave up any information.");
                            // YNNYN End Layer if statement (if it's yes)
                        }
                    }
                }
                // If the YN if statement is false then run this
                // YNN
                else 
                {
                    // Tell the next part of the story and then ask the user for more input.
                    System.out.println("You decide not to give money or bribe an accomplice of a criminal. Instead he's taken to jail for multiple years, and you continue your search.  Do you want to go to the crime scene? (If not you'll go ask other detectives for help)");
                    // Getting user input and storing it in my variable
                    strUserResponse = input.next();
                    // YNN Forth Layer if statement (if it's yes)
                    // YNNY
                    if (strUserResponse.equals(STRYES))
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You go to the crime scene but the body is missing. . . strange. You look around but can't find anything. There is both a forest and a river nearby perfect for throwing a body away. Do you want to investigate the river? (If not, you'll investigate the forest)"); 
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        // YNNY Fifth Layer if statement (if it's yes)
                        // YNNYY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You look around the river for a long time but only find fish and stones. After a long wet day you head back home. You'll have to pick up the case tomorrow."); 
                            // YNNYY End Layer if statement (if it's yes)
                        }
                        // If the YNNY if statement is false then run this
                        // YNNYN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You drive out to the forest that surrounds the area looking for any signs of a body. You find what looks to be a few broken branches and a path of disturbed foliage. following the path you find a path of earth that is hidden very well, but still looks like someone dug it up. After digging it back up you discover a body, but you can't tell who it is due to the mutilation. You head back home disturbed. You'll have to pick up the case tomorrow. "); 
                            // NNNYN End Layer if statement (if it's yes)
                        }
                    }
                    // If the YNN if statement is false then run this
                    // YNNN
                    else 
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You ask you're colleagues for help on this case, and then spend a long time just thinking it. After a while they remember that there warehouse is run by someone named Mat, and they are known for being shady, the police have always been looking for a reason to arrest him, \nbut haven't had any hard evidence, so if he can be connected to the accomplice of a murder then they can finally arrest him, but he probably won't give up any information and the real murders will run away. \nDo you tell the police to go arrest him?"); 
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        // YNNN Fifth Layer if statement (if it's yes)
                        // YNNNY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("The police go and arrest Mat, but he don't tell them anything. On top of that even after a week of investigating you don't find anything on other people related to the crime. Well at least you have 2 people related to the crime arrested. The case closes due to there being no leads."); 
                            // YNNNY End Layer if statement (if it's yes)
                        }
                        // If the YNNN if statement is false then run this
                        // YNNNN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("After a long him of stalking all people related to the crime, a lot of investigation, and teamwork with your colleagues, \nyou find out that someone named Don is behind the murders. You also find out he's part of Cicada 3301. \nYou get the police to raid Cicada 3301 on the day they all where suppose to meet up, and after a short fire fight, 14 members were arrested with 1 dead."); 
                            // YNNNN End Layer if statement (if it's yes)
                        }
                    }
                }
            }
        }
        
        
        
        // If the first if statement is false then run this
        // N
        else 
        {
            // Tell the next part of the story and then ask the user for more input.
            System.out.println("You have chosen to let John go, would you like to question Pat, bob's friend who can remember what they were doing during bob's murder.");
            // Getting user input and storing it in my variable
            strUserResponse = input.next();
            
            // Check if the users reponse is "yes" (well what the program defines as yes).
            // N Second Layer if statement (if it's yes)
            // NY
            if (strUserResponse.equals(STRYES))
            {
                // Tell the next part of the story and then ask the user for more input.
                System.out.println("Pat says that he was drunk, and probably with Bob when he was murdered but can't remember. \nHe says he might know something and hands you a small card with ##)! written on it. He says that he found it in his pocket, but never put it there. \nDo you know what could mean?"); 
                // Getting user input and storing it in my variable
                strUserResponse = input.next();
                
                // Check if the users reponse is "yes" (well what the program defines as yes).
                // NYY
                if (strUserResponse.equals(STRYES))
                {
                    // Tell the next part of the story and then ask the user for more input.
                    System.out.println("This code is so obvious and you easily break it (go ahead). Does it say oozy when decoded?"); 
                    // Getting user input and storing it in my variable
                    strUserResponse = input.next();
                    
                    // Check if the users reponse is "yes" (well what the program defines as yes).
                    // NYYY
                    if (strUserResponse.equals(STRYES))
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("It's definitely oozy, you search the files but come up with nothing but a slime company. Would a slime company have something to do with this murder? \nDo you do investigate the slime company?"); 
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next(); 
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // NYYYY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the next part of the story and then ask the user for more input.
                            System.out.println("You find nothing but some really oozy slime, the case is closed due to you wasting the whole budget buying slime."); 
                        }
                        // NYYYN
                        else 
                        {
                            // Tell the next part of the story and then ask the user for more input.
                            System.out.println("You don't think that the slime company has anything to do with the murder. You send the message to be analyzed but no one ever gets back to you. Without the information you can't continue the case and it closes."); 
                        }                    
                    }
                    // NYYN
                    else 
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("Ahah, you know that it says 3301. That's part of the name of a organization (Cicada 3301). After looking through your files the meeting spot of Cicada 3301 in \"The Whiskey Bar\" Would you like to go to try and find them?"); 
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next(); 
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // NYYNY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the next part of the story and then ask the user for more input.
                            System.out.println("Upon entering the bar everyone looks at you, you sit down at the bar and ask the bartender \"if the job was done\" (trying to act like you fit in). \nThe bartender replies \"Yes\", but his expression slowly changes from surprised to suspicion, but he still serves you a drink, after just touching the drink with your lips you realize you've been poisoned and everything fades to black. \nYou are never heard from again."); 
                        }
                        // NYYNN
                        else 
                        {
                            // Tell the next part of the story and then ask the user for more input.
                            System.out.println("You decide to send in operatives to raid the place instead of going yourself. After the raid they detain around 8 people, but none of them admit to killing Bob and there is no hard evidence so they are all released in just a few days. You will have to continue working on this case later."); 
                        }
                    }
                }
                // NYN
                else 
                {
                    // Tell the next part of the story and then ask the user for more input.
                    System.out.println("You have no idea what they 4 character could mean and ask pat what it could be, Pat says that they have no idea. Bring it to a specialist to try and find out who it belongs to or what it means. \nBut this will take time, would you like to go out to eat lunch?"); 
                    // Getting user input and storing it in my variable
                    strUserResponse = input.next(); 
                    
                    // Check if the users reponse is "yes" (well what the program defines as yes).
                    // NYNY
                    if (strUserResponse.equals(STRYES))
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You step out to have some lunch at your local [GENERIC] restaurant. After getting your food someone quickly walks over your table, and slides you a card that has Cicada 3301 printed on it, and StOP inVEsTiGATIng NOW on it. \nThey walk away quickly. Do you try to follow them?");  
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // NYNYY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You try to follow the person through winding alleys and twisting streets, they go through the backdoor of a bar. You try to the door that they went through, it's locked. \nAs soon as it's rattled half a dozen high bullets wiz through the door, multiple of them hit you. You are later found dead in the forest.");  
                        }
                        // NYNYN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You enjoy your lunch, and return with the card in hand. The specialist tells you what was on the card lines up with part of what is printed on the card you received. As you continue to work on the case you see more and more people watching you. But in the end you never solve the case. Closing it until someone else tries to solve it."); 
                        }
                    }
                    // NYNN
                    else 
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You sit in your office waiting for the specialist to find out more about the card, you wonder about DSA, \nwhen would you use a multi-dimensional segtree, how could you hash in O(logN) time? How should you approach 7p+ construction problems? \nAh, the specialist is done, back to work. The specialist says that it's the sign of a organization called Cicada, and you could probably find there meeting spot in \"The Whiskey Bar\" \nWould you like to go to try and find them?"); 
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next(); 
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // NYNNY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("Upon entering the bar everyone looks at you, you sit down at the bar and ask the bartender \"if the job was done\" (trying to act like you fit in). \nThe bartender replies \"Yes\", but his expression slowly changes from surprised to suspicion, but he still serves you a drink, after just touching the drink with your lips you realize you've been poisoned and everything fades to black. \nYou are never heard from again.");  
                        }
                        // NYNNN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You decide to send in operatives to raid the place instead of going yourself. After the raid they detain around 16 people, but none of them admit to killing Bob and there is no hard evidence so they are all released in just a few days. You will have to continue working on this case."); 
                        }                        
                    }
                }
            }
            // If the N if statement is false then run this
            // NN
            else 
            {
                // Tell the next part of the story and then ask the user for more input.
                System.out.println("You have let Pat leave, would you like to question Tim, who was found walking quickly away from the crime scene, but says he was just on his way home?");
                // Getting user input and storing it in my variable
                strUserResponse = input.next();
                
                // Check if the users reponse is "yes" (well what the program defines as yes).
                // NN Third Layer if statement (if it's yes)
                // NNY
                if (strUserResponse.equals(STRYES))
                {
                    // Tell the next part of the story and then ask the user for more input.
                    System.out.println("You decide to interrogate Tim, who says that he was just walking home from work and while passing by where Bob was said to have been murdered, he never heard any noise. Do you think he lying?");
                    // Getting user input and storing it in my variable
                    strUserResponse = input.next();
                    
                    // Check if the users reponse is "yes" (well what the program defines as yes).
                    // NNY Forth Layer if statement (if it's yes)
                    // NNYY
                    if (strUserResponse.equals(STRYES))
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You don't believe that Tim is telling the truth so you press him for more details about his life, but he can't tell you anything about his job, perhaps he is the killer or perhaps he works a confidential job which he can't disclose. \nBut he won't tell you anything about his job or where he works. Do you think he is the killer?");
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // NNYY Fifth Layer if statement (if it's yes)
                        // NNYYY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You tell the police you are working with that Tim is the murder, and he is take to jail, but just a day later he's out and no one will tell you why, what happened or who he his. \nThe case is closed publicly, with media headlines saying that Tom killed bob, but privately the case is still ongoing, known to only those working on it. It is eventually closed internally.");
                            // NNYYY End Layer if statement (if it's yes)
                        }
                        // If the NNYN if statement is false then run this
                        // NNYYN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("He thanks you for believing him that he is not the killer and, he tells you that he looks forward to working with you on the case, leaving you confused. \nFor the rest of the case, out of the corner of your eye you sometimes see Tim, but when you turn your head to look directly at him he isn't there. The case is never solve, and left open.");
                            // NNYYN End Layer if statement (if it's yes)
                        }
                    }
                    // If the NNY if statement is false then run this
                    // NNYN
                    else 
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You decide to not press Tim further, because you think that he's not lying. But it would be odd if there was no noise during a murder. Is Bob really dead or maybe he was kidnapped with the use of chloroform. \nNo, the body was there. . . wait. You rush to the crime scene. The body WAS there where is the body, leaving just some blood behind. How did it vanish??? You hear something being dragged around the corner. \nDo you immediately draw a weapon and attempt to kill/maim whatever/whoever is on the scene?");
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // NNNY Fifth Layer if statement (if it's yes)
                        // NNYNY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You reach for a service pistol at your hip but then remember you left it at your office, instead you call in a orbital strike on the sound. \nA large metal object falls through the roof and crushes whatever was making the sound. Nothing of value could be recovered, due to it all being destroyed.");
                            // NNNYY End Layer if statement (if it's yes)
                        }
                        // If the NNNY if statement is false then run this
                        // NNYNN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You walk closer to find out what is making the noise, as you approach you make out a wild dog dragging a body away. \nYou chase the dog of but, it's not Bob's body. . . Where where did it go? You continue the case, but nothing comes of it.");
                            // NNNYN End Layer if statement (if it's yes)
                        }
                    }
                }
                // If the NN if statement is false then run this
                // NNN
                else 
                {
                    // Tell the next part of the story and then ask the user for more input.
                    System.out.println("You have let all of the suspects leave. Would you like to go to the crime scene to try and find evidence?");
                    // Getting user input and storing it in my variable
                    strUserResponse = input.next();
                    
                    // Check if the users reponse is "yes" (well what the program defines as yes).
                    // NNN Forth Layer if statement (if it's yes)
                    // NNNY
                    if (strUserResponse.equals(STRYES))
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You decide to go to the crime scene. On the way to the crime scene you see a dark alley, you have a gut feeling that something is going on in that alley. Do you walk in?");
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // NNNY Fifth Layer if statement (if it's yes)
                        // NNNYY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("Walking into the alley, you find a few garbage cans that smells a lot like rotting bodies, but nothing else. While opening one of the garbage cans someone who was hiding in one of the garbage cans pulls out a gun and shoots you. \nThe police find you a few days later along with another body (Bob) in the garbage cans, along with a card with Cicada 3301 printed on it.");
                            // NNNYY End Layer if statement (if it's yes)
                        }
                        // If the NNNY if statement is false then run this
                        // NNNYN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("You make it to the crime scene, but who ever was here was very meticulous leaving no traces behind, only a business card with Cicada 3301 printed on it. \nThere is not enough information to continue the case, so it's put on hold and you go to work on other more mundane cases.");
                            // NNNYN End Layer if statement (if it's yes)
                        }
                    }
                    // If the NNN if statement is false then run this
                    // NNNN
                    else 
                    {
                        // Tell the next part of the story and then ask the user for more input.
                        System.out.println("You don't go to the crime scene, pretty lazy aren't ya? Would you like to search the [CLASSIFIED] files in the office for anything on bob or his killer? (You aren't really suppose to look in them. . .)");
                        // Getting user input and storing it in my variable
                        strUserResponse = input.next();
                        
                        // Check if the users reponse is "yes" (well what the program defines as yes).
                        // NNNN Fifth Layer if statement (if it's yes)
                        // NNNNY
                        if (strUserResponse.equals(STRYES))
                        {
                            // Tell the end part of the story.
                            System.out.println("You turn up with nothing. While searching your superior comes in and asks what you are doing looking in classified files that you aren't allow to be looking at. \nThey don't take looking for info on bob or his killer as a valid answer because it's a minor case. You are detained and interrogated.");
                            // NNNNY End Layer if statement (if it's yes)
                        }
                        // If the NNNN if statement is false then run this
                        // NNNNN
                        else 
                        {
                            // Tell the end part of the story.
                            System.out.println("While you sit around doing nothing, your the head of police comes in and fires you for wasting 14 days.");
                            // NNNNN End Layer if statement (if it's yes)
                        }
                    }
                }
            }
        }
        // A message to inform the user that the game is over, and thanks them for playing
        System.out.println("That is the end of this story. Thank you for playing.");
    }
}