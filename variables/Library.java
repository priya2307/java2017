public class Library{
String name_of_library;
String name_of_book;
int number_of_books;
static String place_of_library;
}
 public void ucm()
{
 public static void main(String[])
  {
  Library l1=new Library();
  l1.name_of_book="projectmanagement";
  l1.number_of_books=150;
  l1.name_of_library="Trg";
  Library.place_of_library="missouri";

  Library l2=new Library();
  l2.name_of_book="indutrialmanagement";
  l2.number_of_books=155;
  l2.name_of_library="Union";
  Library.place_of_library="missouri";
  
  System.out.println(l1.name_of_book);
  System.out.println(l2.name_of_book);
  System.out.println(l2.name_of_library);
  }
}









