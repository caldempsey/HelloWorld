package challenges;

public class CloudHopper {
    public static int clouds(int[] clouds){
        int hops = 0;
        for (int i = 0; i < clouds.length-1;){
            // Increment the current cloud we are standing on (i) by 1
            if (i+2 < clouds.length && clouds[i+2] == 0){
                i = i+2;
            } else {
                i++;
            }
            hops++;
        }
        return hops;
    }
}
