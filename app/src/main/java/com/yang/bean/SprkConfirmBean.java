package com.yang.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class SprkConfirmBean implements Parcelable {
    private double ncp_ZL;
    private String ncp_MC;
    private String ncp_SCDQ;
    private double ncp_kczl;

    public double getNcp_ZL() {
        return ncp_ZL;
    }

    public void setNcp_ZL(double ncp_ZL) {
        this.ncp_ZL = ncp_ZL;
    }

    public double getNcp_kczl() {
        return ncp_kczl;
    }

    public void setNcp_kczl(double ncp_kczl) {
        this.ncp_kczl = ncp_kczl;
    }

    public String getNcp_MC() {
        return ncp_MC;
    }

    public void setNcp_MC(String ncp_MC) {
        this.ncp_MC = ncp_MC;
    }

    public String getNcp_SCDQ() {
        return ncp_SCDQ;
    }

    public void setNcp_SCDQ(String ncp_SCDQ) {
        this.ncp_SCDQ = ncp_SCDQ;
    }

    public static Creator<SprkConfirmBean> getCREATOR() {
        return CREATOR;
    }

    public SprkConfirmBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.ncp_ZL);
        dest.writeString(this.ncp_MC);
        dest.writeString(this.ncp_SCDQ);
        dest.writeDouble(this.ncp_kczl);
    }

    protected SprkConfirmBean(Parcel in) {
        this.ncp_ZL = in.readDouble();
        this.ncp_MC = in.readString();
        this.ncp_SCDQ = in.readString();
        this.ncp_kczl = in.readDouble();
    }

    public static final Creator<SprkConfirmBean> CREATOR = new Creator<SprkConfirmBean>() {
        @Override
        public SprkConfirmBean createFromParcel(Parcel source) {
            return new SprkConfirmBean(source);
        }

        @Override
        public SprkConfirmBean[] newArray(int size) {
            return new SprkConfirmBean[size];
        }
    };
}
