package com.ohgiraffers.section06.singleton;

import java.util.*;

public class test {


    public static void main(String[] args) {

        String[] call = new String[]{"12","3"};


        List<String> callList = Arrays.asList(call);

        int a = callList.indexOf("3");

        System.out.println("a = " + a);

        String[] dd = callList.toArray(new String[0]);


        for (int i = 0; i < dd.length; i++) {
            System.out.println("dd[i] = " + dd[i]);
        }
    }


    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        List<String>playersList = Arrays.asList(players);

        int playerInex = 0;
        String tempSwap = "";
        String calledPlayer = "";

        for(String called : callings){
            playerInex = playersList.indexOf(calledPlayer);

            if( playerInex == 0 ) continue;
            tempSwap = playersList.get(playerInex- 1) ;
            playersList.set(playerInex, tempSwap);
            playersList.set(playerInex - 1, calledPlayer) ;

        }

        answer = playersList.toArray(new String[0]);
        return answer;

    }
}
