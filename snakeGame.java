package projects.game1;

import javax.swing.JFrame;

public class snakeGame extends JFrame { //jvm calls class and class calls constructor
    snakeGame(){ //saari coding iske andar hogi frame k
        super("SNAKE GAME");  // used when we call parent class ka constructor and it must be the first sentence inside a constructor varna error aaega
        add(new board());
       //reload karna hai cheezo hai frame refresh jo changes reflect ho frame pe ...works same as setVisible (as it cannot be used multiple times)
        setSize(300, 300);
        setLocationRelativeTo(null); //screen size k acc center mai khulega
        //setLocation(700,300);
        setVisible(true); //frame ban jaega top left =default
        setResizable(false);
    }
    public static void main(String[] args) {
     new snakeGame().setVisible(true);; //class ka obj hai yeh and it will call class ka constructor
    }
}
