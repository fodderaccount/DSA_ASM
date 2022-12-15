import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Queue QuestionQ = new Queue();
        Queue AnswerQ = new Queue();

        int option = 0;

        System.out.println("Welcome to Q and A session");
        System.out.println("You will provide your name and a question and our customer support staff will answer");
        System.out.println("Your message limit is 250 character per message");

        mainmemu: do {
            mainmenu();
            option = option();
            switch (option) {
                case 1:
                    do {
                        usermenu();
                        option = option();
                        switch (option) {
                            case 1:
                                Message mess= inputMessage();
                                QuestionQ.enqueue(new Node(mess));

                                break;
                            case 2:
                                QuestionQ.print();
                                AnswerQ.print();
                                break;
                            case 3:
                                continue mainmemu;

                            default:
                                if (option != 0) {
                                    System.out.println("Please enter the number of the function!");
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("");
                                } else {
                                    System.out.println("End Session");
                                }

                                break;

                        }
                    } while (option != 0);

                    break;
                case 2:
                    do {
                        staftmenu();

                        option = option();
                        switch (option) {
                            case 1:
                            Message mess= inputMessage();
                            AnswerQ.enqueue(new Node(mess));

                                break;
                            case 2:
                            QuestionQ.dequeue();
                            System.out.println("Success");
                            System.out.println("Question queue");
                            QuestionQ.print();
                                break;
                            case 3:
                            AnswerQ.dequeue();
                            System.out.println("Success");
                            System.out.println("Answer queue");
                            AnswerQ.print();

                                break;
                            case 4:
                                continue mainmemu;

                            default:
                                if (option != 0) {
                                    System.out.println("Please enter the number of the function!");
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("");
                                } else {
                                    System.out.println("End Session");
                                }

                                break;

                        }
                        

                    } while (option != 0);
                    break;
                default:
                    System.out.println("Please enter the number of the function!");
                    System.out.println("-----------------------------------------------");
                    System.out.println("");

            }

        } while (option != 0);
    }

    public static void mainmenu() {

        System.out.println("--------------------------");
        System.out.println("1. UserSession");
        System.out.println("2. StaffSession");
        System.out.println("3. Exit");
        System.out.println("");

    }

    public static void usermenu() {
        System.out.println("--------------------------");
        System.out.println("1. Ask Question");
        System.out.println("2. Show FAQ");
        System.out.println("3. Back");
        System.out.println("");
    }

    public static void staftmenu() {
        System.out.println("--------------------------");
        System.out.println("1. Answer FAQ");
        System.out.println("2. Remove Question");
        System.out.println("3. Remove Answer");
        System.out.println("4. Back");
        System.out.println("");
    }

    public static boolean isLimit(String str) {
        char[] charArr = str.toCharArray();
        if (charArr.length <= 250) {
            return true;
        } else {
            return false;
        }
    }

    public static int option() {
        boolean check = true;
        int temp = 0;
        do {
            System.out.println("Select option: ");

            try {
                temp = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("please enter correct input");
                sc.next();
            }
        } while (check);

        return temp;
    }

    public static Message inputMessage() {

        Message mess = new Message();
        System.out.println("Enter your name:");
        sc.nextLine();
        
        String tempName = sc.nextLine();
        mess.setSender(tempName);
        System.out.println("Type your Question:");
        String tempStr = sc.nextLine();

        while (!isLimit(tempStr)) {
            System.out.println("Message length exceed 250 chars, please try again");
            System.out.println("Type your Question:");
            tempStr = sc.nextLine();
        }
        mess.setMessage(tempStr);
        return mess;

    }
}
