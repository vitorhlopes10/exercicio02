package cadastrarproduto;

public class Produto {

    private int id;
    private String descricao;
    private String nome;
    private String unidade;
    private String apresentacao;
    private double comissao;
    private String codigoBarras;
    private int tipoProduto;
    private int vendaDoProduto;
    private boolean isEstoqueOnline;
    private boolean isConvenio;
    private boolean isPromocao;
    private double valorDeCompra;
    private double custoOperacional;
    private double margemDeLucro;
    private double valorVista;
    private double desconto;
    private double valorPromocao;
    private int estoqueMin;
    private int estoqueMax;
    private String ultimoAumento;
    private String validadePromocao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(int tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getVendaDoProduto() {
        return vendaDoProduto;
    }

    public void setVendaDoProduto(int vendaDoProduto) {
        this.vendaDoProduto = vendaDoProduto;
    }

    public boolean isIsEstoqueOnline() {
        return isEstoqueOnline;
    }

    public void setIsEstoqueOnline(boolean isEstoqueOnline) {
        this.isEstoqueOnline = isEstoqueOnline;
    }

    public boolean isIsConvenio() {
        return isConvenio;
    }

    public void setIsConvenio(boolean isConvenio) {
        this.isConvenio = isConvenio;
    }

    public boolean isIsPromocao() {
        return isPromocao;
    }

    public void setIsPromocao(boolean isPromocao) {
        this.isPromocao = isPromocao;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public double getCustoOperacional() {
        return custoOperacional;
    }

    public void setCustoOperacional(double custoOperacional) {
        this.custoOperacional = custoOperacional;
    }

    public double getMargemDeLucro() {
        return margemDeLucro;
    }

    public void setMargemDeLucro(double margemDeLucro) {
        this.margemDeLucro = margemDeLucro;
    }

    public double getValorVista() {
        return valorVista;
    }

    public void setValorVista(double valorVista) {
        this.valorVista = valorVista;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(double valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getEstoqueMax() {
        return estoqueMax;
    }

    public void setEstoqueMax(int estoqueMax) {
        this.estoqueMax = estoqueMax;
    }

    public String getUltimoAumento() {
        return ultimoAumento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUltimoAumento(String ultimoAumento) {
        this.ultimoAumento = ultimoAumento;
    }

    public String getValidadePromocao() {
        return validadePromocao;
    }

    public void setValidadePromocao(String validadePromocao) {
        this.validadePromocao = validadePromocao;
    }
}
