/* Aim:-PracticalNo4
   Author:-Muskan Choudhary
   Version:-5.0
   Date:-27/02/24
*/
// Parent class
class PracticalNo5 {
    void displayParent() {
        System.out.println("This is the parent class - Emerging Technologies");
    }
}

// Child class AIML
class AIML extends PracticalNo5 {
    void displayAIML() {
        System.out.println("This is the AIML (Artificial Intelligence and Machine Learning) class");
    }
}

// Child class AIDS
class AIDS extends PracticalNo5 {
    void displayAIDS() {
        System.out.println("This is the AIDS (Artificial Intelligence in Data Science) class");
    }
}

// Child class CSE
class CSE extends PracticalNo5 {
    void displayCSE() {
        System.out.println("This is the CSE (Computer Science and Engineering) class");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        AIML aimlObj = new AIML();
        AIDS aidsObj = new AIDS();
        CSE cseObj = new CSE();

        aimlObj.displayParent();
        aimlObj.displayAIML();

        aidsObj.displayParent();
        aidsObj.displayAIDS();

        cseObj.displayParent();
        cseObj.displayCSE();
    }
}
