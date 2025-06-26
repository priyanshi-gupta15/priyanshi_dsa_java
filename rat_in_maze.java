public class rat_in_maze {
  public static void main(String[] args) {
    int n = 3;
    int[][] maze = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 0, 0 } };
    //0 = no obstacale
    //1 = obstacale

    // int count = maze_move(3, 3);
    // System.out.println(count);

    // maze_down_right(n, n, "");

    // maze_diagonal(n, n, "");

    // maze_obstacle(0, 0, maze, "");

    //with backtracking
    maze_obstacle_backtrack(0, 0, maze, "");

  }

  public static int maze_move(int r, int c) {
    if (r == 1 || c == 1) {
      return 1;
    }
    int left = maze_move(r, c - 1);
    int right = maze_move(r - 1, c);

    return left + right;

  }

  public static void maze_down_right(int r, int c, String S) {
    if (r == 1 && c == 1) {
      System.out.println(S);
      return;
    }
    if (r > 1) {
      maze_down_right(r - 1, c, S + "D");
    }
    if (c > 1) {
      maze_down_right(r, c - 1, S + "R");

    }

  }

  public static void maze_diagonal(int r, int c, String S) {
    if (r == 1 && c == 1) {
      System.out.println(S);
      return;
    }
    if (c > 1 && r > 1) {
      maze_diagonal(r - 1, c - 1, S + "D");
    }
    if (r > 1) {
      maze_diagonal(r - 1, c, S + "V");
    }
    if (c > 1) {
      maze_diagonal(r, c - 1, S + "H");
    }

  }

  public static void maze_obstacle(int r, int c, int[][] maze, String s) {
    if (maze[r][c] == 1) {
      return;
    }
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(s);
      return;
    }

    if (r < maze.length - 1) {
      maze_obstacle(r + 1, c, maze, s + "V");
    }
    if (c < maze[0].length - 1) {
      maze_obstacle(r, c + 1, maze, s + "H");
    }
    if (r < maze.length - 1 && c < maze[0].length - 1) {
      maze_obstacle(r + 1, c + 1, maze, s + "D");
    }

  }

  // public static void maze_obstacle_backtrack(int r, int c, int[][] maze, String s) {
  //   if (maze[r][c] == 1) {
  //     return;
  //   }
  //   if (r == maze.length - 1 && c == maze[0].length - 1) {
  //     System.out.println(s);
  //     return;
  //   }

  //   maze[r][c] = 1;

  //   if (r < maze.length - 1) {
  //     maze_obstacle_backtrack(r + 1, c, maze, s + "D");
  //   }
  //   if (r > 0) {
  //     maze_obstacle_backtrack(r - 1, c, maze, s + "U");
  //   }
  //   if (c < maze[0].length - 1) {
  //     maze_obstacle_backtrack(r, c + 1, maze, s + "R");
  //     if (c > 0) {
  //       maze_obstacle_backtrack(r, c - 1, maze, s + "L");
  //     }
  //     if (r < maze.length - 1 && c < maze[0].length - 1) {
  //       maze_obstacle_backtrack(r + 1, c + 1, maze, s + "d");
  //     }
  //     maze[r][c] = 0;
  //   }
  // }

  //not good approach
  public static void maze_obstacle_backtrack(int r, int c, int[][] maze, String s) {
    // Out of bounds or obstacle
    if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || maze[r][c] == 1) {
        return;
    }

    // Destination reached
    if (r == maze.length - 1 && c == maze[0].length - 1) {
        System.out.println(s);
        return;
    }

    // Mark as visited
    maze[r][c] = 1;

    // Move Down
    maze_obstacle_backtrack(r + 1, c, maze, s + "D");
    // Move Up
    maze_obstacle_backtrack(r - 1, c, maze, s + "U");
    // Move Right
    maze_obstacle_backtrack(r, c + 1, maze, s + "R");
    // Move Left
    maze_obstacle_backtrack(r, c - 1, maze, s + "L");
    //move diagonal
    maze_obstacle_backtrack(r+1, c + 1, maze, s + "d");

    // (Optional) Diagonal move — not typical, but included if you want
    // maze_obstacle_backtrack(r + 1, c + 1, maze, s + "d");

    // Unmark (Backtrack)
    maze[r][c] = 0;
}



}
