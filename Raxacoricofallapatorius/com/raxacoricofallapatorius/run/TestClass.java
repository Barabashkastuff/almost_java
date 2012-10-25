package com.raxacoricofallapatorius.run;

import java.util.ArrayList;

import com.raxacoricofallapatorius.analyzer.LexicalAnalyzer;
import com.raxacoricofallapatorius.service.ParseException;
import com.raxacoricofallapatorius.service.Token;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("**********first test****************");
		LexicalAnalyzer la = new LexicalAnalyzer(
				"p for drew while serega true vlad\nawesome(var{break else paper if somethin}mouse/int 4 float 4.5 str \"sss\" pampam)");
		ArrayList<Token> tokenlist = null;
		try {
			la.parse();
			tokenlist = la.getTokens();
			for (Token token : tokenlist) {
				System.out.println(token.toString());
			}
		} catch (ParseException e) {
			System.out.println(e);
		}

		System.out.println("**********second test****************");
		la = new LexicalAnalyzer(
				"void\"123 if\" \"true_\"\"breakdown\" \nmake total insane \"\"\n void \"\"");
		try {
			la.parse();
			tokenlist = la.getTokens();
			for (Token token : tokenlist) {
				System.out.println(token.toString());
			}
		} catch (ParseException e) {
			System.out.println(e);
		}

		System.out.println("------------------------");
	}
}
