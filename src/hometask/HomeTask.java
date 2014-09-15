/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hometask;

/**
 *
 * @author OKonichenko.ua
 */
import java.util.Scanner;
public class HomeTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Принимаем текущие позиции фигур
        System.out.println("Enter current position of rook");
        Scanner sc = new Scanner (System.in);
	String input=sc.nextLine();
        StringBuilder currentRookPosition = new StringBuilder(input);
        
        System.out.println("Enter current position of queen");
        input=sc.nextLine();
        StringBuilder currentQueenPosition = new StringBuilder(input);
        
        System.out.println("Enter current position of knight");
        input=sc.nextLine();
        StringBuilder currentKnightPosition = new StringBuilder(input);
        
        //Если введеная позиция ладьи валидна выводим циклом провалидированый массив возможных позиций
        if (Chessboard.validatePosition(currentRookPosition)){
            System.out.println("Rook can move on");
            StringBuilder[] tempArrayForRookPosition=Rook.rookMove(currentRookPosition);
            for (int i=0;i<=27;i++){
                if (Chessboard.validatePosition(tempArrayForRookPosition[i]))
                System.out.print(" " +tempArrayForRookPosition[i]);
            }
        // Иначе выводим сообщение о некорректно введеной позиции
        }
        else{
            System.out.println("Incorrect position of rook");
        }
            System.out.println();
        
        //Если введеная позиция ферзя валидна выводим циклом провалидированый массив возможных позиций
        if (Chessboard.validatePosition(currentQueenPosition)){
            System.out.println("Queen can move on");
            StringBuilder[] tempArrayForQueenPosition=Queen.moveQueen(currentQueenPosition);
            for (int i=0;i<=55;i++){
                if (Chessboard.validatePosition(tempArrayForQueenPosition[i]))
                System.out.print(" " +tempArrayForQueenPosition[i]);
            }
        }
        // Иначе выводим сообщение о некорректно введеной позиции
        else{
            System.out.println("Incorrect position of queen");
        }
            System.out.println();
        
        //Если введеная позиция коня валидна выводим цилом провалидированый массив возможных позиций
        if (Chessboard.validatePosition(currentKnightPosition)){
            System.out.println("Knight can move on");
            StringBuilder[] tempArrayForKnightPosition=Knight.knightMove(currentKnightPosition);
            for (int i=0;i<=7;i++){
                if (Chessboard.validatePosition(tempArrayForKnightPosition[i]))
                System.out.print(" " +tempArrayForKnightPosition[i]);
            }
            System.out.println();
        }
        // Иначе выводим сообщение о некорректно введеной позиции
        else{
            System.out.println("Incorrect position of knight");
        } 
        
    }
    
}
