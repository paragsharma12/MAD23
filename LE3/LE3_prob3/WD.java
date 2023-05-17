class WD extends Duck implements flyable,quackable{
   public void fly(){
       System.out.println("WD can't fly.");
   }
   public void quack(){
       System.out.println("WD mute.");
   }
}