//WAP in java to create a package for book details giving BookName,AuthorName,Price & Year Of Publishing.
package ABC;
public class BookDetails
{
		String BookName="Java";
		String AuthorName="James Gosling";
		float Price=100;
		int YearOfPublishing=2018;
		public void display()
		{
			System.out.println("BookName="+BookName);
			System.out.println("AuthorName="+AuthorName);
			System.out.println("Price of Book="+Price);
			System.out.println("Year Of Publishing Of Book="+YearOfPublishing);
		}
}