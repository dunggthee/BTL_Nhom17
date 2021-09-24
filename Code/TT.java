
package btl;

public class TT {
    private String name,gt;
    private int tuoi;
//   private boolean gt;

    public TT() {
    }

    public TT(String name, int tuoi, String gt) {
        this.name = name;
        this.tuoi = tuoi;
        this.gt=gt;
       
    }

    public TT(String name) {
        this.name = name;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    String Out(){
        String s="\n Thông tin bệnh nhân"+
                 "\n Tên:"+name
                +"\n Tuổi:"+tuoi
                +"\n Giới tính:"+gt;
        return s;
    }
}
