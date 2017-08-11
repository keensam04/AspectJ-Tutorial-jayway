package com.jayway.blog

object YourScalaClass {
  def main(args: Array[String]): Unit = {
    val yourClass = new YourScalaClass
    yourClass.yourMethodAroundDontRun()
    yourClass.yourMethodAroundRunTrue()
    yourClass.yourMethodAroundRun()
    /*yourClass.testThrowable()*/
    yourClass.mainMethod()
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

  @YourAnnotation def testThrowable() ={
    throw new Exception("Simulate error")
  }

  def mainMethod() = {

    System.out.println("Inside main method");

    @MyAnnotation2
    val someThing = "someThing"

    System.out.println("Calling second method");
    val connection = secondMethod();
    System.out.println("Exiting main method");
  }
  @MyAnnotation def secondMethod():String={
    System.out.println("Entered second method");
    System.out.println("Inside second method");
    System.out.println("Exiting second method");
    "ConnectionObject"
  }
}
