import java.util.ArrayList;

public class BaseDados {
	
	static ArrayList<Robot> robots;
	
	public static void createBase() {
		
		robots = new ArrayList<Robot>();
	}
	
	public static boolean adicionarRobo(Robot robot) {
		if(robot == null  || robot.getNome()==null || robot.getDirecao()==null || robot.getPosicao()==null) {
			return false;
		}
		for (int i=0; i < robots.size(); i++)
			if(robots.get(i).getNome().equalsIgnoreCase(robot.getNome()))
				return false;
		System.out.println("Robô adicionado com sucesso!");
		return robots.add(robot);
	}

	public static boolean inicializar(Robot robot) {
		

		for (Robot robotCurrent: robots)
			if(robotCurrent.getNome().equalsIgnoreCase(robot.getNome()))
				if (robotCurrent.getPosicao() == "(0,0)") {
					robotCurrent.setDirecao("Norte");
					robotCurrent.setStatus(true);
					System.out.println("Robô inicializado e direcionado para o norte!");
					return true;
					}
				else{
					System.out.println("Robô inicializado!");
					return true;
				}
			return false;
			}
	public static boolean andarUmPasso(Robot robot) {

		for (Robot robotCurrent: robots)
			if(robotCurrent.getNome().equalsIgnoreCase(robot.getNome())) {
				robotCurrent.setPassos(1);
				return true;
				}
		System.out.println("Robô não encontrado!");
		return false;
	}
	
	public static boolean andarVariosPassos(Robot robot, int passos) {

		for (Robot robotCurrent: robots)
			if(robotCurrent.getNome().equalsIgnoreCase(robot.getNome())) {
				robotCurrent.setPassos(passos);
				return true;
				}
		System.out.println("Robô não encontrado!");
		return false;
	}
	
	public static boolean mudarPosicao(Robot robot, String posicao) {

		for (Robot robotCurrent: robots)
			if(robotCurrent.getNome().equalsIgnoreCase(robot.getNome())) {
				robotCurrent.setPosicao(posicao);
				return true;
				}
		System.out.println("Robô não encontrado!");
		return false;
	}

	
	public static boolean retornaPosZero(Robot robot) {
		for (Robot robotCurrent: robots)
			if(robotCurrent.getNome().equalsIgnoreCase(robot.getNome())) {
				robotCurrent.setPosicao("(0,0)");
				return true;
				}
		System.out.println("Robô não encontrado!");
		return false;
	}
	
	public static boolean configuracao(Robot robot) {

		for (Robot robotCurrent: robots)
			if(robotCurrent.getNome().equalsIgnoreCase(robot.getNome())) {
				System.out.println(robotCurrent.getNome());
				System.out.println(robotCurrent.getDirecao());
				System.out.println(robotCurrent.getPosicao());
				System.out.println(robotCurrent.getPassos());
				if (robotCurrent.isStatus()==true)
					System.out.println("Inicializado");
				else
					System.out.println("Não Inicializado");
				return true;
				}
		System.out.println("Robô não encontrado!");
		return false;
	}
}
