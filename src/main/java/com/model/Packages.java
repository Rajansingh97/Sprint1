package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
	public class Packages {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		private Integer packageId;

		@NotNull(message = "Package Name Cannot Be Null!")
		@Size(min = 10, max = 100, message = "Package Name Length must be between 10 to 100 characters.")

		private String packageName;

		@NotNull(message = "Package Description Cannot Be Null!")
		@Size(min = 10, max = 1000, message = "Package Description Length must be between 10 to 1000 characters.")


		private String packageDescription;
		
		@NotNull(message="Package Not Rated Yet")
		private String packageRating = "Package Not Rated Yet";

		public Packages() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Packages(Integer packageId,
				@NotNull(message = "Package Name Cannot Be Null!") @Size(min = 10, max = 100, message = "Package Name Length must be between 10 to 100 characters.") String packageName,
				@NotNull(message = "Package Description Cannot Be Null!") @Size(min = 10, max = 1000, message = "Package Description Length must be between 10 to 1000 characters.") String packageDescription,
				@NotNull(message = "Package Not Rated Yet") String packageRating) {
			super();
			this.packageId = packageId;
			this.packageName = packageName;
			this.packageDescription = packageDescription;
			this.packageRating = packageRating;
		}

		public Integer getPackageId() {
			return packageId;
		}

		public void setPackageId(Integer packageId) {
			this.packageId = packageId;
		}

		public String getPackageName() {
			return packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getPackageDescription() {
			return packageDescription;
		}

		public void setPackageDescription(String packageDescription) {
			this.packageDescription = packageDescription;
		}

		public String getPackageRating() {
			return packageRating;
		}

		public void setPackageRating(String packageRating) {
			this.packageRating = packageRating;
		}

		@Override
		public String toString() {
			return "Packages [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
					+ packageDescription + ", packageRating=" + packageRating + "]";
		}
		
		
		


}
