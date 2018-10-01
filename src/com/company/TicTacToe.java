package com.company;

import java.util.Scanner;

/**
 * Created by Admen3000 on 01.10.2018.
 */
    public class TicTacToe {

        Scanner sc = new Scanner(System.in);
        char[][] GameBoard = new char[3][3];
        boolean X = true,Game = true;
        int StepCounter = 1,row,col;
        String PlayerX;
        String PlayerY;

    TicTacToe(){
        System.out.println("Это игра крестики-нолики!!!");
        System.out.println("Введите имя первого игрока: ");
        PlayerX = sc.nextLine();
        System.out.println("Введите имя второго игрока: ");
        PlayerY = sc.nextLine();
        Initialization();
        while(Game==true) {
            if(CheckVictoryY() == false && CheckVictoryX() == false && StepCounter == 10){
                DrawGameBoard();
                System.out.println("Ничья!");
                break;
            }
            if(CheckVictoryY()){
                DrawGameBoard();
                System.out.println("Победа игрока "+PlayerY+"!");
                break;
            }
            if(CheckVictoryX()){
                DrawGameBoard();
                System.out.println("Победа игрока "+PlayerX+"!");
                break;
            }
            CheckVictoryX();
            CheckVictoryY();
            DrawGameBoard();
            if(Game==true) {
                ChangeGameBoard();
            }else{

            }
        }
    }




        public static void main(String[] args) {

     }

        private boolean CheckVictoryX(){
           if (GameBoard[0][0] == 'X' && GameBoard[0][1] == 'X' && GameBoard[0][2] == 'X') {
               Game = false;
               return true;
           }
            if (GameBoard[1][0] == 'X' && GameBoard[1][1] == 'X' && GameBoard[1][2] == 'X') {
                Game = false;
                return true;
            }
            if (GameBoard[2][0] == 'X' && GameBoard[2][1] == 'X' && GameBoard[2][2] == 'X') {
                Game = false;
                return true;
            }
            if (GameBoard[0][0] == 'X' && GameBoard[1][0] == 'X' && GameBoard[2][0] == 'X') {
                Game = false;
                return true;
            }
            if (GameBoard[0][1] == 'X' && GameBoard[1][1] == 'X' && GameBoard[2][1] == 'X') {
                Game = false;
                return true;
            }
            if (GameBoard[0][2] == 'X' && GameBoard[1][2] == 'X' && GameBoard[2][2] == 'X') {
                Game = false;
                return true;
            }
            if (GameBoard[0][0] == 'X' && GameBoard[1][1] == 'X' && GameBoard[2][2] == 'X') {
                Game = false;
                return true;
            }
            if (GameBoard[2][0] == 'X' && GameBoard[1][1] == 'X' && GameBoard[0][2] == 'X') {
                Game = false;
                return true;
            }
            return false;
        }
        private boolean CheckVictoryY(){
            if (GameBoard[0][0] == 'O' && GameBoard[0][1] == 'O' && GameBoard[0][2] == 'O') {
                Game = false;
                return true;
            }
            if (GameBoard[1][0] == 'O' && GameBoard[1][1] == 'O' && GameBoard[1][2] == 'O') {
                Game = false;
                return true;
            }
            if (GameBoard[2][0] == 'O' && GameBoard[2][1] == 'O' && GameBoard[2][2] == 'O') {
                Game = false;
                return true;
            }
            if (GameBoard[0][0] == 'O' && GameBoard[1][0] == 'O' && GameBoard[2][0] == 'O') {
                Game = false;
                return true;
            }
            if (GameBoard[0][1] == 'O' && GameBoard[1][1] == 'O' && GameBoard[2][1] == 'O') {
                Game = false;
                return true;
            }
            if (GameBoard[0][2] == 'O' && GameBoard[1][2] == 'O' && GameBoard[2][2] == 'O') {
                Game = false;
                return true;
            }
            if (GameBoard[0][0] == 'O' && GameBoard[1][1] == 'O' && GameBoard[2][2] == 'O') {
                Game = false;
                return true;
            }
            if (GameBoard[2][0] == 'O' && GameBoard[1][1] == 'O' && GameBoard[0][2] == 'O') {
                Game = false;
                return true;
            }
            return false;
        }


        private void Initialization(){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    GameBoard[i][j] = ' ';
                }
            }
        }

        private void DrawGameBoard(){
            System.out.println(StepCounter+" Ход");
            System.out.println("---------------");
            for (int i = 0; i < 3; i++) {
                System.out.print(" | ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(GameBoard[i][j]+" | ");
                }
                System.out.println("\n---------------");
            }

        }

        private void ChangeGameBoard(){
            if(X==true){
                System.out.println("Ход игрока "+PlayerX);
                System.out.println("Выбери строку: ");
                row = sc.nextInt();
                System.out.println("Выбери столбец: ");
                col = sc.nextInt();
                if (GameBoard[row-1][col-1]=='X'||GameBoard[row-1][col-1]=='O'){
                    System.out.println("Эта клетка уже занята!");
                }else {
                    StepCounter++;
                    GameBoard[row - 1][col - 1] = 'X';
                    X = false;
                }

            }else if (X==false){
                System.out.println("Ход игрока "+PlayerY);
                System.out.println("Выбери строку: ");
                row = sc.nextInt();
                System.out.println("Выбери столбец: ");
                col = sc.nextInt();
                if (GameBoard[row-1][col-1]=='X'||GameBoard[row-1][col-1]=='O'){
                    System.out.println("Эта клетка уже занята!");
                }else {
                    StepCounter++;
                    GameBoard[row - 1][col - 1] = 'O';
                    X = true;
                }
            }


        }

    }

