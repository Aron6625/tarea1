public class Serie
{
    public void Ej1(int N){
        int cont=0;
        boolean sies=true;
        int Serie=0;
       for(int i=1;i<=N;i++){
           cont++;
           if(i>2){
               if(sies==true){
                   Serie=Serie+2;
                   sies=false;
                }else{
                    sies=true;
                    if(cont!=4){
                        Serie=Serie+1;
                    }
                }
            }
            
           if(cont==4){
               cont=0;
               Serie=Serie+3;
            }
            
            if(i==1){
                Serie=1;
            }
            if(i==2){
                Serie=2;
            }
            
            System.out.print(Serie+" ");
            //1 2 4 7 9 10 12 15 17 18 ....
       
        }
    }
}
