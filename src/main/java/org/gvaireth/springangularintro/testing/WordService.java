package org.gvaireth.springangularintro.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {

	@Autowired
	private WordCounter wordCounter;

	public int countWords(String sentence) {
		sentence = sentence != null ? sentence.trim() : "";
		return wordCounter.countWords(sentence);
	}
}
