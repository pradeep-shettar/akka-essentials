package com.akka.playground

import akka.actor.ActorSystem

object HelloWorld extends App {
  val actorSystem = ActorSystem("HelloAkka")
  println(actorSystem.name)
}
