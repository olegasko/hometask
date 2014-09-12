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
public class Queen {
    static StringBuilder[] moveQueen(StringBuilder position){
        char currentColumn=position.charAt((0));
        char currentLine=position.charAt((1));
        
        StringBuilder[] possibleQueenPosition=new StringBuilder[56];
        for (int i=0;i<=55;i++){
            possibleQueenPosition[i]= new StringBuilder("00");
            }
        for (int i=0;i<=6; i++){
            possibleQueenPosition[i].setCharAt(0, ++currentColumn);
            possibleQueenPosition[i].setCharAt(1, ++currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleQueenPosition[i+7].setCharAt(0, --currentColumn);
            possibleQueenPosition[i+7].setCharAt(1, --currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleQueenPosition[i+14].setCharAt(0, ++currentColumn);
            possibleQueenPosition[i+14].setCharAt(1, --currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleQueenPosition[i+21].setCharAt(0, --currentColumn);
            possibleQueenPosition[i+21].setCharAt(1, ++currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleQueenPosition[i+28].setCharAt(0, currentColumn);
            possibleQueenPosition[i+28].setCharAt(1, ++currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleQueenPosition[i+35].setCharAt(0, currentColumn);
            possibleQueenPosition[i+35].setCharAt(1, --currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleQueenPosition[i+42].setCharAt(0, ++currentColumn);
            possibleQueenPosition[i+42].setCharAt(1, currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleQueenPosition[i+49].setCharAt(0, --currentColumn);
            possibleQueenPosition[i+49].setCharAt(1, currentLine);
            }
        return possibleQueenPosition;
        
    }
}
