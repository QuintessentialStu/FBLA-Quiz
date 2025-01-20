import java.util.Scanner; //Lets the program take user input
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class FBLA_Quiz_Runner{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    Question q1 = new Question("MC","What are the three levels of competiton? \n A. Chapter, Reigonals, Worlds \n B. Reigonals, States, Nationals \n C. Worlds, Galaxy, Universe \n D. Districts, States, World", "b");

    Question q2 = new Question("MC","What does FBLA stand for? \n A. Future Bussines Leaders of Argintenia \n B. Featured Boats of Lake Albert \n C. Football Blockers of Los Angeles \n D. Future Business Leaders of America", "d");
    
    Question q3 = new Question("MC","Who is the National President of FBLA? \n A. Stuart O'Connor \n B. Kianna Bolante \n C. Drew Lojewski \n D. Hana Le", "c");

    Question q4 = new Question("TF","Hana Le is the National Secretary for FBLA, True or False", "true");

    Question q5 = new Question("TF","Haneol Lee is the Vice President of FBLA, True or False", "false");

    Question q6 = new Question("MC","Who is the National Parliamentarian? \n A. Hana Le \n B. Stuart O'Connor \n C. Kianna Bolante \n D. Drew Lojewski", "c");

    Question q7 = new Question("TF","Andrew Fox is the Vice President of the Northeastern Region, True of False","false");

    Question q8 = new Question("TF","The Vice President of the Mountains Plains Region is Kaylie Reese, True or False","true");

    Question q9 = new Question("TF","Rhea Mehta is the Vice President of the Southern Region, True or False","false");

    Question q10 = new Question("TF","The Vice President of the Southern Region is Maria Manabat, True of False","true");
    
    Question q11 = new Question("TF","The Vice President of the Western Region is Sachin Sundar, True or False","true");

    Question q12 = new Question("M","Match the national officers' name to their position. \n A. Drew Lojewski        1. Eastern Region VP \n B. Haneol Lee        2. National President \n C. Hana Le        3. Mountain Plains Region VP \n D. Kianna Bolante        4. Southern Region VP \n E. Maria Manabat        5. Western Region VP\n F. Sachin Sundar        6. National Secretary \n G. Kaylie Reese        7. National Parliamentarian\n H. Andrew Fox        8. North Central Region VP \n I. Rhea Mehta        9. National Treasurer", "A2, B9, C6, D7, E4, F5, G3, H1, I8");

    Question q13 = new Question("MC","Who founded FBLA? \n A. Hamden L. Forkner \n B. Paul Revere \n C. Elon Musk \n D. Troy Aikman", "a");

    Question q14 = new Question("Fill","Washington DC is apart of what region? (Put region after the answer. Ex ________ Region)","Eastern Region");

    Question q15 = new Question("Fill","Texas is apart of what region? (Put region after the answer. Ex ________ Region)","Mountain Plains Region");

    Question q16 = new Question("Fill","Arkansas is apart of what region? (Put region after the answer. Ex ________ Region)","Southern Region");

    Question q17 = new Question("Fill","California is apart of what region? (Put region after the answer. Ex ________ Region)","Western Region");

    Question q18 = new Question("Fill","Illinois is apart of what region? (Put region after the answer. Ex ________ Region)","North Central Region");

    Question q19 = new Question("MC","What are the three types of events? \n A. Individual, Team, and Chapter \n B. Individual, Chapter, Region \n C. Chapter, State, Worlds \n D. Individual, State, Country","a");

    Question q20 = new Question("TF","FBLA provides schollarships to colleges, True or False","true");

    Question q21 = new Question("MC","How many members does FBLA have? \n A. About 444,000 \n B. About 10 \n C. About 1,000 \n D. About 250,000","d");

    Question q22 = new Question("M","Match the grade levels to the percentage of members for each particular grade. \n A. 9th grade        1. 25% \n B. 10th grade        2. 29% \n C. 11th grade        3. 28% \n D. 12th grade       4. 18%","A4, B1, C3, D2");

    Question q23 = new Question("Fill","Where was FBLA's first state chapter?","Iowa");

    Question q24 = new Question("Fill","How many years has FBLA been partnered with March of Dimes?","40");

    Question q25 = new Question("MC","When was FBLA established? \n A. 1955 \n B. 1976 \n C. 1932 \n D. 1940","d");

    Question q26 = new Question("TF","FBLA is one of the smallest student run organisations in the nation, True or False","false");

    Question q27 = new Question("MC","What city in Tenessee is FBLA's first local chapter? \n A. Nashville \n B. Johnson City \n C. Memphis \n D. Knoxville","b");

    Question q28 = new Question("TF","There are more females in FBLA than males, True or False","true");

    Question q29 = new Question("M","Match the four divisions of FBLA to the age groups they represent. \n A. PBL        1. High School \n B. Professional        2. College \n C. FBLA Middle        3. Mentors \n D. FBLA        4. Middle School","A2, B3, C4, D1");

    Question q30 = new Question("MC","How many states have members in FBLA? \n A. 10 \n B. 25 \n C. 47 \n D. 70","c");

    Question q31 = new Question("MC","About how many events does FBLA offer? \n A. 10 \n B. 25 \n C. 47 \n D. 70","d");

    Question q32 = new Question("MC","Where is FBLA headquartered? \n A. Houston, TX \n B. San Fransisco, CA \n C. Reston, VA \n D. Greenville, NC","c");

    Question q33 = new Question("Fill","What's the year of the dedication/grand opening of the FBL-PBL National Center?","1991");

    Question q34 = new Question("Fill","How many national officers can be elected from one state?","1");

    Question q35 = new Question("Fill","How many stanzas are in the FBLA-PBL creed?","7");

    Question q36 = new Question("MC","What are the official colors of FBLA? \n A. Purple and Gold \n B. Blue and Black \n C. Blue and Gold \n Red and White","c");

    Question q37 = new Question("TF","National Education for Business month is April, True or False","false");

    Question q38 = new Question("MC","How long does the FBLA-PBL Board of Directors chairmen serve in that office? \n A. 2 years \n B. 1 year \n C. 4 years \n D. Lifetime","b");

    Question q39 = new Question("MC","How is FBLA primarily funded? \n A. Dues \n B. Taxes \n C. Donations \n D. Sponsorships","a");

    Question q40 = new Question("Fill","What is the minimum of active chapters required in order for a state to be issued a state chapter?","5");

    Question q41 = new Question("Fill","How many FBLA goals are there?","9");

    Question q42 = new Question("MC","The first FBLA NLC was held where? \n A. Chicago, Illinois \n B. New York, New York \n C. Las Vegas \n D. Houston Texas","a");

    Question q43 = new Question("MC","The first FBLA NLC was held when? \n A. 1912 \n B. 2020 \n C. 1976 \n D. 1952","1952 d");

    Question q44 = new Question("TF","FBLA gained independent status in 1969, True or False","true");

    Question q45 = new Question("MC","Who determines the cost of National Dues? \n A. The White House \n B. National Board of Directors \n C. The FBLA National President \n D. The FBLA National Secretary","b");

    Question q46 = new Question("MC","How much does the charter cost to activate/reactivate a chapter? \n A. $444 \n B. $5 \n C. $20 \n D. $95","c");

    Question q47 = new Question("Fill","How many members must you recruit to be recognized for Membership Madness?","5");

    Question q48 = new Question("Fill","How many members must you recruit to be recognized for Membership Mania?","10");

    Question q49 = new Question("MC","How many publications are published by FBLA-PBL? \n A. 3 \n D. 1 \n D. 4 \n D. 5","d");

    Question q50 = new Question("TF","The two words are repeated throughout the FBLA-PBL Creed are I believe, True or False","true");

    //This is the array with all the questions in it
    Question[] Question_Pool = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26, q27, q28, q29, q30, q31, q32, q33, q34, q35, q36, q37, q38, q39, q40, q41, q42, q43, q44, q45, q46, q47, q48, q49, q50};
    
    String retake_answer = "Yes";
    while(!retake_answer.equals("no"))
    {
      System.out.println("What is your first and last name?");
      String name = scan.nextLine();
      System.out.print("Hello " + name + ", ");
      //Shows the user the correct way to answer the questions
      System.out.println("Before you start, this is how you will answer the questions. \n For multiple choise, just put the letter. \n Example 1: \"A\" is correct, \"A. I am a member\" is not correct. \n For matching questions, put the letter first and then the number, and space the letter and number combinations with a comma in alphabetical order. \n Example 2: \"A1, B2\" is correct, \"b 2, a 1\" is not correct");

      //Askes the user if they are ready and understandes how to mark their answers correctly
      String ready_ques = "";
      while(!ready_ques.equals("yes"))
      {
        System.out.println("Do you understand the rules and are you ready to take the test?");
        ready_ques = scan.nextLine();
        ready_ques = ready_ques.toLowerCase();
        if(!ready_ques.equals("yes") && !ready_ques.equals("no"))
        {
          System.out.println("ERROR, INVALID INPUT");
        }
        if(ready_ques.equals("no"))
        {
          System.out.println("OK, take your time and fully understand the rules of the quiz.");
        }
      }
        
      if(ready_ques.equals("yes"))
      {
        //Puts the random numbers into variables
        int randomQuestion1 = (int) (Math.random() * 50) + 1;
        int randomQuestion2 = (int) (Math.random() * 50) + 1;
        int randomQuestion3 = (int) (Math.random() * 50) + 1;
        int randomQuestion4 = (int) (Math.random() * 50) + 1;
        int randomQuestion5 = (int) (Math.random() * 50) + 1;
            
        //Compares all the questions, if any of them have the same number they are all given new numbers
        while(randomQuestion1 == randomQuestion2 || randomQuestion1 == randomQuestion3 || randomQuestion1 == randomQuestion4 
          || randomQuestion1 == randomQuestion5 || randomQuestion2 == randomQuestion3 || randomQuestion2 == randomQuestion4 
          || randomQuestion2 == randomQuestion5 || randomQuestion3 == randomQuestion4 || randomQuestion3 == randomQuestion5 
          || randomQuestion4 == randomQuestion5)
        {
          randomQuestion1 = (int) (Math.random() * 50) + 1;
          randomQuestion2 = (int) (Math.random() * 50) + 1;
          randomQuestion3 = (int) (Math.random() * 50) + 1;
          randomQuestion4 = (int) (Math.random() * 50) + 1;
          randomQuestion5 = (int) (Math.random() * 50) + 1;
        }

          int MC_count = 0;
          int MC_correct_count = 0;
          int M_count = 0;
          int M_correct_count = 0;
          int TF_count = 0;
          int TF_correct_count = 0;
          int Fill_count = 0;
          int Fill_correct_count = 0;
          int Total_correct_count = 0;
          //Calls the 1st question from the array, gets the type of question and prints the question to the user
          System.out.println("1. " + Question_Pool[randomQuestion1]);
          String Q1type = Question_Pool[randomQuestion1].getType();
          if(Q1type.equals("MC"))
          {
            MC_count++;
          }
          else if(Q1type.equals("TF"))
          {
            TF_count++;
          }
          else if(Q1type.equals("M"))
          {
            M_count++;
          }
          else if(Q1type.equals("Fill"))
          {
            Fill_count++;
          }
          //Allows the user to answer the question and makes sure it is entered correctly
          String answer_qustion1 = "";
          String valid1 = "No";
          while(!valid1.equals("Yes"))
          {
            answer_qustion1 = scan.nextLine();
            answer_qustion1 = answer_qustion1.toLowerCase();
            if(Q1type.equals("MC") && (answer_qustion1.equals("a") || answer_qustion1.equals("b") || answer_qustion1.equals("c") || answer_qustion1.equals("d")))
            {
              valid1 = "Yes";
            }
            else if(Q1type.equals("TF") && (answer_qustion1.equals("true") || answer_qustion1.equals("false")))
            {
              valid1 = "Yes";
            }
            else if(Q1type.equals("M") && answer_qustion1.substring(0, 1).equals("A"))
            {
              valid1 = "Yes";
            }
            else if(Q1type.equals("Fill"))
            {
              valid1 = "Yes";
            }
            else
            {
              System.out.println("ERROR, INVALID INPUT. REMEMBER THE DIRECTIONS ON HOW TO ANSWER EACH QUESTION");
            }
          }
          //Compares user's answer to correct answer, if correct, the question is labeled correct, and the amount of questions answered correct goes up by 1
          boolean q1correct = false;
          if(Question_Pool[randomQuestion1].isCorrect(answer_qustion1) == true)
          {
            q1correct = true;
            Total_correct_count++;
            if(Q1type.equals("MC"))
              {
                MC_correct_count++;
              }
              else if(Q1type.equals("TF"))
              {
                TF_correct_count++;
              }
              else if(Q1type.equals("M"))
              {
                M_correct_count++;
              }
              else if(Q1type.equals("Fill"))
              {
                Fill_correct_count++;
              }
          }

          //Calls the 2nd question from the array, gets the type of question and prints the question to the user
          System.out.println("2. " + Question_Pool[randomQuestion2]);
          String Q2type = Question_Pool[randomQuestion2].getType();
          if(Q2type.equals("MC"))
          {
            MC_count++;
          }
          else if(Q2type.equals("TF"))
          {
            TF_count++;
          }
          else if(Q2type.equals("M"))
          {
            M_count++;
          }
          else if(Q2type.equals("Fill"))
          {
            Fill_count++;
          }
          //Allows the user to answer the question and makes sure it is entered correctly
          String answer_qustion2 = "";
          String valid2 = "No";
          while(!valid2.equals("Yes"))
          {
            answer_qustion2 = scan.nextLine();
            answer_qustion2 = answer_qustion2.toLowerCase();
            if(Q2type.equals("MC") && (answer_qustion2.equals("a") || answer_qustion2.equals("b") || answer_qustion2.equals("c") || answer_qustion2.equals("d")))
            {
              valid2 = "Yes";
            }
            else if(Q2type.equals("TF") && (answer_qustion2.equals("true") || answer_qustion2.equals("false")))
            {
              valid2 = "Yes";
            }
            else if(Q2type.equals("M") && answer_qustion2.substring(0, 1).equals("A"))
            {
              valid2 = "Yes";
            }
            else if(Q2type.equals("Fill"))
            {
              valid2 = "Yes";
            }
            else
            {
              System.out.println("ERROR, INVALID INPUT. REMEMBER THE DIRECTIONS ON HOW TO ANSWER EACH QUESTION");
            }
            //Compares user's answer to correct answer, if correct, the question is labeled correct, and the amount of questions answered correct goes up by 1
            boolean q2correct = false;
            if(Question_Pool[randomQuestion2].isCorrect(answer_qustion2) == true)
            {
              q2correct = true;
              Total_correct_count++;
              if(Q2type.equals("MC"))
              {
                MC_correct_count++;
              }
              else if(Q2type.equals("TF"))
              {
                TF_correct_count++;
              }
              else if(Q2type.equals("M"))
              {
                M_correct_count++;
              }
              else if(Q2type.equals("Fill"))
              {
                Fill_correct_count++;
              }
            }
            
            //Calls the 3rd question from the array, gets the type of question and prints the question to the user
            System.out.println("3. " + Question_Pool[randomQuestion3]);
            String Q3type = Question_Pool[randomQuestion3].getType();
            if(Q3type.equals("MC"))
            {
              MC_count++;
            }
            else if(Q3type.equals("TF"))
            {
              TF_count++;
            }
            else if(Q3type.equals("M"))
            {
              M_count++;
            }
            else if(Q3type.equals("Fill"))
            {
              Fill_count++;
            }
            //Allows the user to answer the question and makes sure it is entered correctly
            String answer_qustion3 = "";
            String valid3 = "No";
            while(!valid3.equals("Yes"))
            {
              answer_qustion3 = scan.nextLine();
              answer_qustion3 = answer_qustion3.toLowerCase();
              if(Q3type.equals("MC") && (answer_qustion3.equals("a") || answer_qustion3.equals("b") || answer_qustion3.equals("c") || answer_qustion3.equals("d")))
              {
                valid3 = "Yes";
              }
              else if(Q3type.equals("TF") && (answer_qustion3.equals("true") || answer_qustion3.equals("false")))
              {
                valid3 = "Yes";
              }
              else if(Q3type.equals("M") && answer_qustion3.substring(0,1).equals("A"))
              {
                valid3 = "Yes";
              }
              else if(Q3type.equals("Fill"))
              {
                valid3 = "Yes";
              }
              else
              {
                System.out.println("ERROR, INVALID INPUT. REMEMBER THE DIRECTIONS ON HOW TO ANSWER EACH QUESTION");
              }
            }
            //Compares user's answer to correct answer, if correct, the question is labeled correct, and the amount of questions answered correct goes up by 1
            boolean q3correct = false;
            if(Question_Pool[randomQuestion3].isCorrect(answer_qustion3) == true)
            {
              q3correct = true;
              Total_correct_count++;
              if(Q3type.equals("MC"))
              {
                MC_correct_count++;
              }
              else if(Q3type.equals("TF"))
              {
                TF_correct_count++;
              }
              else if(Q3type.equals("M"))
              {
                M_correct_count++;
              }
              else if(Q3type.equals("Fill"))
              {
                Fill_correct_count++;
              }
            }
            
            //Calls the 4th question from the array, gets the type of question and prints the question to the user
            System.out.println("4. " + Question_Pool[randomQuestion4]);
            String Q4type = Question_Pool[randomQuestion4].getType();
            if(Q4type.equals("MC"))
            {
              MC_count++;
            }
            else if(Q4type.equals("TF"))
            {
              TF_count++;
            }
            else if(Q4type.equals("M"))
            {
              M_count++;
            }
            else if(Q4type.equals("Fill"))
            {
              Fill_count++;
            }
            //Allows the user to answer the question and makes sure it is entered correctly
            String answer_qustion4 = "";
            String valid4 = "No";
            while(!valid4.equals("Yes"))
            {
              answer_qustion4 = scan.nextLine();
              answer_qustion4 = answer_qustion4.toLowerCase();
              if(Q4type.equals("MC") && (answer_qustion4.equals("a") || answer_qustion4.equals("b") || answer_qustion4.equals("c") || answer_qustion4.equals("d")))
              {
                valid4 = "Yes";
              }
              else if(Q4type.equals("TF") && (answer_qustion4.equals("true") || answer_qustion4.equals("false")))
              {
                valid4 = "Yes";
              }
              else if(Q4type.equals("M") && answer_qustion4.substring(0, 1).equals("A"))
              {
                valid4 = "Yes";
              }
              else if(Q4type.equals("Fill"))
              {
                valid4 = "Yes";
              }
              else
              {
                System.out.println("ERROR, INVALID INPUT. REMEMBER THE DIRECTIONS ON HOW TO ANSWER EACH QUESTION");
              }
            }
            //Compares user's answer to correct answer, if correct, the question is labeled correct, and the amount of questions answered correct goes up by 1
            boolean q4correct = false;
            if(Question_Pool[randomQuestion4].isCorrect(answer_qustion4) == true)
            {
              q4correct = true;
              Total_correct_count++;
              if(Q4type.equals("MC"))
              {
                MC_correct_count++;
              }
              else if(Q4type.equals("TF"))
              {
                TF_correct_count++;
              }
              else if(Q4type.equals("M"))
              {
                M_correct_count++;
              }
              else if(Q4type.equals("Fill"))
              {
                Fill_correct_count++;
              }
            }
            
            //Calls the 5th question from the array, gets the type of question and prints the question to the user
            System.out.println("5. " + Question_Pool[randomQuestion5]);
            String Q5type = Question_Pool[randomQuestion5].getType();
            if(Q5type.equals("MC"))
            {
              MC_count++;
            }
            else if(Q5type.equals("TF"))
            {
              TF_count++;
            }
            else if(Q5type.equals("M"))
            {
              M_count++;
            }
            else if(Q5type.equals("Fill"))
            {
              Fill_count++;
            }
            //Allows the user to answer the question and makes sure it is entered correctly
            String answer_qustion5 = "";
            String valid5 = "No";
            while(!valid5.equals("Yes"))
            {
              answer_qustion5 = scan.nextLine();
              answer_qustion5 = answer_qustion5.toLowerCase();
              if(Q5type.equals("MC") && (answer_qustion5.equals("a") || answer_qustion5.equals("b") || answer_qustion5.equals("c") || answer_qustion5.equals("d")))
              {
                valid5 = "Yes";
              }
              else if(Q5type.equals("TF") && (answer_qustion5.equals("true") || answer_qustion5.equals("false")))
              {
                valid5 = "Yes";
              }
              else if(Q5type.equals("M") && answer_qustion5.substring(0, 1).equals("A"))
              {
                valid5 = "Yes";
              }
              else if(Q5type.equals("Fill"))
              {
                valid5 = "Yes";
              }
              else
              {
                System.out.println("ERROR, INVALID INPUT. REMEMBER THE DIRECTIONS ON HOW TO ANSWER EACH QUESTION");
              }
            }
            //Compares user's answer to correct answer, if correct, the question is labeled correct, and the amount of questions answered correct goes up by 1
            boolean q5correct = false;
            if(Question_Pool[randomQuestion5].isCorrect(answer_qustion5) == true)
            {
              q5correct = true;
              Total_correct_count++;
              if(Q5type.equals("MC"))
              {
                MC_correct_count++;
              }
              else if(Q5type.equals("TF"))
              {
                TF_correct_count++;
              }
              else if(Q5type.equals("M"))
              {
                M_correct_count++;
              }
              else if(Q5type.equals("Fill"))
              {
                Fill_correct_count++;
              }
            }

            System.out.println("Congratulations " + name + "! You finished the quiz. \n You got " + Total_correct_count + " correct out of 5");
            //Goes through all the questions and displays the correct answer to the User
            if(q1correct == false)
            {
              System.out.println("Im sorry, you got question number 1 wrong. The correct answer to number 1 is " + Question_Pool
              [randomQuestion1].getCorrectAnswer());
            }
            if(q2correct == false)
            {
              System.out.println("Im sorry, you got question number 2 wrong. The correct answer to number 2 is " + Question_Pool
              [randomQuestion2].getCorrectAnswer());
            }
            if(q3correct == false)
            {
              System.out.println("Im sorry, you got question number 3 wrong. The correct answer to number 3 is " + Question_Pool
              [randomQuestion3].getCorrectAnswer());
            }
            if(q4correct == false)
            {
              System.out.println("Im sorry, you got question number 4 wrong. The correct answer to number 4 is " + Question_Pool
              [randomQuestion4].getCorrectAnswer());
            }
            if(q5correct == false)
            {
              System.out.println("Im sorry, you got question number 5 wrong. The correct answer to number 5 is " + Question_Pool
              [randomQuestion5].getCorrectAnswer());
            }
            
            //makes a printable report as a .txt file
            try {
              FileWriter reportWriter = new FileWriter(name + "'s report.txt");
              reportWriter.write("Name: " + name + "\n Grade: " + Total_correct_count + " out of 5 \n Question 1 corrrect: "
                + q1correct + "\n Question 2 corrrect: " + q2correct + "\n Question 3 corrrect: "
                + q3correct + "\n Question 4 corrrect: " + q4correct + "\n Question 5 corrrect: "
                + q5correct + "\n Number of Multiple Choice Questions Answered: " + MC_count
                + "\n Number of Multiple Choice Questions Answered Correctly: " + MC_correct_count
                + "\n Number of True or False Questions Answered: " + TF_count + "\n Number of True or False Questions Answered Correctly: "
                + TF_correct_count + "\n Number of Matching Questions Answered: " + M_count
                + "\n Number of Matching Questions Answered Correctly: " + M_correct_count
                + "\n Number of Fill in the Blank Questions Answered: " + Fill_count
                + "\n Number of Fill in the Blank Questions Answered Correctly: " + Fill_correct_count);
              reportWriter.close();
              System.out.println("Succesfully made a report of the results");
            } catch (IOException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }
            
            //Asks if anyone else will be taking the quiz. If yes, the program starts over. If no, ends program
            System.out.println("");
            System.out.println("Is someone else taking the quiz?");
            retake_answer = scan.nextLine();
            retake_answer = retake_answer.toLowerCase();
          }
      } 
    } 
  }
}