package gameInstance

/** For performance reason, making every element of game instance mutable
 *  is not possible. However, we should rely on immutables as much as possible
 *  because of the parallelism.
 */
class GameInstance
{
  val StartOfHistory = 219000 // roughly 600 years after the start of game universe
  val EndOfHistory = 730000 // roughly 2000 years
  var currentTurn = StartOfHistory;
  
  def processOneTurn()
  {
    currentTurn += 1
    // TODO: processing causes side effects?    
    println("Turn " + currentTurn.toString + " Processed.")
  }
  
  
  def run()
  {
    while (currentTurn < EndOfHistory) processOneTurn
  }
}