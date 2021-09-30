
package b;

public class Users {
    String tenDangnhap;
    String matKhau;
   

    public Users() {
    }


    public Users(String tenDangnhap, String matKhau ) {
        this.tenDangnhap = tenDangnhap;
        this.matKhau = matKhau;
     
    }


    public String getTenDangnhap() {
        return tenDangnhap;
    }

    public void setTenDangnhap(String tenDangnhap) {
        this.tenDangnhap = tenDangnhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

}
