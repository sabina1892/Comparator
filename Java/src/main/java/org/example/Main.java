package org.example;

import java.util.*;



    class Player{
        // Firstly we created Player class and we add 2 parameters - player and name
        // and we add constructor, getter, setter and toString methods
        String player;
        int score;

        public Player(String player, int score) {
            this.player = player;
            this.score = score;
        }

        public String getPlayer() {
            return player;
        }

        public void setPlayer(String player) {
            this.player = player;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "player='" + player + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
    class Checker implements Comparator<Player>{
        // We created Checker class for implementing from Comparator class and anding compare method
        public int compare(Player o1, Player o2) {
            if(o1.score==o2.score) // if players names are same, we can easily compare
                return o2.getPlayer().compareTo(o1.getPlayer());
            return o1.score - o2.score; //we compare for score
        }
    }
public class Main {
    public static void main(String[] args) {
        ArrayList<Player> ar = new ArrayList<>(); // we create arraylist with Player class

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            ar.add(new Player(sc.next(),sc.nextInt()));
        }

        Collections.sort(ar, new Checker()); // we sort arraylist
        for(int i = ar.size()-1 ; i >= 0 ; i--){ // printing descending
            System.out.println(ar.get(i));
        }


    }
}

