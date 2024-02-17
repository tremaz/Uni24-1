package aulapoo;

public class Liquidificador 
	{
	
		private String marca;
		private String cor;
		private int velocidade;
		private boolean tampado;
		
		public Liquidificador() 
		{
			
			
		}
		
		public String getMarca()
		{
			return marca;
		}
		
		public void setMarca(String m)
		{
			this.marca = m;
		}
		
		public String getCor()
		{
			return cor;
		}
		
		public void setCor(String c)
		{
			this.cor = c;
		}
		
		public int getVelocidade()
		{
			return velocidade;
		}
		
		public void setVelocidade(int v)
		{
			this.velocidade = v;
		}
		
		public boolean getTampado()
		{
			return tampado;
		}
		
		public void setTampado(boolean t)
		{
			this.tampado = t;
		}
		
		public void tampar()
		{
			tampado = true;
		}
		
		public void destampar() 
		{
			tampado = false;
		}
		
		public void liquidificar()
		{
			if(tampado = true) 
			{
				System.out.println("ligado");
			}
			else 
			{
				System.out.println("tampar liquidificador");
			}
		}
		
		public void status()
		{
			System.out.println("Marca: " + marca);
			System.out.println("Cor: " +cor);
			System.out.println("Velocidade: " + velocidade);
			System.out.print("Tampado: " + tampado);
			System.out.println("\n");
			
		}
	}