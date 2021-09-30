
package b;

public class Users {
    String tenDangnhap;
    String matKhau,vaiTro;
   

    public Users() {
    }


    public Users(String tenDangnhap, String matKhau, String vaiTro ) {
        this.tenDangnhap = tenDangnhap;
        this.matKhau = matKhau;
     
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
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
