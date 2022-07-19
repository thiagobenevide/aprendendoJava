package questao6_1;

//import java.util.ArrayList;

public class Compra extends Produto {

	private float total;
	private String nota;
	private String descricao;
	

	public Compra(String nome, String codigo, float preco) {
			super(nome, codigo, preco);
			this.descricao = nome + ", " + preco + "\n";
			this.total += preco;
			this.nota = descricao + total;
		}
		
		public boolean totalizar(Compra compra) {
			setTotal(compra.getPreco());
			return true;
		}
		
		
		public boolean adicionarProduto(Produto produto) {
			if (produto == null) {
				return false;
			} else {
				setDescricao(produto.getNome() + ", " + produto.getPreco() + "\n");
				setTotal(produto.getPreco());
				return true;
			}
		}
		
		public boolean registrar(Compra compra) {
			if (compra==null) {
				return false;
			}
			else{
				this.nota = getDescricao() + "Total da Nota: " + getTotal();
				return true;
			}
		}
		
		public String resumir(Compra compra) {
			return compra.getNota();
		}
		
		public float getTotal() {
			return total;
		}
	
		public String getNota() {
			return nota;
		}
	
		public void setTotal(float preco) {
			this.total += preco;
		}
	
		public String getDescricao() {
			return descricao;
		}
		
		public void setDescricao(String nome) {
			if (this.descricao == null) {
				this.descricao = nome;
			}
			else{
			this.descricao += nome ;
			}
		}
	
	}
