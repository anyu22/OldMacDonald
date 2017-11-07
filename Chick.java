class Chick implements Animal 
{     
    //your code here
    private String mySound;
    private String myType;
    Chick(String type, String sound){
    	myType = type;
    	mySound = sound;
    }
    Chick(){
    	myType = "Yellow chick";
    	mySound = "chirp";
    }
    public String getSound(){ return mySound;}
    public String getType() { return myType;}
    
}
