
import java.util.Scanner;

public class Main {
    public static class Articles {
        private String title;
        private String content;
        private String author;

        Articles(String _title, String _content, String _author) {
            this.title = _title;
            this.content = _content;
            this.author = _author;
        }

        public String Edit(String NewContent) {
            return this.content  = NewContent;
        }

        public String ChangeAuthor(String NewAuthor) {
            return this.author  = NewAuthor;
        }

        public String Rename(String Newtitle) {
            return this.title = Newtitle;
        }

        public String ToString() {
            return this.title + " -" + this.content + ":" + this.author;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineOfArrays = line.split("\\,");
        int number = sc.nextInt();
        Articles _articles = new Articles(lineOfArrays[0], lineOfArrays[1],lineOfArrays[2]);
        for (int i = 0; i < number; i++) {
            String comand = sc.next();
            String newComands=sc.nextLine();

            if(comand .equals("Edit:")){
                _articles.Edit(newComands);
            }
            else if(comand.equals("ChangeAuthor:")){
                _articles.ChangeAuthor(newComands);
            }else if(comand.equals("Rename:")){
                _articles.Rename(newComands);
            }
        }
        System.out.print(_articles.ToString());
    }
}
