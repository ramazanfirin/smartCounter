package com.smartcounter.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.smartcounter.domain.enumeration.AGE;

import com.smartcounter.domain.enumeration.GENDER;

/**
 * A Customer.
 */
@Entity
@Table(name = "customer")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "insert_date")
    private LocalDate insertDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "age")
    private AGE age;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private GENDER gender;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInsertDate() {
        return insertDate;
    }

    public Customer insertDate(LocalDate insertDate) {
        this.insertDate = insertDate;
        return this;
    }

    public void setInsertDate(LocalDate insertDate) {
        this.insertDate = insertDate;
    }

    public AGE getAge() {
        return age;
    }

    public Customer age(AGE age) {
        this.age = age;
        return this;
    }

    public void setAge(AGE age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public Customer gender(GENDER gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        if (customer.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), customer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Customer{" +
            "id=" + getId() +
            ", insertDate='" + getInsertDate() + "'" +
            ", age='" + getAge() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }
}
