package os

import java.io.{InputStream, OutputStream}

object Internals {

  val emptyStringArray = Array.empty[String]

  def transfer0(src: InputStream, preReadCallback: () => Unit, sink: (Array[Byte], Int) => Unit) = {
    val buffer = new Array[Byte](8192)
    var r      = 0
    while (r != -1) {
      preReadCallback()
      r = src.read(buffer)
      if (r != -1) sink(buffer, r)
    }
    src.close()
  }

  def transfer(src: InputStream, dest: OutputStream) = transfer0(
    src,
    () => (), // do nothing
    dest.write(_, 0, _),
  )
}