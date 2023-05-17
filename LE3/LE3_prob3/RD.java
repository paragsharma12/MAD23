class RD extends Duck implements flyable,quackable{
   public void fly(){
       System.out.println("RD can't fly.");
   }
   public void quack(){
       System.out.println("RD squeaks.");
   }
}