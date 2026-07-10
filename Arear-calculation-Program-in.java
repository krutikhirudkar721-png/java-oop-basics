// # Calculating area of the Cube
// # CODE

    import java.util.*;
    public class MyProgramCube {
    public static void main(String[] args) {
        float volume;
        Cube c1 = new Cube();   
        volume = c1.calculateVolume(10, 10, 10); 
        System.out.println("Volume = " + volume);
        }
    }

    class Cube {
        float height;
        float width;
        float depth;
        float calculateVolume(float h, float w, float d) {
            this.height = h;
            this.width = w;
            this.depth = d;
            return height * width * depth;
        }
    }
