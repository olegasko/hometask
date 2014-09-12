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
public class Rook extends Chessboard{
    static StringBuilder[] rookMove(StringBuilder position){
        char currentColumn=position.charAt((0));
        char currentLine=position.charAt((1));
        
        StringBuilder[] possibleRookPosition=new StringBuilder[28];
        for (int i=0;i<=27;i++){
            possibleRookPosition[i]= new StringBuilder("00");
            }
        
        for (int i=0;i<=6; i++){
            possibleRookPosition[i].setCharAt(0, currentColumn);
            possibleRookPosition[i].setCharAt(1, ++currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleRookPosition[i+7].setCharAt(0, currentColumn);
            possibleRookPosition[i+7].setCharAt(1, --currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleRookPosition[i+14].setCharAt(0, ++currentColumn);
            possibleRookPosition[i+14].setCharAt(1, currentLine);
            }
        currentColumn=position.charAt((0));
        currentLine=position.charAt((1));
        for (int i=0;i<=6; i++){
            possibleRookPosition[i+21].setCharAt(0, --currentColumn);
            possibleRookPosition[i+21].setCharAt(1, currentLine);
            }
        return possibleRookPosition;
        
    }
        
}
