package enums;

public enum LeadSource {
    ADVERTISEMENT("Advertisement"),
    EMPLOYEE("Employee Referral"),
    EXTERNAL("External Referral"),
    INSTORE("In-Store"),
    ONSITE("On Site"),
    OTHER("Other"),
    SOCIAL("Social"),
    TRADE("Trade Show"),
    WEB("Web"),
    WORD("Word of mouth");
    private final String name;
    LeadSource(final String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public static LeadSource fromString(String value) {
        for (LeadSource leadSource : LeadSource.values()) {
            if (leadSource.getName().equals(value)) {
                return leadSource;
            }
        }
        return null;
    }

}
