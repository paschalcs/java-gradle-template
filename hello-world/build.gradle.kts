plugins {
  id("application")
  id("org.unbroken-dome.test-sets") version "4.1.0"
}

apply(plugin = "application")
application {
    mainClass.set("edu.paschalcs.HelloWorld")
}

sourceSets{
  main {
    java {
      srcDir("edu/paschalcs")
    }
  }
}

testSets {
  create("integrationTest")
}