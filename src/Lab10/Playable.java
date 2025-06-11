package Lab10;

public interface Playable {
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Playing guitar");
    }
}

class Piano implements Playable{
    public void play(){
        System.out.println("Playing piano");
    }
}
class Mu {
    public static void main(String[] args){
        Playable[] instruments = { new Guitar() , new Piano()  };
        for (Playable instrument : instruments){
            instrument.play();
        }
    }
}
