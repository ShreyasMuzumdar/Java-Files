import java.util.*;

public class GuessWho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inpStr = "No";
        int numofQuestions = 0;

        System.out.println("Does your person have white hair and/or red hair and/or glasses?");
        inpStr = input.next();
        numofQuestions++;
        if (inpStr.equals("Yes")) {
            System.out.println("Is your person wearing a hat and/or glasses?");
            inpStr = input.next();
            numofQuestions++;
            if (inpStr.equals("Yes")) {
                System.out.println("Is your person have hair on the top of their head and/or have white hair?");
                inpStr = input.next();
                numofQuestions++;
                if (inpStr.equals("Yes")) {
                    System.out.println("Does you person have white hair?");
                    inpStr = input.next();
                    numofQuestions++;
                    if (inpStr.equals("Yes")) {
                        System.out.println("Your person is Paul");
                    } else if (inpStr.equals("No")) {
                        System.out.println("Does your person have the first letter of their name start with an S?");
                        inpStr = input.next();
                        numofQuestions++;
                        if (inpStr.equals("Yes")) {
                            System.out.println("Your person is Sam");
                        } else if (inpStr.equals("No")) {
                            System.out.println("Your person is Tom");
                        } else {
                            System.out.println("error");
                        }
                    } else {
                        System.out.println("error");
                    }

                } else if (inpStr.equals("No")) {
                    System.out.println("Is your person wearing a hat?");
                    inpStr = input.next();
                    numofQuestions++;
                    if (inpStr.equals("Yes")) {
                        System.out.println("Is your person a male?");
                        inpStr = input.next();
                        numofQuestions++;
                        if (inpStr.equals("Yes")) {
                            System.out.println("Your person is George");
                        } else if (inpStr.equals("No")) {
                            System.out.println("Your person is Claire");
                        } else {
                            System.out.println("error");
                        }
                    } else if (inpStr.equals("No")) {
                        System.out.println("Your person is Joe");
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }

            } else if (inpStr.equals("No")) {
                System.out.println("Does your person have white hair and/or have rosy/red cheeks?");
                inpStr = input.next();
                numofQuestions++;
                if (inpStr.equals("Yes")) {
                    System.out.println("Does your person have rosy/red cheeks?");
                    inpStr = input.next();
                    numofQuestions++;
                    if (inpStr.equals("Yes")) {
                        System.out.println("Your person is Bill");
                    } else if (inpStr.equals("No")) {
                        System.out.println("Is your person a male?");
                        inpStr = input.next();
                        numofQuestions++;
                        if (inpStr.equals("Yes")) {
                            System.out.println("Your person is Peter");
                        } else if (inpStr.equals("No")) {
                            System.out.println("Your person is Susan");
                        }
                    }
                } else if (inpStr.equals("No")) {
                    System.out.println("Does your person have hair on the top of their head?");
                    inpStr = input.next();
                    numofQuestions++;
                    if (inpStr.equals("Yes")) {
                        System.out.println("Your person is Herman");
                    } else if (inpStr.equals("No")) {
                        System.out.println("Does your person have the first letter of their name start with an A?");
                        inpStr = input.next();
                        numofQuestions++;
                        if (inpStr.equals("Yes")) {
                            System.out.println("Your person is Alfred");
                        } else if (inpStr.equals("No")) {
                            System.out.println("Your person is Frans");
                        } else {
                            System.out.println("error");
                        }
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
            } else {
                System.out.println("error");
            }
        } else if (inpStr.equals("No")) {
            System.out.println("Does your person have a mustache and/or beard?");
            inpStr = input.next();
            numofQuestions++;
            if (inpStr.equals("Yes")) {
                System.out.println("Does your person have a beard?");
                inpStr = input.next();
                numofQuestions++;
                if (inpStr.equals("Yes")) {
                    System.out.println("Does you person have hair on the top of their head?");
                    inpStr = input.next();
                    numofQuestions++;
                    if (inpStr.equals("Yes")) {
                        System.out.println("Does your person have a yellow beard");
                        inpStr = input.next();
                        numofQuestions++;
                        if (inpStr.equals("Yes")) {
                            System.out.println("Your person is David");
                        } else if (inpStr.equals("No")) {
                            System.out.println("Your Person is Philip");
                        } else {
                            System.out.println("error");
                        }
                    }

                    else if (inpStr.equals("No")) {
                        System.out.println("Your person is Richard");
                    }
                } else if (inpStr.equals("No")) {
                    System.out.println("Does your person have a black mustache?");
                    inpStr = input.next();
                    numofQuestions++;
                    if (inpStr.equals("Yes")) {
                        System.out.println("Does your person have the first letter of their name start with an A?");
                        inpStr = input.next();
                        numofQuestions++;
                        if (inpStr.equals("Yes")) {
                            System.out.println("Your person is Alex");
                        } else if (inpStr.equals("No")) {
                            System.out.println("Your person is Max");
                        } else {
                            System.out.println("error");
                        }
                    } else if (inpStr.equals("No")) {
                        System.out.println("Your Person is Charles");
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
            } else if (inpStr.equals("No")) {
                System.out.println("Does your person have anything on their head(like a cap, turbin, etc.)?");
                inpStr = input.next();
                numofQuestions++;
                if (inpStr.equals("Yes")) {
                    System.out.println("Does your person have yellow hair under the thing they have on their head?");
                    inpStr = input.next();
                    numofQuestions++;
                    if (inpStr.equals("Yes")) {
                        System.out.println("Your person is Eric");
                    } else if (inpStr.equals("No")) {
                        System.out.println("Is your person a male?");
                        inpStr = input.next();
                        numofQuestions++;
                        if (inpStr.equals("Yes")) {
                            System.out.println("Your person is Bernard");
                        } else if (inpStr.equals("No")) {
                            System.out.println("Your person is Maria");
                        }
                    }
                } else if (inpStr.equals("No")) {
                    System.out.println("Is your person a male?");
                    inpStr = input.next();
                    numofQuestions++;
                    if (inpStr.equals("Yes")) {
                        System.out.println("Your person is Robert");
                    } else if (inpStr.equals("No")) {
                        System.out.println("Does your person have yellow hair?");
                        inpStr = input.next();
                        numofQuestions++;
                        if (inpStr.equals("Yes")) {
                            System.out.println("Your person is Anita");
                        } else if (inpStr.equals("No")) {
                            System.out.println("Your person is anne");
                        } else {
                            System.out.println("error");
                        }
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

        System.out.println("It took " + numofQuestions + " attempts");

    }
}