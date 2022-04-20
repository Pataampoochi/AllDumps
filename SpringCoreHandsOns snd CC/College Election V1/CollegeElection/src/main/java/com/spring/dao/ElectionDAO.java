package com.spring.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.model.Candidate;

//Use appropriate annotation
@Component
public class ElectionDAO {
	@Autowired
	private ArrayList<Candidate> voteList = new ArrayList<Candidate>();

	public Candidate candidateWithMaximumVote() {
		int max = 0;
		Candidate withMaxVote = null;
		for (Candidate candidate : voteList) {
			if (candidate.getNumberOfVotes() > max) {
				withMaxVote = candidate;
				max = candidate.getNumberOfVotes();
			}
		}
		return withMaxVote;
	}

	public int getTotalVotes() {
		return Candidate.getTotalVotes();
	}

	public int unpolledVotes() {
		return getTotalVotes() - totalpolledVotes();
	}

	public int totalpolledVotes() {
		int total = 0;
		for (Candidate candidate : voteList) {
			total += candidate.getNumberOfVotes();
		}
		return total;
	}

	public ElectionDAO() {
	}

	public ArrayList<Candidate> getVoteList() {
		return voteList;
	}

	public void setVoteList(ArrayList<Candidate> voteList) {
		this.voteList = voteList;
	}
}
