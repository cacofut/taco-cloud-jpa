/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cacodev.model.repository;

import br.com.cacodev.tacocloudjpa.model.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author cristianoca
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String>{
    
    
}
