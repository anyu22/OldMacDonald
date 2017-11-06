class Pig //implements Animal 
{     
     //your code here
     private string myType;
     private string mySound;
     public Pig(String type, String sound){
     	myType = type;
     	mySound = sound;
     }
     public Pig(){
     	myType = "pink pig"
     	mySound = " oink"
     }
     public String getSound(){return mySound;}
     public String getType(){return myType;}

}
