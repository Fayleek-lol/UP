public class Syte
{
    private String domen = "https://bsu.edu.ru";
    private String link = "www.shop.ru";
    private String all_information;
    
    public void all_information(){
        all_information = domen + "_" + link;
    }
    
    public void printAboutObject(){
        
    }
    public void printInformation(){
      System.out.println("Вся информация: " + all_information);
    }
}
