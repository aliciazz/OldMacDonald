class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     public Chick(String type, String sound) {
       myType = type;
       mySound = sound;
     }
     public Chick() {
       myType = "unknown";
       mySound = "unknown";
     }
     public void setSound(String s) {
       mySound = s;
     }
     public String getSound() {
       if (Math.random()> .5)
       return mySound;
       else
       return "Cluck";
     }
     public String getType() {
       return myType;
     }
}