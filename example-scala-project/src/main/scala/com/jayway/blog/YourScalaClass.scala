package com.jayway.blog

object YourScalaClass {
  def main(args: Array[String]): Unit = {
    val yourClass = new YourScalaClass
    yourClass.yourMethodAroundDontRun()
    yourClass.yourMethodAroundRunTrue()
    yourClass.yourMethodAroundRun()
  }
}

class YourScalaClass {
  @YourAnnotation(isRun = false) def yourMethodAroundDontRun(): Unit = {
    System.out.println("Executing TestTarget.yourMethodAroundDontRun()")
  }

  @YourAnnotation(isRun = true) def yourMethodAroundRunTrue(): Unit = {
    System.out.println("Executing TestTarget.yourMethodAroundRunTrue()")
  }

  @YourAnnotation def yourMethodAroundRun(): Unit = {
    System.out.println("Executing TestTarget.yourMethodAroundRun()")
  }
}
