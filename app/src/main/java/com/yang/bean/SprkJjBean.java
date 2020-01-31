package com.yang.bean;

import java.util.List;

public class SprkJjBean {
    /**
     * result : true
     * code : 1000
     * message : 操作成功
     * data : [{"ngxb_ID":1,"ngxb_PCID":1,"ncp_ZL":496,"ncp_SCJD":"董家窑菜市场","ncp_SCDQ":"江西省南昌市","ncp_ID":1},{"ngxb_ID":2,"ngxb_PCID":1,"ncp_ZL":488,"ncp_SCJD":"董家窑菜市场","ncp_SCDQ":"江西省南昌市","ncp_ID":2},{"ngxb_ID":4,"ngxb_PCID":1,"ncp_ZL":200,"ncp_SCJD":"江西南昌水产批发市场","ncp_SCDQ":"江西省南昌市","ncp_ID":2},{"ngxb_ID":5,"ngxb_PCID":1,"ncp_ZL":200,"ncp_SCJD":"江西南昌水产批发市场11","ncp_SCDQ":"江西省南昌市","ncp_ID":2},{"ngxb_ID":10,"ngxb_PCID":1,"ncp_ZL":300,"ncp_SCJD":"扬子洲","ncp_SCDQ":"江西省南昌市","ncp_ID":1}]
     */

    private boolean result;
    private int code;
    private String message;
    public List<DataBean> data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * ngxb_ID : 1
         * ngxb_PCID : 1
         * ncp_ZL : 496
         * ncp_SCJD : 董家窑菜市场
         * ncp_SCDQ : 江西省南昌市
         * ncp_ID : 1
         */

        // 剩余重量
        private double ncp_SYZL;
        // 名称
        private String ncp_MC;
        // 生产地区
        private String ncp_SCDQ;
        // 购买重量
        private String ncp_buyWeight;
        // 重量类型 (1：Kg，2：吨)
        private int zlLx;

        public int getZlLx() {
            return zlLx;
        }

        public void setZlLx(int zlLx) {
            this.zlLx = zlLx;
        }


        public double getNcp_SYZL() {
            return ncp_SYZL;
        }

        public void setNcp_SYZL(double ncp_SYZL) {
            this.ncp_SYZL = ncp_SYZL;
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

        public String getNcp_buyWeight() {
            return ncp_buyWeight;
        }

        public void setNcp_buyWeight(String ncp_buyWeight) {
            this.ncp_buyWeight = ncp_buyWeight;
        }

    }
}
