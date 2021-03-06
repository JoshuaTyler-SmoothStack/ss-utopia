package com.utopia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "airplane_type")
public class AirplaneType implements Serializable {

  private static final long serialVersionUID = -4518915396094953540L;

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "max_capacity")
	private Integer maxCapacity;

  public AirplaneType(Integer id, Integer maxCapacity) {
    super();
    this.setId(id);
    this.setMaxCap(maxCapacity);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
	}


  public Integer getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCap(Integer maxCapacity) {
    this.maxCapacity = maxCapacity;
	}

  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    AirplaneType other = (AirplaneType) obj;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    return true;
  }
}