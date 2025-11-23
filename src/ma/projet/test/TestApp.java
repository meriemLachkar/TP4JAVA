package ma.projet.test;

import java.util.Iterator;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {

	public static void main(String args[]) {

		Categorie[] categories = new Categorie[2];

		categories[0] = new Categorie("O PR", "Ordinateur Portable");
		categories[1] = new Categorie("O PO", "Ordinateur Poste");

		Article[] articles = new Article[4];

		articles[0] = new Article(14, "DELL INSPIRON", categories[0]);
		articles[1] = new Article(4, "SONY VAIO", categories[0]);
		articles[2] = new Article(74, "TERRA", categories[1]);
		articles[3] = new Article(785, "HP Compaq", categories[1]);

		for (int i = 0; i < categories.length; i++) {
			Categorie c = categories[i];
			System.out.println(c.getLibelle()+ " :");

			for (int j = 0; j < articles.length; j++) {
				if (articles[j].getCategorie().getId() == c.getId()) {
					System.out.println(articles[j].toString());
				}
			}
			System.out.println();
		}

	}
}