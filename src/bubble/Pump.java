package bubble;

import interfaces.Bringable;


public class Pump implements Bringable {
    private String name;
    private boolean isInWork;
    public Pump(String name, boolean isInWork){
        this.name = name;
        this.isInWork = isInWork;
    }

   public boolean validateWorkOfPump(){
        if (isInWork){
            return true;
        } else {
            return false;
        }
    }
    public String bring() {
        return " принес насос";
    }

    public void attachTo(){
         class Pipe {
            private String name;
            Pipe(String name){
                this.name= name;
            }

             public String getName() {
                 return name;
             }
         }
        Pipe pipe = new Pipe("Трубка");
        System.out.println(pipe.getName() + " присоединилась к насосу");
    }

    public boolean isInWork() {
        return isInWork;
    }
}
