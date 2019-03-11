package fr.aberwag.universite.matiere.service;

import java.util.List;

import fr.aberwag.universite.matiere.domain.Matiere;

public interface IMatiereService {
	public List<Matiere> findAll();
	public Matiere findOne(Integer id);
}
