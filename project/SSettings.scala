package sbtstudent

object SSettings {
  import scala.Console._
  val consoleColorMap: Map[String, String] =
    Map("GREEN" -> GREEN, "RED" -> RED, "BLUE" -> BLUE, "CYAN" -> CYAN, "YELLOW" -> YELLOW, "WHITE" -> WHITE, "BLACK" -> BLACK, "MAGENTA" -> MAGENTA)

  val testFolders = List("src/test")

  val studentifiedBaseFolder = "demo_stage"

  val promptManColor         = "GREEN"
  val promptExerciseColor    = "GREEN"
  val promptCourseNameColor = "GREEN"
}
       