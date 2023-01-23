/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author zento
 */
@Entity
public class Posts implements Serializable {

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

    private enum typesOfPosts {

        offerItem,
        searchItem;
    }
    private float price;

    private Long neighbourhood_id;

    private Long user_id;

    private String description_id;

    private typesOfPosts typeOfPost;

    private String title;

    private String photo;

    /**
     * Get the value of photo
     *
     * @return the value of photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Set the value of photo
     *
     * @param photo new value of photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the value of typeOfPost
     *
     * @return the value of typeOfPost
     */
    public typesOfPosts getTypeOfPost() {
        return typeOfPost;
    }

    /**
     * Set the value of typeOfPost
     *
     * @param typeOfPost new value of typeOfPost
     */
    public void setTypeOfPost(typesOfPosts typeOfPost) {
        this.typeOfPost = typeOfPost;
    }

    /**
     * Get the value of description_id
     *
     * @return the value of description_id
     */
    public String getDescription_id() {
        return description_id;
    }

    /**
     * Set the value of description_id
     *
     * @param description_id new value of description_id
     */
    public void setDescription_id(String description_id) {
        this.description_id = description_id;
    }

    /**
     * Get the value of user_id
     *
     * @return the value of user_id
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * Set the value of user_id
     *
     * @param user_id new value of user_id
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     * Get the value of neighbourhood_id
     *
     * @return the value of neighbourhood_id
     */
    public Long getNeighbourhood_id() {
        return neighbourhood_id;
    }

    /**
     * Set the value of neighbourhood_id
     *
     * @param neighbourhood_id new value of neighbourhood_id
     */
    public void setNeighbourhood_id(Long neighbourhood_id) {
        this.neighbourhood_id = neighbourhood_id;
    }

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(float price) {
        this.price = price;
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
        if (!(object instanceof Posts)) {
            return false;
        }
        Posts other = (Posts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.polsl.entities.Posts[ id=" + id + " ]";
    }

}
