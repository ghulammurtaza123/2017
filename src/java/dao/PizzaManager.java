/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Pizza;

@Stateless
public class PizzaManager {

    @PersistenceContext
    EntityManager em;
// add pizza

    public void addPizza(Pizza p) {

        em.persist(p);

    }

    public void editPizza(Pizza p) {

        em.merge(p);

    }

    public Pizza findById(Integer id) {

        return em.find(Pizza.class, id);
    }

    public void removePizza(Pizza p) {
        if (!em.contains(p)) {
            p = em.merge(p);
        }
        em.remove(p);

    }

    public List<Pizza> getAllPizzas() {
        Query q = em.createQuery("SELECT p FROM Pizza p");

        return q.getResultList();
    }

}
