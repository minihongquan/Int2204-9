
class hoaQua{
    protected int gia, soLg;
    protected String ngayNhap, NguonGoc;

    public int getSoLg() {
            return soLg;
    }

    public int getGia() {

        return gia;
    }

    public String getXuatXu() {

        return NguonGoc;
    }

    public String getNgayNhap() {
            return ngayNhap;
    }

    public void setSoLg(int soLg) {
            this.soLg = soLg;
    }

    public void setGia(int gia) {
            this.gia = gia;
    }

    public void setXuatXu(String NguonGoc) {
            this.NguonGoc = NguonGoc;
    }

    public void setNgayNhap(String ngayNhap) {
            this.ngayNhap = ngayNhap;
    }
}
class quaTao extends hoaQua{

    protected String xuaxuTao;

    public String getXuaxuTao() {
        return xuaxuTao;
    }

    public void setXuaxuTao(String xuaxuTao) {
        this.xuaxuTao= xuaxuTao;
    }
}

class quaCam extends hoaQua{

    protected boolean NhoHayTo; //to = true, nho =  false

    public boolean isNhoHayTo() {
        return NhoHayTo;
    }

    public void setNhoHayTo(boolean NhoHayTo) {
        this.NhoHayTo = NhoHayTo;
    }
}

class camSanh extends quaCam{

    protected String mausac; //cam sành vỏ màu xanh lá

    public String getMauVo() {
        return mausac;
    }

    public void setMauVo(String mauVo) {
        this.mausac = mauVo;
    }
}

class camCaoPhong extends quaCam{

    protected String mausac; //cam Cao Phong vỏ màu vàng

    public String getMauVo() {
        return mausac;
    }

    public void setMauVo(String mauVo) {
        this.mausac = mauVo;
    }
}

public class lab05b1 {
        public static void main(String[] args){
            hoaQua hq = new hoaQua();
            quaTao qt = new quaTao();
            quaCam qc = new quaCam();
            camSanh cs = new camSanh();
            camCaoPhong ccp = new camCaoPhong();
        }
}
