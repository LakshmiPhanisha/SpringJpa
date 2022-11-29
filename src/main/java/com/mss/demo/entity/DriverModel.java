package com.mss.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver")
public class DriverModel {
		@Id
		private int id;
		private String name;
		private String gender;
		private String pancard;
		private String lisence;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPancard() {
			return pancard;
		}
		public void setPancard(String pancard) {
			this.pancard = pancard;
		}
		public String getLisence() {
			return lisence;
		}
		public void setLisence(String lisence) {
			this.lisence = lisence;
		}
}

		

