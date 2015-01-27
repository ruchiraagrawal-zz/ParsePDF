
import java.io.FileOutputStream
import scala.Console
import java.io._
import org.apache.tika.parser.pdf._
import org.apache.tika.metadata._
import org.apache.tika.parser._
import org.xml.sax._
import org.apache.tika.sax.BodyContentHandler
import java.nio.file.Paths
import java.nio.file.Files
import java.nio.charset.StandardCharsets

object pdfParser {
 
  def parsePDF {
    val pdf: PDFParser = new PDFParser();
    val stream: InputStream = new FileInputStream("files/40_339675.pdf")
    val handler: ContentHandler = new BodyContentHandler()
    val metadata: Metadata = new Metadata()
    val context: ParseContext = new ParseContext()
    metadata.set("org.apache.tika.parser.pdf.sortbyposition", "true");
    metadata.set("org.apache.tika.parser.pdf.enableAutoSpace", "true");
    pdf.parse(stream, handler, metadata, context)

    Files.write(Paths.get("files/out.txt"), handler.toString().getBytes(StandardCharsets.UTF_8))
    stream.close()
  }

}


