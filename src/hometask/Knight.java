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
public class Knight {
    static StringBuilder[] knightMove(StringBuilder position){
        char currentColumn=position.charAt((0));
        char currentLine=position.charAt((1));
        
        StringBuilder[] possibleKnightPosition=new StringBuilder[8];
        for (int i=0;i<=7;i++){
            possibleKnightPosition[i]= new StringBuilder("00");
            }
        possibleKnightPosition[0].setCharAt(0, currentColumn+=2);
        possibleKnightPosition[0].setCharAt(1, ++currentLine);
        currentColumn-=2;
        currentLine--;
        possibleKnightPosition[1].setCharAt(0, currentColumn-=2);
        possibleKnightPosition[1].setCharAt(1, ++currentLine);
        currentColumn+=2;
        currentLine--;
        possibleKnightPosition[2].setCharAt(0, ++currentColumn);
        possibleKnightPosition[2].setCharAt(1, currentLine+=2);
        currentColumn--;
        currentLine-=2;
        possibleKnightPosition[3].setCharAt(0, ++currentColumn);
        possibleKnightPosition[3].setCharAt(1, currentLine-=2);
        currentColumn--;
        currentLine+=2;
        possibleKnightPosition[4].setCharAt(0, --currentColumn);
        possibleKnightPosition[4].setCharAt(1, currentLine+=2);
        currentColumn++;
        currentLine-=2;
        possibleKnightPosition[5].setCharAt(0, --currentColumn);
        possibleKnightPosition[5].setCharAt(1, currentLine-=2);
        currentColumn++;
        currentLine+=2;
        possibleKnightPosition[6].setCharAt(0, currentColumn+=2);
        possibleKnightPosition[6].setCharAt(1, --currentLine);
        currentColumn-=2;
        currentLine++;
        possibleKnightPosition[7].setCharAt(0, currentColumn-=2);
        possibleKnightPosition[7].setCharAt(1, --currentLine);
        return possibleKnightPosition;
        
    }
}
