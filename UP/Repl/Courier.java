class Courier{
  private String del_place;
  private String del_terms;
  private int phone;
  private String name;

 public void setDel_place(String del_place){
   this.del_place = del_place;
 }
 public String getDel_place(){
   return del_place;
 }
 public void setDel_terms(String del_terms){
   this.del_terms = del_terms;
 }
 public String getDel_terms(){
   return del_terms;
 }
 public void setPhone(int phone){
   this.phone = phone;
 }
 public  int getPhone(){
   return phone;
 }
 public void setName(String name){
   this.name = name;
 }
 public String getName(){
   return name;
 }

 public void printInformation(){
    System.out.println("Адрес доставки: " + del_place);
    System.out.println("Дата доставки: " + del_terms);
    System.out.println("Номер телефона курьера: "+phone);
    System.out.println("Имя курьера: " + name);
  }
 
}