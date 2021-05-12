
public class padovan
{
   public void ejercicioDos(int hasta){
            int  n[] = new int[hasta];
            int i;
            n[0]=n[1]=n[2]=1;
            switch(hasta){
                case 1:
                    System.out.print(n[0]);
                break;
                case 2:
                    System.out.print(n[0]+""+n[1]);
                break;
                case 3:
                    System.out.print(n[0]+""+n[1]+""+n[2]);
                break;
                default:
                    System.out.print(n[0]+""+n[1]+""+n[2]);
            }
        for(i=3;i<hasta;i++){
           n[i]=n[i-2]+n[i-3];
          System.out.print(n[i]);
        
        }

    }
}
