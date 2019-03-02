#!/usr/bin/env groovy

def call(String binPath,String serviceName) {
  echo "Hello, ${binPath} , ${serviceName}"
  //def sout = new StringBuilder(), serr = new StringBuilder()
  //def args = ['calc.exe']
  //def proc = new ProcessBuilder( args )
  //Runtime.runtime.exec("cmd /c ipconfig")
  //Process process = proc.start()
  //process.consumeProcessOutput( sout, serr )
  //process.waitForOrKill( 2000 )
 //println System.getenv("PATH")
 // println "${path}".execute().text
  bat "sc create ${serviceName} binpath=${binPath}"
  bat "sc start ${serviceName}
}

