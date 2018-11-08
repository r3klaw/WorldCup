package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // r3klaw code
        String[] teams16 = {"Uruguay", "Portugal", "France", "Argentina", "Brazil", "Mexico",
                "Belgium", "Japan", "Spain", "Russia", "Croatia", "Denmark", "Sweden", "Switzerland",
                "Colombia", "England"};

        int z = 0;
//input data
        Scanner keyboard = new Scanner(System.in);
        Random result = new Random();
        System.out.print("Enter your favourite team: ");
        String team = keyboard.nextLine();
        boolean teamwc = false;

// choice of the favourite team
        for (int i = 0; i < 16; i++) {
            if (teams16[i].equalsIgnoreCase(team)) {
                teamwc = true;
            }
        }
        if (!teamwc) {
            System.out.println("Your team is not in the Round of 16 ");
        }


// the tournament begins (ROUND OF 16)
        while (true) if (teamwc) {
        //    int z = 0;
            String[] winnerof16 = new String[8];
            int a = 0;

            System.out.print("ROUND OF 16:");
            for (int i = 0; i < 16; i += 2) {
                int score1 = result.nextInt(5);
                int score2 = result.nextInt(5);

                if (score1 > score2) {
                    winnerof16[a] = teams16[i];
                } else if (score1 < score2) {
                    winnerof16[a] = teams16[i + 1];

                } else if (score1 == score2) {
                    Random overtime = new Random();
                    int ot = overtime.nextInt(2);
                    if (ot == 0) {
                        score1++;
                        winnerof16[a] = teams16[i];
                    } else if (ot == 1) {
                        score2++;
                        winnerof16[a] = teams16[i + 1];
                    }
                }
                System.out.print("[" + teams16[i] + "]" + " " + score1 + ":" + score2 + " " + "[" + teams16[i + 1] + "]" + " ");
                a++;
                // Calculate and display total score
            int totalScore = (score1 + score2);

            System.out.println("Total score is " + totalScore );
            }
            System.out.println();
            String[] winnerof8 = new String[4];
            int b = 0;
            System.out.print("QUARTER-FINALS:");
            for (int k = 0; k < 8; k += 2) {
                int score3 = result.nextInt(5);
                int score4 = result.nextInt(5);
                if (score3 > score4) {
                    winnerof8[b] = winnerof16[k];
                } else if (score3 < score4) {
                    winnerof8[b] = winnerof16[k + 1];
                } else if (score3 == score4) {
                    Random overtime2 = new Random();
                    int ot2 = overtime2.nextInt(2);
                    if (ot2 == 0) {
                        score3++;
                        winnerof8[b] = winnerof16[k];
                    } else if (ot2 == 1) {
                        score4++;
                        winnerof8[b] = winnerof16[k + 1];
                    }
                }
                System.out.print("[" + winnerof16[k] + "]" + " " + score3 + ":" + score4 + " " + "[" + winnerof16[k + 1] + "]" + " ");
                b++;
                // Calculate and display total score
                int totalScore = (score3 + score4);

                System.out.println("Total score is " + totalScore );
            }
            System.out.println();
            String[] winnerof4 = new String[2];
            int c = 0;
            System.out.print("SEMI-FINALS:");
            for (int l = 0; l < 4; l += 2) {
                int score5 = result.nextInt(5);
                int score6 = result.nextInt(5);
                if (score5 > score6) {
                    winnerof4[c] = winnerof8[l];
                } else if (score5 < score6) {
                    winnerof4[c] = winnerof8[l + 1];
                } else if (score5 == score6) {
                    Random overtime3 = new Random();
                    int ot3 = overtime3.nextInt(2);
                    if (ot3 == 0) {
                        score5++;
                        winnerof4[c] = winnerof8[l];
                    } else if (ot3 == 1) {
                        score6++;
                        winnerof4[c] = winnerof8[l + 1];
                    }
                }
                System.out.print("[" + winnerof8[l] + "]" + " " + score5 + ":" + score6 + " " + "[" + winnerof8[l + 1] + "]" + " ");
                c++;
                // Calculate and display total score
                int totalScore = (score5 + score6);

                System.out.println("Total score is " + totalScore );
            }
            System.out.println();
            String[] winnerof2 = new String[1];
            int d = 0;
            System.out.print("FINALS:");
            for (int m = 0; m < 2; m += 2) {
                int score7 = result.nextInt(5);
                int score8 = result.nextInt(5);
                if (score7 > score8) {
                    winnerof2[d] = winnerof4[m];
                } else if (score7 < score8) {
                    winnerof2[d] = winnerof4[m + 1];
                } else if (score7 == score8) {
                    Random overtime4 = new Random();
                    int ot4 = overtime4.nextInt(2);
                    if (ot4 == 0) {
                        score7++;
                        winnerof2[d] = winnerof4[m];
                    } else if (ot4 == 1) {
                        score8++;
                        winnerof2[d] = winnerof4[m + 1];
                    }

                }
                System.out.print("[" + winnerof4[m] + "]" + " " + score7 + ":" + score8 + " " + "[" + winnerof4[m + 1] + "]" + " ");
                // Calculate and display total score
                int totalScore = (score7 + score8);

                System.out.println("Total score is " + totalScore );
                System.out.println();
            }


            System.out.println("Tournament: " + z + " The WINNER is: " + winnerof2[d]);
            z++;
            if (winnerof2[d].equalsIgnoreCase(team)) {
                break;
            }
        }
    }
}
