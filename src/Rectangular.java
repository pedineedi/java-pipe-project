public class Rectangular {
   public static void main(String[] args){
	   int lenght = Integer.parseInt(args[0]);
	   int width  = Integer.parseInt(args[1]]);
	   Rectangle myrec = new Rectangle ( lenght , width);
	   String output = String.format("*** your Rectangle ***\n\nlength :%d\n	Width: %d\nArea: %d\nPerimeter: %d\n\n", myrec.lenght, myrec.width, myrec.getArea(), myrec.getPerimeter());
	   System.out.println(output):
   }

}

