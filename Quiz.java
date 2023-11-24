package Quiz;

import java.util.Scanner;
/**
 * This is going to be a 4 question quiz about the World Cup 2022
 * C22469126
 * Bryan Nnadi
 * 05/11/2022
 */
public class Quiz
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("/f");

        /** . List variables **/

        String answer1 = "";
        String answer2 = "";
        String answer3 = "";
        String answer4 = "";

        int rightAnswers = 0;
        int wrongAnswers = 0;
        int amountOfTries = 0;
        double totalPoints = 0.0;
        double score = 0.0;

        
        String Q1 = " Who is the captain of France ? : ";
        String Q2 = " Who is the captain of Argentina ? : ";
        String Q3 = " Who is the captain of South Korea ? : ";
        String Q4 = " Who is the captain of Senegal ? : ";

        String playAgain = "";

        /** . Convey a ‘welcome’ message. **/
        System.out.println(" Welcome to Bryan's World Cup quiz ");
        System.out.println(" This quiz consists of four questions going in order from easiest to hardest ");
        System.out.println(" The answer is either going to be A, B, C and and H or h will be used for a hint ");
        System.out.println(" Goodluck and Enjoy!!! ");

        /** . Clear the screen **/

        System.out.println(" Press return to continue ");
        scan.nextLine();
        System.out.print("\f");

        /** . Ask user the first question of the quiz while displaying the three possible answers **/

        System.out.println(" Question 1 ");
        do
        {
            score = 0;
            do
            {
                amountOfTries = amountOfTries + 1;
                System.out.println( Q1 );
                System.out.println(" A) Mbappe ");
                System.out.println(" B) Pogba " );
                System.out.println(" C) Lloris " );
                System.out.println(" D) Benzema " );
                System.out.println(" H) or h) Hint " );

                answer1 = scan.nextLine();

                if (answer1.equalsIgnoreCase("c"))
                {   // + 3 points and display a "correct" message if user picks c 
                    System.out.println(" CORRECT :) " );
                    System.out.println(" + 3.0 points ");
                    score = score + 3.0;
                    totalPoints = totalPoints + 3.0;
                    rightAnswers = rightAnswers + 1;
                }
                else if(answer1.equalsIgnoreCase("a") || answer1.equalsIgnoreCase ("b") || answer1.equalsIgnoreCase ("d"))
                {   // - 1 points and display a "wrong message if user picks wrong answer 
                    System.out.println(" NOPE, unlucky :( " );
                    System.out.println(" - 1.0  points ");
                    score = score - 1.0;
                    totalPoints = totalPoints - 1.0;
                    wrongAnswers = wrongAnswers + 1;
                }
                else if (answer1.equalsIgnoreCase("h"))
                {   //press h to bring out the hint option
                    System.out.println(" A) Mbappe ");
                    System.out.println(" B) Pogba " );
                    System.out.println(" C) Lloris " );
                    System.out.println(" D) Benzema " );
                    System.out.println(" He plays for Spurs " );    
                    answer1 = scan.nextLine();

                    if (answer1.equalsIgnoreCase("c"))
                    {   // + 2.5 points and display a "correct" message if user picks c
                        System.out.println("CORRECT :)");
                        System.out.println(" + 0.5 points ");
                        score = score + 0.5;
                        totalPoints = totalPoints + 0.5;
                        rightAnswers = rightAnswers + 1;
                    }
                    else if (answer1.equalsIgnoreCase("a") || answer1.equalsIgnoreCase("b") || answer1.equalsIgnoreCase("d"))
                    {   // - 1 points and display a "wrong message if user picks wrong answer 
                        System.out.println("NOPE, unlucky :(");
                        System.out.println(" - 1.0 points " );
                        score = score - 1.0;
                        totalPoints = totalPoints - 1.0;
                        wrongAnswers = wrongAnswers - 1;
                    }
                    else
                    {   // if user picks an invalid answer display 'error' message
                        System.out.println( "ERROR, please choose a valid answer (A, B, C, D or H/h) ");
                    }
                }
                else
                {   // if user picks an invalid answer display 'error' message
                    System.out.println( "ERROR, please choose a valid answer (A, B, C, D or H/h) ");
                }
                // if user picks an invalid answer the question is asked again until they pick either a, b, c, d, or h 
                // and an "invalid" message is displayed
            }while(!answer1.equalsIgnoreCase ("a") && !answer1.equalsIgnoreCase("b") && !answer1.equalsIgnoreCase 
            ("c") && !answer1.equalsIgnoreCase ("d") && !answer1.equalsIgnoreCase ("h"));
            
            /** . Clear the screen **/        
            System.out.println(" Press return to continue ");
            scan.nextLine();
            System.out.print("\f");

            /** . Ask user the second question of the quiz while displaying the three possible answers **/ 

            System.out.println(" Question 2 : " );

            do
            {
                System.out.println( Q2 );
                System.out.println(" A) Messi ");
                System.out.println(" B) Di Maria " );
                System.out.println(" C) Martinez " );
                System.out.println(" D) Lo Celso " );
                System.out.println(" H) or h) Hint " );
                System.out.println(" Your score is " + score );

                answer2 = scan.nextLine();

                if (answer2.equalsIgnoreCase("a"))
                {   // + 3 points and display a "correct" message if user picks a **/
                    System.out.println(" CORRECT :) " );
                    System.out.println(" + 3.0 points ");
                    score =score + 3.0;
                    totalPoints = totalPoints + 3.0;
                    rightAnswers = rightAnswers + 1;
                }
                else if (answer2.equalsIgnoreCase("c") || answer2.equalsIgnoreCase ("b") || answer2.equalsIgnoreCase ("d"))
                {   // - 1 points and display a "wrong message if user picks wrong answer 
                    System.out.println(" NOPE, unlucky :( " );
                    System.out.println(" - 1.0  points ");
                    score = score - 1.0;
                    totalPoints = totalPoints - 1.0;
                    wrongAnswers = wrongAnswers + 1;
                }
                else if (answer2.equalsIgnoreCase("h"))
                {   //press h to bring out the hint option
                    System.out.println(" A) Messi ");
                    System.out.println(" B) Di Maria " );
                    System.out.println(" C) Martinez " );
                    System.out.println(" D) Lo Celso " );
                    System.out.println("He wears number 10");
                    answer2 = scan.nextLine();

                    if (answer2.equalsIgnoreCase("a"))
                    {   // + 2.5 points and display a "correct" message if user picks a
                        System.out.println(" CORRECT:) ");
                        System.out.println(" + 0.5 ");
                        score = score + 0.5;
                        totalPoints = totalPoints + 0.5;
                        rightAnswers = rightAnswers +1;
                    }   
                    else if (answer2.equalsIgnoreCase("c") || answer2.equalsIgnoreCase("b") || answer2.equalsIgnoreCase("d"))
                    {   // - 1 points and display a "wrong message if user picks wrong answer 
                        System.out.println(" NOPE, unlucky :( " );
                        System.out.println(" - 1.0  points ");
                        score = score - 1.0;
                        totalPoints = totalPoints - 1.0;
                        wrongAnswers = wrongAnswers + 1;
                    }
                    else
                    {   // if user picks an invalid answer display 'error' message
                        System.out.println( "ERROR, please choose a valid answer (A, B, C, D or H/h) ");
                    }
                }
                else
                {   // if user picks an invalid answer display 'error' message
                    System.out.println( "ERROR, please choose a valid answer (A, B, C, D or H/h) ");
                }
                // if user picks an invalid answer the question is asked again until they pick either a, b, c, d, or h 
                // and an "invalid" message is displayed
            }while(!answer2.equalsIgnoreCase("a") && !answer2.equalsIgnoreCase ("c") && !answer2.equalsIgnoreCase ("b") 
            && !answer2.equalsIgnoreCase ("d") && !answer2.equalsIgnoreCase("h"));
            
            /** . Clear the screen **/            

            System.out.println(" Press return to continue ");
            scan.nextLine();
            System.out.print("\f");

            /** . Ask user the third question of the quiz while displaying the three possible answers **/ 

            System.out.println(" Question 3 ");        

            do
            {
                System.out.println( Q3 );
                System.out.println(" A) Son Heung-Min ");
                System.out.println(" B) Son Jon Ho " );
                System.out.println(" C) Kim Min-Jae " );
                System.out.println(" D) Kim Tae-Hwan " );
                System.out.println(" H) or h) Hint " );
                System.out.println(" Your score is " + score );

                answer3 = scan.nextLine();

                if (answer3.equalsIgnoreCase("a"))
                {   // + 3 points and display a "correct" message if user picks a **/
                    System.out.println(" CORRECT :) " );
                    System.out.println(" + 3.0 points ");
                    score = score + 3.0;
                    totalPoints = totalPoints + 3.0;
                    rightAnswers = rightAnswers + 1;
                }
                else if(answer3.equalsIgnoreCase("c") || answer3.equalsIgnoreCase ("b") || answer3.equalsIgnoreCase ("d"))
                {  // - 1 points and display a "wrong message if user picks wrong answer 
                    System.out.println(" NOPE, unlucky :( " );
                    System.out.println(" - 1.0  points ");
                    score = score - 1.0;
                    totalPoints = totalPoints - 1.0;
                    wrongAnswers = wrongAnswers + 1;
                }
                    else if (answer3.equalsIgnoreCase("h"))
                {   //press h to bring out the hint option
                        System.out.println(" A) Son Heung-Min ");
                        System.out.println(" B) Son Jon Ho " );
                        System.out.println(" C) Kim Min-Jae " );
                        System.out.println(" D) Kim Tae-Hwan " );
                        System.out.println("He plays with the captain of France");
                        answer3 = scan.nextLine();
                    if (answer3.equalsIgnoreCase("a"))
                    {   // + 2.5 points and display a "correct" message if user picks a
                        System.out.println(" CORRECT:) ");
                        System.out.println(" + 0.5 ");
                        score = score + 0.5;
                        totalPoints = totalPoints + 0.5;
                        rightAnswers = rightAnswers +1;
                    }
                    else if (answer3.equalsIgnoreCase("c") || answer3.equalsIgnoreCase("b") || answer3.equalsIgnoreCase("d"))
                    {   // - 1 points and display a "wrong message if user picks wrong answer 
                        System.out.println(" NOPE, unlucky :( " );
                        System.out.println(" - 1.0  points ");
                        score = score - 1.0;
                        totalPoints = totalPoints - 1.0;
                        wrongAnswers = wrongAnswers + 1;
                    }
                    else 
                    {   // if user picks an invalid answer display 'error' message
                        System.out.println( "ERROR, please choose a valid answer (A, B, C, D or H/h) ");
                    }
                }
                else
                {       // if user picks an invalid answer display 'error' message
                        System.out.println( "ERROR, please choose a valid answer (A, B, C, D or H/h) ");
                }
                // if user picks an invalid answer the question is asked again until they pick either a, b, c, d, or h 
                // and an "invalid" message is displayed
            }while(!answer3.equalsIgnoreCase("a") && !answer3.equalsIgnoreCase ("c") && !answer3.equalsIgnoreCase ("b") 
            && !answer3.equalsIgnoreCase ("d"));
            
            /** . Clear the screen **/

            System.out.println(" Press return to continue ");
            scan.nextLine();
            System.out.print("\f");

            /** . Ask user the fourth question of the quiz while displaying the three possible answers **/ 

            System.out.println(" Question 4 ");            

            do
            {
                System.out.println( Q4 );
                System.out.println(" A) Gueye ");
                System.out.println(" B) Koulibaly " );
                System.out.println(" C) Mendy " );
                System.out.println(" D) Mane " );
                System.out.println(" H) or h) Hint " );
                System.out.println(" Your score is " + score );

                answer4 = scan.nextLine();

                if (answer4.equalsIgnoreCase("d"))
                {   // + 3 points and display a "correct" message if user picks d
                    System.out.println(" CORRECT :) " );
                    System.out.println(" + 3.0 points ");
                    score = score + 3.0;
                    totalPoints = totalPoints + 3.0;
                    rightAnswers = rightAnswers + 1;
                }
                else if(answer4.equalsIgnoreCase("c") || answer4.equalsIgnoreCase ("b") || answer4.equalsIgnoreCase ("a"))
                {   // - 1 points and display a "wrong message if user picks wrong answer 
                    System.out.println(" NOPE, unlucky :( " );
                    System.out.println(" - 1.0  points ");
                    score = score - 1.0;
                    totalPoints = totalPoints - 1.0;
                    wrongAnswers = wrongAnswers + 1;
                }
                
                    else if (answer4.equalsIgnoreCase("h"))
                {   //press h to bring out the hint option
                        System.out.println(" A) Gueye ");
                        System.out.println(" B) Koulibaly " );
                        System.out.println(" C) Mendy " );
                        System.out.println(" D) Mane " );
                        System.out.println("He recently signed for Bayern Munich");
                        answer4 = scan.nextLine();
                    
                    if (answer4.equalsIgnoreCase("d"))
                    {   // + 2.5 points and display a "correct" message if user picks d 
                        System.out.println(" CORRECT:) ");
                        System.out.println(" + 0.5 ");
                        score = score + 0.5;
                        totalPoints = totalPoints + 0.5;
                        rightAnswers = rightAnswers +1;
                    }
                    else if (answer4.equalsIgnoreCase("c") || answer4.equalsIgnoreCase("b") || answer4.equalsIgnoreCase("a"))
                    {   // - 1 points and display a "wrong message if user picks wrong answer 
                        System.out.println(" NOPE, unlucky :( " );
                        System.out.println(" - 1.0  points ");
                        score = score - 1.0;
                        totalPoints = totalPoints - 1.0;
                        wrongAnswers = wrongAnswers + 1;
                    }
                    else 
                    {   // if user picks an invalid answer display 'error' message
                        System.out.println( "ERROR, please choose a valid answer (A, B, C, D or H/h) ");
                    }
                }
                else
                {       // if user picks an invalid answer display 'error' message
                        System.out.println( "ERROR, please choose a valid answer (A, B, C, D or H/h) "); 
                }
                System.out.println(" Your total score is " + score + "/12, well done ");
                // if user picks an invalid answer the question is asked again until they pick either a, b, c, d, or h 
                // and an "invalid" message is displayed
            }while(!answer4.equalsIgnoreCase("a") && !answer4.equalsIgnoreCase ("c") && !answer4.equalsIgnoreCase ("b") 
            && !answer4.equalsIgnoreCase ("d"));
            
            /** retry quiz **/

            System.out.println(" Do you want to retry the quiz?????? (Y/N) ");
            playAgain = scan.nextLine();
            if(playAgain.equalsIgnoreCase("Y"));
            {
                score = score ;
            }
        }while(playAgain.equalsIgnoreCase("y"));
        
        System.out.println(" Press return to continue ");
        scan.nextLine();
        
        System.out.print("\f");
        /** .  End **/
        
        System.out.println(" You got " + rightAnswers + " answers right ");
        System.out.println(" You got " + wrongAnswers + " answers wrong ");
        
        int totalQuestionsAnswered = rightAnswers + wrongAnswers;
        System.out.println(" You answered " + totalQuestionsAnswered + " questions alltogether ");
        System.out.println( " You had a total of " + amountOfTries + " attempts ");
        
        double percentage = rightAnswers*100/totalQuestionsAnswered;
        System.out.println(" You scored " + percentage + "%");
        
        System.out.println(" Your total score over all games is " + totalPoints );
        
        if(percentage >= 85 )
        {
            System.out.println(" Grade : A ");
        }
        else if(percentage >= 70)
        {
            System.out.println(" Grade : B ");
        }
        else if(percentage >= 65)
        {
            System.out.println(" Grade : C ");
        }
        else if(percentage >= 50)
        {
            System.out.println(" Grade : D ");
        }
        else if(percentage <= 49)
        {
            System.out.println(" Grade : F ");
        }
        
        System.out.println(" Press return to continue ");
        scan.nextLine();
        System.out.print("\f");        
    }
}
