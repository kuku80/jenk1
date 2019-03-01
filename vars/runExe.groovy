#!/usr/bin/env groovy

def runExe(String path) {
  echo "Hello, ${path}"
  def sout = new StringBuilder(), serr = new StringBuilder()
  def args = ['cmd', '/c', "${path}"]
  def proc = new ProcessBuilder( args )
  Process process = proc.start()
  process.consumeProcessOutput( sout, serr )
  process.waitForOrKill( 2000 )
}

