package dao;

import controller.PizzaController;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.Pizza;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class PizzaManagerTest {

    @Mock
    private PizzaManager pm;

    @InjectMocks
    private PizzaController pc;

   
    Pizza p = new Pizza();

    public PizzaManagerTest() {
    }

    @Before
    public void setUp() {

        
       // pc=new PizzaController();
        MockitoAnnotations.initMocks(this);
       // pc.setPm(pm);
//        when().thenReturn(new ArrayList<Pizza>());
        
        
    }

    /**
     * Test of addPizza method, of class PizzaManager.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testAddPizza() throws Exception {

        Mockito.doThrow(new IllegalArgumentException()).when(pm).addPizza(p);

    }

    /**
     * Test of removePizza method, of class PizzaManager.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRemovePizza() throws Exception {
        System.out.println("removePizza");
        Mockito.doThrow(new IllegalArgumentException()).when(pm).removePizza(p);

    }

    /**
     * Test of getAllPizzas method, of class PizzaManager.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGetAllPizzas() throws Exception {
        System.out.println("getAllPizzas");
         
        p.setId(0);
        p.setName("Ost");
        p.setPrice(70);
        p.setDescription("ost,tomat");
           pm.addPizza(p);
       
       
         // all.add(new Pizza("Ost",70,"ost,tomat"));
                 
        //MOCK ALERT: return mocked result set to get all pizzas
       // when(pm.getAllPizzas()).thenReturn(pc.getAllPizzas());
       // assertEquals(p,pm.addPizza(p));

    }

   
}
