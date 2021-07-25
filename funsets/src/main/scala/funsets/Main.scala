package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  println(contains(map(x => x > 0 , x => x*2),1))
}

