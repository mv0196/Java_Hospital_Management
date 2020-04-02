
public class splashcons {
    public static void main(String[] args){
        Index in=new Index();
          splash s=new splash();
          s.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                 s.loadingnum.setText(Integer.toString(i)+"%");
                s.loadingbar.setValue(i);
               
                if(i==100){
               in.setVisible(true);
               s.dispose();
                }
                   
                }
        }
        catch(Exception e){
        }
    }
}
