**Game description**: In this project you and your team will create a video game called Land Mine!

Here’s how the game works:

1. The Board is arranged in an 8x8 grid (like a checkerboard).
2. The 8x8 board will create 64 individual cells
3. Each cell will either be empty, or contain a landmine that will explode when the cell is uncovered.
4. There should be 10 landmines placed randomly on the board (see note below about random numbers)
5. The player uncovers one cell at a time.
  a. If the cell is empty, the player receives one point￼
￼ b. If the cell contains a landmine, the player explodes and loses one life
6. When the player loses 3 lives, the game is over
7. The game should have a leaderboard that is displayed between games
  a. If a player gets a high score, the game should ask for his or her name which will be displayed on the leaderboard.

**Group planning and discussion**: Before you write a single line of code, you need to get together as a group and decide on the methods and instance data that will be required by the Model, View, and Controller classes.

For instance, the Model class will need a method called (for example) clearBoardwhich will set all the cells in the array to false. You will also need a method called randomizeMines(number)which will randomly place some number of mines on the board.

You'll also need to agree on the messaging protocol that will be used to communicate in the MVC framework. For instance, the View could send the message exposeCellwith a message payload of the cell number as so that the Controller could tell the Model to modify the app's data accordingly.

**Division of effort**: Each team will consist of three people with the following responsibilities:

  * Team member 1 will be in charge of writing and unit testing the Controller class
  * Team member 2 will be in charge of writing and unit testing the View class
  * Team member 3 will be in charge of writing and unit testing the Model class
  * All team members are responsible for integration testing (putting the classes together and testing the final game)
  * What the game’s UI looks like is up to you. Use your team’s gaming experience to guide you. Be creative and use your imagination.