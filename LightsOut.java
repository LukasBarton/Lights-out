package games;

public class LightsOut {

    private boolean[][] mrizka;

    public LightsOut(int size){
        mrizka = new boolean[size][size];

        for (int i= 0; i < size; i++){
            for (int j = 0; j < size; j++){
                mrizka[i][j] = false;
            }
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < mrizka.length; i++) {
            for (int j = 0; j < mrizka[i].length; j++) {
                if (mrizka[i][j]) {
                    s += "#";
                }else{
                    s += ".";
                }
            }
            s += "\n";
        }
        return s;
    }

    public void randomize() {
        for (int i = 0; i < mrizka.length; i++) {
            for (int j = 0; j < mrizka[i].length; j++) {
                if (Math.random() > 0.5) {
                    mrizka[i][j] = true;
                }
            }
        }
    }

    public void toggle(int x, int y){
        mrizka[x][y] = !mrizka[x][y];
        if (x < mrizka.length - 1){
            mrizka[x + 1][y] = !mrizka[x + 1][y];
        }
        if (x > 0 ) {
            mrizka[x - 1][y] = !mrizka[x - 1][y];
        }
        if (y < mrizka.length - 1) {
            mrizka[x][y + 1] = !mrizka[x][y + 1];
        }
        if (y > 0) {
            mrizka[x][y - 1] = !mrizka[x][y - 1];
        }
    }

    public boolean isSolved() {
        for (int i = 0; i < mrizka.length; i++) {
            for (int j = 0; j < mrizka[i].length; j++) {
                if (mrizka[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

