import akka.actor.Actor
import akka.actor.Props
import akka.event.Logging
import akka.actor.Props
 

class MyActor extends Actor {
  val log = Logging(context.system, this)
  def receive = {
    case "test" => log.info("received test")
    case _      => log.info("received unknown message")
  }
}

class Thing {
  def method():Int = {
    return 4
  }
}

object Test{
  def main(args: Array[String]):Unit = {
    val props1 = Props[MyActor];
    println("1");
  }
  def test(a: Int): Int = { return 1; }
  def factorial(n: Int): Int = {
    def factorialHelper(n: Int, productThusFar: Int): Int = {
      if(n==1) productThusFar else factorialHelper(n-1, productThusFar*n)
    }
    factorialHelper(n, 1)
  }
}

