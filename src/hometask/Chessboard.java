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
public class Chessboard {
    static boolean validatePosition(StringBuilder position){
        if (position.length()!=2)
        {return false;}
        switch (position.charAt(0)){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
                switch (position.charAt(1)){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    return true;
                    default: return false;
                }
            default: return false;            
        }
    }
}
