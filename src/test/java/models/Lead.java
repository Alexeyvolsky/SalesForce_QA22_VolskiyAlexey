package models;

import enums.*;

import java.util.Objects;

public class Lead {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String phone;
    private final String title;
    private final String email;
    private final String website;
    private final String city;
    private final String province;
    private final String postalCode;
    private final String country;
    private final String numberOfEmployees;
    private final String annualRevenue;
    private final String street;
    private final String description;
    private final Industry industry;
    private final String fullName;
    private final String fullAddress;
    private final Salutation salutation;
    private final LeadStatus leadStatus;
    private final Rating rating;
    private final LeadSource leadSource;


    private Lead(LeadBuilder leadBuilder) {
        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.company = leadBuilder.company;
        this.phone = leadBuilder.phone;
        this.title = leadBuilder.title;
        this.email = leadBuilder.email;
        this.website = leadBuilder.website;
        this.city = leadBuilder.city;
        this.province = leadBuilder.province;
        this.postalCode = leadBuilder.postalCode;
        this.country = leadBuilder.country;
        this.numberOfEmployees = leadBuilder.numberOfEmployees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.street = leadBuilder.street;
        this.description = leadBuilder.description;
        this.leadStatus = leadBuilder.leadStatus;
        this.rating = leadBuilder.rating;
        this.leadSource = leadBuilder.leadSource;
        this.industry = leadBuilder.industry;
        this.fullName = leadBuilder.fullName;
        this.salutation = leadBuilder.salutation;
        this.fullAddress = leadBuilder.fullAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getPhone() {
        return phone;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getStreet() {
        return street;
    }

    public String getDescription() {
        return description;
    }

    public LeadStatus getLeadStatus() {
        return leadStatus;
    }

    public Rating getRating() {
        return rating;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public Industry getIndustry() {
        return industry;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public String getFullName() {
        if (this.fullName != null) {
            return this.fullName;
        } else {
            String salutation = Objects.isNull(this.salutation) ? "" : this.salutation.getName();
            String firstName = Objects.isNull(this.firstName) ? "" : this.firstName;
            String lastName = Objects.isNull(this.lastName) ? "" : this.lastName;
            return (salutation + " " + firstName + " " + lastName).trim();
        }
    }
    public String getFullAddress(){
        if(this.fullAddress != null){
            return this.fullAddress;
        }else {
            String street = Objects.isNull(this.street) ? "" : this.street + "\n";
            String city = Objects.isNull(this.city) ? "" : this.city + ", ";
            String province = Objects.isNull(this.province) ? "" : this.province;
            String postalCode = Objects.isNull(this.postalCode) ? "" : String.valueOf(this.postalCode);
            String country = Objects.isNull(this.country) ? "" : "\n" + this.country;
            return (street + city + province + postalCode + country).trim();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return Objects.equals(getFullName(), lead.getFullName())
                && Objects.equals(company, lead.company) && Objects.equals(phone, lead.phone)
                && Objects.equals(title, lead.title) && Objects.equals(email, lead.email)
                && Objects.equals(website, lead.website) && Objects.equals(numberOfEmployees, lead.numberOfEmployees)
                && Objects.equals(annualRevenue, lead.annualRevenue) && Objects.equals(description, lead.description)
                && Objects.equals(leadStatus, lead.leadStatus) && Objects.equals(rating, lead.rating)
                && Objects.equals(leadSource, lead.leadSource) && Objects.equals(industry, lead.industry)
                && Objects.equals(fullName, lead.fullName) && Objects.equals(fullAddress, lead.fullAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, phone, title, email, website, city, province, postalCode,
                country, numberOfEmployees, annualRevenue, street, description, leadStatus, rating, leadSource,
                industry, getFullName(), getFullAddress());
    }

    @Override
    public String toString() {
        return "Lead {" +
                " company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", numberOfEmployees='" + numberOfEmployees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", description='" + description + '\'' +
                ", leadStatus='" + leadStatus + '\'' +
                ", rating='" + rating + '\'' +
                ", leadSource='" + leadSource + '\'' +
                ", industry='" + industry + '\'' +
                ", fullName='" + fullName + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                '}';
    }

    public static class LeadBuilder {
        private String firstName;
        private String lastName;
        private String company;
        private String phone;
        private String title;
        private String email;
        private String website;
        private String city;
        private String province;
        private String postalCode;
        private String country;
        private String numberOfEmployees;
        private String annualRevenue;
        private String street;
        private String description;
        private Industry industry;
        private String fullName;
        private String fullAddress;

        private Salutation salutation;
        private LeadStatus leadStatus;
        private Rating rating;
        private LeadSource leadSource;


        public LeadBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public LeadBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public LeadBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public LeadBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public LeadBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public LeadBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public LeadBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public LeadBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public LeadBuilder setProvince(String province) {
            this.province = province;
            return this;
        }

        public LeadBuilder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public LeadBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public LeadBuilder setNumberOfEmployees(String numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public LeadBuilder setAnnualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public LeadBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public LeadBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public LeadBuilder setLeadSource(LeadSource leadSource) {
            this.leadSource = leadSource;
            return this;
        }

        public LeadBuilder setIndustry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public LeadBuilder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public LeadBuilder setFullAddress(String fullAddress) {
            this.fullAddress = fullAddress;
            return this;
        }

        public LeadBuilder setSalutation(Salutation salutation) {
            this.salutation = salutation;
            return this;
        }

        public LeadBuilder setLeadStatus(LeadStatus leadStatus) {
            this.leadStatus = leadStatus;
            return this;
        }

        public LeadBuilder setRating(Rating rating) {
            this.rating = rating;
            return this;
        }

        public Lead build() {
            if ( this.fullName == null && this.fullAddress == null) {
                String salutation = Objects.isNull(this.salutation) ? "" : this.salutation.getName();
                String firstName = Objects.isNull(this.firstName) ? "" : this.firstName;
                String lastName = Objects.isNull(this.lastName) ? "" : this.lastName;
                String street = Objects.isNull(this.street) ? "" : this.street + "\n";
                String city = Objects.isNull(this.city) ? "" : this.city + ", ";
                String province = Objects.isNull(this.province) ? "" : this.province + " ";
                String postalCode = Objects.isNull(this.postalCode) ? "" : this.postalCode;
                String country = Objects.isNull(this.country) ? "" : "\n" + this.country;
                this.fullAddress = (street + city + province + postalCode + country).trim();
                this.fullName = (salutation + " " + firstName + " " + lastName).trim();
                return new Lead(this);
            }return new Lead(this);
        }

    }
}
