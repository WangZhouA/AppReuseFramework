package com.ruide.subway.bean;

import java.util.List;

public class LoginBean {

    /**
     * code : 200
     * msg : 登录成功!
     * data : {"token":"ec609df2e27b6740e5d58098eb9b1ffb84307bb9a5337779dc6d2ed70bdca3f2","user":{"user_id":125,"user_type":3,"user_login":"514077686123@qq.com","user_email":"514077686123@qq.com","avatar":"","monitoredDevice":0,"accountId":"514077686123@qq.com","pin":"1111","notificationEmail":"514077686123@qq.com","purchasedDevice":0,"deviceRemained":0},"devices":[]}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * token : ec609df2e27b6740e5d58098eb9b1ffb84307bb9a5337779dc6d2ed70bdca3f2
         * user : {"user_id":125,"user_type":3,"user_login":"514077686123@qq.com","user_email":"514077686123@qq.com","avatar":"","monitoredDevice":0,"accountId":"514077686123@qq.com","pin":"1111","notificationEmail":"514077686123@qq.com","purchasedDevice":0,"deviceRemained":0}
         * devices : []
         */

        private String token;
        private UserBean user;
        private List<?> devices;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<?> getDevices() {
            return devices;
        }

        public void setDevices(List<?> devices) {
            this.devices = devices;
        }

        public static class UserBean {
            /**
             * user_id : 125
             * user_type : 3
             * user_login : 514077686123@qq.com
             * user_email : 514077686123@qq.com
             * avatar :
             * monitoredDevice : 0
             * accountId : 514077686123@qq.com
             * pin : 1111
             * notificationEmail : 514077686123@qq.com
             * purchasedDevice : 0
             * deviceRemained : 0
             */

            private int user_id;
            private int user_type;
            private String user_login;
            private String user_email;
            private String avatar;
            private int monitoredDevice;
            private String accountId;
            private String pin;
            private String notificationEmail;
            private int purchasedDevice;
            private int deviceRemained;

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public int getUser_type() {
                return user_type;
            }

            public void setUser_type(int user_type) {
                this.user_type = user_type;
            }

            public String getUser_login() {
                return user_login;
            }

            public void setUser_login(String user_login) {
                this.user_login = user_login;
            }

            public String getUser_email() {
                return user_email;
            }

            public void setUser_email(String user_email) {
                this.user_email = user_email;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getMonitoredDevice() {
                return monitoredDevice;
            }

            public void setMonitoredDevice(int monitoredDevice) {
                this.monitoredDevice = monitoredDevice;
            }

            public String getAccountId() {
                return accountId;
            }

            public void setAccountId(String accountId) {
                this.accountId = accountId;
            }

            public String getPin() {
                return pin;
            }

            public void setPin(String pin) {
                this.pin = pin;
            }

            public String getNotificationEmail() {
                return notificationEmail;
            }

            public void setNotificationEmail(String notificationEmail) {
                this.notificationEmail = notificationEmail;
            }

            public int getPurchasedDevice() {
                return purchasedDevice;
            }

            public void setPurchasedDevice(int purchasedDevice) {
                this.purchasedDevice = purchasedDevice;
            }

            public int getDeviceRemained() {
                return deviceRemained;
            }

            public void setDeviceRemained(int deviceRemained) {
                this.deviceRemained = deviceRemained;
            }
        }
    }
}
