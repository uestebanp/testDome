package com.urieban.testDome.exersice2;

public class Tiles {
	
	public static void tileEdges(boolean[][] tiles) {
		System.out.println(tiles.length);
		boolean isTrueLine = Boolean.FALSE;
		boolean isColumnTrue = Boolean.FALSE;
		for (int i = 0; i < tiles.length; i++) {
			if(i==0 || i==tiles.length-1) {
				isTrueLine = Boolean.TRUE;
			}else {
				isTrueLine = Boolean.FALSE;
			}
            for (int j = 0; j < tiles[i].length; j++) {
            	if(isTrueLine) {
            		tiles[i][j] = Boolean.TRUE;
            	}else {
            		if(j==0 || j==tiles[i].length-1) {
            			isColumnTrue = Boolean.TRUE;
        			}else {
        				isColumnTrue = Boolean.FALSE;
        			}
            		if(isColumnTrue) {
                		tiles[i][j] = Boolean.TRUE;
                	}
            	}
            }
        }
    }

    public static void main(String[] args) {
        boolean[][] tiles = new boolean[16][16];
        
        tileEdges(tiles);

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                System.out.print(tiles[i][j] ? "true  " : "false ");
            }
            System.out.println();
        }
    }

}
