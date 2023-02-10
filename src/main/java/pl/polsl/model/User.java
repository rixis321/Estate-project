/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import pl.polsl.entities.Opinions;

/**
 *
 * @author zento
 */
public class User {

    private EntityManager em;
    private EntityTransaction transaction;

    private String bornDate;
    private String email;
    private String password;
    private ArrayList<Long> toolsId = new ArrayList();
    private ArrayList<Long> opinionsId = new ArrayList();
    private int userId;
    private String name;
    private String surname;
    private int telephoneNumber;
    private boolean visibility;
    private ArrayList<Long> friends = new ArrayList();

    public ArrayList<Long> getToolId() {
        return toolsId;
    }

    public void setToolId(ArrayList<Long> toolId) {
        this.toolsId = toolId;
    }

    public ArrayList<Long> getOpinionId() {
        return opinionsId;
    }

    public void setOpinionId(ArrayList<Long> opinionId) {
        this.opinionsId = opinionId;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public ArrayList<Long> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Long> friends) {
        this.friends = friends;
    }

    public void setUserProperties(String name, String surname, String bornDate, int number, String email, String password) {

        this.setName(name);
        this.setSurname(surname);
        this.setBornDate(bornDate);
        this.setTelephoneNumber(number);
        this.setEmail(email);
        this.setPassword(password);

    }

    private boolean checkNameOrSurname(String name) {
        if (!name.matches("[a-zA-Z]")) {
            return false;
        }
        return true;

    }

    /*Daty nie ma co sprawdzac bo zrobi sie z HTMLA*/
//       public boolean checkbornDate(String name){
//        if(!name.matches("[a-zA-Z]")){
//            return false;
//        }
//        return true;
//       
//    }
    private boolean checkPhoneNumber(String number) {
        if (!number.matches("[0-9]{9}")) {
            return false;
        }

        return true;
    }

    private boolean checkEmail(String mail) {
        if (!mail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return false;
        }
        return true;
    }

    private boolean checkPassword(String password) {
        if (!password.matches("^(?=.[A-Z])(?=.\\d)(?=.[@$!%#?&])[A-Za-z\\d@$!%*#?&]{8,}$")) {
            return false;
        }

        return true;
    }

    /**
     * funkcja sprawdza input od uzytkownika return 1 ozancza ze IMIE
     * uzytkownika jest zle return 2 oznacza ze NAZWISKO uzytkownika jest zle
     * return 3 oznacza ze NUMER TELEFONU jest nieprawidlowy return 4 oznacza ze
     * EMAIL jest nieprawidlowy return 5 oznacza ze HASLO jest nieprawidlowe
     * (HASLO MUSI!!!!!!!! ZAWIERAC CHOCIAZ JEDNA WIELKA LITERE ORAZ JEDNA CYFRE
     * I JEDEN ZNAK SPECJALNY I PRZYNAJMNIEJ 8 ZNAKOW return 0 oznacza ze
     * wszystko jest ok(sprawdzenie przeszlo git)
     */
    public int checkUserProperties(String name, String surname, String number, String mail, String password) {
        if (!this.checkNameOrSurname(name)) {
            return 1;
        }
        if (!this.checkNameOrSurname(surname)) {
            return 2;
        }
        if (!this.checkPhoneNumber(number)) {
            return 3;
        }
        if (!this.checkEmail(mail)) {
            return 4;
        }
        if (!this.checkPassword(password)) {
            return 5;
        }
        return 0;

    }

    //TODO aktualizacja danych
    public boolean deleteOpinion(long opinionId) {
        for (long opin : opinionsId) {
            if (opin == opinionId) {
                opinionsId.remove(opin);
                return true;
            }
        }
        return false;
    }

    /** funkcja ktora dodaje opinie do konta
     * @param text opis opinii
     * @param user_id id uzytkownika ktora wystawia opinie 
     */
    public void addOpinion(String text, long user_id) {
        Opinions opinion = new Opinions();
        opinion.setDescription(text);
        opinion.setAuthor_id(user_id);
        opinion.setUser_id(this.userId);
        opinionsId.add(opinion.getId());
        //opinion.setUser(this);
         this.persistObject(opinionsId);

    }

    /**
     * Method returns entityManager parameter.
     *
     * @return entityManager parameter
     */
    public EntityManager getEntityManager() {
        return em;
    }

    /**
     * Method returns transaction parameter.
     *
     * @return transaction parameter
     */
    public EntityTransaction getTransaction() {
        return transaction;
    }
    
        public void persistObject(Object object) {
        transaction.begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {

        }

    }
        

    public User() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_registerWeb_war_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
        transaction = em.getTransaction();
       
        
    }
    
    

}
