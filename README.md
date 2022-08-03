# My-Projects
Trying out different things in coding

1)Procedural Heart:
      Prints a Heart pattern in the Console Output using stars of any size.
      It is a procedural algorithm.
      Code: [[Heart](Python/ProceduralHeart.py)]
      
      Sample:
      Example1:
      input: 5
      output: 
                                  * # # # # # *     * # # # # # * 
                                * # # # # # # # * * # # # # # # # * 
                                * # # # # # # # * * # # # # # # # * 
                                * # # # # # # # * * # # # # # # # * 
                                * # # # # # # # * * # # # # # # # * 
                                * # # # # # # # # # # # # # # # # * 
                                * # # # # # # # # # # # # # # # # * 
                                  * # # # # # # # # # # # # # # * 
                                    * # # # # # # # # # # # # * 
                                      * # # # # # # # # # # * 
                                        * # # # # # # # # * 
                                          * # # # # # # * 
                                            * # # # # * 
                                              * # # * 
       Example2:
       input: 10
       output:
                    * # # # # # # # *                         * # # # # # # # * 
                * # # # # # # # # # # # *                 * # # # # # # # # # # # * 
              * # # # # # # # # # # # # # *             * # # # # # # # # # # # # # * 
            * # # # # # # # # # # # # # # # *         * # # # # # # # # # # # # # # # * 
          * # # # # # # # # # # # # # # # # # *     * # # # # # # # # # # # # # # # # # * 
          * # # # # # # # # # # # # # # # # # *     * # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # * * # # # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # * * # # # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # * * # # # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # * * # # # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # * * # # # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
        * # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
          * # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
            * # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
              * # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
                * # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
                    * # # # # # # # # # # # # # # # # # # # # # # # # # # # # * 
                      * # # # # # # # # # # # # # # # # # # # # # # # # # # * 
                        * # # # # # # # # # # # # # # # # # # # # # # # # * 
                          * # # # # # # # # # # # # # # # # # # # # # # * 
                              * # # # # # # # # # # # # # # # # # # * 
                                * # # # # # # # # # # # # # # # # * 
                                  * # # # # # # # # # # # # # # * 
                                    * # # # # # # # # # # # # * 
                                        * # # # # # # # # * 
                                          * # # # # # # * 
                                            * # # # # * 
                                              * # # * 


2)Simple Snake Game in C++:
      It is the same game we used to play on Nokia 3310 but runs completely on the terminal.
      We use W A S D to move the snake.
      Fruits spawn randomly on the map.
      Collecting fruits increases the tail size as well as the score.
      If snake's head hits the tail game ends.
      Goal is to try and get a High Score.
      Code: [[Snake](Snake-Game/snake.cpp)]
      
      Sample:
                    #####################
                    #                   #
                    #                   #
                    #                   #
                    #                   #
                    #                   #
                    #                   #
                    #                   #
                    #                   #
                    #                   #
                    #                   #
                    #    ooooooooo      #
                    #            o      #
                    #            o      #
                    #            o      #
                    #            0      #
                    #                   #
                    #            @      #
                    #                   #
                    #                   #
                    #                   #
                    #####################
                    fruits: 12  score: 120
                    
   [Working](https://user-images.githubusercontent.com/110351644/182687269-6e0eddb3-fc3a-4b01-9be6-d44e57e11c97.mp4)
                    
                    
3) Sudoku Solver AwT App:
      Download the Sudoku App folder. Launch the AwT App by compiling the SudokuApp.java File in command line prompt.
      You will see a 9x9 grid of Text Fields. Enter the known Numbers in their respective Fields and Click on Solve.
      The empty spaces should fill up with the right answer giving you a solved sudoku.
      Codes:
      [[Awt Code](Sudoku%20App/SudokuApp.java)]
      [[BackTrack Algorithm](Sudoku%20App/SudokuPlz.java)]
      
            Example: 
            Input:
                  0 0 0 2 6 0 7 0 1
                  6 8 0 0 7 0 0 9 0
                  1 9 0 0 0 4 5 0 0
                  8 2 0 1 0 0 0 4 0
                  0 0 4 6 0 2 9 0 0
                  0 5 0 0 0 3 0 2 8 
                  0 0 9 3 0 0 0 7 4
                  0 4 0 0 5 0 0 3 6
                  7 0 3 0 1 8 0 0 0
                  
            Output:
                  4 3 5 2 6 9 7 8 1 
                  6 8 2 5 7 1 4 9 3 
                  1 9 7 8 3 4 5 6 2 
                  8 2 6 1 9 5 3 4 7 
                  3 7 4 6 8 2 9 1 5 
                  9 5 1 7 4 3 6 2 8 
                  5 1 9 3 2 6 8 7 4 
                  2 4 8 9 5 7 1 3 6 
                  7 6 3 4 1 8 2 5 9 
      
      
      [Example](https://user-images.githubusercontent.com/110351644/182678677-3d3f4312-bc2e-45aa-b846-2a62b4ca2419.mp4)

