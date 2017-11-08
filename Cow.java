class Cow implements Animal 
{     
     //your code here
     private String myType;
     private String mySound;
     Cow(String type, String sound){
          mySound = sound;
          myType = type;
     }
     public Cow(){
     	myType = "Cow";
     	mySound = "Moo.";
     }
     public String getSound(){
     	return mySound;
     }
     public String getType(){
     	return myType;
     }
}
