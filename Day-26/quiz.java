import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class quiz{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int score;
        while (true){
            score = 0;
            System.out.println("        A Warm Welcome To The Quiz Competition        \n");
            System.out.println("READ THE FOLLOWING RULES CAREFULLY TO PLAY THE QUIZ COMPETITION:\n");
            System.out.println("1 - One point will be given for a correct answer, while one point will be deducted for an incorrect answer.");
            System.out.println("2 - Are you all set to play the quiz and test your brain?\n");
            System.out.println("Enter 1 to start the quiz, or any other number number to exit.");
            int start;
            try{
                start = in.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Exiting quiz.");
                break;
            }
            if(start != 1){
                System.out.println("Quiz exited. Goodbye!");
                break;
            }
            String[] questions = {
                "Which river flows between the Satpuras and Vindhyas?",
                "Who is the first Indian to be elected to the British Parliament?",
                "Chapchar Kut is a festival of which state?",
                "An onion is a modified form of?",
                "When was Kshetriya Gramin Bank established?",
                "Who was the flag bearer of India at Rio Olympics 2016?",
                "What is the national flower of India?",
                "Who is known as the 'Father of the Nation' in India?",
                "In which year did India gain independence?",
                "Which is the longest river in India?",
                "What is the capital of India?",
                "Who was the first President of India?",
                "Who wrote the Indian National Anthem?",
                "What is the official language of India?",
                "Which is the national animal of India?",
                "Who invented the light bulb?",
                "Who was the first man to walk on the Moon?",
                "Who developed the theory of relativity?",
                "What is the largest continent by area?",
                "What is the longest bone in the human body?",
                "Who painted the Mona Lisa?",
                "Which country is known as the Land of the Rising Sun?",
                "What is the national bird of India?",
                "Who is the founder of Microsoft?",
                "Which city is the capital of Australia?",
                "In which year was the first human flight into space?",
                "What is the atomic number of Oxygen?",
                "Which planet is known as the Red Planet?",
                "Who is the author of 'The Catcher in the Rye'?",
                "Which is the largest ocean on Earth?"
            };
            String[][] options = {
                {"1) Godavari", "2) Narmada", "3) Gandak", "4) None of these"},
                {"1) Bipin Chandra Pal", "2) Dadabhai Naoroji", "3) Lala Lajpat Rai", "4) None of these"},
                {"1) Manipur", "2) Nagaland", "3) Mizoram", "4) Meghalaya"},
                {"1) Stem", "2) Root", "3) Leaf", "4) None of these"},
                {"1) 1987", "2) 1925", "3) 1999", "4) 1975"},
                {"1) Abhinav Bindra", "2) Yogeshwar Dutt", "3) Jwala Gutta", "4) PV Sindhu"},
                {"1) Lotus", "2) Sunflower", "3) Rose", "4) Jasmine"},
                {"1) Jawaharlal Nehru", "2) Subhas Chandra Bose", "3) Mahatma Gandhi", "4) Sardar Patel"},
                {"1) 1947", "2) 1950", "3) 1937", "4) 1960"},
                {"1) Yamuna", "2) Godavari", "3) Ganges", "4) Narmada"},
                {"1) Mumbai", "2) New Delhi", "3) Bangalore", "4) Kolkata"},
                {"1) Jawaharlal Nehru", "2) Rajendra Prasad", "3) Dr. Sarvepalli Radhakrishnan", "4) Sardar Patel"},
                {"1) Mahatma Gandhi", "2) Bankim Chandra Chattopadhyay", "3) Subhas Chandra Bose", "4) Rabindranath Tagore"},
                {"1) Hindi", "2) English", "3) Tamil", "4) Bengali"},
                {"1) Lion", "2) Elephant", "3) Tiger", "4) Deer"},
                {"1) Nikola Tesla", "2) Thomas Edison", "3) Alexander Graham Bell", "4) Benjamin Franklin"},
                {"1) Neil Armstrong", "2) Buzz Aldrin", "3) Michael Collins", "4) Yuri Gagarin"},
                {"1) Isaac Newton", "2) Galileo Galilei", "3) Nikola Tesla", "4) Albert Einstein"},
                {"1) Africa", "2) Asia", "3) Europe", "4) North America"},
                {"1) Femur", "2) Tibia", "3) Radius", "4) Humerus"},
                {"1) Pablo Picasso", "2) Leonardo da Vinci", "3) Vincent van Gogh", "4) Michelangelo"},
                {"1) China", "2) South Korea", "3) Japan", "4) Thailand"},
                {"1) Peacock", "2) Sparrow", "3) Eagle", "4) Crow"},
                {"1) Bill Gates", "2) Steve Jobs", "3) Mark Zuckerberg", "4) Larry Page"},
                {"1) Sydney", "2) Melbourne", "3) Canberra", "4) Brisbane"},
                {"1) 1961", "2) 1960", "3) 1969", "4) 1971"},
                {"1) 6", "2) 8", "3) 10", "4) 16"},
                {"1) Earth", "2) Venus", "3) Mars", "4) Jupiter"},
                {"1) J.D. Salinger", "2) Harper Lee", "3) F. Scott Fitzgerald", "4) George Orwell"},
                {"1) Arctic Ocean", "2) Atlantic Ocean", "3) Indian Ocean", "4) Pacific Ocean"}
            };
            int[] correctAnswers = {
                2,2,3,1,4,1,1,3,1,3,2,2,4,1,3,2,1,4,2,1,2,3,1,1,3,1,2,3,1,4
            };
            boolean[] askedQuestions = new boolean[questions.length];
            int questionsAsked = 0;
            Random rand = new Random();
            while(questionsAsked < 20){
                int qIndex = rand.nextInt(questions.length);
                if(!askedQuestions[qIndex]){
                    askedQuestions[qIndex] = true;
                    System.out.println("Question "+(questionsAsked+1)+":");
                    score += askQuestion(in, questions[qIndex], options[qIndex], correctAnswers[qIndex]);
                    questionsAsked++;
                }
            }
            System.out.println("\nYou scored " + score + " points!");
            if (score > 15)
                System.out.println("You played the game very well! If you want to restart the quiz, enter 1, or any other number to quit.");
            else if(score > 12)
                System.out.println("Well played! If you want to restart the quiz enter 1, or any other number to quit.");
            else if(score > 9)
                System.out.println("Not bad, but you can do better! If you want to restart the quiz, enter 1, or any other number to quit.");
            else if(score > 5)
                System.out.println("Focus!!Try harder. If you want to restart the quiz, enter 1, or any other number to quit.");
            else
                System.out.println("Try again! If you want to restart the quiz, enter 1, or any other number to quit.");
            int restart;
            try{
                restart = in.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Exiting quiz.");
                break;
            }
            if(restart != 1){
                System.out.println("Thanks for playing!");
                break;
            }
        }
        in.close();
    }
    public static int askQuestion(Scanner in, String question, String[] options, int correctAnswer){
        System.out.println("\n" + question);
        for(int i=0;i<options.length;i++)
            System.out.println(options[i]);
        System.out.println("\nSelect your answer (1-4):");
        int answer;
        try{
            answer = in.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. -1 point.");
            in.nextLine();
            for(int a=0;a<60;a++)
            System.out.print("*");
            System.out.println();
            return -1;
        }
        if(answer == correctAnswer){
            System.out.println("Correct answer! +1 point");
            for(int a=0;a<60;a++)
            System.out.print("*");
            System.out.println();
            return 1;
        }
        else{
            System.out.println("Wrong answer. -1 point");
            for(int a=0;a<60;a++)
            System.out.print("*");
            System.out.println();
            return -1;
        }
    }
}
