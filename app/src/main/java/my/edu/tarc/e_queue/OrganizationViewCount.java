package my.edu.tarc.e_queue;

public class OrganizationViewCount {
    public int organizationID;
    public int totalView;
    public int dailyView;
    public int monthlyView;
    public int anualView;

    public OrganizationViewCount() {
    }

    public OrganizationViewCount(int ID, int totalView, int daily, int monthly, int anual) {
        this.organizationID = ID;
        this.totalView = totalView;
        this.dailyView = daily;
        this.monthlyView = monthly;
        this.anualView = anual;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public int getTotalView() {
        return totalView;
    }

    public void setTotalView(int totalView) {
        this.totalView = totalView;
    }

    public int getDailyView() {
        return dailyView;
    }

    public void setDailyView(int dailyView) {
        this.dailyView = dailyView;
    }

    public int getMonthlyView() {
        return monthlyView;
    }

    public void setMonthlyView(int monthlyView) {
        this.monthlyView = monthlyView;
    }

    public int getAnualView() {
        return anualView;
    }

    public void setAnualView(int anualView) {
        this.anualView = anualView;
    }
}
