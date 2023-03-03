class Movie

{

             public static void main(String args[])
   
             {

             theater pm=new theater();
             pm.setMovie(16,"vivah","sooraj bajaty",400);
             theater pm2=new theater();
             pm2.setMovie(120,"kabirsingh","sandeep reddy",350);
             pm.getMovie();
             pm2.getMovie();

             }

}

class theater

{
             private int bNum,bPrice;
             private String bName,bDirector;

            
             public void setMovie(int movieTicket,String movieName,String movieDirector,int moviePrice){
             bNum=movieTicket;
             bName=movieName;
             bDirector=movieDirector;
             bPrice=moviePrice;
                  }
              
               public void getMovie(){
               System.out.println(bNum+" is "+bName+" which is written by"+bDirector+" and it is price"+bPrice+"rupees");

              }

}

