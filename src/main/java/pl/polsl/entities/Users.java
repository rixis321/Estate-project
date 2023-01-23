/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author zento
 */
@Entity
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //TODO to moga byc listy !
    private Long tool_id;
    
    private Long opinion_id;
    
    private String name;
    
    private String surname;

    private int phoneNumber;
    
    private boolean visibility;

        private List<Long> friends;

    /**
     * Get the value of friends
     *
     * @return the value of friends
     */
    public List<Long> getFriends() {
        return friends;
    }

    /**
     * Set the value of friends
     *
     * @param friends new value of friends
     */
    public void setFriends(List<Long> friends) {
        this.friends = friends;
    }

    /**
     * Get the value of visibility
     *
     * @return the value of visibility
     */
    public boolean isVisibility() {
        return visibility;
    }

    /**
     * Set the value of visibility
     *
     * @param visibility new value of visibility
     */
    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    /**
     * Get the value of phoneNumber
     *
     * @return the value of phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the value of phoneNumber
     *
     * @param phoneNumber new value of phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get the value of surname
     *
     * @return the value of surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the value of surname
     *
     * @param surname new value of surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /**
     * Get the value of opinion_id
     *
     * @return the value of opinion_id
     */
    public Long getOpinion_id() {
        return opinion_id;
    }

    /**
     * Set the value of opinion_id
     *
     * @param opinion_id new value of opinion_id
     */
    public void setOpinion_id(Long opinion_id) {
        this.opinion_id = opinion_id;
    }

    /**
     * Get the value of tool_id
     *
     * @return the value of tool_id
     */
    public Long getTool_id() {
        return tool_id;
    }

    /**
     * Set the value of tool_id
     *
     * @param tool_id new value of tool_id
     */
    public void setTool_id(Long tool_id) {
        this.tool_id = tool_id;
    }

    private String password;

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    private String bornDate;

    /**
     * Get the value of bornDate
     *
     * @return the value of bornDate
     */
    public String getBornDate() {
        return bornDate;
    }

    /**
     * Set the value of bornDate
     *
     * @param bornDate new value of bornDate
     */
    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.polsl.entities.Users[ id=" + id + " ]";
    }

}
