#!/usr/bin/env groovy

def call(String path) {
  echo "Hello, ${path}"
  def sout = new StringBuilder(), serr = new StringBuilder()
  def args = ['C:\\Windows\\system32\\cmd.exe','/c','c:\\windows\\system32\\calc.exe']
  def proc = new ProcessBuilder( args )
  //Runtime.runtime.exec("cmd /c ipconfig")
  Process process = proc.start()
  process.consumeProcessOutput( sout, serr )
  process.waitForOrKill( 2000 )
 //println System.getenv("PATH")
 // println "${path}".execute().text
}

