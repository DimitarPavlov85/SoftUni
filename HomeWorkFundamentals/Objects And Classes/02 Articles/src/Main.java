
import java.util.Scanner;

public class Main {
    public static class Articles {
        private String Title;
        private String Content;
        private String Author;

        Articles(String _Title, String _Content, String _Author) {
            this.Title = _Title;
            this.Content = _Content;
            this.Author = _Author;
        }

        public String Edit(String NewContent) {
            return this.Content = NewContent;
        }

        public String ChangeAuthor(String NewAuthor) {
            return this.Author = NewAuthor;
        }

        public String Rename(String Newtitle) {
            return this.Title = Newtitle;
        }

        public String ToString() {
            return this.Title + " -" + this.Content + ":" + this.Author;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine();
        String[] LineOfArrays = Line.split("\\,");
        int Number = sc.nextInt();
        Articles _articles = new Articles(LineOfArrays[0], LineOfArrays[1], LineOfArrays[2]);
        for (int i = 0; i < Number; i++) {
            String Comand = sc.next();
            String NewComands=sc.nextLine();

            if(Comand .equals("Edit:")){
                _articles.Edit(NewComands);
            }
            else if(Comand.equals("ChangeAuthor:")){
                _articles.ChangeAuthor(NewComands);
            }else if(Comand.equals("Rename:")){
                _articles.Rename(NewComands);
            }
        }
        System.out.print(_articles.ToString());
    }
}
