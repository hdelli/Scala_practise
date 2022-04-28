package exercises

object DefaultArgs extends App{

  def savePicture(format:String = "jpeg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width=800)
  //OR
  savePicture(width=1000, format="bpm", height= 120)//you can pass them in different orders

  /*
  when you call a function with the same parameters
  options for default arguments
  1.pass in every leading argument that you want to change
  2.name the arguments
   */



}
