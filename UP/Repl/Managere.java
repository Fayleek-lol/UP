class Managere{
  private String name;

 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return name;
 }

 public void printInformation(){
      System.out.println("Имя менеджера: " + name);
  }

}